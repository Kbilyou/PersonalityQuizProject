package gui;

import introvert.Introvert;
import extrovert.Extrovert;

// Team 4: Kamron Bilyou
// Freda Mensah 
// Sheila Le
public class PersonalityQuizGUI extends javax.swing.JFrame 
{
    static boolean getChoice = true, exit = false;
    static int choice;
    static int testIndex = 0;
    static Introvert test = new Introvert();
    static Extrovert test2 = new Extrovert();
    
    public PersonalityQuizGUI() 
    {
        initComponents();
        
        // Onload
        textArea.setText("Please input which personality quiz you would like to take. (Input 1 or 2)\n1) Introvert Quiz\n2) Extrovert Quiz\n");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personality Quiz");
        setPreferredSize(new java.awt.Dimension(600, 300));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setFocusable(false);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputField, submitBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (getChoice)
        {
            choice = Integer.parseInt(inputField.getText());
            getChoice = false;
        }

        if (!exit) start(); // Start menu functions
    }//GEN-LAST:event_submitBtnActionPerformed

    // Start menu functions
    public void start()
    {
        if (choice == 1)
        {            
            if (testIndex < 9)
            {
                if (testIndex == 0) textArea.setText(test.intro() + test.start(Integer.parseInt(inputField.getText())));
                else textArea.setText(test.start(Integer.parseInt(inputField.getText())));                
            }
            else
            {
                textArea.setText(test.result(Integer.parseInt(inputField.getText())) + "\nGoodbye");
                exit = true;
            }
            testIndex++;
	}
        else if (choice == 2)
        {            
            if (testIndex < 5)
            {
                if (testIndex == 0) textArea.setText(test2.intro() + test2.start(Integer.parseInt(inputField.getText())));
                else textArea.setText(test2.start(Integer.parseInt(inputField.getText())));                
            }
            else
            {
                textArea.setText(test2.result(Integer.parseInt(inputField.getText())) + "\nGoodbye");
                exit = true;
            }
            testIndex++;
	}
        inputField.setText(""); // Clear input field
    }
    
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
            java.util.logging.Logger.getLogger(PersonalityQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalityQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalityQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalityQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalityQuizGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
