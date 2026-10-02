1. Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error
dari kompiler dan mengapa? kelas abstrak tidak dapat dibuat objeknya secara langsung menggunakan keyword

2. Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi
@Override ada, dan jika dihapus? Jika @Override masih ada, akan muncul error karena nama method berbeda dengan kelas induknya.
Jika @Override dihapus, program bisa dijalankan, tetapi method tersebut tidak lagi dianggap sebagai overriding.

3. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan? Program akan mengalami error saat dijalankan karena judul buku kosong dan tidak sesuai dengan aturan validasi.
   
4. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main
menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar? Aturan yang dilanggar adalah Encapsulation. Karena status bisa diubah langsung dari luar kelas tanpa melalui prosedur yang seharusnya. Akibatnya, data buku bisa menjadi tidak konsisten.

<img width="1917" height="1016" alt="image" src="https://github.com/user-attachments/assets/15d28773-de7d-47dc-90c3-2c33b5b8e8dd" />
