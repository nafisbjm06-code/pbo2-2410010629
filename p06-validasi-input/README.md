# Tabel singkat berisi temuan dari teman, perbaikan yang Anda lakukan, dan commit yang memuat perbaikan tersebut
| No | Heuristik | Temuan | Skor 0-4 | Saran |
|:---:|---|---|:---:|---|
| 1 | Visibilitas status sistem | Aplikasi berjalan dengan baik, tetapi ketika data yang baru didaftarkan, alangkah baiknya semua isian termasuk radiobutton juga dikosongkan kembali. | 1 | Perbaiki tombol batal untuk radiobutton. |
| 2 | Kesesuaian dengan dunia nyata | Tulisan dan isian terlihat dengan jelas dan rapi. | 0 | - |
| 3 | Kendali dan kebebasan pengguna | Terdapat 1 masalah, ketika ingin menambahkan data yang baru, isian pada combobox "Informatika" tidak bisa didaftarkan. | 2 | Perbaiki combobox isian "Informatika" agar segera bisa didaftarkan. |
| 4 | Konsistensi dan standar | Halaman form masih terlihat konsisten ketika dikecilkan dan dilebarkan. | 0 | - |
| 5 | Pencegahan kesalahan | NPM dan nomor sudah tidak bisa dimasukkan data berupa huruf. Ketika nama dan email diisi tidak sesuai ketentuan, akan muncul pesan peringatan singkat. | 0 | - |
| 6 | Mengenali, bukan mengingat | Pengguna dipastikan mudah beradaptasi karena tampilan terlihat rapi dan mudah dikenali. | 0 | - |
| 7 | Fleksibilitas dan efisiensi | Tidak ada kendala. | 0 | - |
| 8 | Desain estetis dan minimalis | Letak label dan isian enak dilihat. | 0 | - |
| 9 | Membantu memperbaiki kesalahan | Terdapat pesan error kalau isian tidak sesuai ketentuan, sangat memudahkan pengguna. | 0 | - |
| 10 | Bantuan dan dokumentasi | Terdapat pesan error bantuan berupa pesan singkat isian mana saja yang harus diperbaiki. | 0 | - |

Nama peninjau: Muhammad Arifin Ikhsan Nama pemilik form: Muhammad Nafis

# Tangkapan layar (screenshot) form dengan pesan kesalahan;
<img width="1917" height="1020" alt="image" src="https://github.com/user-attachments/assets/26476845-b111-4ba3-a8ef-77be4ccf8bd0" />
# Tangkapan layar (screenshot) jendela Navigator yang memperlihatkan label pesan;
<img width="1917" height="1018" alt="image" src="https://github.com/user-attachments/assets/0721b70c-ce8f-432f-95dc-0fc4cbf4bc35" />
# Jawaban eksperimen Praktikum 4
1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?

Jawaban: Huruf tidak akan muncul di isian NPM karena hanya angka yang diperbolehkan. Hal ini terjadi karena kode !Character.isDigit(evt.getKeyChar()) memeriksa apakah karakter bukan angka, lalu evt.consume() membatalkan karakter tersebut.

2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?

Jawaban: Pesan kesalahan muncul setelah menekan Tab atau saat kursor berpindah dari isian email. Hal ini karena event focusLost menjalankan validasi dan mendeteksi format email yang belum benar.

3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?

Jawaban: Karena sistem hanya memeriksa nama saat isian tidak kosong. Jika pengguna hanya melewati isian tanpa mengetik, pesan kesalahan belum ditampilkan. Isian kosong baru diperiksa ketika tombol Daftar diklik.

4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?

Jawaban: Isian NPM mendapat fokus karena merupakan isian pertama yang salah. Program menggunakan salah.get(0).requestFocusInWindow() untuk mengarahkan kursor ke kesalahan pertama.

5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?

Jawaban: Isian Nama lengkap akan mendapat fokus. Hal ini diatur menggunakan properti displayedMnemonic dengan huruf N dan labelFor yang menghubungkan label dengan isian Nama.

6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

Jawaban: Ya, data tetap ada dan tidak terhapus. Karena saat memilih No, program membatalkan proses pengosongan form sehingga semua data yang sudah dimasukkan tetap tersimpan di isian.
# Deklarasi penggunaan AI: alat yang dipakai dan untuk keperluan apa, atau pernyataan tidak memakai AI.
