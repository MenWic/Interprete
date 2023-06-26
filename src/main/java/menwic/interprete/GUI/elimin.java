/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.yefrig.compilerapp.front;

import com.yefrig.compilerapp.cup.Parser;
import com.yefrig.compilerapp.cup.ParserSym;
import com.yefrig.compilerapp.flex.Lexer;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 *
 * @author yefri
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    private String NAME = "Code.java";
//    private String pathRelative = System.getProperty("user.dir");
//    private String pathPackage = "main.java.com.yefrig.compilerapp.cup";
//    private String path = pathRelative + File.separator + "src" + File.separator + pathPackage.replace(".", File.separator);

    public Window() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.editorjTextArea.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorjTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editorjButton = new javax.swing.JButton();
        consolejButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        runjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        editorjTextArea.setBackground(new java.awt.Color(19, 24, 52));
        editorjTextArea.setColumns(20);
        editorjTextArea.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        editorjTextArea.setForeground(java.awt.Color.yellow);
        editorjTextArea.setRows(5);
        editorjTextArea.setCaretColor(java.awt.Color.yellow);
        jScrollPane1.setViewportView(editorjTextArea);

        consoleTextArea.setEditable(false);
        consoleTextArea.setBackground(new java.awt.Color(19, 24, 52));
        consoleTextArea.setColumns(20);
        consoleTextArea.setFont(new java.awt.Font("Gargi", 0, 13)); // NOI18N
        consoleTextArea.setForeground(java.awt.Color.yellow);
        consoleTextArea.setRows(5);
        jScrollPane2.setViewportView(consoleTextArea);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editor");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consola");

        editorjButton.setBackground(java.awt.Color.yellow);
        editorjButton.setForeground(java.awt.Color.yellow);
        editorjButton.setIcon(new javax.swing.ImageIcon("/home/yefri/NetBeansProjects/CompilerApp/src/main/java/com/yefrig/compilerapp/images/cleaning_clean_broom_icon_153281.png")); // NOI18N
        editorjButton.setToolTipText("Limpiar Editor");
        editorjButton.setBorder(null);
        editorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorjButtonActionPerformed(evt);
            }
        });

        consolejButton.setBackground(java.awt.Color.yellow);
        consolejButton.setIcon(new javax.swing.ImageIcon("/home/yefri/NetBeansProjects/CompilerApp/src/main/java/com/yefrig/compilerapp/images/iconfinder-broom-clean-service-labor-website-4622511_122412.png")); // NOI18N
        consolejButton.setToolTipText("Limpiar Consola");
        consolejButton.setBorder(null);
        consolejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolejButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(java.awt.Color.yellow);

        runjButton.setBackground(java.awt.Color.yellow);
        runjButton.setIcon(new javax.swing.ImageIcon("/home/yefri/NetBeansProjects/CompilerApp/src/main/java/com/yefrig/compilerapp/images/run_icon-icons.com_61189 (1).png")); // NOI18N
        runjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                        .addComponent(runjButton)
                        .addGap(56, 56, 56)
                        .addComponent(editorjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(consolejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editorjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(consolejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(runjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void editorjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.editorjTextArea.setText("");
    }                                             

    private void consolejButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.consoleTextArea.setText("");
    }                                              

    private void runjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Parser parser = null;
        try {
            Lexer lexer = new Lexer(new StringReader(editorjTextArea.getText()));
            String code = "";
            Random r = new Random();
            code += "import java.util.ArrayList;\n"
                    + "import javax.swing.JOptionPane;\n";
            code += "public class Code {\n";
            code += "\tpublic static void main(String[] args){\n";
            Symbol tk = lexer.next_token();

            while (tk != null && tk.sym != ParserSym.EOF) {
                if (tk.sym == ParserSym.ERROR) {
                    JOptionPane.showMessageDialog(this, "Lexico" + tk.value.toString() + "" + tk.left + "" + tk.right);
                    return;
                }
                tk = lexer.next_token();
            }

            lexer = new Lexer(new StringReader(editorjTextArea.getText()));
            parser = new Parser(lexer, consoleTextArea);
            parser.parse();
            code += parser.getCode();
            code += "\t}\n}";
            //System.out.println(code);
            this.deleteFIles();
            this.createFileJava(code);
            this.compileFile();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, " Finalizando Ejecucion");
        }
    }                                          

    private void createFileJava(String code) {
        try {
            File file = new File(NAME);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(code);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void deleteFIles() {
        try {

            String[] comands = {"rm", "Code.java"};
            ProcessBuilder pb = new ProcessBuilder(comands);
            pb.redirectErrorStream(true);
            Process pr = pb.start();
            int result = pr.waitFor();
            System.out.println("Archivos eliminados .java");
        } catch (IOException ex) {
            System.out.println("Error al eliminar archivos");
        } catch (InterruptedException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void compileFile() {
        try {
            //PROCESO
            String[] comand = {"javac", "Code.java"};
            ProcessBuilder pb = new ProcessBuilder(comand);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            //FIN PROCESO
            int result = process.waitFor();
            if (result == 0) {
                JOptionPane.showMessageDialog(this, "Archivo Java compilado exitosamente");
                this.executeFile();
            } else {
                System.out.println("Error al compilar el archivo Java");
                // Leer la salida de error del proceso de compilación
                BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                String line;
                while ((line = br.readLine()) != null) {
                    int startIndex = line.indexOf("error:");
                    String error = line.substring(startIndex);
                    consoleTextArea.append("Error: " + error + "\n");
                }
                br.close();
                return;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error al compilar el archivo Java: " + e.getMessage());
            return;
        }

    }

    private void executeFile() throws IOException {
        try {
            //INICIO PROCESO
            String[] comand={"java","Code"};
            ProcessBuilder pb = new ProcessBuilder(comand);
            pb.redirectErrorStream(true);
            Process pr = pb.start();
            //FIN PROCESO
            BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            consoleTextArea.setText("");
            while ((line = br.readLine()) != null) {
                consoleTextArea.append(line+"\n");
            }
            int exitCode = pr.waitFor();
            System.out.println("Proceso terminado");
        } catch (IllegalArgumentException | MalformedURLException | InterruptedException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JButton consolejButton;
    private javax.swing.JButton editorjButton;
    private javax.swing.JTextArea editorjTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton runjButton;
    // End of variables declaration                   
}