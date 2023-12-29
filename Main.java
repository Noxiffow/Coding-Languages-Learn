import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Hola mundo

        System.out.println ("Hola, Java!");

        String myString = "Esto es una cadena de texto";
        myString = "Aqui cambio el valor de la cadena de texto";

        Integer myInt = 7;
        myInt = myInt + 4;

        System.out.println(myString + " " + myInt);
        System.out.println(myInt - 1);

        Double myDouble = 6.5;
        System.out.println("Sacamos nuestro Double por pantalla --> " + myDouble);

        Float myFloat = 6.5f;
        System.out.println("Sacamos nuestro Float por pantalla --> " + myFloat);

        System.out.println("Sacamos por pantalla la suma del Double y el Float anteriores --> " + myDouble + myFloat);

        // Double.valueOf(myFloat), transforma el valor de float a Double en caso de incompatibilidades.
        System.out.println("Sumamos las dos variables que tenemos, pero una está con su valor adaptado a un Double --> " + myDouble + Double.valueOf(myFloat));

        System.out.println(myDouble + myFloat + myInt + "... " + myString);

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println("Sacamos por pantalla el valor final de nuestra variable Boolean --> " + myBoolean);


        // El valor null indica que la variable no contiene ningún valor, ya sea porque no ha sido inicializada o porque no tenga nada definido en ella.
        myBoolean = null;
        System.out.println(myBoolean);

        System.out.println("---------------------------------------------");

        //Vamos a hacer un ejemplo con el valor null. Usando la condición IF y ELSE, ponemos la opción de 2 distintos resultados, uno si es nulo y otro en el caso de que no fuese nulo. 
        myFloat = null;
        if (myFloat != null){
            System.out.println(myFloat + 10);
            System.out.println("Mi float es distinto de Null/Nulo");
        } else {
            System.out.println("Mi float es Null/Nulo");
        }
        

        if (myInt == 11) {
            System.out.println("myInt = 11");
        } else if (myInt == 12) {
            System.out.println("myInt = 12");
        } else {
            System.out.println("El valor no es ni 11 ni 12");
        }


        List <String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);


        Map myMap = new HashMap();
        

    }
}