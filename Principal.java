
import java.util.Scanner;
/**
 * Calcular el area de un poligono regular * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: longitud (s), lados (n)
        // 1. Definicion de variables
        // Datos de entrada
        double s;
        int n;
        // Datos de salida
        double area;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese longitud de un lado del poligono:");
        s = teclado.nextDouble();
        System.out.print("Ingrese la cantidad de lados del poligono:");
        n = teclado.nextInt();
        
        
        // 2. Realizar calculos
        area = (n * Math.pow(s,2)) / (4 *   Math.tan(Math.PI / n));
        if (n<5)
        {
            System.out.print("La cantidad de lados no puede ser menor a 5, digite nuevamente el numero de lados:");
            n = teclado.nextInt();
        }
        // 3. Mostrar datos de salida
        System.out.println("El poligono de" + n + "lados y con longitud de" + s + "tiene un area de:" + area);
        
                                 
      
         
  } //Fin de la clase principal
}