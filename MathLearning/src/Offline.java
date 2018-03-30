
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


  

public class Offline extends javax.swing.JFrame {

    public static double score;
    double result;
    String userId;
    String question;
    String historyt="";
    String name="Offline mood";
   
    int s;
    
    public Offline() {
        initComponents();
    }

    public void add(){
        int x,y;
        x = Number.generator();
        y = Number.generator();
        result = x+y;
        question = String.valueOf(x)+"+"+String.valueOf(y);
        String values = String.valueOf(x)+"+"+String.valueOf(y)+" ?";
        numbers.setText(values);
    }
    
    public void sub(){
        int x,y;
        x = Number.generator();
        y = Number.generator();
        if(y>x){
            int temp=x;
            x=y;
            y=temp;
        }
        result = x-y;
        question = String.valueOf(x)+"-"+String.valueOf(y);
        String values = String.valueOf(x)+"-"+String.valueOf(y)+" ?";
        numbers.setText(values);
    }
    
    public void mul(){
        int x,y;
        x = Number.minGenerator();
        y = Number.minGenerator();
        result = x*y;
        question = String.valueOf(x)+"x"+String.valueOf(y);
        String values = String.valueOf(x)+"x"+String.valueOf(y)+" ?";
        numbers.setText(values);
    }
    
    public void div(){
        int x,y;
       
        while(true){
            x = Number.generator();
            y = Number.minGenerator();
            if(x%y==0)
            {
                break;
            }
            
        }
        result = x/y;
        question = String.valueOf(x)+"/"+String.valueOf(y);
        String values = String.valueOf(x)+"/"+String.valueOf(y)+" ?";
        numbers.setText(values);
    }
    
    void autoSet(){
        int x;
        while(true){
           x = (int) (Math.random()*4);
            if(s!=x)
                break;
               
        }
        s=x;
        
        
        if(x==1)
            div();
        else if(x==2)
            sub();
        else if(x==3)
            mul();
        else if(x==0)
            add();
     
    }
    
    private void close(){
                WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING); 
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
   
    }
    
    public void scoreUp(){
         score+=1;
        scoredisplay.setText(new DecimalFormat("##.##").format(score));
    }
    
    public void scoreDown(){
         score-=.5;
        scoredisplay.setText(new DecimalFormat("##.##").format(score));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        historydisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texthistory = new javax.swing.JTextArea();
        titlehistory = new javax.swing.JLabel();
        backfhistory = new javax.swing.JButton();
        clearh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scoredisplay = new javax.swing.JLabel();
        userResultIn = new javax.swing.JTextField();
        submitb = new javax.swing.JButton();
        numbers = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cAnswer = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        user_name = new javax.swing.JLabel();
        cAnswer1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        history = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 105, 14));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(228, 241, 254));
        jLabel7.setText("Learn Math ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel7)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(228, 241, 254));
        jLabel13.setText("Correct answer will add 1 point and every wrong answer reduce .5 point");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(228, 241, 254));
        jLabel12.setText("Click or press 's' to start!");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        start.setBackground(new java.awt.Color(34, 49, 63));
        start.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        start.setForeground(new java.awt.Color(249, 105, 14));
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                startKeyReleased(evt);
            }
        });
        jPanel2.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 400));

        historydisplay.setBackground(new java.awt.Color(34, 49, 63));
        historydisplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texthistory.setEditable(false);
        texthistory.setBackground(new java.awt.Color(34, 49, 63));
        texthistory.setColumns(20);
        texthistory.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        texthistory.setForeground(new java.awt.Color(240, 240, 240));
        texthistory.setRows(5);
        texthistory.setBorder(null);
        jScrollPane1.setViewportView(texthistory);

        historydisplay.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 550, 220));

        titlehistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titlehistory.setForeground(new java.awt.Color(228, 241, 254));
        titlehistory.setText("History");
        historydisplay.add(titlehistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        backfhistory.setBackground(new java.awt.Color(34, 49, 63));
        backfhistory.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        backfhistory.setForeground(new java.awt.Color(228, 241, 254));
        backfhistory.setText("Back");
        backfhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backfhistoryActionPerformed(evt);
            }
        });
        backfhistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backfhistoryKeyPressed(evt);
            }
        });
        historydisplay.add(backfhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 80, 30));

        clearh.setBackground(new java.awt.Color(34, 49, 63));
        clearh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        clearh.setForeground(new java.awt.Color(228, 241, 254));
        clearh.setText("Clear");
        clearh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearhActionPerformed(evt);
            }
        });
        clearh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearhKeyPressed(evt);
            }
        });
        historydisplay.add(clearh, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 80, 30));

        jPanel2.add(historydisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 640, 380));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(228, 241, 254));
        jLabel9.setText("Ans:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 40, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 110, 20));

        scoredisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scoredisplay.setForeground(new java.awt.Color(228, 241, 254));
        scoredisplay.setText("0");
        jPanel2.add(scoredisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 10, 60, -1));

        userResultIn.setBackground(new java.awt.Color(34, 49, 63));
        userResultIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userResultIn.setForeground(new java.awt.Color(228, 241, 254));
        userResultIn.setBorder(null);
        jPanel2.add(userResultIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 100, 30));

        submitb.setBackground(new java.awt.Color(34, 49, 63));
        submitb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        submitb.setForeground(new java.awt.Color(228, 241, 254));
        submitb.setText("Submit");
        submitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbActionPerformed(evt);
            }
        });
        submitb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitbKeyPressed(evt);
            }
        });
        jPanel2.add(submitb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 80, 30));

        numbers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numbers.setForeground(new java.awt.Color(228, 241, 254));
        numbers.setText("1");
        jPanel2.add(numbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 110, 10));

        cAnswer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cAnswer.setForeground(new java.awt.Color(228, 241, 254));
        cAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(cAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(228, 241, 254));
        jLabel11.setText(" Score:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        login.setBackground(new java.awt.Color(34, 49, 63));
        login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(228, 241, 254));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 30));

        user_name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user_name.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));

        cAnswer1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cAnswer1.setForeground(new java.awt.Color(228, 241, 254));
        cAnswer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(cAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(228, 241, 254));
        jLabel15.setText("What is");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        history.setBackground(new java.awt.Color(34, 49, 63));
        history.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        history.setForeground(new java.awt.Color(228, 241, 254));
        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        history.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                historyKeyPressed(evt);
            }
        });
        jPanel2.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void submitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbActionPerformed
        double userResult;
        try{
         userResult = Double.valueOf(userResultIn.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"There is no valid Answer!\nFill the answer section Correctly.","Error", JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        userResultIn.setText("");
        if(userResult==result){  //right ans
            cAnswer.setForeground(new java.awt.Color(30, 130, 76));   //set color
           cAnswer.setText("Correct Answer!");
           historyt=(historyt+question+" = "+(int)result+" True!\n");
           texthistory.setText(historyt);
           cAnswer1.setText("");
            scoreUp();
          
        }
        else{
            scoreDown();
          
           cAnswer.setText("Wrong Answer!");
           cAnswer1.setText(question+" = "+(int)result);
           historyt=(historyt+question+" = "+(int)userResult+" False! C.A. "+result+"\n");
           texthistory.setText(historyt);
          
           cAnswer.setForeground(new java.awt.Color(217, 30, 24)); 
           cAnswer1.setForeground(new java.awt.Color(217, 30, 24));
          
                                //wrong ans
        }
        
        autoSet();
        
              
        
    }//GEN-LAST:event_submitbActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start.setVisible(false);
        jLabel12.setVisible(false);
        historydisplay.setVisible(false);
        texthistory.setVisible(false);
        titlehistory.setVisible(false);
        jLabel13.setVisible(false);
        autoSet();
        texthistory.setText(historyt);
        user_name.setText(name);
        scoredisplay.setText(String.valueOf(score));
    }//GEN-LAST:event_startActionPerformed

    private void startKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_S){
          start.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        autoSet();
        texthistory.setText(historyt);
        historydisplay.setVisible(false);
        texthistory.setVisible(false);
        titlehistory.setVisible(false);
       }
    }//GEN-LAST:event_startKeyPressed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        user_name.setText("");
       score=0;
        new welcome_page().setVisible(true);
        close();
    }//GEN-LAST:event_loginActionPerformed

    private void startKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startKeyReleased
        userResultIn.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_startKeyReleased

    private void submitbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitbKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        double userResult;
        try{
         userResult = Double.valueOf(userResultIn.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"There is no valid Answer!\nFill the answer section Correctly.","Error", JOptionPane.INFORMATION_MESSAGE);
           return;
        }
        userResultIn.setText("");
        if(userResult==result){  //right ans
            cAnswer.setForeground(new java.awt.Color(30, 130, 76));   //set color
           cAnswer.setText("Correct Answer!");
          historyt=(historyt+question+" = "+(int)result+" True!\n");
           texthistory.setText(historyt);  cAnswer1.setText("");
            scoreUp();
        }
        else{
            scoreDown();
          
           cAnswer.setText("Wrong Answer!");
           cAnswer1.setText(question+" = "+(int)result);
          historyt=(historyt+question+" = "+(int)userResult+" False! C.A. "+result+"\n");
           texthistory.setText(historyt);
           cAnswer.setForeground(new java.awt.Color(217, 30, 24)); 
           cAnswer1.setForeground(new java.awt.Color(217, 30, 24));
                                //wrong ans
        }
        autoSet();
        }
    }//GEN-LAST:event_submitbKeyPressed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        user_name.setText("");
       score=0;
        new welcome_page().setVisible(true);
        close();
    }//GEN-LAST:event_loginKeyPressed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        historydisplay.setVisible(true);
        texthistory.setVisible(true);
        titlehistory.setVisible(true);
    }//GEN-LAST:event_historyActionPerformed

    private void historyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_historyKeyPressed
       historydisplay.setVisible(true);
        texthistory.setVisible(true);
        titlehistory.setVisible(true);
    }//GEN-LAST:event_historyKeyPressed

    private void backfhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backfhistoryActionPerformed
        historydisplay.setVisible(false);
        texthistory.setVisible(false);
        titlehistory.setVisible(false);
    }//GEN-LAST:event_backfhistoryActionPerformed

    private void backfhistoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backfhistoryKeyPressed
        historydisplay.setVisible(false);
        texthistory.setVisible(false);
        titlehistory.setVisible(false);
    }//GEN-LAST:event_backfhistoryKeyPressed

    private void clearhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearhActionPerformed
       int p = JOptionPane.showConfirmDialog(null,"Do you want to clear your history?","Clear History",JOptionPane.YES_NO_OPTION);
       if(p==0){
           historyt="";
       texthistory.setText("");
       
       }
               
    }//GEN-LAST:event_clearhActionPerformed

    private void clearhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearhKeyPressed
       int p = JOptionPane.showConfirmDialog(null,"Do you want to clear your history?","Clear History",JOptionPane.YES_NO_OPTION);
       if(p==0){
           historyt="";
       texthistory.setText("");
      
       }
    }//GEN-LAST:event_clearhKeyPressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backfhistory;
    private javax.swing.JLabel cAnswer;
    private javax.swing.JLabel cAnswer1;
    private javax.swing.JButton clearh;
    private javax.swing.JButton history;
    private javax.swing.JPanel historydisplay;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton login;
    private javax.swing.JLabel numbers;
    private javax.swing.JLabel scoredisplay;
    private javax.swing.JButton start;
    private javax.swing.JButton submitb;
    private javax.swing.JTextArea texthistory;
    private javax.swing.JLabel titlehistory;
    private javax.swing.JTextField userResultIn;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
