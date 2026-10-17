1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing
satu contoh.
Top-level container: Wadah utama untuk menampilkan aplikasi. Contoh: JFrame.
Intermediate container: Wadah untuk mengelompokkan komponen di dalam form. Contoh: JPanel.
Atomic component: Komponen yang langsung digunakan oleh pengguna. Contoh: JButton.

2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?
Agar pengguna hanya bisa memilih satu pilihan saja, misalnya Reguler atau Karyawan, bukan keduanya sekaligus.
   
3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?
Saat pilihan yang tersedia cukup banyak dan ingin menghemat tempat, misalnya memilih jurusan dari daftar.

5. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan
seharusnya ditulis?
Karena kode tersebut dibuat otomatis oleh NetBeans dan bisa berubah atau terhapus saat form diedit. Kode tambahan sebaiknya ditulis di luar initComponents(), misalnya di constructor atau event handler.

6. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?
Agar tampilan FlatLightLaf diterapkan sejak awal ketika form dibuat, sehingga semua komponen menggunakan tampilan yang seragam.

## Dua tangkapan layar Form Pemesanan Tiket Travel saat dijalankan: tema terang dan tema gelap.##
<img width="1912" height="1022" alt="image" src="https://github.com/user-attachments/assets/da167761-d322-4492-b84e-ffb5214a5462" />
<img width="1831" height="1061" alt="image" src="https://github.com/user-attachments/assets/bc0e95bf-fdf7-43cd-b427-d1d63e7278ee" />

## Satu tangkapan layar tab Design FormTiketTravel yang memperlihatkan jendela Navigator. ##
<img width="1917" height="1018" alt="image" src="https://github.com/user-attachments/assets/6aeb0743-797f-4a4e-9a6a-224305b743ab" />



