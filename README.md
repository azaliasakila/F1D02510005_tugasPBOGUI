# Aplikasi Pembayaran Sederhana

## Deskripsi
Aplikasi Pembayaran Sederhana merupakan program berbasis Java yang dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO).

Program ini menggunakan GUI (Graphical User Interface) dengan Java Swing untuk membantu pengguna melakukan simulasi perhitungan pembayaran berdasarkan metode pembayaran yang dipilih.

## Identitas Mahasiswa
- **Nama:** Azalia Sakila
- **NIM:** F1D02510005
- **Kelas:** B
- **Mata Kuliah:** Pemrograman Berorientasi Objek

## Fitur Aplikasi
1. Memasukkan nama barang.
2. Memasukkan harga barang.
3. Memilih jenis pembayaran (Tunai atau Transfer).
4. Menghitung total pembayaran secara otomatis.
5. Menampilkan hasil pembayaran.

## Konsep OOP yang Digunakan
- **Abstract Class:** `Pembayaran`
- **Inheritance:** `Tunai` dan `Transfer` mewarisi class `Pembayaran`.
- **Abstract Method:** `hitungTotal()`.
- **Polymorphism:** Objek `Pembayaran` dapat menggunakan implementasi dari class `Tunai` maupun `Transfer`.
- **Encapsulation:** Pengelompokan atribut dan method ke dalam class.

## Komponen GUI
Aplikasi dibuat menggunakan Java Swing dengan komponen:
- `JFrame`
- `JLabel`
- `JTextField`
- `JComboBox`
- `JButton`

## Aturan Perhitungan
- Pembayaran tunai: harga barang tanpa biaya tambahan.
- Pembayaran transfer: harga barang ditambah biaya administrasi simulasi sebesar Rp2.500.

## Teknologi
- Java
- Java Swing
- NetBeans / Visual Studio Code

## Cara Menjalankan
1. Pastikan Java JDK sudah terinstal.
2. Buka project menggunakan NetBeans atau Visual Studio Code.
3. Jalankan file `AplikasiPembayaran.java`.
4. Masukkan nama barang dan harga.
5. Pilih metode pembayaran.
6. Klik tombol **BAYAR** untuk melihat total pembayaran.

## Hasil Program
Aplikasi akan menampilkan total pembayaran sesuai dengan metode pembayaran yang dipilih.
## Tampilan dan Hasil Pengujian

### 1. Pembayaran Tunai

Pembayaran tunai tidak dikenakan biaya administrasi.

![Pembayaran Tunai](screenshots/tunai.png)

### 2. Pembayaran Transfer

Pembayaran transfer dikenakan biaya administrasi sebesar Rp2.500.

![Pembayaran Transfer](screenshots/transfer.png)
---

**Dibuat oleh Azalia Sakila**  
**F1D02510005 | Kelas B**
