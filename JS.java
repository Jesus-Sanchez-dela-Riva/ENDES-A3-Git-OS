//Jesús Sánchez de la Riva
package unidad3;
import java.util.Scanner;//Importo el Scanner
public class U03_A2 {//Creo la clase
    public static void main (String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println ("Hola,elige un numero decimal");
        double numero = sc.nextDouble();//Indico la variable
        System.out.println ("Hola, has elegido " + numero); 
        System.out.println ("Hola, elige un numero entero");
        int entero = sc.nextInt();//Indico la variable
        System.out.println ("Hola, has elegido " + entero); 
        System.out.println ("Hola, elige un numero escrito");
        String numero3 =  sc.next();     
        System.out.println ("Hola, has elegido " + numero3);
	System.out.println("Denuevo yo aca");
        
    }
}
