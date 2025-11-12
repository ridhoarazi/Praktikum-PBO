package pertemuan11_guilanjutan;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class HomePage extends javax.swing.JPanel {

    public HomePage(MainFrame frame) {
        setLayout(null);

        JLabel title = new JLabel("Selamat Datang di Sistem Perpustakaan");
        title.setFont(new Font("Segoe UI", Font.BOLD, 16));
        title.setBounds(150, 60, 400, 30);
        add(title);

        JButton btnBooks = new JButton("Kelola Buku");
        btnBooks.setBounds(250, 130, 150, 40);
        add(btnBooks);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(250, 190, 150, 40);
        add(btnLogout);

        btnBooks.addActionListener(e -> {
            frame.showPage("book");
        });

        btnLogout.addActionListener(e -> {
            frame.showPage("login");
        });
    }

    @SuppressWarnings("unchecked")
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
