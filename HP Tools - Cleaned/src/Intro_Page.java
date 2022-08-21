import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Intro_Page extends javax.swing.JFrame {

    public Intro_Page() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        copyright2 = new javax.swing.JLabel();
        sdc_gen = new javax.swing.JButton();
        pg_est1 = new javax.swing.JButton();

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel21.setText("Voltage");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Heading.setBackground(new java.awt.Color(38, 213, 211));
        Heading.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("High Performance Tools");
        Heading.setOpaque(true);

        copyright2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        copyright2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/struent_logo.png"))); // NOI18N
        copyright2.setText("© Copyright 2022 Struent Semiconductors ");

        sdc_gen.setBackground(new java.awt.Color(40, 219, 217));
        sdc_gen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        sdc_gen.setForeground(new java.awt.Color(255, 255, 255));
        sdc_gen.setText("SDC Generator");
        sdc_gen.setAlignmentX(0.5F);
        sdc_gen.setDefaultCapable(false);
        sdc_gen.setFocusable(false);
        sdc_gen.setVerifyInputWhenFocusTarget(false);
        sdc_gen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sdc_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdc_genActionPerformed(evt);
            }
        });

        pg_est1.setBackground(new java.awt.Color(40, 219, 217));
        pg_est1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pg_est1.setForeground(new java.awt.Color(255, 255, 255));
        pg_est1.setText("PG Estimator");
        pg_est1.setAlignmentX(0.5F);
        pg_est1.setDefaultCapable(false);
        pg_est1.setFocusable(false);
        pg_est1.setVerifyInputWhenFocusTarget(false);
        pg_est1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pg_est1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pg_est1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(877, Short.MAX_VALUE)
                .addComponent(copyright2))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(sdc_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(pg_est1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(830, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(sdc_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(copyright2)
                .addGap(6, 6, 6))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(pg_est1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(352, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void sdc_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdc_genActionPerformed
        SDC_Generator sdc=new SDC_Generator();
        sdc.setResizable(false);
        sdc.setVisible(true);
        sdc.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_sdc_genActionPerformed

    private void pg_est1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pg_est1ActionPerformed
        JOptionPane.showMessageDialog(null,"Warning: Calculations will always give '1' for every output regardless of Input.");
        PG_Calc pgc=new PG_Calc();
        pgc.setDefaultCloseOperation(HIDE_ON_CLOSE);
        pgc.main(null);
    }//GEN-LAST:event_pg_est1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
            Intro_Page intro_pg=new Intro_Page();
            intro_pg.getContentPane().setBackground(Color.WHITE);
            intro_pg.setVisible(true);
            intro_pg.setResizable(false);
//            JOptionPane.showMessageDialog(null,"Warning: Due to security reasons and to uphold confidentiality of , the formulae used in the calculations are removed");
            int tempoption=JOptionPane.showConfirmDialog(null,"To uphold confidentiality of the calculation formulae made by the company,\nI have been directed to remove or modify the following features in the application's public release:\n* The lines of code used to calculate the PG Estimator outputs are removed completely.\n* The PG Estimator will instead give \'1\' as value for every output field.\n* Some UI functionalities may not be present.\n* The SDC Generator's function is almost completely removed and can ony read and store\n  excel sheets as a text file without any actual processing.\n\n Are you sure you want to proceed?", "Warning: This Application Version is a Public Release", JOptionPane.OK_CANCEL_OPTION);
            if(tempoption==JOptionPane.OK_OPTION){}
            else System.exit(0);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel copyright2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JButton pg_est1;
    private javax.swing.JButton sdc_gen;
    // End of variables declaration//GEN-END:variables
}
