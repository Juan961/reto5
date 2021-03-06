package view;

public class mainEjemplo extends javax.swing.JFrame {

    /**
     * Creates new form mainEjemplo
     */
    public mainEjemplo() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        welcomeMessage = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        registerMessage = new javax.swing.JLabel();
        loginMessage = new javax.swing.JLabel();
        infoMessage1 = new javax.swing.JLabel();
        infoMessage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuevana");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 520));

        welcomeMessage.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 36)); // NOI18N
        welcomeMessage.setText("Bienvenido");
        jPanel1.add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        registerButton.setText("ac??");
        registerButton.setActionCommand("login");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        loginButton.setText("ac??");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, -1, -1));

        registerMessage.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        registerMessage.setText("Comienza a compartir dando click");
        jPanel1.add(registerMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 24));

        loginMessage.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        loginMessage.setText("Si ya tienes cuenta da click");
        jPanel1.add(loginMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, 20));

        infoMessage1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        infoMessage1.setText("Enterate sobre lo que estan realizando los mejores directores del");
        jPanel1.add(infoMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 500, 32));

        infoMessage2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        infoMessage2.setText("mundo o recibe feedback sobre tu contenido");
        jPanel1.add(infoMessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        register reg = new register();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoMessage1;
    private javax.swing.JLabel infoMessage2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginMessage;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerMessage;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
