package sebastian.zambrano;

public class Suma { // nombre de la clase
    private 
            float n1; // variable de tipo float con nombre n1
            float n2; // variable de tipo float con nombre n2
            float n3; // variable de tipo float con nombre n3
            float n4; //variable de tipo float con nombre n4
            float n5; //variable de tipo float con nombre n5
            float suma; // Variable que va a recibir la suma de cada una de las variables anteriores. 
    
            
    public void Datos(float n1, float n2, float n3, float n4, float n5){ // Metodo dentro de mi clase Suma, aqui llamare a mis varibles (vacio)
        this.n1 = n1; //Encapsular mi varibale n1 con this para que el usuario no tenga acceseso 
        this.n2 = n2; //Encapsular mi varibale n2 con this para que el usuario no tenga acceseso 
        this.n3 = n3; //Encapsular mi varibale n3 con this para que el usuario no tenga acceseso 
        this.n4 = n4; //Encapsular mi varibale n4 con this para que el usuario no tenga acceseso 
        this.n5 = n5; //Encapsular mi varibale n5 con this para que el usuario no tenga acceseso 
    }
    private float suma(){ //Metodo privado donde se realiza la operación suma, lo dejo en privado para que el usuario no se de cuenta del procedimiento y pido que devuelva un valor flotante
        suma = n1 + n2 + n3 + n4 + n5; // Le estoy indicando al codigo, que mi variable suma va hacer igual a la suma de n1,n2,n3,n4,n5
        return suma; // Estoy devolviendo el resultado a mi variable suma 
        // si nos damos cuenta mi operacion solo esta haciendo la operacion con las varibles de color verde. 
    }
    public float getSuma(){ // dentro de este metodo quiero que devuelva el resultado de mi varible suma en float
        return suma();
    }
}
