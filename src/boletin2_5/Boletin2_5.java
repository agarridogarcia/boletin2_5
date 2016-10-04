
package boletin2_5;

import javax.swing.JOptionPane;


public class Boletin2_5 {

 
    public static void main(String[] args) {
        float millasmarinas, metros;
        final int CONSTANTE= 1852;
        millasmarinas=Float.parseFloat(JOptionPane.showInputDialog("millasmarinas"));
                metros=millasmarinas*CONSTANTE;
                
                JOptionPane.showMessageDialog(null, "metros="+metros);
    }
    
}
