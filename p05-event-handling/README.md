# Tabel pengamatan Praktikum 2 yang sudah diisi
| No | Tindakan | Event yang tercatat |
|---|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | MouseEvent kursor masuk ke tombol dan kursor keluar dari tombol  |
| 2 | Klik tombol Klik Saya | ActionEvent  tombol diklik  |
| 3 | Centang lalu hapus centang Aktifkan fitur | ItemEvent    kotak dicentang dan centang dihapus  |
| 4 | Ganti pilihan dari Pagi menjadi Malam | ItemEvent    memilih Malam    |
| 5 | Klik isian, lalu ketik kata "abc" | KeyEvent     mengetik huruf a, mengetik huruf b, mengetik huruf c|
| 6 | Klik tombol setelah mengetik di isian | FocusEvent   isian kehilangan fokus  |
# Jawaban eksperimen Praktikum 3
1. Berapa kali pesan tercetak setiap pilihan diganti?
Jawab: 2 kali, karena itemStateChanged terjadi saat pilihan lama DESELECTED dan pilihan baru SELECTED.

2. Mengapa hasil yang tampil terlambat satu karakter saat memakai keyPressed?
Jawab: Karena keyPressed terjadi sebelum karakter masuk ke TextField.

3. Apa yang muncul di Output jika try-catch dihapus lalu mengetik huruf?
Jawab: Muncul error NumberFormatException.

# Jawaban eksperimen Praktikum 4
1. Berapa kali pesan "kali" tercetak? Mengapa satu tombol sebaiknya hanya memakai satu cara?
Jawab: 2 kali, karena ada dua listener yang aktif. Satu tombol sebaiknya memakai satu cara agar aksi tidak berjalan dua kali.

2. Apa yang diubah untuk menambahkan tombol %?
Jawab: Di Design tambahkan tombol %. Di Source tambahkan event actionPerformed dan operasi modulus % pada method hitung().

3. Mengapa setelah tombol Hapus ditekan kursor langsung berada di isian pertama?
Jawab: Karena ada perintah angka1Field.requestFocusInWindow();.

# Tangkapan layar jendela Properties bagian Events untuk tombol Daftar
<img width="1919" height="1036" alt="image" src="https://github.com/user-attachments/assets/3c4e58f5-d741-4132-a3d4-c9f6367b3d53" />

# Tangkapan layar dialog ringkasan
<img width="1919" height="1033" alt="image" src="https://github.com/user-attachments/assets/c2297e88-fa45-43d8-ae0a-945a1caa0051" />

# Tangkapan layar dialog konfirmasi keluar
<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/b1b26c6a-23bc-43bd-bc80-5e6e518a0721" />

# Deklarasi penggunaan AI: alat yang dipakai dan untuk keperluan apa, atau pernyataan tidak memakai AI.
