# APLIKASI PEMBAYARAN SEDERHANA

## Deskripsi
Aplikasi Pembayaran Sederhana merupakan program berbasis Java yang dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO).

Aplikasi ini menggunakan GUI (Graphical User Interface) dengan Java Swing untuk melakukan simulasi pembayaran berdasarkan metode pembayaran yang dipilih, yaitu tunai dan transfer.

## Identitas Mahasiswa
- **Nama:** Azalia Sakila
- **NIM:** F1D02510005
- **Kelas:** B
- **Mata Kuliah:** Pemrograman Berorientasi Objek

## Fitur Aplikasi
1. Memasukkan nama barang.
2. Memasukkan harga barang.
3. Memilih jenis pembayaran.
4. Menghitung total pembayaran secara otomatis.
5. Menampilkan hasil pembayaran.

## Konsep OOP yang Digunakan

- **Abstract Class:** `Pembayaran` sebagai kelas induk.
- **Inheritance:** Class `Tunai` dan `Transfer` mewarisi class `Pembayaran`.
- **Abstract Method:** `hitungTotal()` sebagai method abstrak yang diimplementasikan oleh class turunannya.
- **Polymorphism:** Objek `Pembayaran` dapat menggunakan implementasi dari class `Tunai` maupun `Transfer`.

## Aturan Perhitungan Pembayaran

Terdapat dua metode pembayaran dalam aplikasi:

1. **Pembayaran Tunai**
   - Tidak dikenakan biaya administrasi.
   - Total pembayaran sama dengan harga barang.

2. **Pembayaran Transfer**
   - Dikenakan biaya administrasi sebesar Rp2.500.
   - Total pembayaran merupakan harga barang ditambah biaya administrasi.

**Rumus:**
- Tunai = Harga Barang
- Transfer = Harga Barang + Rp2.500

## Tampilan dan Hasil Pengujian

### 1. Pembayaran Tunai

Pembayaran menggunakan metode tunai tidak dikenakan biaya administrasi. Total pembayaran sama dengan harga barang.

![Pembayaran Tunai](screenshots/tunai.png)

### 2. Pembayaran Transfer

Pembayaran menggunakan metode transfer dikenakan biaya administrasi sebesar Rp2.500.

![Pembayaran Transfer](screenshots/transfer.png)

## Komponen GUI

Aplikasi dibuat menggunakan Java Swing dengan komponen:

1. `JFrame` – sebagai jendela utama aplikasi.
2. `JLabel` – menampilkan keterangan.
3. `JTextField` – memasukkan nama dan harga barang.
4. `JComboBox` – memilih metode pembayaran.
5. `JButton` – menjalankan proses pembayaran.

## Teknologi yang Digunakan
- Java
- Java Swing
- JDK
- Visual Studio Code / NetBeans

## Cara Menjalankan Program

1. Pastikan Java JDK sudah terinstal.
2. Buka project menggunakan Visual Studio Code atau NetBeans.
3. Jalankan file `AplikasiPembayaran.java`.
4. Masukkan nama barang.
5. Masukkan harga barang.
6. Pilih metode pembayaran (Tunai atau Transfer).
7. Klik tombol **BAYAR**.
8. Hasil total pembayaran akan ditampilkan pada aplikasi.

---

**Dibuat oleh Azalia Sakila**  
**NIM F1D02510005 | Kelas B**
