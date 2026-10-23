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
| 1 | Arahkan kursor ke tombol, lalu jauhkan | MouseEvent, kursor masuk ke tombol dan kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | ActionEvent, tombol diklik |
| 3 | Centang lalu hapus centang Aktifkan fitur | ItemEvent, kontak dicentang dan centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | ItemEvent, memilih malam |
| 5 | Klik isian, lalu ketik kata "abc" | FocusEvent, isian mendapatkan fokus dan KeyEvent, mengetik huruf abc |
| 6 | Klik tombol setelah mengetik di isian | FocusEvent, isian kehilangan fokus dan ActionEvent, tombol diklik |

### Jawaban eksperimen
