/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author RAHUL MALI
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {
    
    private String startGame ="X";
    private int XCount =0;
    private int OCount =0;

    /**
     * Creates new form Tic_Tac_Toe
     */
    public Tic_Tac_Toe() {
        initComponents();
        setSize(1200,700);
        setLocationRelativeTo(null);
    }
    
    private void gameScore(){
        jbplayerX.setText(String.valueOf(XCount));
        jbPlayerO.setText(String.valueOf(OCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    
    private void winningGame(){
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
    
        if(b1==("X")&&b2==("X")&&b3==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton2.setBackground(Color.cyan);
            jButton3.setBackground(Color.cyan);
        }
        
        if(b4==("X")&&b5==("X")&&b6==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton4.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
        }
        if(b7==("X")&&b8==("X")&&b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton7.setBackground(Color.blue);
            jButton8.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
        }
        if(b1==("X")&&b4==("X")&&b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton1.setBackground(Color.magenta);
            jButton4.setBackground(Color.magenta);
            jButton7.setBackground(Color.magenta);
        }
        if(b2==("X")&&b5==("X")&&b8==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton2.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton8.setBackground(Color.pink);
        }
        if(b3==("X")&&b6==("X")&&b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton3.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            jButton9.setBackground(Color.green);
        }
        if(b1==("X")&&b5==("X")&&b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton1.setBackground(Color.blue);
            jButton5.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
        }
        if(b3==("X")&&b5==("X")&&b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            XCount++;
            gameScore();
            jButton3.setBackground(Color.blue);
            jButton5.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
        }
        if(b1==("O")&&b2==("O")&&b3==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton1.setBackground(Color.cyan);
            jButton2.setBackground(Color.cyan);
            jButton3.setBackground(Color.cyan);
        }
        
        if(b4==("O")&&b5==("O")&&b6==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton4.setBackground(Color.yellow);
            jButton5.setBackground(Color.yellow);
            jButton6.setBackground(Color.yellow);
        }
        if(b7==("O")&&b8==("O")&&b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton7.setBackground(Color.blue);
            jButton8.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
        }
        if(b1==("O")&&b4==("O")&&b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton1.setBackground(Color.magenta);
            jButton4.setBackground(Color.magenta);
            jButton7.setBackground(Color.magenta);
        }
        if(b2==("O")&&b5==("O")&&b8==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton2.setBackground(Color.pink);
            jButton5.setBackground(Color.pink);
            jButton8.setBackground(Color.pink);
        }
        if(b3==("O")&&b6==("O")&&b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton3.setBackground(Color.green);
            jButton6.setBackground(Color.green);
            jButton9.setBackground(Color.green);
        }
        if(b1==("O")&&b5==("O")&&b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton1.setBackground(Color.blue);
            jButton5.setBackground(Color.blue);
            jButton9.setBackground(Color.blue);
        }
        if(b3==("O")&&b5==("O")&&b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            OCount++;
            gameScore();
            jButton3.setBackground(Color.blue);
            jButton5.setBackground(Color.blue);
            jButton7.setBackground(Color.blue);
        }
    
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jbplayerX = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jbPlayerO = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jbReset = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel21.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jbplayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel22.add(jbplayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel26.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jbPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel27.add(jbPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel27);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel32);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel30);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jbReset.setBackground(new java.awt.Color(0, 255, 153));
        jbReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbReset.setText("Reset");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });
        jPanel29.add(jbReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel29);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jbExit.setBackground(new java.awt.Color(255, 0, 0));
        jbExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jPanel28.add(jbExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel28);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private JFrame frame;   
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
         frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION  )==JOptionPane.YES_NO_OPTION);
        {
                System.exit(0);
        }
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed

        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);

        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);

        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.GREEN);
        }
        else{
            jButton2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.GREEN);
        }
        else{
            jButton1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.GREEN);
        }
        else{
            jButton3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.GREEN);
        }
        else{
            jButton4.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.GREEN);
        }
        else{
            jButton5.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.GREEN);
        }
        else{
            jButton6.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.GREEN);
        }
        else{
            jButton7.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.GREEN);
        }
        else{
            jButton8.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.GREEN);
        }
        else{
            jButton9.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jbPlayerO;
    private javax.swing.JButton jbReset;
    private javax.swing.JLabel jbplayerX;
    // End of variables declaration//GEN-END:variables
}
