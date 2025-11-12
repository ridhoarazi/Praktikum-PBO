package pertemuan11_guilanjutan;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Models.Book;

public class BookPage extends javax.swing.JPanel {

    private JTable table;
    private DefaultTableModel model;
    private JTextField tfJudul, tfPenulis, tfTahun;

    public BookPage(MainFrame frame) {
        setLayout(null);

        // ======= Label Judul Halaman =======
        JLabel title = new JLabel("Daftar Buku");
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setBounds(260, 20, 200, 30);
        add(title);

        // ======= Tabel Buku =======
        model = new DefaultTableModel(new Object[]{"Judul", "Penulis", "Tahun", "Status"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 70, 500, 150);
        add(scrollPane);

        // ======= Input Form =======
        JLabel lblJudul = new JLabel("Judul:");
        lblJudul.setBounds(100, 230, 80, 25);
        add(lblJudul);
        tfJudul = new JTextField();
        tfJudul.setBounds(180, 230, 150, 25);
        add(tfJudul);

        JLabel lblPenulis = new JLabel("Penulis:");
        lblPenulis.setBounds(350, 230, 80, 25);
        add(lblPenulis);
        tfPenulis = new JTextField();
        tfPenulis.setBounds(430, 230, 150, 25);
        add(tfPenulis);

        JLabel lblTahun = new JLabel("Tahun:");
        lblTahun.setBounds(100, 265, 80, 25);
        add(lblTahun);
        tfTahun = new JTextField();
        tfTahun.setBounds(180, 265, 150, 25);
        add(tfTahun);

        // ======= Tombol =======
        JButton btnAdd = new JButton("Tambah");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Hapus");
        JButton btnBack = new JButton("Kembali");

        btnAdd.setBounds(100, 310, 100, 30);
        btnEdit.setBounds(210, 310, 100, 30);
        btnDelete.setBounds(320, 310, 100, 30);
        btnBack.setBounds(500, 310, 100, 30);

        add(btnAdd);
        add(btnEdit);
        add(btnDelete);
        add(btnBack);

        // ======= Event Tombol =======
        btnBack.addActionListener(e -> frame.showPage("home"));

        // Tombol Tambah Buku
        btnAdd.addActionListener(e -> {
            try {
                String judul = tfJudul.getText();
                String penulis = tfPenulis.getText();
                int tahun = Integer.parseInt(tfTahun.getText());

                if (judul.isEmpty() || penulis.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Judul dan Penulis tidak boleh kosong!");
                    return;
                }

                Book newBook = new Book(judul, penulis, tahun, false);
                frame.getBooks().add(newBook);
                refreshTable(frame.getBooks());

                tfJudul.setText("");
                tfPenulis.setText("");
                tfTahun.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Tahun harus berupa angka!");
            }
        });

        // Tombol Edit Buku
        btnEdit.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) {
                try {
                    String judulBaru = tfJudul.getText();
                    String penulisBaru = tfPenulis.getText();
                    int tahunBaru = Integer.parseInt(tfTahun.getText());

                    Book b = frame.getBooks().get(row);
                    b.setJudul(judulBaru);
                    b.setPenulis(penulisBaru);
                    b.setTahun(tahunBaru);

                    refreshTable(frame.getBooks());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Tahun harus berupa angka!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilih buku yang mau diedit dulu!");
            }
        });

        // Tombol Hapus Buku
        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) {
                frame.getBooks().remove(row);
                refreshTable(frame.getBooks());
            } else {
                JOptionPane.showMessageDialog(null, "Pilih buku yang mau dihapus dulu!");
            }
        });

        // Saat klik di tabel → isi text field
        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0 && row < frame.getBooks().size()) {
                Book b = frame.getBooks().get(row);
                tfJudul.setText(b.getJudul());
                tfPenulis.setText(b.getPenulis());
                tfTahun.setText(String.valueOf(b.getTahun()));
            }
        });

        // Refresh tabel di awal
        refreshTable(frame.getBooks());
    }

    private void refreshTable(ArrayList<Book> books) {
        model.setRowCount(0);
        for (Book b : books) {
            model.addRow(new Object[]{
                b.getJudul(),
                b.getPenulis(),
                b.getTahun(),
                b.getStatus() ? "Booked" : "Available"
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
