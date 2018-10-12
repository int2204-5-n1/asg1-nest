
package nest_1.pkg0;

import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;

public class DictionaryUI extends javax.swing.JFrame {
    final String EV = "C:\\Users\\Asus\\Desktop\\asg1-nest-master\\src\\database\\E_V.txt";
    final String VE = "C:\\Users\\Asus\\Desktop\\asg1-nest-master\\src\\database\\V_E.txt";
    
    VoiceManager vm;
    Voice v;
    
    public DictionaryUI() {
=======
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
//import java.text.ParseException;

//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.UnsupportedLookAndFeelException;
public class Dictionary extends javax.swing.JFrame {

    final String EV = "D:\\Nest_1.0\\Nest_1.0\\src\\nest_1\\pkg0\\E_V.txt";
    final String VE = "D:\\Nest_1.0\\Nest_1.0\\src\\nest_1\\pkg0\\V_E.txt";
    VoiceManager vm;
    Voice v;
    public Dictionary() {
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        initComponents();
        setTitle("Nest-Dictionary");
        setLocation(400,150);
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
    
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
    public void write(String path){
        BufferedWriter bw= null;
        FileWriter fw= null;
        try{
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            for(int i=0;i<keys.size();i++){
                bw.write(keys.get(i));
                bw.write(hm.get(keys.get(i)));
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (Exception e) {
                e.printStackTrace();
            }   
    }
    
=======
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();
        TextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        speakButton = new javax.swing.JButton();
        evButton = new javax.swing.JRadioButton();
        veButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        setMinimumSize(new java.awt.Dimension(650, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\icon.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 220, 81);

        jTextField1.setText("Enter your word....");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
=======

        list.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list.setForeground(new java.awt.Color(0, 0, 204));
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
            }
        });
        jScrollPane1.setViewportView(list);

        TextPane.setBackground(new java.awt.Color(255, 255, 204));
        TextPane.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(TextPane);

        TextField.setText("Enter your word...");
        TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldMouseClicked(evt);
            }
        });
        TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldKeyTyped(evt);
            }
        });

<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\find.gif")); // NOI18N
        jButton1.setToolTipText("Search something");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
=======
        searchButton.setIcon(new javax.swing.ImageIcon("D:\\Nest_1.0\\Nest_1.0\\img\\find.gif")); // NOI18N
        searchButton.setToolTipText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 100, 60, 30);

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
        jScrollPane2.setBounds(10, 135, 250, 319);

        txtHTML.setBackground(new java.awt.Color(255, 255, 153));
        txtHTML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtHTML.setContentType("text/html"); // NOI18N
        jScrollPane3.setViewportView(txtHTML);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(269, 135, 360, 319);

        removeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\delete.gif")); // NOI18N
        removeButton.setToolTipText("Delete");
=======

        removeButton.setIcon(new javax.swing.ImageIcon("D:\\Nest_1.0\\Nest_1.0\\img\\delete.gif")); // NOI18N
        removeButton.setToolTipText("Remove");
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        getContentPane().add(removeButton);
        removeButton.setBounds(370, 100, 60, 30);

        modifyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\edit.gif")); // NOI18N
        modifyButton.setToolTipText("Modified");
=======

        modifyButton.setIcon(new javax.swing.ImageIcon("D:\\Nest_1.0\\Nest_1.0\\img\\edit.gif")); // NOI18N
        modifyButton.setToolTipText("Modify");
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        getContentPane().add(modifyButton);
        modifyButton.setBounds(470, 100, 60, 30);

        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\add.gif")); // NOI18N
=======

        addButton.setIcon(new javax.swing.ImageIcon("D:\\Nest_1.0\\Nest_1.0\\img\\add.gif")); // NOI18N
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        addButton.setToolTipText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        getContentPane().add(addButton);
        addButton.setBounds(560, 100, 57, 30);

=======

        speakButton.setIcon(new javax.swing.ImageIcon("D:\\Nest_1.0\\Nest_1.0\\img\\43551168_457021924787369_7163206495616630784_n.png")); // NOI18N
        speakButton.setToolTipText("Speak");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });

>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        buttonGroup1.add(evButton);
        evButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        evButton.setForeground(new java.awt.Color(0, 0, 153));
        evButton.setText("English-Vietnamese");
        evButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(veButton);
        veButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        veButton.setForeground(new java.awt.Color(0, 0, 153));
        veButton.setText("Vietnamese-English");
        veButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veButtonActionPerformed(evt);
            }
        });

<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        speakButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\speaker3.png")); // NOI18N
        speakButton.setToolTipText("Speak out");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });
        getContentPane().add(speakButton);
        speakButton.setBounds(290, 100, 50, 30);
=======
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(evButton)
                                .addGap(18, 18, 18)
                                .addComponent(veButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(59, 59, 59)
                                .addComponent(removeButton)
                                .addGap(29, 29, 29)
                                .addComponent(modifyButton)
                                .addGap(28, 28, 28)
                                .addComponent(addButton)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evButton)
                    .addComponent(veButton))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(removeButton)
                        .addComponent(modifyButton)
                        .addComponent(addButton))
                    .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String word = TextField.getText().trim();
        //Tim nghia cua Word
        String mean;
        if(hm.containsKey(word))
        {
            mean = hm.get(word);
        }
        else
            mean = "<html><body><font color='red'>The word you've searched does NOT exist in Nest Dictionary!!!</font></body></html>";
        //Output nghia cua Word ra 
        TextPane.setText(mean);
    }//GEN-LAST:event_searchButtonActionPerformed

<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            String w = keys.get(index);
            txtHTML.setText(hm.get(w));
            }
    }//GEN-LAST:event_listValueChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
=======
    private void TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldKeyTyped
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        // TODO add your handling code here:
        String text = TextField.getText().trim();
        //De cham hon 1 don vi
        text += evt.getKeyChar();
        text = text.trim().toLowerCase();
        for(int i=0;i<mod.size();i++)
        {
            String val = ""+mod.getElementAt(i);
            if(val.startsWith(text))
            {
                list.setSelectedIndex(i);
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
                JScrollBar sb=jScrollPane2.getVerticalScrollBar();
                sb.setValue(i*19);
=======
                JScrollBar sb=jScrollPane1.getVerticalScrollBar();
                sb.setValue(i*16);
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
                return;
            }
        }
        list.clearSelection();
    }//GEN-LAST:event_TextFieldKeyTyped

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            String w = keys.get(index);
            TextPane.setText(hm.get(w));
        }
    }//GEN-LAST:event_listValueChanged

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        RemoveUI r = new RemoveUI(this);
        r.setVisible(true);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here
        ModifyUI m = new ModifyUI(this);
        m.setVisible(true);
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

    private void TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseClicked
        // TODO add your handling code here:
        TextField.setText("");
    }//GEN-LAST:event_TextFieldMouseClicked

    private void speakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakButtonActionPerformed
        // TODO add your handling code here:
        String speak;
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        if(list.isSelectionEmpty()) speak= jTextField1.getText();
        else {
            int index=list.getSelectedIndex();
            speak = keys.get(index);
        }
=======
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            speak = keys.get(index);
        }
        else
            speak = TextField.getText();
        
>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        System.setProperty("mbrola.base", "mbrola");
        vm = VoiceManager.getInstance();
        v = vm.getVoice("mbrola_us1");
        v.allocate();
        v.speak(speak);
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
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         try 
<<<<<<< HEAD:src/nest_1/pkg0/DictionaryUI.java
        {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        //</editor-fold>
        // Loading...
        load ss = new load();
        ss.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                ss.lbl.setText(Integer.toString(i)+"%");
                if(i==100) ss.dispose();
            }
        }catch(Exception e){
            
        }
=======
    {
      UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
        //</editor-fold>

>>>>>>> 5832a6446a529bf255ae8ab483d748c12a3ceb5f:src/nest_1/pkg0/Dictionary.java
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dictionary().setVisible(true);
            }
        });
    }
    private HashMap<String, String> hm;
    private ArrayList<String> keys;
    private DefaultListModel<String> mod;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton evButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton speakButton;
    private javax.swing.JRadioButton veButton;
    // End of variables declaration//GEN-END:variables
}
