package mx.com.animales;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Perro", 2) {
            @Override
            void hacerSonido() {
                System.out.println("Ladrar");
            }
        };
        animal.mostrarInformacion();
        animal.hacerSonido();
    }
}
