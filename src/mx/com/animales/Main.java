package mx.com.animales;

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
    }
}
