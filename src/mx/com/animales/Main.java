package mx.com.animales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> arrayAnimal = new ArrayList<>();
        arrayAnimal.add(new Perro("Max",3));
        arrayAnimal.add(new Gato("Luna",2));
        arrayAnimal.add(new Vaca("Lola",5));
        arrayAnimal.add(new Caballo("Ace",1));

        for (Animal an: arrayAnimal) {
           an.mostrarInformacion();
           an.hacerSonido();

           //El if es para confirmar la interfaz
           if (an instanceof Movible){
               Movible animal = (Movible) an;
               animal.moverse();
           }
            System.out.println();
        }
    }
}
