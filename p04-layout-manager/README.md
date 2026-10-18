## Pertanyaan Refleksi G
1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?
   = karena posisi komponen diatur manual, sehingga tampilan bisa berantakan saat ukuran jendela berubah.
   
2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.
   = FlowLayout menyusun komponen berurutan dan bisa pindah baris, sedangkan GridLayout membagi komponen dalam baris dan kolom dengan ukuran yang sama.
   
3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?
   = Weight X mengatur pembagian ruang horizontal tambahan, sedangkan Fill mengatur cara komponen mengisi ruang yang tersedia.
   
4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?
   = formPanel dibungkus dalam isiPanel agar tata letak form lebih mudah diatur dan dipisahkan dari panel lainnya. Kemudian, isiPanel diletakkan di posisi North menggunakan BorderLayout agar form berada di bagian atas          jendela dan tidak ikut melebar secara vertikal ketika jendela diperbesar.
   
5. Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.
   = Consistency: Label dan kolom input dibuat dengan susunan yang seragam.
     Alignment: Label dan kolom input dibuat sejajar agar form terlihat rapi dan mudah digunakan.

## Foto sketsa form dan tabel rancangan
<img width="1200" height="1600" alt="image" src="https://github.com/user-attachments/assets/8e632ef8-a728-47d5-a489-8aaa530ff31d" />


| Bagian    | Panel       | Layout             |
|-----------|-------------|--------------------|
| Jendela   | JFrame      | Border Layout      |
| Header    | headerPanel | Box Layout, Y axis |
| Pembungkus| isiPanel    | Border Layout      |
| Isi form  | formPanel   | Grid Bag Layout    |
| Tombol    | tombolPanel | Flow Layout,Right  |

## Dua tangkapan layar (screenshot) FormAnggotaPerpustakaan saat dijalankan: ukuran awal dan saat dilebarkan
<img width="1916" height="1021" alt="image" src="https://github.com/user-attachments/assets/9a44e7c7-0fea-469f-a31f-251a2866035e" />
<img width="1917" height="1018" alt="image" src="https://github.com/user-attachments/assets/24bc5d62-378b-40c7-a5c4-9b922b1f03bb" />

## Satu tangkapan layar (screenshot) tab Design FormAnggotaPerpustakaan yang memperlihatkan susunan panel dan layout di jendela Navigator
<img width="1917" height="1017" alt="image" src="https://github.com/user-attachments/assets/bc092115-ebb6-42ff-89d2-4d2438647786" />

## Jawaban eksperimen Praktikum 2, serta saran dari teman pada Tahap 4
1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris
mana di initComponents() yang ikut berubah?
= Tombol berada di tengah dan bisa pindah baris saat jendela diperkecil. Baris yang berubah adalah pengaturan FlowLayout menjadi FlowLayout.CENTER.

2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa? 
   = Terbentuk 3 baris jika ada 6 komponen, karena 2 kolom diisi secara otomatis oleh GridLayout.
   
3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers di
antara tombol.
= Setelah maximumSize diatur dengan lebar 32767 dan tinggi sesuai tinggi tombol, tombol dapat melebar mengikuti ruang yang tersedia. Jika ditambahkan Vertical Strut di antara tombol, akan muncul jarak vertikal tetap di antara tombol sehingga susunannya terlihat lebih renggang.

## Jawaban Praktikum 4
1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?
   = Isian nama tidak melebar saat jendela diperbesar karena tidak mendapat tambahan ruang horizontal.
   
2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa
perbedaannya?
= Form berpindah ke bagian tengah secara vertikal, berbeda dengan North yang menempatkan form di bagian atas.

3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian
mana yang rusak lebih dulu?
= Jendela bisa diperkecil terlalu kecil. Bagian form dan komponennya mulai bertumpuk atau terpotong sehingga sulit digunakan.

## Saran dari teman pada Tahap 4


## Deklarasi penggunaan AI: sebutkan alat yang dipakai dan untuk keperluan apa, atau buat pernyataan jika tidak memakai AI
buatkan kode readme untuk membuat tabel seperti berikut
| Bagian   | Panel  | Layout |
|----------|--------|--------|
| Jendela  | JFrame |        |
| Header   |        |        |
| Isi form |        |        |
| Tombol   |        |        |
