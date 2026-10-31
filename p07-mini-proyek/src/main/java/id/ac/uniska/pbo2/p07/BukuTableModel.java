/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ACER
 */
public class BukuTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Kode", "Judul", "Penulis", "Tahun", "Status"};
    private final List<Buku> data = new ArrayList<>();

    public BukuTableModel() {
        // Data contoh: minimal 5 buku
        data.add(new Buku("B001", "Algoritma dan Pemrograman", "Rinaldi Munir", 2016, Status.TERSEDIA));
        data.add(new Buku("B002", "Basis Data", "Fathansyah", 2018, Status.TERSEDIA));
        data.add(new Buku("B003", "Pemrograman Java", "Budi Raharjo", 2020, Status.DIPINJAM));
        data.add(new Buku("B004", "Jaringan Komputer", "Onno W. Purbo", 2014, Status.TERSEDIA));
        data.add(new Buku("B005", "Rekayasa Perangkat Lunak", "Rosa A.S.", 2019, Status.DIPINJAM));
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Class<?> getColumnClass(int kolom) {
        return kolom == 3 ? Integer.class : Object.class; // tahun terurut sebagai angka
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Buku b = data.get(baris);
        return switch (kolom) {
            case 0 -> b.kode();
            case 1 -> b.judul();
            case 2 -> b.penulis();
            case 3 -> b.tahun();
            default -> b.status();
        };
    }

    public Buku ambil(int baris) {
        return data.get(baris);
    }

    public void tambah(Buku buku) {
        data.add(buku);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public void ubah(int baris, Buku buku) {
        data.set(baris, buku);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        data.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }

    public long jumlahTersedia() {
        return data.stream().filter(b -> b.status() == Status.TERSEDIA).count();
    }
}
