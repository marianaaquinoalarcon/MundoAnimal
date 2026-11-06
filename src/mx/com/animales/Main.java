package mx.com.animales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Perro ---");
        Perro objPerro = new Perro("Perro peludo", 2);
        objPerro.mostrarInformacion();
        objPerro.hacerSonido();
        objPerro.moverse();

        System.out.println("--- Gato ---");
        Gato objGato = new Gato("Gato esponjado", 1);
        objGato.mostrarInformacion();
        objGato.hacerSonido();
        objGato.moverse();

        System.out.println("--- Vaca ---");
        Vaca objVaca = new Vaca("Vaca lechera", 3);
        objVaca.mostrarInformacion();
        objVaca.hacerSonido();
        objVaca.moverse();

        System.out.println("--- Array de Animales ---");
        List<Animal> arrayAnimal = new ArrayList<>();
        arrayAnimal.add(new Perro("Perro caramelo",3));
        arrayAnimal.add(new Gato("Gato esfinge",4));
        arrayAnimal.add(new Vaca("Vaca manchada",1));

        for (Animal an: arrayAnimal) {
           an.mostrarInformacion();
           an.hacerSonido();

           //El if es para confirmar la interfaz
           if (an instanceof Movible){
               Movible animal = (Movible) an;
               animal.moverse();
           }
        }
    }
}
