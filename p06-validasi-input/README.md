# Lembar per review heuristik dari teman
nama Peninjau : Muhammad Arifin Ikhsan

nama Pemilik Form : Muhammad Nafis
<img width="1200" height="1600" alt="image" src="https://github.com/user-attachments/assets/ca6734f3-37ae-4373-9b9a-01e6c74ecbf3" />


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
