/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynotepad;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gihan Chathuranga
 */
public class Notepad extends javax.swing.JFrame {

    String programName = "Notepad";
    String filename = "";
    String holdText;
    String fn;
    String dir;
    boolean textChange = false;
    String fileName;
    Clipboard clip = getToolkit().getSystemClipboard();

    public Notepad() {
        initComponents();
    }

    public void checkFile() {
        BufferedReader read;
        StringBuffer sb = new StringBuffer();
        try {
            read = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = read.readLine()) != null) {
                sb.append(line + "\n");
            }
            textArea.setText(sb.toString());
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColorchoser = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        textArea = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveasMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        textcolourMenu = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorchoserLayout = new javax.swing.GroupLayout(dialogColorchoser.getContentPane());
        dialogColorchoser.getContentPane().setLayout(dialogColorchoserLayout);
        dialogColorchoserLayout.setHorizontalGroup(
            dialogColorchoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogColorchoserLayout.setVerticalGroup(
            dialogColorchoserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 328, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("My Notepad");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textArea.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textAreaTextValueChanged(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        saveasMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveasMenu.setText("Save As");
        saveasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveasMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        textcolourMenu.setText("Text Colour");
        textcolourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcolourMenuActionPerformed(evt);
            }
        });
        jMenu2.add(textcolourMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
        newFile();
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
        if (textArea.getText().length() < 0) {
            FileDialog fd = new FileDialog(Notepad.this, "Save", FileDialog.SAVE);
            fd.show();
            if (fd.getFile() != null) {
                filename = fd.getDirectory() + fd.getFile();
                setTitle(filename);
                checkFile();
            }
            textArea.requestFocus();
        } else if (!textChange) {
            FileDialog fd = new FileDialog(this, "Choose File", FileDialog.SAVE);
            fd.show();
            if (fd.getFile() != null) {
                filename = fd.getDirectory() + fd.getFile();
                setTitle(filename);
                checkFile();
            }
            textArea.requestFocus();
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save");
            if (confirm == JOptionPane.YES_OPTION) {
                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);
                }
            } else if (confirm == JOptionPane.NO_OPTION) {
                setTitle(programName);
                textArea.setText("");
                textChange = false;
            }
        }
    }//GEN-LAST:event_openMenuActionPerformed

    private void textcolourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcolourMenuActionPerformed
        // TODO add your handling code here:
        Color c = colorChooser.showDialog(null, "Colour Dialog", black);
        textArea.setForeground(c);
    }//GEN-LAST:event_textcolourMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        if (filename.equals("")) {
            saveAs();
        } else {
            save(filename);
        }
    }//GEN-LAST:event_saveMenuActionPerformed

    private void saveasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasMenuActionPerformed
        saveAs();
    }//GEN-LAST:event_saveasMenuActionPerformed

    private void textAreaTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textAreaTextValueChanged
        if (TextEvent.TEXT_VALUE_CHANGED != 0) {
            if (!textChange) {
                setTitle("* " + getTitle());
                textChange = true;
                saveMenu.setEnabled(true);

            }
        }
    }//GEN-LAST:event_textAreaTextValueChanged

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        if ("".equals(textArea.getText())) {
            System.exit(0);
        }else if(!textChange){
            System.exit(0);
        }else{
             int confirm = JOptionPane.showConfirmDialog(null, "Do you want");
            if (confirm == JOptionPane.YES_OPTION) {
                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);
                    System.exit(0);
                }
            } else if (confirm == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_exitMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if ("".equals(textArea.getText())) {
            System.exit(0);
        }else if(!textChange){
            System.exit(0);
        }else{
             int confirm = JOptionPane.showConfirmDialog(null, "Do you want");
            if (confirm == JOptionPane.YES_OPTION) {
                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);
                    System.exit(0);
                }
            } else if (confirm == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JDialog dialogColorchoser;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem saveasMenu;
    private java.awt.TextArea textArea;
    private javax.swing.JMenuItem textcolourMenu;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
        FileDialog fd = new FileDialog(Notepad.this, "Save", FileDialog.SAVE);
        fd.show();

        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory();
            filename = dir + fn + ".txt";

            setTitle(filename);

            try {
                DataOutputStream d = new DataOutputStream(new FileOutputStream(filename));
                holdText = textArea.getText();
                BufferedReader br = new BufferedReader(new StringReader(holdText));

                while ((holdText = br.readLine()) != null) {
                    d.writeBytes(holdText + "\r\n");
                    d.close();
                }
            } catch (Exception ex) {
                System.out.println("File Not Found");
            }
            textArea.requestFocus();
            save(filename);
        }
    }

    private void save(String filename) {
        setTitle(programName + " " + filename);

        try {
            FileWriter out = new FileWriter(fn);
            out.write(textArea.getText());
            out.close();
        } catch (IOException ex) {
            System.out.println("Error" + ex);
        }
        textChange = false;
        saveMenu.setEnabled(false);
    }

    private void newFile() {
        if (textArea.getText().length() < 0) {
            setTitle("Untitled-" + programName);
            textArea.setText("");
            textChange = false;
        } else if (!textChange) {
            setTitle("Untitled-" + programName);
            textArea.setText("");
            textChange = false;
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save");
            if (confirm == JOptionPane.YES_OPTION) {
                if ("".equals(filename)) {
                    saveAs();
                } else {
                    save(filename);
                }
            } else if (confirm == JOptionPane.NO_OPTION) {
                setTitle(programName);
                textArea.setText("");
                textChange = false;
            }
        }
    }
}
