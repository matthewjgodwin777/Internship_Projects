import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.*;   
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class PG_Calc extends javax.swing.JFrame {

    double out[]=new double[12];
    boolean inv[]=new boolean[12];
    public PG_Calc() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        m3_ts_req = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        mtop1_ts_req = new javax.swing.JTextField();
        m3_width = new javax.swing.JTextField();
        btop_ts_req_label = new javax.swing.JLabel();
        btop_width_label = new javax.swing.JLabel();
        mtop1_width = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        more = new javax.swing.JButton();
        copyright2 = new javax.swing.JLabel();
        copyright1 = new javax.swing.JLabel();
        fp_inp_button = new javax.swing.JButton();
        sr_inp_button = new javax.swing.JButton();
        cd_inp_button1 = new javax.swing.JButton();
        stripe_dist_inp_button = new javax.swing.JButton();
        other_inp_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mtop_width = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        mtop_ts_req = new javax.swing.JTextField();

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel21.setText("Voltage");

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
        Heading.setText("PG Estimator");
        Heading.setOpaque(true);

        m3_ts_req.setEditable(false);
        m3_ts_req.setBackground(getBackground());
        m3_ts_req.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        m3_ts_req.setAutoscrolls(false);
        m3_ts_req.setOpaque(false);
        m3_ts_req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3_ts_reqActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Mtop-1 Total Stripes Required");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel24.setText("Mtop-1 Width (µm)");

        mtop1_ts_req.setEditable(false);
        mtop1_ts_req.setBackground(new java.awt.Color(255, 255, 255));
        mtop1_ts_req.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mtop1_ts_req.setAutoscrolls(false);
        mtop1_ts_req.setOpaque(false);
        mtop1_ts_req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtop1_ts_reqActionPerformed(evt);
            }
        });

        m3_width.setEditable(false);
        m3_width.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        m3_width.setAutoscrolls(false);
        m3_width.setOpaque(false);

        btop_ts_req_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btop_ts_req_label.setText("Btop Total Stripes Required");

        btop_width_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btop_width_label.setText("Btop Width (µm)");

        mtop1_width.setEditable(false);
        mtop1_width.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mtop1_width.setAutoscrolls(false);
        mtop1_width.setOpaque(false);

        calculate.setBackground(new java.awt.Color(67, 212, 210));
        calculate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        calculate.setForeground(new java.awt.Color(255, 255, 255));
        calculate.setText("Calculate");
        calculate.setAlignmentX(0.5F);
        calculate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(67, 212, 210));
        clear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setAlignmentX(0.5F);
        clear.setDefaultCapable(false);
        clear.setFocusable(false);
        clear.setVerifyInputWhenFocusTarget(false);
        clear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        more.setBackground(new java.awt.Color(61, 193, 192));
        more.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        more.setForeground(new java.awt.Color(255, 255, 255));
        more.setText("More");
        more.setAlignmentX(0.5F);
        more.setDefaultCapable(false);
        more.setFocusable(false);
        more.setVerifyInputWhenFocusTarget(false);
        more.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });

        copyright2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        copyright2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/struent_logo.png"))); // NOI18N
        copyright2.setText("© Copyright 2022 Struent Semiconductors ");

        copyright1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        copyright1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/struent_logo.png"))); // NOI18N
        copyright1.setText("© Copyright 2022 Struent Semiconductors ");

        fp_inp_button.setBackground(new java.awt.Color(67, 212, 210));
        fp_inp_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fp_inp_button.setForeground(new java.awt.Color(255, 255, 255));
        fp_inp_button.setText("Follow Pin");
        fp_inp_button.setToolTipText("");
        fp_inp_button.setAlignmentX(0.5F);
        fp_inp_button.setDefaultCapable(false);
        fp_inp_button.setFocusable(false);
        fp_inp_button.setVerifyInputWhenFocusTarget(false);
        fp_inp_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fp_inp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fp_inp_buttonActionPerformed(evt);
            }
        });

        sr_inp_button.setBackground(new java.awt.Color(67, 212, 210));
        sr_inp_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        sr_inp_button.setForeground(new java.awt.Color(255, 255, 255));
        sr_inp_button.setText("Sheet Resistance");
        sr_inp_button.setToolTipText("");
        sr_inp_button.setAlignmentX(0.5F);
        sr_inp_button.setDefaultCapable(false);
        sr_inp_button.setFocusable(false);
        sr_inp_button.setVerifyInputWhenFocusTarget(false);
        sr_inp_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sr_inp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_inp_buttonActionPerformed(evt);
            }
        });

        cd_inp_button1.setBackground(new java.awt.Color(67, 212, 210));
        cd_inp_button1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cd_inp_button1.setForeground(new java.awt.Color(255, 255, 255));
        cd_inp_button1.setText("Current Density");
        cd_inp_button1.setToolTipText("");
        cd_inp_button1.setAlignmentX(0.5F);
        cd_inp_button1.setDefaultCapable(false);
        cd_inp_button1.setFocusable(false);
        cd_inp_button1.setVerifyInputWhenFocusTarget(false);
        cd_inp_button1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cd_inp_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cd_inp_button1ActionPerformed(evt);
            }
        });

        stripe_dist_inp_button.setBackground(new java.awt.Color(67, 212, 210));
        stripe_dist_inp_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        stripe_dist_inp_button.setForeground(new java.awt.Color(255, 255, 255));
        stripe_dist_inp_button.setText("Stripe Distance");
        stripe_dist_inp_button.setToolTipText("");
        stripe_dist_inp_button.setAlignmentX(0.5F);
        stripe_dist_inp_button.setDefaultCapable(false);
        stripe_dist_inp_button.setFocusable(false);
        stripe_dist_inp_button.setVerifyInputWhenFocusTarget(false);
        stripe_dist_inp_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stripe_dist_inp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stripe_dist_inp_buttonActionPerformed(evt);
            }
        });

        other_inp_button.setBackground(new java.awt.Color(67, 212, 210));
        other_inp_button.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        other_inp_button.setForeground(new java.awt.Color(255, 255, 255));
        other_inp_button.setText("Other Grid Specs");
        other_inp_button.setToolTipText("");
        other_inp_button.setAlignmentX(0.5F);
        other_inp_button.setDefaultCapable(false);
        other_inp_button.setFocusable(false);
        other_inp_button.setVerifyInputWhenFocusTarget(false);
        other_inp_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        other_inp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                other_inp_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Inputs :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Outputs :");

        jLabel3.setText("    ");

        mtop_width.setEditable(false);
        mtop_width.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mtop_width.setAutoscrolls(false);
        mtop_width.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Mtop Total Stripes Required");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel27.setText("Mtop Width (µm)");

        mtop_ts_req.setEditable(false);
        mtop_ts_req.setBackground(new java.awt.Color(255, 255, 255));
        mtop_ts_req.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mtop_ts_req.setAutoscrolls(false);
        mtop_ts_req.setOpaque(false);
        mtop_ts_req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtop_ts_reqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(more, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(copyright2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mtop_ts_req, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mtop_width, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mtop1_ts_req, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mtop1_width, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btop_ts_req_label, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btop_width_label, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m3_ts_req, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m3_width, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fp_inp_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cd_inp_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(stripe_dist_inp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sr_inp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(other_inp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyright1)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fp_inp_button, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(stripe_dist_inp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cd_inp_button1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(sr_inp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(other_inp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(calculate)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyright1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mtop1_ts_req, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mtop_ts_req, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(mtop1_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mtop_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m3_ts_req, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m3_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btop_ts_req_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btop_width_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(more)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyright2)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("PG_Estimator.ico");
        setIconImage(icon.getImage());
        
        javax.swing.JComboBox<String> nfp = new javax.swing.JComboBox<>();
        nfp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        
    }//GEN-LAST:event_formWindowActivated

    private void m3_ts_reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3_ts_reqActionPerformed

    }//GEN-LAST:event_m3_ts_reqActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    try{
        nfps=1;
        
    }catch(Exception e){}
    try{
        fp_m1_width.setText("");
    }catch(Exception e){}
    try{
    fp_m2_width.setText("");
    }catch(Exception e){}
    try{
    m1_cd.setText("");
    }catch(Exception e){}
    try{
    m2_cd.setText("");
    }catch(Exception e){}
    try{
    m3_cd.setText("");
    }catch(Exception e){}    
    try{
    m1_sr.setText("");
    }catch(Exception e){}
    try{
    m2_sr.setText("");
    }catch(Exception e){}
    try{
    m3_sr.setText("");
    }catch(Exception e){}
    try{
    mtop1_sr.setText("");
    }catch(Exception e){}
    try{
    mtop_sr.setText("");
    }catch(Exception e){}
    try{
    sct_height.setText("");
    }catch(Exception e){}
    try{
    core_height.setText("");
    }catch(Exception e){}
    try{
    core_width.setText("");
    }catch(Exception e){}
    try{
    block_power.setText("");
    }catch(Exception e){}
    try{
    voltage.setText("");
    }catch(Exception e){}
    try{
    drop_req.setText("");
    }catch(Exception e){}
    try{
    m3_dist.setText("");
    }catch(Exception e){}
    try{
    mtop1_dist.setText("");
    }catch(Exception e){}
    try{
    mtop_dist.setText("");
    }catch(Exception e){}
    try{
    m3_ts_req.setText("");
    }catch(Exception e){}
    try{
    m3_width.setText("");
    }catch(Exception e){}
    try{
    mtop1_ts_req.setText("");
    }catch(Exception e){}
    try{
    mtop1_width.setText("");
    }catch(Exception e){}
    try{
    mtop_ts_req.setText("");
    }catch(Exception e){}
    try{
    mtop_width.setText("");
    }catch(Exception e){}
    this.setSize(HORIZONTAL,VERTICAL);
    copyright1.setVisible(true);
    }//GEN-LAST:event_clearActionPerformed
    static String roundn(double x)
    {
        String t=Double.toString(x);
        if(t.length()-1-t.indexOf('.')>7 && t.indexOf('.')!=-1){
            //System.out.print(x+" ");
            x=Math.round(x*Math.pow(10,7))*Math.pow(10,-7);
            //System.out.print(x+" "+String.format("%.7f",x)+" greater than 7 decimals\n");
            return String.format("%.7f",x);
        }
        return t;
    }
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        m3_ts_req.setText("");
        m3_width.setText("");
        mtop1_ts_req.setText("");
        mtop1_width.setText("");
        mtop_ts_req.setText("");
        mtop_width.setText("");
        for(int i=0;i<12;i++)
        {
            inv[i]=false;
            out[i]=0.0;
        }
        try{
            out[0]=1;
        }
        catch(Exception e){
            inv[0]=true;
        }
        try{
            out[1]=1;
        }
        catch(Exception e){
            inv[1]=true;
        }
        try{
            out[2]=1;
        }
        catch(Exception e){
            inv[2]=true;
        }
        try{
            out[3]=1;
        }
        catch(Exception e){
            if(nfps==2)
                inv[3]=true;
        }
        try{
            out[4]=1;
        }
        catch(Exception e){
            if(nfps==2)
                inv[4]=true;
        }
        try{
            out[5]=1;
        }
        catch(Exception e){
            if(btop_exist && nfps==2)
                inv[5]=true;
        }
        try{
            out[6]=1;
        }
        catch(Exception e){
            if(nfps==2)
                inv[6]=true;
        }
        try{
            out[7]=1;
        }
        catch(Exception e){
            inv[7]=true;
        }
        try{
            out[8]=1;
        }
        catch(Exception e){
            inv[8]=true;
        }
        try{
            out[9]=1;
        }
        catch(Exception e){
            if(btop_exist)
                inv[9]=true;
        }
        try{
            out[10]=1;
        }
        catch(Exception e){
            inv[10]=true;
        }
        try{
            out[11]=1;
        }
        catch(Exception e){
            inv[11]=true;
        }
        boolean flg=false,mstflg=true,missing_op=false;
        for(int i=0;i<12;i++)missing_op = missing_op || inv[i];
        try{  
        m3_ts_req.setText(Integer.toString(1));
        mstflg=false;
        }catch(Exception e){
            if(btop_exist)
                flg=true;
            m3_ts_req.setText("");}
        try{
        m3_width.setText(roundn(1));
        mstflg=false;
        }catch(Exception e){
            if(btop_exist)
                flg=true;
            m3_width.setText("");}
        try{
        mtop1_ts_req.setText(Integer.toString(1));
        mstflg=false;
        }catch(Exception e){flg=true;mtop1_ts_req.setText("");}
        try{
        mtop1_width.setText(roundn(1));
        mstflg=false;
        }catch(Exception e){flg=true;mtop1_width.setText("");}
        try{
        mtop_ts_req.setText(Integer.toString(1));
        mstflg=false;
        }catch(Exception e){flg=true;mtop_ts_req.setText("");}
        try{
        mtop_width.setText(roundn(1));
        mstflg=false;
        }catch(Exception e){flg=true;mtop_width.setText("");}
        if(mstflg)
            JOptionPane.showMessageDialog(null,"Please Enter Valid Values For Every Input Field!");
        else if(flg || missing_op){
            JOptionPane.showMessageDialog(null,"Warning: Some results were not generated due to Insufficient / Invalid Input values.");
            this.setSize(FULL_HORIZONTAL,FULL_VERTICAL);
            copyright1.setVisible(false);
            m3_ts_req.setVisible(btop_exist);
            m3_width.setVisible(btop_exist);
            btop_ts_req_label.setVisible(btop_exist);
            btop_width_label.setVisible(btop_exist); 
        }
        else{
            m3_ts_req.setVisible(btop_exist);
            m3_width.setVisible(btop_exist);
            btop_ts_req_label.setVisible(btop_exist);
            btop_width_label.setVisible(btop_exist); 
            this.setSize(FULL_HORIZONTAL,FULL_VERTICAL);
            copyright1.setVisible(false);
        }
    }//GEN-LAST:event_calculateActionPerformed
    static String stripTrailingZeros(String x){
    if(x.indexOf('.')==-1) return x;
    int pos=x.length()-1;
    for(;pos>=0;pos--)
    {
        if(x.charAt(pos)=='.')
            return x.substring(0,pos);
        if(x.charAt(pos)!='0') return x.substring(0,pos+1);
    }
    return x;
    }
    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        String out_title[]={"Total Rows","Block average current (mA)","Max current supported by M1 & M2 (mA)","Maximum current supported by M2 (mA)","Current to be supplied by Btop","Btop width required","No. of equal portions","Drop Voltage","Resistance required","Btop total width (µm)","Mtop-1 total width (µm)","Mtop total Width (µm)"};
        String tmp=" ";
        if(!inv[0])
            tmp+=out_title[0]+'\t'+" = "+stripTrailingZeros(roundn(out[0]));
        else tmp+=out_title[0]+'\t'+" = Not Enough Data To Compute";
        tmp=tmp.trim();
        for(int i=1;i<12;i++)
        {
            if((!((i==4 || i==5 || i==9) && (!btop_exist)))&&(nfps!=1 || (i!=3 && i!=4 && i!=5 && i!=6))){
            if(nfps==1 && i==2){
                tmp+='\n'+"Max Current supported by M1 (mA)"+'\t'+" = "+stripTrailingZeros(roundn(out[i]));
            }
            else{
            tmp+='\n';
            if(!inv[i]){
                tmp+=out_title[i]+'\t'+" = "+stripTrailingZeros(roundn(out[i]));
            }
            else{
                tmp+=out_title[i]+'\t'+" = Not Enough Data To Compute";
            }
            }
            }
        }
        JOptionPane.showMessageDialog(null,tmp,"More Outputs",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_moreActionPerformed

    private void fp_inp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fp_inp_buttonActionPerformed
        javax.swing.JComboBox<String> nfp = new javax.swing.JComboBox<>();
        if(nfps==2)
            nfp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2","1" }));
        else
            nfp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        Object[] message = {
                "Number of Follow Pins:",nfp,
                "M1 Width:", fp_m1_width,
                "M2 Width:", fp_m2_width
            };
        Object[] message2 = {
                "Number of Follow Pins:",nfp,
                "M1 Width:", fp_m1_width
            };
JFrame fp_inp_frame = new JFrame();
fp_inp_frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
nfp.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent evt) {
        nfps=Integer.parseInt(nfp.getSelectedObjects()[0].toString());
        if(evt.getStateChange() == ItemEvent.SELECTED ){
            //System.out.println(nfps);
            fp_inp_frame.dispatchEvent(new WindowEvent(fp_inp_frame, WindowEvent.WINDOW_CLOSING));
            if(nfps==2)
                nfp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2","1" }));
            else
                nfp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
            message[1]=nfp;
            message2[1]=nfp;
            int tempoption=JOptionPane.showConfirmDialog(fp_inp_frame, (nfps==2)?message:message2, "Follow Pin", JOptionPane.DEFAULT_OPTION);
            nfps=Integer.parseInt(nfp.getSelectedObjects()[0].toString());
            if (tempoption == JOptionPane.OK_OPTION) {
           fp_inp_frame.dispose();
}}
    }
});
int option=JOptionPane.showConfirmDialog(fp_inp_frame, (nfps==2)?message:message2, "Follow Pin", JOptionPane.DEFAULT_OPTION);
nfps=Integer.parseInt(nfp.getSelectedObjects()[0].toString());
fp_inp_frame.dispose();
    }//GEN-LAST:event_fp_inp_buttonActionPerformed

    private void sr_inp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_inp_buttonActionPerformed
        Object[] message1={"M1 Sheet Resistance: ",m1_sr,"M2 Sheet Resistance: ",m2_sr,"Btop Sheet Resistance: ",m3_sr,"Mtop-1 Sheet Resistance",mtop1_sr,"Mtop Sheet Resistance",mtop_sr};
        Object[] message2={"M1 Sheet Resistance: ",m1_sr,"M2 Sheet Resistance: ",m2_sr,"Mtop-1 Sheet Resistance",mtop1_sr,"Mtop Sheet Resistance",mtop_sr};
        Object[] message3={"M1 Sheet Resistance: ",m1_sr,"Btop Sheet Resistance: ",m3_sr,"Mtop-1 Sheet Resistance",mtop1_sr,"Mtop Sheet Resistance",mtop_sr};
        Object[] message4={"M1 Sheet Resistance: ",m1_sr,"Mtop-1 Sheet Resistance",mtop1_sr,"Mtop Sheet Resistance",mtop_sr};
int option;
option= JOptionPane.showConfirmDialog(null, (nfps==2)?((btop_exist)?message1:message2):((btop_exist)?message3:message4), "Sheet Resistance", JOptionPane.DEFAULT_OPTION);
if (option == JOptionPane.OK_OPTION) {
}
else {
    
}
    }//GEN-LAST:event_sr_inp_buttonActionPerformed

    private void cd_inp_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cd_inp_button1ActionPerformed
        Object[] message1={"M1 Current Density: ",m1_cd,"M2 Current Density: ",m2_cd,"Btop Current Density: ",m3_cd};
        Object[] message2={"M1 Current Density: ",m1_cd,"Btop Current Density: ",m3_cd};
        Object[] message3={"M1 Current Density: ",m1_cd,"M2 Current Density: ",m2_cd};
        Object[] message4={"M1 Current Density: ",m1_cd};
int option;
option= JOptionPane.showConfirmDialog(null, (nfps==2)?((btop_exist)?message1:message3):((btop_exist)?message2:message4), "Current Density", JOptionPane.DEFAULT_OPTION);
if (option == JOptionPane.OK_OPTION) {
}
else {
    
}
    }//GEN-LAST:event_cd_inp_button1ActionPerformed

    private void stripe_dist_inp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stripe_dist_inp_buttonActionPerformed
        JCheckBox btop_cbox = new JCheckBox("BTop", btop_exist);  
        Object[] message1={btop_cbox,"Btop Stripe Distance: ",m3_dist,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
        Object[] message2={btop_cbox,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
        int option;
        JFrame stripe_dist_inp_frame = new JFrame();
        stripe_dist_inp_frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        btop_cbox.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {           
                //btop_exist=(e.getStateChange()==1);
               /*System.out.println(e.getStateChange());
                if(e.getStateChange()==1 && btop_cbox.isSelected() && (btop_exist==false)){
                btop_exist=true; 
                System.out.println(btop_cbox.isSelected());
                //JCheckBox btop_cbox = new JCheckBox("BTop", btop_exist);
                btop_cbox.setSelected(true);
                stripe_dist_inp_frame.dispatchEvent(new WindowEvent(stripe_dist_inp_frame, WindowEvent.WINDOW_CLOSING));
                Object[] message1={btop_cbox,"Btop Stripe Distance: ",m3_dist,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
                Object[] message2={btop_cbox,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
                int tempoption= JOptionPane.showConfirmDialog(stripe_dist_inp_frame, btop_exist?message1:message2, "Stripe Distance", JOptionPane.DEFAULT_OPTION);
             }    
                else if(e.getStateChange()==2 && (!btop_cbox.isSelected()) && (btop_exist==true)){
                btop_exist=false;
                System.out.println(btop_cbox.isSelected());
                btop_cbox.setSelected(false);
                //JCheckBox btop_cbox = new JCheckBox("BTop", btop_exist);
                stripe_dist_inp_frame.dispatchEvent(new WindowEvent(stripe_dist_inp_frame, WindowEvent.WINDOW_CLOSING));
                Object[] message1={btop_cbox,"Btop Stripe Distance: ",m3_dist,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
                Object[] message2={btop_cbox,"Mtop-1 Stripe Distance",mtop1_dist,"Mtop Stripe Distance",mtop_dist};
                int tempoption= JOptionPane.showConfirmDialog(stripe_dist_inp_frame, btop_exist?message1:message2, "Stripe Distance", JOptionPane.DEFAULT_OPTION);
                }*/
               booltemp=!booltemp;
               if(e.getSource()==btop_cbox && booltemp){
               //if((e.getStateChange()==1)){
               btop_exist=btop_cbox.isSelected();
               stripe_dist_inp_frame.dispatchEvent(new WindowEvent(stripe_dist_inp_frame, WindowEvent.WINDOW_CLOSING));
               stripe_dist_inp_buttonActionPerformed(null);
               }
          }});
        option= JOptionPane.showConfirmDialog(stripe_dist_inp_frame, btop_exist?message1:message2, "Stripe Distance", JOptionPane.DEFAULT_OPTION);
        stripe_dist_inp_frame.dispose();
    }//GEN-LAST:event_stripe_dist_inp_buttonActionPerformed

    private void other_inp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_other_inp_buttonActionPerformed
        Object[] message={"Std Cell Track Height: ",sct_height,"Core Height: ",core_height,"Core Width: ",core_width,"Block Power (µW): ",block_power,
                        "Voltage: ",voltage,"Drop required (%) - VDD & VSS each :",drop_req,};
        int option= JOptionPane.showConfirmDialog(null,message, "Other Grid Specs", JOptionPane.DEFAULT_OPTION); 
    }//GEN-LAST:event_other_inp_buttonActionPerformed

    private void mtop1_ts_reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtop1_ts_reqActionPerformed

    }//GEN-LAST:event_mtop1_ts_reqActionPerformed

    private void mtop_ts_reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtop_ts_reqActionPerformed
 
    }//GEN-LAST:event_mtop_ts_reqActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PG_Calc pgc = new PG_Calc(); 
                pgc.setResizable(false);
                pgc.setSize(HORIZONTAL,VERTICAL);
                pgc.getContentPane().setBackground(Color.WHITE);
                ImageIcon ImageIcon = new ImageIcon("PG_Estimator.ico");
                Image Image = ImageIcon.getImage();
                pgc.Heading.setIcon(ImageIcon);
                pgc.setIconImage(Image);
                pgc.clearActionPerformed(null);
                pgc.setVisible(true);
            }
        });
    }
private javax.swing.JTextField fp_m1_width=new JTextField(),fp_m2_width=new JTextField(),m1_cd=new JTextField(),m2_cd=new JTextField(),m3_cd=new JTextField(),m1_sr=new JTextField(),m2_sr=new JTextField(),m3_sr=new JTextField(),mtop1_sr=new JTextField(),mtop_sr=new JTextField();
private javax.swing.JTextField m3_dist=new JTextField(),mtop1_dist=new JTextField(),mtop_dist=new JTextField(),sct_height=new JTextField(),core_height=new JTextField(),core_width=new JTextField(),block_power=new JTextField(),voltage=new JTextField(),drop_req=new JTextField();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel btop_ts_req_label;
    private javax.swing.JLabel btop_width_label;
    private javax.swing.JButton calculate;
    private javax.swing.JButton cd_inp_button1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel copyright1;
    private javax.swing.JLabel copyright2;
    private javax.swing.JButton fp_inp_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField m3_ts_req;
    private javax.swing.JTextField m3_width;
    private javax.swing.JButton more;
    private javax.swing.JTextField mtop1_ts_req;
    private javax.swing.JTextField mtop1_width;
    private javax.swing.JTextField mtop_ts_req;
    private javax.swing.JTextField mtop_width;
    private javax.swing.JButton other_inp_button;
    private javax.swing.JButton sr_inp_button;
    private javax.swing.JButton stripe_dist_inp_button;
    // End of variables declaration//GEN-END:variables
private int nfps=1;
private boolean btop_exist=true;
private boolean booltemp=false;
private final static int HORIZONTAL=965,VERTICAL=590,FULL_HORIZONTAL=965,FULL_VERTICAL=775;
}
