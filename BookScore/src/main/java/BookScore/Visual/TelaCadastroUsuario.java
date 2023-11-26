/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BookScore.Visual;

import BookScore.Banco.ControleDados.CtrlUsuarios;
import javax.swing.JOptionPane;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        super("BookScore - Cadastro de Usuários");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cadastrarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        loginTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        confirmSenhaPasswordField = new javax.swing.JPasswordField();
        senhaPasswordField = new javax.swing.JPasswordField();
        idadeComboBox = new javax.swing.JComboBox<>();
        sexoComboBox = new javax.swing.JComboBox<>();
        generoFav1ComboBox = new javax.swing.JComboBox<>();
        generoFav2ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 51, 51));

        jPanel2.setBackground(new java.awt.Color(46, 79, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 228, 222));
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setForeground(new java.awt.Color(203, 228, 222));
        jLabel2.setText("Login:");

        jLabel3.setForeground(new java.awt.Color(203, 228, 222));
        jLabel3.setText("Senha:");

        jLabel4.setForeground(new java.awt.Color(203, 228, 222));
        jLabel4.setText("Confirme sua senha:");

        jLabel5.setForeground(new java.awt.Color(203, 228, 222));
        jLabel5.setText("Nome:");

        jLabel6.setForeground(new java.awt.Color(203, 228, 222));
        jLabel6.setText("Idade:");

        jLabel7.setForeground(new java.awt.Color(203, 228, 222));
        jLabel7.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Gêneros preferidos");

        cadastrarButton.setBackground(new java.awt.Color(14, 131, 136));
        cadastrarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(203, 228, 222));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        voltarButton.setBackground(new java.awt.Color(14, 131, 136));
        voltarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(203, 228, 222));
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        loginTextField.setBackground(new java.awt.Color(203, 228, 222));
        loginTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(44, 51, 51));

        nomeTextField.setBackground(new java.awt.Color(203, 228, 222));
        nomeTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeTextField.setForeground(new java.awt.Color(44, 51, 51));

        confirmSenhaPasswordField.setBackground(new java.awt.Color(203, 228, 222));
        confirmSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmSenhaPasswordField.setForeground(new java.awt.Color(44, 51, 51));

        senhaPasswordField.setBackground(new java.awt.Color(203, 228, 222));
        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaPasswordField.setForeground(new java.awt.Color(44, 51, 51));

        idadeComboBox.setBackground(new java.awt.Color(203, 228, 222));
        idadeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idadeComboBox.setForeground(new java.awt.Color(44, 51, 51));
        idadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));

        sexoComboBox.setBackground(new java.awt.Color(203, 228, 222));
        sexoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexoComboBox.setForeground(new java.awt.Color(44, 51, 51));
        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        generoFav1ComboBox.setBackground(new java.awt.Color(203, 228, 222));
        generoFav1ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generoFav1ComboBox.setForeground(new java.awt.Color(44, 51, 51));
        generoFav1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Romance", "Ficção", "Técnico" }));

        generoFav2ComboBox.setBackground(new java.awt.Color(203, 228, 222));
        generoFav2ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generoFav2ComboBox.setForeground(new java.awt.Color(44, 51, 51));
        generoFav2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Romance", "Ficção", "Técnico" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(loginTextField)
                            .addComponent(jLabel6)
                            .addComponent(senhaPasswordField)
                            .addComponent(idadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(nomeTextField)
                            .addComponent(confirmSenhaPasswordField)
                            .addComponent(sexoComboBox, 0, 180, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generoFav1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generoFav2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarButton))
                        .addGap(118, 118, 118))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoFav2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generoFav1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(voltarButton))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaInicialADM tiADM = new TelaInicialADM();
        tiADM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        String confirmSenha = new String(confirmSenhaPasswordField.getPassword());
        String nome = nomeTextField.getText();
        String stringIdade = idadeComboBox.getSelectedItem().toString();
        int idade = Integer.parseInt(stringIdade);
        String sexo = sexoComboBox.getSelectedItem().toString();
        String tipoFav1 = generoFav1ComboBox.getSelectedItem().toString();
        String tipoFav2 = generoFav2ComboBox.getSelectedItem().toString();

        CtrlUsuarios cUsuario = new CtrlUsuarios();

        if (!login.equals("") && !senha.equals("") && !nome.equals("")) {

            if (senha.equals(confirmSenha)) {

                if (!tipoFav1.equals("Selecione") || !tipoFav2.equals("Selecione")) {

                    if (tipoFav1.equals(tipoFav2)) {

                        JOptionPane.showMessageDialog(null, "Os gêneros não podem ser iguais!", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
                    } 
                    else {
                        try {

                            if (cUsuario.cadastraUsuarios(login, nome, stringIdade, sexo, senha, tipoFav1, tipoFav2)) {

                                int opcao = JOptionPane.showConfirmDialog(null, "Usuário cadastrado com sucesso! \n\nDeseja cadastrar mais algum Usuário?");

                                if (opcao == JOptionPane.YES_OPTION) {

                                    TelaCadastroUsuario tcUsuario = new TelaCadastroUsuario();
                                    tcUsuario.setVisible(true);
                                    this.dispose();

                                } else {

                                    TelaInicialADM tiADM = new TelaInicialADM();
                                    tiADM.setVisible(true);
                                    this.dispose();

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta! \n\n", "Erro de conexão", JOptionPane.ERROR_MESSAGE);

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro ao cadastrar conta! \n\n Não foi possível conectar-se ao banco.", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
                            e.printStackTrace();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Os gêneros estão vazios!", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "As senhas estão divergentes, verifique-as novamente!", "Senhas divergentes", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos solicitados!", "Campos vazios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JPasswordField confirmSenhaPasswordField;
    private javax.swing.JComboBox<String> generoFav1ComboBox;
    private javax.swing.JComboBox<String> generoFav2ComboBox;
    private javax.swing.JComboBox<String> idadeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}