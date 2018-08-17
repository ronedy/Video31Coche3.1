/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video31Coche3Kev;

/**
 *
 * @author HP ENVY
 */
public class Video31Coche3Kev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche u = new Coche(); 
      u.establecer_color("Marron");
      
      System.out.println(u.dime_datos_generales());
      System.out.println(u.dime_color());
      u.configura_asientos("si");
      System.out.println(u.dime_asientos());
      
      
        
    }
    
}
