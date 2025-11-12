import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PenentuNilaiMahasiswa extends JFrame {

    JTextField txtNama, txtTugas, txtUTS, txtUAS;
    JTextField txtOutNama, txtOutRata, txtOutGrade, txtOutHasil;

    public PenentuNilaiMahasiswa() {
        setTitle("Aplikasi Penentu Nilai Mahasiswa");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panelInput = new JPanel(null);
        panelInput.setBounds(20, 60, 200, 200);
        panelInput.setBackground(new Color(180, 255, 180));

        panelInput.add(new JLabel("Tugas:")).setBounds(10, 20, 80, 25);
        txtTugas = new JTextField();
        txtTugas.setBounds(90, 20, 80, 25);
        panelInput.add(txtTugas);

        panelInput.add(new JLabel("UTS:")).setBounds(10, 60, 80, 25);
        txtUTS = new JTextField();
        txtUTS.setBounds(90, 60, 80, 25);
        panelInput.add(txtUTS);

        panelInput.add(new JLabel("UAS:")).setBounds(10, 100, 80, 25);
        txtUAS = new JTextField();
        txtUAS.setBounds(90, 100, 80, 25);
        panelInput.add(txtUAS);

        add(panelInput);

        JPanel panelOutput = new JPanel(null);
        panelOutput.setBounds(260, 60, 200, 200);
        panelOutput.setBackground(new Color(255, 255, 170));

        panelOutput.add(new JLabel("Nama:")).setBounds(10, 20, 80, 25);
        txtOutNama = new JTextField();
        txtOutNama.setEditable(false);
        txtOutNama.setBounds(90, 20, 100, 25);
        panelOutput.add(txtOutNama);

        panelOutput.add(new JLabel("AVG:")).setBounds(10, 60, 80, 25);
        txtOutRata = new JTextField();
        txtOutRata.setEditable(false);
        txtOutRata.setBounds(90, 60, 100, 25);
        panelOutput.add(txtOutRata);

        panelOutput.add(new JLabel("Grade:")).setBounds(10, 100, 80, 25);
        txtOutGrade = new JTextField();
        txtOutGrade.setEditable(false);
        txtOutGrade.setBounds(90, 100, 100, 25);
        panelOutput.add(txtOutGrade);

        panelOutput.add(new JLabel("Hasil:")).setBounds(10, 140, 80, 25);
        txtOutHasil = new JTextField();
        txtOutHasil.setEditable(false);
        txtOutHasil.setBounds(90, 140, 100, 25);
        panelOutput.add(txtOutHasil);

        add(panelOutput);

        // Nama
        JLabel lblNama = new JLabel("Nama Lengkap:");
        lblNama.setBounds(20, 15, 100, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(140, 15, 320, 25);
        add(txtNama);

        // Tombol
        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBounds(20, 270, 100, 30);
        btnHitung.addActionListener(e -> hitungNilai());
        add(btnHitung);

        JButton btnReset = new JButton("Bersihkan");
        btnReset.setBounds(140, 270, 120, 30);
        btnReset.addActionListener(e -> reset());
        add(btnReset);

        JButton btnExit = new JButton("Keluar");
        btnExit.setBounds(380, 270, 80, 30);
        btnExit.addActionListener(e -> System.exit(0));
        add(btnExit);

        setVisible(true);
    }

    private void hitungNilai() {
        try {
            double tugas = Double.parseDouble(txtTugas.getText());
            double uts = Double.parseDouble(txtUTS.getText());
            double uas = Double.parseDouble(txtUAS.getText());

            double rata = (tugas + uts + uas) / 3;
            String grade, hasil;

            if (rata >= 85) grade = "A";
            else if (rata >= 75) grade = "B";
            else if (rata >= 65) grade = "C";
            else grade = "D";

            hasil = (rata >= 65) ? "Lulus" : "Tidak Lulus";

            txtOutNama.setText(txtNama.getText());
            txtOutRata.setText(String.format("%.2f", rata));
            txtOutGrade.setText(grade);
            txtOutHasil.setText(hasil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }

    private void reset() {
        txtNama.setText("");
        txtTugas.setText("");
        txtUTS.setText("");
        txtUAS.setText("");
        txtOutNama.setText("");
        txtOutRata.setText("");
        txtOutGrade.setText("");
        txtOutHasil.setText("");
    }

    public static void main(String[] args) {
        new PenentuNilaiMahasiswa();
    }
}
