/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ACER
 */
public class BarangTableModel extends AbstractTableModel {
   
    private static final String[] NAMA_KOLOM =
            {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private static final long BATAS_DISKON = 100_000;

    private final List<Barang> daftarBarang = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftarBarang.size();
    }

    @Override
    public int getColumnCount() {
        return NAMA_KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return NAMA_KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftarBarang.get(baris);
        switch (kolom) {
            case 0: return b.getNama();
            case 1: return b.getKategori().toString();
            case 2: return formatRupiah(b.getHarga());
            case 3: return b.getJumlah();
            default: return formatRupiah(b.getSubtotal());
        }
    }

    public void tambah(Barang barang) {
        daftarBarang.add(barang);
        int baris = daftarBarang.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public boolean sudahAda(String nama) {
        for (Barang b : daftarBarang) {
            if (b.getNama().equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public long hitungTotal() {
        long total = 0;
        for (Barang b : daftarBarang) {
            total += b.getSubtotal();
        }
        return total;
    }

    public long hitungDiskon() {
        long total = hitungTotal();
        return total >= BATAS_DISKON ? total * 10 / 100 : 0; // pembagian bulat = dibulatkan ke bawah
    }

    public long hitungBayar() {
        return hitungTotal() - hitungDiskon();
    }

    public static String formatRupiah(long nilai) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        return "Rp" + new DecimalFormat("#,##0", simbol).format(nilai);
    }
    
}
