
import java.awt.*;
import javax.swing.*;

// ABSTRACT CLASS
abstract class Pembayaran {
    double harga;

    Pembayaran(double harga) {
        this.harga = harga;
    }

    abstract double hitungTotal();
}

// PEMBAYARAN TUNAI
class Tunai extends Pembayaran {

    Tunai(double harga) {
        super(harga);
    }

    @Override
    double hitungTotal() {
        return harga;
    }
}

// PEMBAYARAN TRANSFER
class Transfer extends Pembayaran {

    Transfer(double harga) {
        super(harga);
    }

    @Override
    double hitungTotal() {
        return harga + 2500;
    }
}

// GUI
public class AplikasiPembayaran extends JFrame {

    JTextField txtNama, txtHarga;
    JComboBox<String> cmbPembayaran;
    JButton btnBayar;
    JLabel lblHasil;

    AplikasiPembayaran() {

        setTitle("Aplikasi Pembayaran");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Komponen 1: JLabel
        add(new JLabel("Nama Barang:"));

        // Komponen 2: JTextField
        txtNama = new JTextField();
        add(txtNama);

        add(new JLabel("Harga Barang:"));

        txtHarga = new JTextField();
        add(txtHarga);

        add(new JLabel("Jenis Pembayaran:"));

        // Komponen 3: JComboBox
        cmbPembayaran = new JComboBox<>(
            new String[]{"Tunai", "Transfer"}
        );
        add(cmbPembayaran);

        // Komponen 4: JButton
        btnBayar = new JButton("Bayar");
        add(btnBayar);

        // Komponen 5: JLabel
        lblHasil = new JLabel("Total: Rp0");
        add(lblHasil);

        // EVENT BUTTON
        btnBayar.addActionListener(e -> {

            try {
                String nama = txtNama.getText();
                double harga = Double.parseDouble(
                    txtHarga.getText()
                );

                if (nama.trim().isEmpty() || harga < 0) {
                    JOptionPane.showMessageDialog(
                        this, "Data tidak boleh kosong atau negatif!"
                    );
                    return;
                }

                Pembayaran pembayaran;

                if (cmbPembayaran.getSelectedIndex() == 0) {
                    pembayaran = new Tunai(harga);
                } else {
                    pembayaran = new Transfer(harga);
                }

                double total = pembayaran.hitungTotal();

                lblHasil.setText(
                    "Total: Rp" + total
                );

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this, "Harga harus berupa angka!"
                );
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AplikasiPembayaran();
    }
}
