/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alexandra
 */
public class RegistroUsuario extends javax.swing.JFrame {

   public RegistroUsuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbltema = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblclave = new javax.swing.JLabel();
        lblrepclave = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        txtrepcontrasena = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        btnregistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lbltema.setFont(new java.awt.Font("Trebuchet MS", 3, 28)); // NOI18N
        lbltema.setText("Registro de Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(lbltema, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblusuario.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(51, 51, 51));
        lblusuario.setText("Ingrese Usuario:");

        lblclave.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        lblclave.setForeground(new java.awt.Color(51, 51, 51));
        lblclave.setText("Contraseña:");

        lblrepclave.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        lblrepclave.setForeground(new java.awt.Color(51, 51, 51));
        lblrepclave.setText("Repetir Contraseña:");

        lblsaldo.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(51, 51, 51));
        lblsaldo.setText("Saldo Inicial:");

        txtrepcontrasena.setBackground(new java.awt.Color(153, 153, 255));
        txtrepcontrasena.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtcontrasena.setBackground(new java.awt.Color(153, 153, 255));
        txtcontrasena.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtsaldo.setBackground(new java.awt.Color(153, 153, 255));
        txtsaldo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtusuario.setBackground(new java.awt.Color(153, 153, 255));
        txtusuario.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        btnregistrarse.setBackground(new java.awt.Color(153, 153, 255));
        btnregistrarse.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btnregistrarse.setText("Registrarse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblrepclave)
                            .addComponent(lblusuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblclave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsaldo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtrepcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtcontrasena, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsaldo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblclave)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrepclave)
                    .addComponent(txtrepcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsaldo)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
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

    public JButton getBtnregistrarse() {
        return btnregistrarse;
    }

    public void setBtnregistrarse(JButton btnregistrarse) {
        this.btnregistrarse = btnregistrarse;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getTxtcontrasena() {
        return txtcontrasena;
    }

    public void setTxtcontrasena(JTextField txtcontrasena) {
        this.txtcontrasena = txtcontrasena;
    }

    public JTextField getTxtrepcontrasena() {
        return txtrepcontrasena;
    }

    public void setTxtrepcontrasena(JTextField txtrepcontrasena) {
        this.txtrepcontrasena = txtrepcontrasena;
    }

    public JTextField getTxtsaldo() {
        return txtsaldo;
    }

    public void setTxtsaldo(JTextField txtsaldo) {
        this.txtsaldo = txtsaldo;
    }

    public JTextField getTxtusuario() {
        return txtusuario;
    }

    public void setTxtusuario(JTextField txtusuario) {
        this.txtusuario = txtusuario;
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrarse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblrepclave;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lbltema;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JTextField txtrepcontrasena;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
