package view;

import access.usuarioDAO;
import static javax.swing.JOptionPane.showMessageDialog;

public class account extends javax.swing.JFrame {

    /**
     * Creates new form account
     */
    public account() {
        initComponents();
        this.setLocationRelativeTo(null);
        nameUser.setText(login.loginUser.getNombreUsuario());
        emailUser.setText(login.loginUser.getEmailUsuario());
        passwordUser.setText(login.loginUser.getContraseñaUsuario());
        isDirector.setSelected(login.loginUser.isDirectorUsuario() );
        shareEmail.setSelected(login.loginUser.isShareEmail() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        accountMessage = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        emailUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JPasswordField();
        isDirector = new javax.swing.JCheckBox();
        shareEmail = new javax.swing.JCheckBox();
        updateUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        nameMessage = new javax.swing.JLabel();
        emailMessage = new javax.swing.JLabel();
        passwordMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        backButton.setText("Volver");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        accountMessage.setForeground(new java.awt.Color(255, 255, 255));
        accountMessage.setText("Cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(accountMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(accountMessage))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        emailUser.setEditable(false);

        isDirector.setText("¿Eres creador?");

        shareEmail.setText("¿Deseas compartir tu email en caso de que alguien te contacte?");

        updateUser.setText("Actualizar datos");
        updateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateUserMouseClicked(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(255, 0, 0));
        deleteUser.setForeground(new java.awt.Color(255, 255, 255));
        deleteUser.setText("Eliminar cuenta");

        nameMessage.setText("Nombre");

        emailMessage.setText("Email");

        passwordMessage.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(385, 385, 385)
                                .addComponent(nameMessage))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(isDirector))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameUser)
                                        .addComponent(emailUser, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(emailMessage))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(passwordMessage))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(shareEmail)))
                        .addGap(0, 424, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(updateUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(nameMessage)
                .addGap(18, 18, 18)
                .addComponent(nameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(emailMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordMessage)
                .addGap(14, 14, 14)
                .addComponent(passwordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isDirector)
                .addGap(18, 18, 18)
                .addComponent(shareEmail)
                .addGap(26, 26, 26)
                .addComponent(updateUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(deleteUser)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        contenido contenido = new contenido();
        contenido.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

    private void updateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMouseClicked
        String nombre = nameUser.getText();
        String contraseña = passwordUser.getText();
        boolean director = isDirector.isEnabled();
        boolean share = shareEmail.isEnabled();
        
        usuarioDAO update = new usuarioDAO();
        
        boolean pass = update.updateUser(login.loginUser, nombre, contraseña, director, share);
        
        if(pass){
            showMessageDialog(null, "El usuario ha sido actualizado");
            contenido contenido = new contenido();
            contenido.setVisible(true);
            this.setVisible(false);
        } else {
            showMessageDialog(null, "Algo salio mal");

        }
    }//GEN-LAST:event_updateUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountMessage;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteUser;
    private javax.swing.JLabel emailMessage;
    private javax.swing.JTextField emailUser;
    private javax.swing.JCheckBox isDirector;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameMessage;
    private javax.swing.JTextField nameUser;
    private javax.swing.JLabel passwordMessage;
    private javax.swing.JPasswordField passwordUser;
    private javax.swing.JCheckBox shareEmail;
    private javax.swing.JButton updateUser;
    // End of variables declaration//GEN-END:variables
}
