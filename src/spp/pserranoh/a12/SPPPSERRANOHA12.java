/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.a12;
import javax.swing.JOptionPane;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHA12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double e,p,imc;
      String imc2;
     try{
     e = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura en metros"));
     p = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso en Kilogramos."));
     imc= p/Math.pow(e,2);
 if(imc>25){
            imc2=(" de Sobrepeso");
        }else 
            if(imc<19){
               imc2=(" de Desnutrición");
        }else {
          imc2=("Normal");
                }
     JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es de : "+imc+" esta en un estado "+imc2  );
     }
     catch(Exception ex){
         JOptionPane.showMessageDialog(null,"ERROR"+ ex);
     }
    
    
}
    }