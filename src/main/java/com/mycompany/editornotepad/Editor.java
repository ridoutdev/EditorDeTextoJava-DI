package com.mycompany.editornotepad;
/******EDITOR DE TEXTO CON JAVA SWING******/
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 ** @author Ridouan Abdellah Tieb.
 **/
public class Editor extends javax.swing.JFrame {
    
    /*Voy a crear un editor de texto con swing que tenga funcionalidades 
    similares al Notepad de Windows. En concreto tiene la posibilidad de abrir 
    un archivo y mostrarlo, guardar un archivo editado, cambiar el tamaño y el 
    color de la fuente, cambiar la disposición del texto y la sustitución de 
    los simbolos de puntuación, información sobre la ruta y el tamaño del 
    archivo, además de información sobre el desarrollador. Por último tendrá
    una opcion para salir del programa aparte de la X de la esquina superior 
    derecha. 
    */
    
    /*------------------------------------------------------------------------*/
    
    /*
    El constructor vacío de la clase y el método que iniciará los componentes 
    creados de java swing. 
    */
    public Editor() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameBuscArchivo = new javax.swing.JFrame();
        buscArchivo = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        alumno = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        escribe = new javax.swing.JScrollPane();
        escribiendo = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        acerca = new javax.swing.JButton();
        tamano = new javax.swing.JLabel();
        ubica = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        guardar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        fuente = new javax.swing.JMenu();
        tamaño = new javax.swing.JMenu();
        tamaño1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        tamaño2 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        tamaño3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        color = new javax.swing.JMenu();
        rojo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        azul = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        verde = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        negro = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mayuscula = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        puntos = new javax.swing.JMenuItem();

        javax.swing.GroupLayout frameBuscArchivoLayout = new javax.swing.GroupLayout(frameBuscArchivo.getContentPane());
        frameBuscArchivo.getContentPane().setLayout(frameBuscArchivoLayout);
        frameBuscArchivoLayout.setHorizontalGroup(
            frameBuscArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(frameBuscArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frameBuscArchivoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        frameBuscArchivoLayout.setVerticalGroup(
            frameBuscArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(frameBuscArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frameBuscArchivoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buscArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad-RiduDev");

        escribiendo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        escribe.setViewportView(escribiendo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escribe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escribe, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        acerca.setText("Acerca de");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });

        tamano.setText("Tamaño: ");

        ubica.setText("Ubicación: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ubica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acerca))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        archivo.setText("Archivo");

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrir.setText("Abrir archivo");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        archivo.add(abrir);
        archivo.add(jSeparator1);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar.setText("Guardar ");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);
        archivo.add(jSeparator2);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        fuente.setText("Fuente");

        tamaño.setText("Tamaño");

        tamaño1.setText("18");
        tamaño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamaño1ActionPerformed(evt);
            }
        });
        tamaño.add(tamaño1);
        tamaño.add(jSeparator4);

        tamaño2.setText("20");
        tamaño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamaño2ActionPerformed(evt);
            }
        });
        tamaño.add(tamaño2);
        tamaño.add(jSeparator6);

        tamaño3.setText("22");
        tamaño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamaño3ActionPerformed(evt);
            }
        });
        tamaño.add(tamaño3);

        fuente.add(tamaño);
        fuente.add(jSeparator3);

        color.setText("Color");

        rojo.setText("Rojo");
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });
        color.add(rojo);
        color.add(jSeparator5);

        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        color.add(azul);
        color.add(jSeparator7);

        verde.setText("Verde");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });
        color.add(verde);
        color.add(jSeparator10);

        negro.setText("Negro");
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActionPerformed(evt);
            }
        });
        color.add(negro);

        fuente.add(color);
        fuente.add(jSeparator8);

        mayuscula.setText("Todo mayúscula");
        mayuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayusculaActionPerformed(evt);
            }
        });
        fuente.add(mayuscula);
        fuente.add(jSeparator9);

        puntos.setText("Sin puntuación");
        puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntosActionPerformed(evt);
            }
        });
        fuente.add(puntos);

        jMenuBar1.add(fuente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    Evento que sucede cuando hacemos click en el item "salir" del menu "archivo".
    Sale del programa. 
    */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el tamaño de la fuente, cambiando
    esta a 18 con el método setFont().
    */
    private void tamaño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaño1ActionPerformed
        escribiendo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
    }//GEN-LAST:event_tamaño1ActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el tamaño de la fuente, cambiando
    esta a 20 con el método setFont().
    */
    private void tamaño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaño2ActionPerformed
        escribiendo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    }//GEN-LAST:event_tamaño2ActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el tamaño de la fuente, cambiando
    esta a 22 con el método setFont().
    */
    private void tamaño3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaño3ActionPerformed
        escribiendo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
    }//GEN-LAST:event_tamaño3ActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el color de la fuente, cambiando
    este a rojo con el método setForeground().
    */
    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        escribiendo.setForeground(Color.red);
    }//GEN-LAST:event_rojoActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el color de la fuente, cambiando
    este a azul con el método setForeground().
    */
    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        escribiendo.setForeground(Color.blue);
    }//GEN-LAST:event_azulActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el color de la fuente, cambiando
    este a verde con el método setForeground().
    */
    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        escribiendo.setForeground(Color.green);
    }//GEN-LAST:event_verdeActionPerformed
    /*
    Evento que sucede cuando damos click en el item "abrir" del menu "archivo".
    
    Mediante el método showOpenDialog() creamos la ventana de selección de 
    archivos.
    
    Utilizamos la clase File con el método getSelectedFile() para fijar "f" en 
    el archivo que queremos, con getAbsolutePath() obtenemos la ruta del archivo
    finalmente utilizamos el método propio getContenido() para escribir en
    el JTextPane con el metodo setText() el contenido del archivo. 
    
    Además en este método (abrirActionPerformed) añado dos funcionalidades más,
    por una parte mediante los métodos getCurrentDirectory() y getParent()
    obtengo la ubicación del archivo y por otra parte con el metodo length()
    ayudado de String.valueOf , enseño el tamaño del archivo en Bytes. 
    */
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
         
        buscArchivo.showOpenDialog(this);
        
        File f = buscArchivo.getSelectedFile();
        String path = f.getAbsolutePath();
        String contenido = getContenido(path);
        escribiendo.setText(contenido);
        
       
        f = buscArchivo.getCurrentDirectory();
        String fullpath = f.getParent();
        ubica.setText(fullpath);
        
        tamano.setText(String.valueOf(f.length()/1024) + "MB");
  
    }//GEN-LAST:event_abrirActionPerformed
    /*
    Evento que sucede cuando hacemos click en el item "guadar" del menu "archivo".
    
    Mediante el método showSaveDialog() creamos la ventana de guardado de 
    archivos.
    
    Guardamos el archivo seleccionado en una variable de tipo int.
    
    Si la selección de archivo es correcta, utilizamos la clase File para 
    seleccionarlo y obtener su ruta como hicimos en el método anterior. 
    
    Ahora utilizaremos las clases FileWriter y BufferedWriter para escribir y 
    guardar en el archivo mediante los métodos write() flush() y close()
    
    Si el archivo existe te preguntará si deseas reemplazarlo. 
    */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        int seleccion = buscArchivo.showSaveDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION){
        File f =  new File(buscArchivo.getSelectedFile().getAbsolutePath());
        
        try {                    
                    FileWriter wr = new FileWriter(f, false);
                  
                    BufferedWriter w = new BufferedWriter(wr);
                    
                    if(f.exists()){
		    if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog
                    (buscArchivo,"El fichero existe,deseas reemplazarlo?",
                    "Sobreescribir Archivo",JOptionPane.YES_NO_OPTION)){
                        
                    w.write(escribiendo.getText());
                    w.flush();
                    w.close(); }
                    }
                    }catch (IOException ex) {
                    JOptionPane.showMessageDialog(escribiendo, ex.getMessage());
                }              
            }    
    }//GEN-LAST:event_guardarActionPerformed
    /*
    Evento que sucede cuando hacemos click en el botón "acerca de".
    
    Salta una ventana emergente con la información del alumno. Utilizo la clase
    
    JOptionPane con el método showMessageDialog();
    */
    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Ridouan Abdellah Tieb","ALUMNO"
                                      , JOptionPane.CLOSED_OPTION);    
    }//GEN-LAST:event_acercaActionPerformed
    /*
    Evento que sucede cuando hacemos click en el item "Todo mayúscula" del menu
    "fuente".
    
    Conseguimos pasar todo el texto que tengamos en el JTextPane mayúscula. 
    Creo un String del que obtengo el texto escrito con el método getText() y
    mediante el método setTex() enseño por pantalla esa variable pasandole el 
    método toUpperCase().
    */
    private void mayusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayusculaActionPerformed
        String mayuscula = escribiendo.getText();
        escribiendo.setText(mayuscula.toUpperCase());      
    }//GEN-LAST:event_mayusculaActionPerformed
    /*
    Evento que sucdede cuando hacemos click en el item "Sin puntuación" del menu
    "archivo".
    
    Mediante el método replaceAll() de la clase String intercambiamos los 
    símbolos de puntuación por una cadena vacía "". 
    */
    private void puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntosActionPerformed
        String mayuscula = escribiendo.getText();
        mayuscula= mayuscula.replaceAll("[\\.\\,\\(\\)\\;\\:]", "");
        escribiendo.setText(mayuscula);
    }//GEN-LAST:event_puntosActionPerformed
    /*
    Evento que sucede cuando queremos cambiar el color de la fuente, cambiando
    este a negro con el método setForeground().
    */
    private void negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActionPerformed
        escribiendo.setForeground(Color.black);
    }//GEN-LAST:event_negroActionPerformed
    /*
    Este método es propio y lo utilizo como ayuda en el método abrirActionPerformed
    Es el mismo que vimos en clase para leer un archivo. Es simple utiliza las
    clases FileReader y BufferedReader para crear un objeto que luego hay que leer 
    recorreriendolo con un while y retornar lo leido.  
    */
    public String getContenido(String path){
        FileReader fr;
        BufferedReader br = null;
        String contenido = "";
        try {
               fr = new FileReader(path);
               br = new BufferedReader(fr);

               String linea;
               while((linea=br.readLine())!=null){
               contenido += linea + "\n";
            }
               return contenido;

                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                }finally{
                          try{
                               br.close();
                            }catch(IOException e){
                            }
                        }
                        return contenido;
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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JButton acerca;
    private javax.swing.JOptionPane alumno;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenuItem azul;
    private javax.swing.JFileChooser buscArchivo;
    private javax.swing.JMenu color;
    private javax.swing.JScrollPane escribe;
    private javax.swing.JTextPane escribiendo;
    private javax.swing.JFrame frameBuscArchivo;
    private javax.swing.JMenu fuente;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem mayuscula;
    private javax.swing.JMenuItem negro;
    private javax.swing.JMenuItem puntos;
    private javax.swing.JMenuItem rojo;
    private javax.swing.JMenuItem salir;
    private javax.swing.JLabel tamano;
    private javax.swing.JMenu tamaño;
    private javax.swing.JMenuItem tamaño1;
    private javax.swing.JMenuItem tamaño2;
    private javax.swing.JMenuItem tamaño3;
    private javax.swing.JLabel ubica;
    private javax.swing.JMenuItem verde;
    // End of variables declaration//GEN-END:variables

}
