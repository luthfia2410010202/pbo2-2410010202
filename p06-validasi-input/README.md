## p06 - Validasi Input

### Foto atau pindaian lembar peer review yang Anda terima dari teman
Nama pemilik form	: Luthfia Agustina_2410010202
Nama peninjau	: Asma Nut Patmi_2410010342

![Foto atau pindaian lembar peer review yang Anda terima dari teman](peer%20review.jpeg)

### Tabel singkat berisi temuan dari teman, perbaikan yang Anda lakukan, dan commit yang memuat perbaikan 
| No | Heuristik | Temuan | Perbaikan | Commit |
| 1 | Bantuan dan Dokumentasi | Tidak ada tooltip pada kolom NPM dan Nomor HP. | Menambahkan tooltip pada npmField dan hpField. | P06: validasi input dan umpan balik pada form anggota |
| 2 | Bantuan dan Dokumentasi | Tidak ada petunjuk singkat penggunaan aplikasi. | Mengubah teks keteranganLabel menjadi “Semua isian wajib di isi kecuali alamat | P06: validasi input dan umpan balik pada form anggota |
| 3 | Bantuan dan Dokumentasi | Tidak ada README yang menjelaskan cara menjalankan dan menggunakan aplikasi. | Menambahkan bagian “Cara Menjalankan” dan “Cara Menggunakan” di README. | P06: validasi input dan umpan balik pada form anggota |

**Cara Menjalankan**
1. Buka proyek di Apache NetBeans.
2. Klik kanan proyek, pilih **Clean and Build**.
3. Buka `FormAnggotaPerpustakaan.java`, lalu jalankan dengan **Shift+F6**.

**Cara Menggunakan**
1. Isi NPM (10 digit angka), nama lengkap, program studi, jenis anggota, email, nomor HP, dan alamat (boleh kosong).
2. Centang persetujuan tata tertib agar tombol **Daftar** aktif.
3. Klik **Daftar**. Jika ada isian yang salah, kolom diberi garis merah dan pesan tampil di bawahnya.
4. Klik **Batal** untuk mengosongkan form. Aplikasi meminta konfirmasi jika sudah ada isian.

### Hasil Tangkapan layar

![Tangkapan layar (screenshot) form dengan pesan kesalahan](Tangkapan%20layar%20(screenshot)%20form%20dengan%20pesan%20kesalahan.png)

![Tangkapan layar (screenshot) jendela Navigator yang memperlihatkan label pesan](Tangkapan%20layar%20(screenshot)%20jendela%20Navigator%20yang%20memperlihatkan%20label%20pesan.png)

### Eksperimen
[Jawaban eksperimen Praktikum 4](Eksperimen%20praktikum%204.txt)

### Deklarasi penggunaan AI
Saya memakai Gemini dan Claude untuk memahami bagian modul yang belum saya pahami. Claude membantu menjelaskan cara menaruh method bantu validasi di kelas form, memperbaiki error kode (method kembar, kurung kurawal berlebih, nama package), menyamakan tampilan FormAnggotaPerpustakaan dengan form contoh di modul, dan menyusun draft jawaban eksperimen yang kemudian saya coba dan tulis ulang dengan kata-kata saya sendiri. Claude juga membantu mengatasi error git push dan merge di cmd. Pengujian form dan pencatatan hasil eksperimen saya kerjakan sendiri.
