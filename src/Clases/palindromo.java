/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Martin
 */
public class palindromo extends javax.swing.JFrame {

    /**
     * Creates new form palindromo
     */
    
    public palindromo() {
        initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(153, 153, 255));

        jButton1.setText("Iniciar MT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Ingresar cadena");

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Palindromos ");

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

      
        String cinta1 = this.jTextField1.getText();
        String cinta2 = "";
        jTextArea1.append("========Qo==========="); 
        jTextArea1.append(System.getProperty("line.separator"));
        jTextArea1.append("Cinta 1-R Cinta 2-S"); 
        jTextArea1.append(System.getProperty("line.separator"));
        int m=0;       
        for(int i=0;i<cinta1.length();i++){
            //System.out.println(cinta1.substring(m,i+1)+" ->");
            jTextArea1.append(cinta1.substring(m,i+1)+" ->"); 
            jTextArea1.append(System.getProperty("line.separator"));
            m++;
           
            if(i==cinta1.length()-1){
               // jTextArea1.append("========Q1==========="); 
               // jTextArea1.append(System.getProperty("line.separator"));
                jTextArea1.append("<- CADENA VACIA"); 
                jTextArea1.append(System.getProperty("line.separator"));
                 
            }
               
        }
        jTextArea1.append("========Q1==========="); 
        jTextArea1.append(System.getProperty("line.separator"));
        jTextArea1.append("Cinta 1-S Cinta 2-L"); 
        jTextArea1.append(System.getProperty("line.separator"));
        m=cinta1.length()-1;
        for(int i=cinta1.length();i>0;i--){
           // System.out.println(cinta1.substring(m,i)+" <-");
                jTextArea1.append(cinta1.substring(m,i)+" <-"); 
                jTextArea1.append(System.getProperty("line.separator"));
            
            cinta2=cinta2+cinta1.substring(m,i);
           //System.out.println("m: "+m+" i:"+i);
            m--;
            
            
             if(m==-1){
                // jTextArea1.append("========Q3==========="); 
                // jTextArea1.append(System.getProperty("line.separator"));
                 jTextArea1.append("CADENA VACIA ->"); 
                 jTextArea1.append(System.getProperty("line.separator"));
                 
             }
             
    }
        jTextArea1.append("========Q2===========");  
        jTextArea1.append(System.getProperty("line.separator"));
        jTextArea1.append("Cinta 1-R y Cinta 2-R"); 
        jTextArea1.append(System.getProperty("line.separator"));
        
         
         m=0;       
        for(int i=0;i<cinta1.length();i++){
            if(cinta1.substring(m,i+1).equalsIgnoreCase(cinta2.substring(m, i+1))){
           // System.out.println(cinta1.substring(m,i+1)+cinta2.substring(m, i+1)+" ->");
                jTextArea1.append(cinta1.substring(m,i+1)+" ->      "+cinta2.substring(m, i+1)+" ->"); 
                jTextArea1.append(System.getProperty("line.separator"));
             
                
            }else{
             //System.out.println(cinta1+" No es palindromo"); 
             jTextArea1.append("CADENA VACIA ->"); 
             jTextArea1.append(System.getProperty("line.separator"));   
             jTextArea1.append("========Q3==========="); 
             jTextArea1.append(System.getProperty("line.separator"));
             jTextArea1.append("Resultado: " +cinta1+" No es palindromo"); 
             jTextArea1.append(System.getProperty("line.separator"));
             break;
            }
            
            m++;
            if(i==cinta1.length()-1){
              jTextArea1.append("========Q3==========="); 
              jTextArea1.append(System.getProperty("line.separator"));
              jTextArea1.append("CADENA VACIA ->"); 
              jTextArea1.append(System.getProperty("line.separator"));   
              jTextArea1.append("========= Estado de aceptacion Q4 ============"); 
              jTextArea1.append(System.getProperty("line.separator"));
              jTextArea1.append("Resultado: " +cinta1+" Si es palindromo"); 
              jTextArea1.append(System.getProperty("line.separator"));
            }
            
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextArea1.setText("");
        this.jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(palindromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(palindromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(palindromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(palindromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new palindromo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}