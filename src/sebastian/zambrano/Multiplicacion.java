package sebastian.zambrano;

public class Multiplicacion { // nombre de la clase
    private 
            double n1; // variable de tipo double con nombre n1
            double n2; // variable de tipo double con nombre n2
            double n3; // variable de tipo double con nombre n3
            double n4; // variable de tipo double con nombre n4
            double n5; // variable de tipo double con nombre n5
            double multiplicacion; // Variable que va a recibir la multiplicación de cada una de las variables anteriores. 
    
            
    public void Datos2(double num1, double num2, double num3, double num4, double num5){ // Metodo dentro de mi clase Multiplicación, aqui llamare a mis varibles (vacio)
        this.n1 = num1; //Encapsular mi varibale n1
        this.n2 = num2; //Encapsular mi varibale n2
        this.n3 = num3; //Encapsular mi varibale n3
        this.n4 = num4; //Encapsular mi varibale n4
        this.n5 = num5; //Encapsular mi varibale n5
    }
    private double multiplicacion(){ //Metodo privado donde se realiza la Multiplicación
        multiplicacion = (n1 + n2 + n3 + n4 + n5)*0.5; // Le estoy indicando al codigo, que sume cada uno de los valores 
        // y despues lo Multiplique por * 0.5
        // aqui lo multiplico por 0.5 ya que quiero que el menú arroje resultados coherentes, en cada uno de los metodos
        // no quiero que arroje numeros extremadamente largos 
        return multiplicacion; // quiero que el resultado me retorne el valor en mi varible multiplicación 
    }
    public double getMultiplicacion(){ // dentro de este metodo quiero que devuelva el resultado de mi varible multiplicacion en double
        return multiplicacion();
    }
}
