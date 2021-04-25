/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akasztofa;

import java.util.ArrayList;
import javax.swing.ButtonGroup;


public class Ablak extends javax.swing.JFrame 
{   
    private ArrayList<String> szavak;
    private String tippelendo;

 
    public Ablak()
    {   
        szavak=new ArrayList();
        listaFeltolt();
        szotGeneral();
        
        initComponents();
        
        
        ButtonGroup radiogombok=new ButtonGroup();
        radiogombok.add(rbKonnyu);
        radiogombok.add(rbNehez);
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMegfejtes = new javax.swing.JButton();
        btnUjszo = new javax.swing.JButton();
        lblKitalalando = new javax.swing.JLabel();
        lblKitalalndoSzoMezo = new javax.swing.JLabel();
        lblHibakSzama = new javax.swing.JLabel();
        cbTipp = new javax.swing.JCheckBox();
        lblTippeles = new javax.swing.JLabel();
        lblFelhasznaltBetuk = new javax.swing.JLabel();
        txtFelhasznaltBetuk = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuJatek = new javax.swing.JMenu();
        btnUjatek = new javax.swing.JMenuItem();
        btnMentes = new javax.swing.JMenuItem();
        btnBetoltes = new javax.swing.JMenuItem();
        mnuNehezseg = new javax.swing.JMenu();
        rbKonnyu = new javax.swing.JRadioButtonMenuItem();
        rbNehez = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMegfejtes.setText("Megfejtés");

        btnUjszo.setText("ÚjSzó");

        lblKitalalando.setText("Kitalálando szó:");

        lblKitalalndoSzoMezo.setText("- - - - - - ");

        lblHibakSzama.setText("Hibák száma");

        lblTippeles.setText("Tippelés");

        lblFelhasznaltBetuk.setText("Felhasznált betük");

        mnuJatek.setText("Játék");

        btnUjatek.setText("Új játék");
        mnuJatek.add(btnUjatek);

        btnMentes.setText("Mentés");
        mnuJatek.add(btnMentes);

        btnBetoltes.setText("Betöltés");
        mnuJatek.add(btnBetoltes);

        jMenuBar1.add(mnuJatek);

        mnuNehezseg.setText("Nehézség");

        rbKonnyu.setSelected(true);
        rbKonnyu.setText("Könnyü");
        mnuNehezseg.add(rbKonnyu);

        rbNehez.setSelected(true);
        rbNehez.setText("Nehéz");
        mnuNehezseg.add(rbNehez);

        jMenuBar1.add(mnuNehezseg);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKitalalndoSzoMezo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTippeles)))
                        .addGap(18, 18, 18)
                        .addComponent(cbTipp)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMegfejtes)
                                .addGap(18, 18, 18)
                                .addComponent(btnUjszo))
                            .addComponent(lblKitalalando)
                            .addComponent(lblHibakSzama)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFelhasznaltBetuk, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFelhasznaltBetuk))))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegfejtes)
                    .addComponent(btnUjszo))
                .addGap(42, 42, 42)
                .addComponent(lblKitalalando)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblKitalalndoSzoMezo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipp)
                            .addComponent(lblTippeles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFelhasznaltBetuk)
                        .addGap(4, 4, 4)))
                .addComponent(lblHibakSzama)
                .addGap(18, 18, 18)
                .addComponent(txtFelhasznaltBetuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBetoltes;
    private javax.swing.JButton btnMegfejtes;
    private javax.swing.JMenuItem btnMentes;
    private javax.swing.JMenuItem btnUjatek;
    private javax.swing.JButton btnUjszo;
    private javax.swing.JCheckBox cbTipp;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblFelhasznaltBetuk;
    private javax.swing.JLabel lblHibakSzama;
    private javax.swing.JLabel lblKitalalando;
    private javax.swing.JLabel lblKitalalndoSzoMezo;
    private javax.swing.JLabel lblTippeles;
    private javax.swing.JMenu mnuJatek;
    private javax.swing.JMenu mnuNehezseg;
    private javax.swing.JRadioButtonMenuItem rbKonnyu;
    private javax.swing.JRadioButtonMenuItem rbNehez;
    private javax.swing.JTextField txtFelhasznaltBetuk;
    // End of variables declaration//GEN-END:variables

    private void listaFeltolt() 
    {
       szavak.add("alma");
       szavak.add("eper");
       szavak.add("iskola");
       szavak.add("kutya");
       szavak.add("macska");
       szavak.add("marha");
       szavak.add("laptop");
       szavak.add("telefon");
       szavak.add("fon");
       
       
    }

    private void szotGeneral()
    {
        int randszam=(int)(Math.random()*szavak.size())+1;
        
        tippelendo=szavak.get(randszam);
        
        System.out.println(tippelendo);
    }
}
