
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
       
//ConversionTemperatura temperatura = new ConversionTemperatura ();
       

//solicitar al usuario 
        System.out.println("Ingrese la temperatura: ");
        double temp =  scannerEntrada.nextDouble();
       
        
//crear objeto
        ConversionTemperatura obj = new ConversionTemperatura (temp);
       
 //obtener resultado
        double resultado = obj.ConversionAFarenheit();
        
//Mostrar resultados
        System.out.printf("Temperatura en farenheit: %.2f%n ", resultado);
        
         scannerEntrada.close();
        
    }
    
}
