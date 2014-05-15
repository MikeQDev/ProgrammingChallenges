package image.viewer;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class ImageViewerGUI extends JFrame{
    private JLabel image, description;
    private JMenuBar menuBar;
    private JMenuItem exitItem, openItem;
    private JMenu fileMenu;
    private JFileChooser fChooser;
    
    public ImageViewerGUI() {
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(350,280);
        
        description = new JLabel("File -> Open and select image to view", SwingConstants.CENTER);
        buildMenuBar();
        
        add(description, BorderLayout.CENTER);
        
        setVisible(true);
    }
    private void buildMenuBar(){
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        openItem.addActionListener(new OpenListener());
        exitItem.addActionListener(new ExitListener());
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }
    private class OpenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            fChooser = new JFileChooser();
            int status = fChooser.showOpenDialog(null);
            File selectedFile = fChooser.getSelectedFile();
            ImageIcon iconPath = new ImageIcon(selectedFile.getPath());
            if(status == JFileChooser.APPROVE_OPTION){
                description.setText(null);
                description.setIcon(iconPath);
                pack();
            }
        }
    }
    private class ExitListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}
