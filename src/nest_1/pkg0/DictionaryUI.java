
package nest_1.pkg0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;

/*import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;*/

public class DictionaryUI extends javax.swing.JFrame {
    final String EV = "D:\\Nest_1.0\\Nest_1.0\\src\\nest_1\\pkg0\\E_V.txt";
    final String VE = "D:\\Nest_1.0\\Nest_1.0\\src\\nest_1\\pkg0\\V_E.txt";
    
   /// VoiceManager vm;
   // Voice v;
    
    public DictionaryUI() {
        initComponents();
        setTitle("Nest-Dictionary");
        
        setLocation(400,150);
        //loadDataIntoMap(EV);
    }

    public void loadDataIntoMap(String path)
    {
        hm = new HashMap<>();
        keys = new ArrayList<>();
        String line,word,s;
        mod = new DefaultListModel<>();
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null)
            {
                int i = line.indexOf("<html>");
                word = line.substring(0, i);
                word = word.trim();
                s = line.substring(i); //s=<html>....</html>
                hm.put(word, s);
                keys.add(word);
                mod.addElement(word);
            }
            list.setModel(mod);
            br.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHTML = new javax.swing.JEditorPane();
        removeButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        evButton = new javax.swing.JRadioButton();
        veButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        speakButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("       Nest");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 285, 81);

        jTextField1.setText("Enter your word....");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 100, 180, 30);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 100, 100, 30);

        list.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        list.setForeground(new java.awt.Color(0, 0, 204));
        list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listKeyTyped(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 135, 285, 319);

        txtHTML.setBackground(new java.awt.Color(255, 255, 153));
        txtHTML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHTML.setContentType("text/html"); // NOI18N
        jScrollPane3.setViewportView(txtHTML);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(301, 135, 328, 319);

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(300, 100, 110, 30);

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modifyButton);
        modifyButton.setBounds(410, 100, 94, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(510, 100, 94, 30);

        evButton.setBackground(new java.awt.Color(255, 153, 0));
        buttonGroup1.add(evButton);
        evButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        evButton.setForeground(new java.awt.Color(0, 0, 153));
        evButton.setText("English-Vietnamese");
        evButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evButtonActionPerformed(evt);
            }
        });
        getContentPane().add(evButton);
        evButton.setBounds(250, 40, 137, 23);

        veButton.setBackground(new java.awt.Color(255, 204, 51));
        buttonGroup1.add(veButton);
        veButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        veButton.setForeground(new java.awt.Color(0, 0, 153));
        veButton.setText("Vietnamese-English");
        veButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veButtonActionPerformed(evt);
            }
        });
        getContentPane().add(veButton);
        veButton.setBounds(450, 40, 137, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Sản phẩm chưa phải là app chưa có tác dụng dùng thay thế app từ điển...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 460, 399, 13);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 100, 50, 30);

        speakButton.setText("Speak");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });
        getContentPane().add(speakButton);
        speakButton.setBounds(340, 70, 70, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        //jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Lay Word duoc nhap vao
        String word = jTextField1.getText().trim().toLowerCase();
        //Tim nghia cua Word
        String mean;
        if(hm.containsKey(word))
        {
            mean = hm.get(word);
        }
        else
            mean = "<html><body><font color='red'>The word you've searched does NOT exist in Nest Dictionary!!!</font></body></html>";
        //Output nghia cua Word ra 
        txtHTML.setText(mean);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listKeyTyped
        // TODO add your handling code here
        
    }//GEN-LAST:event_listKeyTyped

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            String w = keys.get(index);
            txtHTML.setText(hm.get(w));
        }
    }//GEN-LAST:event_listValueChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        String text = jTextField1.getText().trim();
        //De cham hon 1 don vi
        text += evt.getKeyChar();
        text = text.trim().toLowerCase();
        for(int i=0;i<mod.size();i++)
        {
            String val = ""+mod.getElementAt(i);
            if(val.startsWith(text))
            {
                list.setSelectedIndex(i);
                JScrollBar sb=jScrollPane2.getVerticalScrollBar();
                sb.setValue(i*20);
                return;
            }
        }
        list.clearSelection();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        RemoveUI r = new RemoveUI(this);
        r.setVisible(true);
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        ModifyUI m = new ModifyUI(this);
        m.setVisible(true);
          //modifyWord("nhanh","","xinh gai");
    }//GEN-LAST:event_modifyButtonActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        AddUI  a = new AddUI(this);
        a.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void evButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evButtonActionPerformed
        // TODO add your handling code here:
        loadDataIntoMap(EV);
    }//GEN-LAST:event_evButtonActionPerformed

    private void veButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veButtonActionPerformed
        // TODO add your handling code here: 
        loadDataIntoMap(VE);
    }//GEN-LAST:event_veButtonActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void speakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakButtonActionPerformed
        // TODO add your handling code here:
        /*String speak = jTextField1.getText();
        System.setProperty("mbrola.base", "mbrola");
        vm = VoiceManager.getInstance();
        v = vm.getVoice("mbrola_us1");
        v.allocate();
        v.speak(speak);*/
    }//GEN-LAST:event_speakButtonActionPerformed

    public int searchBinary(String w, ArrayList<String> k)
    {
        if (k.get(0).compareTo(w)>=0) return 0;
        int d = 0, c = k.size();
        while (d<c-1){
            int g = (d+c)/2;
            if (k.get(g).compareTo(w)<0) d=g;else c=g;
        }
        return c;
    }
    public void addWord(String w, String m)
    {
        w = w.trim().toLowerCase();
        hm.put(w, m);
        int i = searchBinary(w,keys);
        keys.add(i,w);
        mod.add(i, w);
    }
    
    public void removeWord(String w)
    {
        int i = keys.indexOf(w);
        if (i != -1){
            keys.remove(i);
            hm.remove(w);
            mod.removeElementAt(i);
        }
    }
    
    public void modifyWord(String w, String nw, String nm)
    {
        if (nw.equals("")){
            removeWord(w);
            addWord(w,nm);
            System.out.println("Hi");
        }
        else if (nm.equals("")){
            String mean;
            mean = ""+hm.get(w);
            System.out.println("Hi");
            removeWord(w);
            addWord(nw, mean); 
        } else{
            removeWord(w);
            addWord(nw,nm);
        }
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
            java.util.logging.Logger.getLogger(DictionaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryUI().setVisible(true);
            }
        });
    }
    private HashMap<String, String> hm;
    private ArrayList<String> keys;
    private DefaultListModel<String> mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton evButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton speakButton;
    private javax.swing.JEditorPane txtHTML;
    private javax.swing.JRadioButton veButton;
    // End of variables declaration//GEN-END:variables
}
