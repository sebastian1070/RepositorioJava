package sebastian.zambrano;

public class Promedio { // nombre de la clase
    private 
            float n1; // variable de tipo float con nombre n1
            float n2; // variable de tipo float con nombre n2
            float n3; // variable de tipo float con nombre n3
            float n4; // variable de tipo float con nombre n4
            float n5; // variable de tipo float con nombre n5
            float suma; // variable de tipo float en el cual quiero que se almacene el resultado del promedio
    
            
    public void Datos3(float n1, float n2, float n3, float n4, float n5){// Metodo dentro de mi clase Promedio, aqui llamare a mis varibles (vacio)
        this.n1 = n1; //Encapsular n1 con this
        this.n2 = n2; //Encapsular n2 con this
        this.n3 = n3; //Encapsular n3 con this
        this.n4 = n4; //Encapsular n4 con this
        this.n5 = n5; //Encapsular n5 con this
    }
    private float promedio(){ //Metodo privado donde se realiza la operación
        suma = (n1 + n2 + n3 + n4 + n5)/5; // estoy indicando, que sume cada uno de los valores que son 5 y que los divida por 5 
        return suma; // quiero que el resultado me retorne el valor en mi varible promedio
    }
    public float getPromedio(){ // dentro de este metodo quiero que devuelva el resultado de mi varible promedio en double
        return promedio();
    }
}
