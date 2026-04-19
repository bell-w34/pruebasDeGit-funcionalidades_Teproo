
package tareadosteprooconvtemper;
import java.util.Scanner;

public class TareaDosTeprooConvTemper {

    /**
     * Crear la clase ConversionTemperatura que tenga como atributo a temperatura en
      grados centígrados y tenga un método para convertir grados centígrados en grados
     farenheit.
     Se debe solicitar los datos al usuario, captarlos a través de un objeto Scanner y
      finalmente reportar la respuesta
     * @param args
     */
    public static void main(String[] args) {
      
        Scanner scannerEntrada = new Scanner(System.in);
       ConversionTemperatura obj = new ConversionTemperatura ();
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2.  Fahrenheit a Celsius ");
        System.out.println("3. Celsius a kelvin");
        System.out.println("Seleccione una opcion por favor: ");
        int opcion = scannerEntrada.nextInt();
        
        
//solicitar al usuario 
        System.out.println("Ingrese la temperatura: ");
        double temp =  scannerEntrada.nextDouble();
       
        
        
        
      obj.setTemp(temp);
      
      if(opcion == 1) {
          System.out.println("Resultado: " +obj.ConversionAFarenheit());
          
      }else if (opcion == 2) {
          System.out.println("Resultado: "+ obj.convertirAcelsius());
             
      }else if (opcion == 3) {
          System.out.println("Resultado: "+  obj.convertirAkelvin());
          
      } else {
          System.out.println("Opcion invalida");
      }

       
 //obtener resultad
        //double resultado = obj.ConversionAFarenheit();
        
//Mostrar resultados
      //  System.out.printf("Temperatura en farenheit: %.2f%n ", resultado);
        
         scannerEntrada.close();
        
    }
    
}

//probandooooooS
