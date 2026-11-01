# eksperimen Praktikum 5
1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu tambah kontak baru. Apakah tabel langsung berubah?
Jawaban: Tidak, tabel tidak langsung berubah karena fireTableRowsInserted() berfungsi memberi tahu JTable bahwa ada data baru. Jika baris tersebut dijadikan komentar, data tetap masuk ke List, tetapi tampilan tabel tidak otomatis diperbarui.
2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata "ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?
Jawaban: Nama yang muncul adalah Budi Santoso. Hal ini karena getSelectedRow() mengambil nomor baris tampilan, bukan nomor baris asli pada model. Setelah pencarian, urutan baris berubah sehingga data yang terbaca menjadi salah.
3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka, coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?
Jawaban: Jendela utama tetap bisa diklik meskipun dialog masih terbuka. Namun, kontak yang ditambahkan tidak langsung masuk ke tabel karena dialog tidak lagi bersifat modal. Method tampilkan() langsung mengembalikan hasil sebelum pengguna selesai mengisi dan menyimpan data.
4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?
Jawaban: Karena Ctrl+E digunakan untuk mengubah data dan Ctrl+D untuk menghapus data, sehingga harus ada baris yang dipilih terlebih dahulu. Jika tidak ada baris yang dipilih, menu Ubah dan Hapus otomatis dinonaktifkan. Sedangkan Ctrl+N tetap bisa digunakan untuk menambahkan kontak baru.
5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di initComponents()?
Jawaban: Baris yang berubah adalah hapusItem.setAccelerator(). Sebelumnya menggunakan Ctrl+D, kemudian berubah menjadi tombol Delete tanpa perlu menekan Ctrl.
6.Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan mengapa?
Jawaban: Program dapat mengalami NullPointerException saat dijalankan. Hal ini karena initComponents() menggunakan variabel model untuk JTable sebelum objeknya dibuat. Akibatnya, model masih bernilai null dan tidak bisa digunakan dengan benar, terutama saat sorter dibuat menggunakan model tersebut.
