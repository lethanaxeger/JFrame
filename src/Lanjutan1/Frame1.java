
package Lanjutan1;

/**
 *
 * @author WINDOWS 10
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Downloads\\asem lo.jpg")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Downloads\\mme lu garing.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 60, 16);

        jLabel2.setText("Nama ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 37, 16);

        jLabel3.setText("Absen ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 39, 16);
        getContentPane().add(Nama);
        Nama.setBounds(80, 70, 230, 30);
        getContentPane().add(Absen);
        Absen.setBounds(80, 120, 230, 30);

        jLabel4.setText("Kelas ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 34, 16);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox);
        ComboBox.setBounds(80, 170, 140, 22);

        jLabel5.setText("Jurusan ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 220, 50, 16);

        rd1.setText("RPL");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        getContentPane().add(rd1);
        rd1.setBounds(90, 220, 49, 25);

        rd2.setText("TKJ");
        getContentPane().add(rd2);
        rd2.setBounds(190, 220, 107, 25);

        jLabel6.setText("Alamat ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 50, 16);
        getContentPane().add(Alamat);
        Alamat.setBounds(100, 260, 210, 30);

        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        getContentPane().add(Send);
        Send.setBounds(90, 320, 80, 25);

        Exit.setText("EXIT");
        getContentPane().add(Exit);
        Exit.setBounds(250, 320, 59, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Downloads\\mme lu garing.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 60, 310, 300);

        setBounds(0, 0, 673, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = ComboBox.getSelectedItem().toString();
        String jurusan = "";
        String alamat = Alamat.getText();

        if (rd1.isSelected()) {
            jurusan = "RPL";
        } else if (rd2.isSelected()) {
            jurusan = "TKJ";
        } else if (ComboBox.getSelectedItem() == "XI RPL 1") {
        }
        if (ComboBox.getSelectedItem() == "XI RPL 2") {
        }
        if (ComboBox.getSelectedItem() == "XI RPL 3") {
        }
        if (ComboBox.getSelectedItem() == "XI RPL 4") {
        }
        if (ComboBox.getSelectedItem() == "XI RPL 5") {
        }
        if (ComboBox.getSelectedItem() == "XI RPL 6") {
        }

        new Frame2(nama, absen, kelas, jurusan, alamat).setVisible(true);
    }//GEN-LAST:event_SendActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    // End of variables declaration//GEN-END:variables
}