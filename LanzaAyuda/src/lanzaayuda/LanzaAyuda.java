/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzaayuda;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.net.URL; 
import javax.help.*;


/**
 *
 * @author Eduardo
 */
public class LanzaAyuda 
{
    private static JFrame frame;
    private static JPanel panel;
    private static JMenuBar menuBar;
    private static JMenu menu;
    private static JMenuItem menuItem;
    
    public static void main(String[] args) 
    {                                  
        // Creamos una ventana
        frame = new JFrame("LanzaAyuda");
        
        // Creamos el panel
        panel = new JPanel();
        panel.setSize(300, 400);
        
        // Creamos el MenuBar
        menuBar = new JMenuBar();

        // Creamos el primer menú
        menu = new JMenu("Ayuda");        
        menuBar.add(menu);

        
        // Creamos el primer menuItem
        menuItem = new JMenuItem("Contenido de Ayuda");
                
        HelpSet hs = obtenFicAyuda(); 
        HelpBroker hb = hs.createHelpBroker();
        
        hb.enableHelpOnButton(menuItem, "index", hs);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        hb.enableHelpKey(menuItem, "index", hs);
                
        menu.add(menuItem);
                
        panel.add(menuBar);                

        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300, 400);        
    }
    
            
    public static HelpSet obtenFicAyuda()
    { 
        try 
        { 
            // ClassLoader cl = LanzaAyuda.class.getClassLoader();
            File file = new File(LanzaAyuda.class.getResource("help/helpset.hs").getFile());
            
            URL url = file.toURI().toURL();
            
            // crea un objeto Helpset
            HelpSet hs = new HelpSet(null,url);
            return hs;
        }
       catch (Exception ex) 
        { 
        JOptionPane.showMessageDialog(null,"Fichero HelpSet no encontrado"); 
        return null; 
        } 
    }
    
}
