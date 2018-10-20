
package nest_1.pkg0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class DictionaryUI extends javax.swing.JFrame {
    final String EV = "database/E_V.txt";
    final String VE = "database/V_E.txt";
    final String EVreset = "database/reset_data/E_V.txt";
    final String VEreset = "database/reset_data/V_E.txt";
    
    
    public DictionaryUI() {
        initComponents();
        setTitle("Nest-Dictionary");
        setLocation(400,150);
        his = new ArrayList<>();
    }

    public void loadDataIntoMap(String path)
    {
        hm = new HashMap<>();
        keys = new ArrayList<>();
        String line,word,s;
        mod = new DefaultListModel<>();
        try
        {  
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
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
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public void write(String path){
        BufferedWriter bw= null;
        try{
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for(int i=0;i<keys.size();i++){
                bw.write(keys.get(i));
                bw.write(hm.get(keys.get(i)));
                bw.newLine();
            }
            bw.close();
        }catch (Exception e) {
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
        speakButton = new javax.swing.JButton();
        history = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        hel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VNe = new javax.swing.JMenuItem();
        Ee = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        EV_reset = new javax.swing.JMenuItem();
        VE_reset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\nest1.0.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 10, 300, 100);

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

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\find.gif")); // NOI18N
        jButton1.setToolTipText("Search something");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(330, 100, 60, 30);

        modifyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\edit.gif")); // NOI18N
        modifyButton.setToolTipText("Modified");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modifyButton);
        modifyButton.setBounds(410, 100, 60, 30);

        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\add.gif")); // NOI18N
        addButton.setToolTipText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(490, 100, 57, 30);

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
        evButton.setBounds(250, 40, 139, 25);

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
        veButton.setBounds(450, 40, 139, 25);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Sản phẩm chưa phải là app chưa có tác dụng dùng thay thế app từ điển...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 460, 399, 13);

        speakButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\speaker3.png")); // NOI18N
        speakButton.setToolTipText("Speak out");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });
        getContentPane().add(speakButton);
        speakButton.setBounds(270, 100, 50, 30);

        history.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\asg1-nest-master\\img\\his.png")); // NOI18N
        history.setToolTipText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        getContentPane().add(history);
        history.setBounds(560, 100, 60, 30);

        jMenu1.setText("File");

        about.setText("About us");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu1.add(about);

        hel.setText("Help");
        hel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helMouseClicked(evt);
            }
        });
        hel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helActionPerformed(evt);
            }
        });
        jMenu1.add(hel);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Language");

        VNe.setText("Vietnamese");
        VNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNeActionPerformed(evt);
            }
        });
        jMenu2.add(VNe);

        Ee.setText("English");
        Ee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EeActionPerformed(evt);
            }
        });
        jMenu2.add(Ee);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reset");

        EV_reset.setText("E-V");
        EV_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EV_resetActionPerformed(evt);
            }
        });
        jMenu3.add(EV_reset);

        VE_reset.setText("V-E");
        VE_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VE_resetActionPerformed(evt);
            }
        });
        jMenu3.add(VE_reset);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //bỏ
    }//GEN-LAST:event_jTextField1ActionPerformed
    //dịch nghĩa bằng cách ấn search
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
        his.add(word);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void listKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listKeyTyped
        // Bỏ        
    }//GEN-LAST:event_listKeyTyped
    // dịch từ được chọn trong list
    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        if(!list.isSelectionEmpty()){
            int index = list.getSelectedIndex();
            String w = keys.get(index);
            txtHTML.setText(hm.get(w));
            }
    }//GEN-LAST:event_listValueChanged
    // Gợi ý trong lúc search từ
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
                sb.setValue(i*16);
                return;
            }
        }
        list.clearSelection();
    }//GEN-LAST:event_jTextField1KeyTyped
    // Các nút thao tác
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        RemoveUI r = new RemoveUI(this);
        r.setVisible(true);
        
    }//GEN-LAST:event_removeButtonActionPerformed
    //sửa
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        ModifyUI m = new ModifyUI(this);
        m.setVisible(true);
    }//GEN-LAST:event_modifyButtonActionPerformed
    //thêm
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        AddUI  a = new AddUI(this);
        a.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed
    // load từ điển anh việt việt anh
    private void evButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evButtonActionPerformed
        // TODO add your handling code here:
        loadDataIntoMap(EV);
        check=true;
    }//GEN-LAST:event_evButtonActionPerformed

    private void veButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veButtonActionPerformed
        // TODO add your handling code here: 
        loadDataIntoMap(VE);
        check=false;
    }//GEN-LAST:event_veButtonActionPerformed
    //Enter your word 
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked
    // Thao tác phát âm
    private void speakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakButtonActionPerformed
        // TODO add your handling code here:
        String speak;
        if(list.isSelectionEmpty()) speak= jTextField1.getText();
        else {
            int index=list.getSelectedIndex();
            speak = keys.get(index);
        }
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        //System.setProperty("mbrola.base", "mbrola"); 
        vm = VoiceManager.getInstance();
        v = vm.getVoice("kevin16");
        v.allocate();
        v.speak(speak);
    }//GEN-LAST:event_speakButtonActionPerformed
    // phần thay đổi ngôn ngữ.
    private void VNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNeActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("Nhập từ cần dịch: ");
        jButton1.setToolTipText("Dịch");
        speakButton.setToolTipText("Phát âm");
        removeButton.setToolTipText("Xóa");
        modifyButton.setToolTipText("Sửa");
        addButton.setToolTipText("Thêm");
        jMenu2.setText("Ngôn ngữ");
        jMenu3.setText("Chạy lại");
        hel.setText("Giúp đỡ");
        about.setText("Thông tin");
        history.setToolTipText("Lịch sử");
    }//GEN-LAST:event_VNeActionPerformed

    private void EeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EeActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("Enter your word: ");
        jButton1.setToolTipText("Search");
        speakButton.setToolTipText("Speak out");
        removeButton.setToolTipText("Delete");
        modifyButton.setToolTipText("Modify");
        addButton.setToolTipText("Add");
        jMenu2.setText("Language");
        jMenu3.setText("Reset");
        hel.setText("Help");
        about.setText("About us");
        history.setToolTipText("History");
    }//GEN-LAST:event_EeActionPerformed
    // phần reset từ điển
    private void EV_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EV_resetActionPerformed
        // TODO add your handling code here:
        loadDataIntoMap(EVreset);
        
    }//GEN-LAST:event_EV_resetActionPerformed

    private void VE_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VE_resetActionPerformed
        // TODO add your handling code here:
        loadDataIntoMap(VEreset);
    }//GEN-LAST:event_VE_resetActionPerformed

    // mở item help trong menu bar
    private void helActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helActionPerformed
        // TODO add your handling code here:
        Help help = new Help(this,false);
        help.setVisible(true);
    }//GEN-LAST:event_helActionPerformed

    private void helMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helMouseClicked
        // bỏ
    }//GEN-LAST:event_helMouseClicked

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        about About = new about(this,false);
        About.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        if(dem==his.size()) dem=0;
        else {
        System.out.println(his.get(dem));
        txtHTML.setText(hm.get(his.get(dem)));
        dem++;
        }
    }//GEN-LAST:event_historyActionPerformed

   // sắp xếp vào trong Hashmap và arraylist
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
    // thêm từ
    public void addWord(String w, String m)
    {
        w = w.trim().toLowerCase();
        hm.put(w, m);
        int i = searchBinary(w,keys);
        keys.add(i,w);
        mod.add(i, w);
        if(check) write(EV);
            else write(VE);
    }
    // xóa từ
    public void removeWord(String w)
    {
        int i = keys.indexOf(w);
        if (i != -1){
            keys.remove(i);
            hm.remove(w);
            mod.removeElementAt(i);
        }
        if(check) write(EV);
            else write(VE);
    }
    // sửa từ
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
        if(check) write(EV);
            else write(VE); 
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
        
         try 
        {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        //</editor-fold>
        // phần Loading...
        load ss = new load();
        ss.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(30);
                ss.lbl.setText(Integer.toString(i)+"%");
                if(i==100) ss.dispose();
            }
        }catch(Exception e){
            
        }
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryUI().setVisible(true);
            }
        });
    }
    VoiceManager vm;
    Voice v;
    private int dem=0;
    private ArrayList<String> his;
    private HashMap<String, String> hm;
    private ArrayList<String> keys;
    private DefaultListModel<String> mod;
    private boolean check; // true EV false VE
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EV_reset;
    private javax.swing.JMenuItem Ee;
    private javax.swing.JMenuItem VE_reset;
    private javax.swing.JMenuItem VNe;
    private javax.swing.JMenuItem about;
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton evButton;
    private javax.swing.JMenuItem hel;
    private javax.swing.JButton history;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
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
