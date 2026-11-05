/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08;

/**
 * Nama: Luthfia Agustina
 * NPM: 2410010202
 * @author ACER
 */
public enum Kategori {
    
    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String label;

    Kategori(String label) {
        this.label = label;
    }

    public static Kategori dariLabel(String label) {
        for (Kategori k : values()) {
            if (k.label.equals(label)) {
                return k;
            }
        }
        return LAINNYA;
    }

    @Override
    public String toString() {
        return label;
    }
    
}
