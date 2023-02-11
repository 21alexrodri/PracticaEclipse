/*
  
Cálculo del área de una corona circular.
Los valores de los radios se entran por teclado.
  
Instrucciones:
Desde el método que calcula el área de la corona se debe llamar a
otro método que calcule el área de un círculo, ya que el área de una
corona circular es el área del 'círculo mayor' menos el área del
'círculo menor'.
  
  
Salida del programa
----------------------------------------
Escribe el radio interior : 6
Escribe el radio exterior : 9
El area es 141,37
  
*/
  
import java.io.*;
  
public class E04_AreaCoronaCircularPROF {
     
    public static void main(String[] args) throws IOException {
  
    	BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
  
        System.out.print("Escribe el radio interior : ");
        double radioInt = Double.parseDouble(entrada.readLine());
  
        System.out.print("Escribe el radio exterior : ");
        double radioExt = Double.parseDouble(entrada.readLine());
        
        Cercle petit=new Cercle(radioInt);
        Cercle gran=new Cercle(radioExt);
               
        Corona corCircular=new Corona(petit, gran);

        double area=corCircular.area();

        System.out.printf("El area es %.2f\n",area);
    }
}
