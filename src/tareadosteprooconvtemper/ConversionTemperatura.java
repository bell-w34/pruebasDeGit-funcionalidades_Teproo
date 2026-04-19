
package tareadosteprooconvtemper;

/**
     - Crear la clase ConversionTemperatura que tenga como atributo a temperatura en
      grados centígrados y tenga un método para convertir grados centígrados en grados
     farenheit.
     Se debe solicitar los datos al usuario, captarlos a través de un objeto Scanner y
      finalmente reportar la respuesta
     
     */

public class ConversionTemperatura {
     /*atributo a temperatura en
      grados centígrados*/
    
    private double temp; // <- atributo encapsulado

    public ConversionTemperatura() {
    }
    
   
    
    
    
     //Constructor 
     public ConversionTemperatura (double temp) {
        this.temp = temp;   
        
}
      

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
     
    
    
     //Metodo para conertir a Fahrenheit
     public double ConversionAFarenheit() {
         return (temp * 9/5) +32;
         
     }


      
    //Metodo para convertir Fahrenheit a celsius
     public double convertirAcelsius(){
         return (temp - 32)*5 / 9;
     }
    
     
     /*Se debe solicitar los datos al usuario, captarlos a través de un objeto Scanner y
      finalmente reportar la respuesta*/
     
     
}