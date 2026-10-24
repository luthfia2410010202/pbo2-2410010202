# pbo2-2410010202

## PERTEMUAN 3 - KOMPONEN GUI

### Deskripsi Tugas
Membuat aplikasi tiket travel menggunakan Komponen GUI Java Swing.

### Screenshot hasil
![Mode terang](p03-komponen-gui/tiket%20travel%20mode%20terang.png)

![Mode gealap](p03-komponen-gui/tiket%20travel%20mode%20gelap.png)

![Tab design](p03-komponen-gui/tab%20design%20tiket%20travel.png)

### Refleksi
[Refleksi bagian G](p03-komponen-gui/refleksi%20bagian%20G.pdf)


## PERTEMUAN 4 - LAYOUT MANAGER
### Refleksi
[Refleksi bagian G](p04-layout-manager/refleksi%20bagian%20G.txt)

### Tabel rancangan
| Bagian | Panel | Layout |
| ------ | ----- | ------ |
| Jendela | JFrame | BorderLayout |
| Header (North) | headerPanel | BoxLayout, Y Axis |
| Pembungkus (Center) | isiPanel | BordeLayout |
| Isi form (North di isiPanel) | formPanel | GidBagLayout |
| Tombol (South) | tombolPanel | FlowLayout, Right |

### Screenshot hasil dan foto
![Foto sketsa](p04-layout-manager/foto%20sketsa%20form.jpeg)

![Tab design](p04-layout-manager/tab%20design%20anggota%20perpustakaan.png)

![Ukuran awal](p04-layout-manager/hasil%20form%20anggota%20perpustakaan%20awal.png)

![Saat dilebarkan](p04-layout-manager/Hasil%20form%20anggota%20pepustakaan%20dilebarkan.png)

### Eksperimen
[Praktikum 2](p04-layout-manager/eksperimen%20praktikum%202.txt)

[Praktikum 4](p04-layout-manager/Eksperimen%20praktikum%204.txt)

### Penilaian dan saran dari teman
| No | Pemeriksaan | Ya atau Belum |
| -- | ----------- | -------------- |
| 1 | Label singkat, jelas, dan sejajar | Ya |
| 2 | Isian dikelompokkan dengan judul bagian | Ya |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya |
| 4 | Komponen sesuai jenis data | Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah | Ya |
| 6 | Jarak antar komponen konsisten | Ya |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Ya  (tampilan tetap rapi saat jendela diperlebar, tetapi saat ditinggikan belum terlihat pada screenshot) |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya |

Saran teman : Menurut saya, jarak antara bagian Data Anggota, Kontak, dan Persetujuan bisa sedikit ditambah agar tampilan form lebih rapi dan nyaman dilihat. 
(dinilai oleh Asma Nur Patmi_2410010342)

### Deklarasi penggunaan AI
Saya menggunakan Gemini dan Claude untuk memahami modul praktikum yang saya tidak paham, membantu mengatasi kotak Alamat yang gepeng saat komponen Persetujuan ditambahkan, menyusun draft jawaban pertanyaan refleksi lalu saya pahami dan tulis ulang dengan kata-kata saya sendiri, dan juga membantu mengganti pesan commit di GitHub melalui cmd. Ada juga bagian penilaian nomor 7 untuk menilai punya teman, saya bingung antara ya atau belum jadi saya minta saran ke claude.


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
[Praktikum 3](p05-event-handling/Eksperimen%20praktikum%203.txt)

[Praktikum 4](p05-event-handling/Eksperimen%20praktikum%204.txt)

### Peta event pada FormAnggotaPerpustakaan
| Komponen | Menu Events | Aksi |
| -------- | ----------- | ---- |
| Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang  |
| Tombol Batal | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |

### Tangkapan layar
![Tangkapan layar jendela properties bagian event untuk tombol daftar](p05-event-handling/Tangkapan%20layar%20jendela%20Properties%20bagian%20Events%20untuk%20tombol%20Daftar.png)

![Tangkapan layar dialog ringkasan](p05-event-handling/Tangkapan%20layar%20dialog%20ringkasan.png)

![Tangkapan layar dialog konfirmasi keluar](p05-event-handling/Tangkapan%20layar%20dialog%20konfirmasi%20keluar.png)

### Deklarasi penggunaan AI
Saya memakai Gemini dan Claude untuk memahami bagian modul yang belum saya pahami. Claude juga membantu saya menulis kode event handler (kotak centang, tombol Batal, tombol Daftar, isian NPM, dan konfirmasi saat jendela ditutup), mengatur posisi label jumlah digit di GridBagLayout, memperbaiki error pada kode seperti package dan kurung kurawal yang berlebih, serta mengatasi error saat git push di cmd. Setelah itu saya coba dan jalankan sendiri formnya, lalu menyesuaikan tampilannya.
