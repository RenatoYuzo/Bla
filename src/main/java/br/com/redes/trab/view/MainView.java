package br.com.redes.trab.view;

import br.com.redes.trab.p2p.Client1;
import br.com.redes.trab.p2p.ClientUDP;
import br.com.redes.trab.p2p.Server1;
import br.com.redes.trab.p2p.ServerUDP;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author RenatoYuzo
 */
public class MainView extends javax.swing.JFrame {

    ServerSocket serverSocket;
    Server1 newServer;
    Socket client;
    Client1 myClientTCP;
    ClientUDP myClientUDP;
    ServerUDP myServerUDP;
    String fileName;

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        //tfDownload.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmClear = new javax.swing.JPopupMenu();
        miClear = new javax.swing.JMenuItem();
        pmClear1 = new javax.swing.JPopupMenu();
        miClear1 = new javax.swing.JMenuItem();
        pmClear2 = new javax.swing.JPopupMenu();
        miClear2 = new javax.swing.JMenuItem();
        listFiles = new java.awt.List();
        btnServer = new javax.swing.JButton();
        tfIP = new javax.swing.JTextField();
        tfPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textArea = new java.awt.List();
        textError = new java.awt.List();
        btnClient = new javax.swing.JButton();
        cbCommand = new javax.swing.JComboBox<>();
        textAreaClient = new java.awt.List();
        tfSrcFolder = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDestFolder = new javax.swing.JTextField();
        btnChooseFileSrcFolder = new javax.swing.JButton();
        btnChooseFileDestFolder = new javax.swing.JButton();
        tfDownload = new javax.swing.JTextField();

        miClear.setText("Clear");
        miClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClearActionPerformed(evt);
            }
        });
        pmClear.add(miClear);

        miClear1.setText("Clear");
        miClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClear1ActionPerformed(evt);
            }
        });
        pmClear1.add(miClear1);

        miClear2.setText("Clear");
        miClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClear2ActionPerformed(evt);
            }
        });
        pmClear2.add(miClear2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P2P");
        setResizable(false);

        listFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listFilesMouseReleased(evt);
            }
        });

        btnServer.setText("Server");
        btnServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerActionPerformed(evt);
            }
        });

        tfIP.setText("255.255.255.255");

        tfPort.setText("5555");

        jLabel1.setText("IP Address:");

        jLabel2.setText("Port:");

        textArea.setBackground(new java.awt.Color(204, 204, 204));
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAreaMouseReleased(evt);
            }
        });

        textError.setBackground(new java.awt.Color(255, 204, 204));

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        cbCommand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Get All IP's From RCA", "2 - Get All Available Files", "3 - Download File" }));

        textAreaClient.setBackground(new java.awt.Color(204, 204, 204));
        textAreaClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAreaClientMouseReleased(evt);
            }
        });

        tfSrcFolder.setText("D:\\Desktop\\Shared Files");

        jLabel3.setText("Source Folder:");

        jLabel4.setText("Dest. Folder:");

        tfDestFolder.setText("D:\\Desktop\\Received Files from Server");

        btnChooseFileSrcFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file_icon.png"))); // NOI18N
        btnChooseFileSrcFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileSrcFolderActionPerformed(evt);
            }
        });

        btnChooseFileDestFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file_icon.png"))); // NOI18N
        btnChooseFileDestFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileDestFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPort, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfSrcFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChooseFileSrcFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(163, 163, 163)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAreaClient, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(btnClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCommand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDestFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChooseFileDestFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfDownload))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tfDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseFileSrcFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfSrcFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(tfDestFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addComponent(btnChooseFileDestFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClient)
                    .addComponent(btnServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAreaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed

        String command = Integer.toString(cbCommand.getSelectedIndex() + 1);

        if (cbCommand.getSelectedIndex() == 1) {
            openClientUDP(command);
        } else if (cbCommand.getSelectedIndex() == 2) {
            fileName = getSelectedFile();
            if (fileName != null) {
                openClientUDP(command);
            } else if (listFiles.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "Empty list of files.");
            } else {
                JOptionPane.showMessageDialog(null, "Select one file to download.");
            }
        }

    }//GEN-LAST:event_btnClientActionPerformed

    private void btnServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerActionPerformed
        tfIP.setEnabled(false);
        tfPort.setEnabled(false);
        tfSrcFolder.setEnabled(false);
        btnChooseFileSrcFolder.setEnabled(false);
        openServerUDP();
    }//GEN-LAST:event_btnServerActionPerformed

    private void btnChooseFileSrcFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileSrcFolderActionPerformed
        chooseDirectory("Choose Server source folder", tfSrcFolder);

    }//GEN-LAST:event_btnChooseFileSrcFolderActionPerformed

    private void btnChooseFileDestFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileDestFolderActionPerformed
        chooseDirectory("Choose Client destination folder", tfDestFolder);
    }//GEN-LAST:event_btnChooseFileDestFolderActionPerformed

    private void miClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClearActionPerformed
        if (listFiles.getItemCount() > 0) {
            listFiles.removeAll();
        }
    }//GEN-LAST:event_miClearActionPerformed

    private void listFilesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFilesMouseReleased
        if (evt.isPopupTrigger()) {
            pmClear.show(listFiles, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_listFilesMouseReleased

    private void miClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClear1ActionPerformed
        if (textArea.getItemCount() > 0) {
            textArea.removeAll();
        }
    }//GEN-LAST:event_miClear1ActionPerformed

    private void miClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClear2ActionPerformed
        if (textAreaClient.getItemCount() > 0) {
            textAreaClient.removeAll();
        }
    }//GEN-LAST:event_miClear2ActionPerformed

    private void textAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMouseReleased
        if (evt.isPopupTrigger()) {
            pmClear1.show(textArea, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_textAreaMouseReleased

    private void textAreaClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaClientMouseReleased
        if (evt.isPopupTrigger()) {
            pmClear2.show(textAreaClient, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_textAreaClientMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainView main = new MainView();
                main.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFileDestFolder;
    private javax.swing.JButton btnChooseFileSrcFolder;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnServer;
    private javax.swing.JComboBox<String> cbCommand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.List listFiles;
    private javax.swing.JMenuItem miClear;
    private javax.swing.JMenuItem miClear1;
    private javax.swing.JMenuItem miClear2;
    private javax.swing.JPopupMenu pmClear;
    private javax.swing.JPopupMenu pmClear1;
    private javax.swing.JPopupMenu pmClear2;
    private java.awt.List textArea;
    private java.awt.List textAreaClient;
    private java.awt.List textError;
    private javax.swing.JTextField tfDestFolder;
    private javax.swing.JTextField tfDownload;
    private javax.swing.JTextField tfIP;
    private javax.swing.JTextField tfPort;
    private javax.swing.JTextField tfSrcFolder;
    // End of variables declaration//GEN-END:variables

    public void chooseDirectory(String msg, JTextField tf) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new java.io.File("."));
        fileChooser.setDialogTitle(msg);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            tf.setText(fileChooser.getSelectedFile().getPath());
        }

    }

    public String getSelectedFile() {
        String[] separated;

        for (int i = 0; i < listFiles.getItemCount(); i++) {
            if (listFiles.isIndexSelected(i)) {
                separated = listFiles.getItem(i).split(" ");
                return separated[1];
            }
        }
        return null;
    }

    /*public void openServer() {
        Thread myServer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket();
                    serverSocket.bind(new InetSocketAddress(tfIP.getText(), Integer.parseInt(tfPort.getText())));

                    textArea.add("Server port: " + serverSocket.getLocalPort());
                    textArea.add("Server HostAddress = " + serverSocket.getInetAddress().getHostAddress());
                    textArea.add("Server HostName = " + serverSocket.getInetAddress().getHostName());

                    while (true) {
                        textArea.add("====== Main Server waiting for Client ======");
                        client = serverSocket.accept();

                        //textArea.add("Server connected with Client " + client.getPort());
                        //textArea.add("Client HostAddress = " + client.getInetAddress().getHostAddress());
                        //textArea.add("Client HostName = " + client.getInetAddress().getHostName());
                        newServer = new ServerTCP(serverSocket, client, textArea, textError, listFiles, tfSrcFolder.getText());
                        Thread threadServer = new Thread(newServer);
                        threadServer.start();
                    }

                } catch (IOException ex) {
                    textError.add("Error: " + ex.getMessage());
                }
            }
        });
        myServer.start();
    }

    public void openClient(String command, String fileName) {
        myClientTCP = new ClientTCP(Integer.parseInt(tfPort.getText()), textArea, textError, listFiles, tfDestFolder.getText(), command, fileName);
        Thread threadClientTCP = new Thread(myClientTCP);
        threadClientTCP.start();
    }*/
    public void openClientUDP(String command) {
        myClientUDP = new ClientUDP(textAreaClient, textError, listFiles, command, tfDestFolder.getText());
        Thread threadClientUDP = new Thread(myClientUDP);
        threadClientUDP.start();
    }

    public void openServerUDP() {
        myServerUDP = new ServerUDP(textArea, textError, listFiles, tfSrcFolder.getText());
        Thread threadServerUDP = new Thread(myServerUDP);
        threadServerUDP.start();
    }
}
