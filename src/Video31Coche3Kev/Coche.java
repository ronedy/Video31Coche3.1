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
public class Coche {
   
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    String color;
    int pesototal;
    boolean asientos_cuero, climatizador;
    
    public Coche(){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public String dime_datos_generales(){ //metodo getter
        
        return "La plataforma del vehiculo tiene " + ruedas + 
               " ruedas " + ". mide " + largo/1000 + " metros con un ancho de " +
               ancho + " cm y un peso de la plataforma de " + peso + " Kg "; 
    }
    
    public void establecer_color(String color_coche){//metodo setter
        
        color = color_coche;
        
    }
    
    public String dime_color(){
        
        return "El color del automovil es " + color;
    }
    
    public void configura_asientos(String asientos_cuero){

    if(asientos_cuero=="si"){
        
        this.asientos_cuero=true;
        
    }else{
        
        this.asientos_cuero=false;
    }
        
    }
    
    public String dime_asientos(){
        
        if(asientos_cuero==true){
            
            return "El automovil tiene asientos de cuero";
            
        }else{
            
            return "El automovil tiene asientos de serie";
        }
    }
    
}
