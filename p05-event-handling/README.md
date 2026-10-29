## PERTEMUAN 5 - EVENT HANDLING
### Tabel pengamatan
| No | Tindakan | Event yang tercatat |
| -- | -------- | ------------------- |
| 1 | Arahkan kursor ke tombol, lalu jauhkan | MouseEvent, kursor masuk ke tombol dan kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | ActionEvent, tombol diklik |
| 3 | Centang lalu hapus centang Aktifkan fitur | ItemEvent, kontak dicentang dan centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | ItemEvent, memilih malam |
| 5 | Klik isian, lalu ketik kata "abc" | FocusEvent, isian mendapatkan fokus dan KeyEvent, mengetik huruf abc |
| 6 | Klik tombol setelah mengetik di isian | FocusEvent, isian kehilangan fokus dan ActionEvent, tombol diklik |

### Jawaban eksperimen
[Praktikum 3](Eksperimen%20praktikum%203.txt)

[Praktikum 4](Eksperimen%20praktikum%204.txt)

### Peta event pada FormAnggotaPerpustakaan
| Komponen | Menu Events | Aksi |
| -------- | ----------- | ---- |
| Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang  |
| Tombol Batal | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |

### Tangkapan layar
![Tangkapan layar jendela Properties bagian Events untuk tombol Daftar](Tangkapan%20layar%20jendela%20Properties%20bagian%20Events%20untuk%20tombol%20Daftar.png)

![Tangkapan layar dialog ringkasan](Tangkapan%20layar%20dialog%20ringkasan.png)

![Tangkapan layar dialog konfirmasi keluar](Tangkapan%20layar%20dialog%20konfirmasi%20keluar.png)

### Deklarasi penggunaan AI
Saya memakai Gemini dan Claude untuk memahami bagian modul yang belum saya pahami. Claude juga membantu saya menulis kode event handler (kotak centang, tombol Batal, tombol Daftar, isian NPM, dan konfirmasi saat jendela ditutup), mengatur posisi label jumlah digit di GridBagLayout, memperbaiki error pada kode seperti package dan kurung kurawal yang berlebih, serta mengatasi error saat git push di cmd. Setelah itu saya coba dan jalankan sendiri formnya, lalu menyesuaikan tampilannya.
