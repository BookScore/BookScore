/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BookScore.Visual;

import BookScore.Banco.ControleDados.CntrlNota;
import BookScore.Banco.ControleDados.CtrlLivro;
import BookScore.Model.Livro;
import BookScore.Model.Singleton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author clj service
 */
public class TelaAvaliaLivro extends javax.swing.JFrame {

    /**
     * Creates new form TelaAvaliaLivro
     */
    public TelaAvaliaLivro() {
        initComponents();
        buscarLivro();
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
        nomeLivroTextField = new javax.swing.JTextField();
        nomeAutorTextField = new javax.swing.JTextField();
        cancelarButton = new javax.swing.JButton();
        avaliarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        notaLivroTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idLivroTextField = new javax.swing.JTextField();
        livrosComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 51, 51));

        jPanel2.setBackground(new java.awt.Color(46, 79, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 228, 222));
        jLabel1.setText("Avaliar Livro");

        jLabel2.setForeground(new java.awt.Color(203, 228, 222));
        jLabel2.setText("Livro:");

        jLabel3.setForeground(new java.awt.Color(203, 228, 222));
        jLabel3.setText("Nome:");

        jLabel4.setForeground(new java.awt.Color(203, 228, 222));
        jLabel4.setText("Autor:");

        nomeLivroTextField.setEditable(false);
        nomeLivroTextField.setBackground(new java.awt.Color(203, 228, 222));
        nomeLivroTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeLivroTextField.setForeground(new java.awt.Color(44, 51, 51));
        nomeLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeLivroTextFieldActionPerformed(evt);
            }
        });

        nomeAutorTextField.setEditable(false);
        nomeAutorTextField.setBackground(new java.awt.Color(203, 228, 222));
        nomeAutorTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeAutorTextField.setForeground(new java.awt.Color(44, 51, 51));
        nomeAutorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAutorTextFieldActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(14, 131, 136));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(203, 228, 222));
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        avaliarButton.setBackground(new java.awt.Color(14, 131, 136));
        avaliarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avaliarButton.setForeground(new java.awt.Color(203, 228, 222));
        avaliarButton.setText("Avaliar");
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(203, 228, 222));
        jLabel5.setText("Dê uma nota de 0 a 10:");

        notaLivroTextField.setBackground(new java.awt.Color(203, 228, 222));
        notaLivroTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        notaLivroTextField.setForeground(new java.awt.Color(44, 51, 51));
        notaLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaLivroTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(203, 228, 222));
        jLabel6.setText("ID:");

        idLivroTextField.setEditable(false);
        idLivroTextField.setBackground(new java.awt.Color(203, 228, 222));
        idLivroTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idLivroTextField.setForeground(new java.awt.Color(44, 51, 51));

        livrosComboBox.setBackground(new java.awt.Color(203, 228, 222));
        livrosComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        livrosComboBox.setForeground(new java.awt.Color(44, 51, 51));
        livrosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(notaLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(nomeAutorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(idLivroTextField)))))
                    .addComponent(nomeLivroTextField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cancelarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avaliarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(livrosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(livrosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLivroTextField)
                    .addComponent(nomeAutorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(avaliarButton))
                .addGap(19, 19, 19))
        );

        livrosComboBox.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        TelaInicialUsuario tiUsuario = new TelaInicialUsuario();
        tiUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        
        String nomeLivro = nomeLivroTextField.getText();
        String nomeAutor = nomeAutorTextField.getText();
        int idLivro = Integer.parseInt(idLivroTextField.getText());
        String stringNotaLivro = notaLivroTextField.getText();
        int notaLivro = Integer.parseInt(stringNotaLivro);
        
        if(nomeLivro == null || nomeLivro.length() == 0 || nomeAutor == null || nomeAutor.length() == 0 || stringNotaLivro.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os todos campos!");
        }
        else {
            if(notaLivro < 0 || notaLivro > 10){
                JOptionPane.showMessageDialog(null,"A nota deve ser de 0 à 10!", "Preencha corretamente", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try {
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente avaliar o livro?");
                    if(opcao == JOptionPane.YES_OPTION) {
                    
                        CntrlNota cNota = new CntrlNota();
                        int idUser = Singleton.getInstance().getIdUsuario();
                    
                        if(cNota.registrarNota(notaLivro,idUser, idLivro)){
                        
                            JOptionPane.showMessageDialog(null, "Avaliação registrada com sucesso!");
                            this.dispose();
                              buscarLivro();
                            new TelaAvaliaLivro().setVisible(true);
//                            nomeLivroTextField.setText("");
//                            nomeAutorTextField.setText("");
//                            idLivroTextField.setText("");
//                        
//                            JOptionPane.showMessageDialog(null, "Avaliação registrada com sucesso!");
//                            buscarLivro();
                        }
                    }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Desculpe, estamos com problemas tecnicos");
                e.printStackTrace();
            }
            }
        }
    }//GEN-LAST:event_avaliarButtonActionPerformed

    private void livrosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosComboBoxActionPerformed
        Livro livros = (Livro)livrosComboBox.getSelectedItem();
        
        nomeLivroTextField.setText(livros.getNome());
        nomeAutorTextField.setText(livros.getAutor());
        idLivroTextField.setText(Integer.toString(livros.getId()));
    }//GEN-LAST:event_livrosComboBoxActionPerformed

    private void nomeLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeLivroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeLivroTextFieldActionPerformed

    private void nomeAutorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAutorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAutorTextFieldActionPerformed

    private void notaLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaLivroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaLivroTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAvaliaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAvaliaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avaliarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField idLivroTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<Livro> livrosComboBox;
    private javax.swing.JTextField nomeAutorTextField;
    private javax.swing.JTextField nomeLivroTextField;
    private javax.swing.JTextField notaLivroTextField;
    // End of variables declaration//GEN-END:variables


    
    private void buscarLivro(){
        try {
            CtrlLivro cLivro = new CtrlLivro();
            Livro[] livros = cLivro.pegaListaLivros();
            livrosComboBox.setModel(new DefaultComboBoxModel<>(livros));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao subir lista de livros.");
            e.printStackTrace();
        }
    }


}