
package sebastian.zambrano;


import java.util.Scanner; 
import java.text.DecimalFormat; // Importe esta clase para poder manejar el punto decimal de la respuesta de cada una de las operaciones





public class principal {

    
    public static void main(String[] args) {
       int a; // variable donde se guarda el dato de las operaciones del menú 
      float n1, n2, n3, n4, n5; // varibles de cada una de mis clases dentro del metodo principal
      Scanner scanner = new Scanner(System.in); // linea que permite capturar datos de usuario
      do{ // ciclo do while que me ayuda a repetir el menú, una vez finalizada cada una de las operaciones
           System.out.println("-------------Menu------------");
            System.out.println("1. Suma de productos");
            System.out.println("2. Multiplicación de productos");  // Menu principal 
            System.out.println("3. Promedio de productos");
            System.out.print("Opcion: ");
            a = scanner.nextInt(); // varible donde quiero que se guarda el numero de las 3 opciones del menu
            
                switch (a){ // la funcion switch donde permite que se enlacen cada una de las opciones del menú
                case 1: // caso uno de la suma de productos
                Suma obj = new Suma();// llamando a mi clase Suma al metodo main y dentro del case 1 
                System.out.print("Ingrese el precio de la leche: ");
                n1 = scanner.nextInt(); // capturando el primer dato del usuario
                System.out.print("Ingrese el precio de la leche descremada: ");
                n2 = scanner.nextInt(); // capturando el  segundo dato del usuario
                System.out.print("Ingrese el precio de la leche condensada: ");
                n3 = scanner.nextInt(); // capturando el  tercer dato del usuario
                System.out.print("Ingrese el precio de la mantequilla: ");
                n4 = scanner.nextInt(); // capturando el cuarto dato del usuario
                System.out.print("Ingrese el precio del queso: ");
                n5 = scanner.nextInt(); // capturando el  quinto dato del usuario
                obj.Datos(n1, n2, n3, n4, n5); // llamando a mi metodo Datos dentro de la clase suma 
                DecimalFormat df =new DecimalFormat("0000.#"); // linea de codigo que me permite manipular el punto decimal del resultado "suma"
                System.out.println("El resultado de la suma de los productos es:"+df.format(obj.getSuma())); // resultado de la operecion suma 
                System.out.print("Presione 0 para salir: ");
                a = scanner.nextInt(); // varible que me guarda el dato que el programa le esta pidiendo al usuario
                break; // cierre de mi caso numero 1 
                case 2: // caso  multiplicacion de los productos 
                Multiplicacion obj1 = new Multiplicacion(); // llamando a mi clase multiplicación
                System.out.println("****A el total de los productos se le aplicara el 5% de descuento***** ");
                System.out.println("-No es necesario colocar los mismos precios de la opcion suma- ");
                System.out.print("Precio del yogurt griego: ");
                n1 = scanner.nextInt();  // capturando el primer dato del usuario
                System.out.print("Precio del yogurt de fresa: ");
                n2 = scanner.nextInt();  // capturando el segundo dato del usuario
                System.out.print("Precio del yogurt de mora: ");
                n3 = scanner.nextInt();  // capturando el tercer dato del usuario
                System.out.print("Precio del yogurt de melocotón: ");
                n4 = scanner.nextInt();  // capturando el cuarto dato del usuario
                System.out.print("Precio de las almojábanas: ");
                n5 = scanner.nextInt();  // capturando el quito dato del usuario
                obj1.Datos2(n1, n2, n3, n4, n5); // llamando a mi metodo Datos2 de mi clase Multiplicación
                DecimalFormat df1 =new DecimalFormat("0.#"); // linea de codigo que me permite manipular el punto decimal del resultado "Multiplicación"
                System.out.println("El resultado de la multiplicacion con el descuento del 5% del total de los prodcutos es:"+df1.format(obj1.getMultiplicacion())); // resultado de la operacion multiplicacion
                System.out.print("Presione 0 para salir: ");
                a = scanner.nextInt(); // varible que me guarda el dato que el programa le esta pidiendo al usuario
                break; // cierre del caso 2
                case 3: // caso de el promedio de los prodcutos
                Promedio obj2 = new Promedio(); // llamando a la clase promedio
                System.out.print("Cantidad de frascos de yogurt  griego: ");
                n1 = scanner.nextInt();// capturando el primer dato del usuario
                System.out.print("Cantidad de frascos de yogurt de fresa: ");
                n2 = scanner.nextInt(); // capturando el segundo dato del usuario
                System.out.print("Cantidad de frascos de yogurt de mora: ");
                n3 = scanner.nextInt(); // capturando el tercer dato del usuario
                System.out.print("Cantidad de frascos de yogurt de melocotón: ");
                n4 = scanner.nextInt(); // capturando el cuarto dato del usuario
                System.out.print("Cantidad de almojábanas: ");
                n5 = scanner.nextInt(); // capturando el quinto dato del usuario
                obj2.Datos3(n1, n2, n3, n4, n5); // llamando al metodo de mi clase Promedio
                DecimalFormat df2 =new DecimalFormat("0.#");
                System.out.println("El promedio de la venta es:"+df2.format(obj2.getPromedio())); // resultado del promedio con el formato para controlar el . decimal 
                System.out.print("Presione 0 para salir: ");
                a = scanner.nextInt(); // varible que me guarda el dato que el programa le esta pidiendo al usuario
                break; // cierre del case 3
                default: 
            } // cierre del switch 
        }while(a>3 || a<1); // cierre del ciclo do While con parametros 
    } // cierre del metodo main 
} // cierre de la clase principal  
    
    

