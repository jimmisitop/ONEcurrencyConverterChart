package com.mycompany.conversordemoneda;

public class CurrencyConverterChart extends javax.swing.JFrame {
    
    int badgeCoin = 0;
    double resulto = 0;
    String badgeCurrencyOriginal = "MXN";
    String badgeCurrency = "USD";
    
    public CurrencyConverterChart() {
        initComponents();
    }
    
    public String ToExchange(Double badgeCoin, String coin){
        return "$ " + Math.round(badgeCoin*100.0)/100.0 + " " + coin;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        from = new javax.swing.JPanel();
        converter = new javax.swing.JButton();
        badgeText = new javax.swing.JTextField();
        badge = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        result = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        from.setBackground(new java.awt.Color(0, 0, 0));

        converter.setText("Convertir");
        converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterActionPerformed(evt);
            }
        });

        badgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badgeTextActionPerformed(evt);
            }
        });
        badgeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                badgeTextKeyReleased(evt);
            }
        });

        badge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "WON", "YEN", "LIB" }));
        badge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fromLayout = new javax.swing.GroupLayout(from);
        from.setLayout(fromLayout);
        fromLayout.setHorizontalGroup(
            fromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(badge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(converter, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(fromLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(badgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fromLayout.setVerticalGroup(
            fromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(badgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(fromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(converter)
                    .addComponent(badge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        result.setBackground(new java.awt.Color(0, 0, 0));
        result.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversor de Monedas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void badgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badgeTextActionPerformed
       
    }//GEN-LAST:event_badgeTextActionPerformed

    private void converterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterActionPerformed
          converter();
          result.setText(ToExchange(resulto, badgeCurrency));
    }//GEN-LAST:event_converterActionPerformed

    private void badgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_badgeActionPerformed
        badgeCurrency = badge.getSelectedItem().toString();
        converter();
    }//GEN-LAST:event_badgeActionPerformed

    private void badgeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_badgeTextKeyReleased
       int badgeTxt = Integer.parseInt(badgeText.getText());
       badgeCoin = badgeTxt;
       converter();
    }//GEN-LAST:event_badgeTextKeyReleased

    public void converter(){
         switch(badgeCurrencyOriginal){
           case "MXN" -> {
               if(badgeCurrency.equals("USD")){
                   resulto = badgeCoin*0.056;
               }else if(badgeCurrency.equals("EUR")){
                   resulto = badgeCoin*0.050;
               }else if(badgeCurrency.equals("WON")){
                   resulto = badgeCoin*74.34;
               }else if(badgeCurrency.equals("YEN")){
                   resulto = badgeCoin*7.57;
               }else if(badgeCurrency.equals("LIB")){
                   resulto = badgeCoin*0.044;
               }                  
           }
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverterChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> badge;
    private javax.swing.JTextField badgeText;
    private javax.swing.JButton converter;
    private javax.swing.JPanel from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables

    private String ToExchange(int badgeCoin, String badgeCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
