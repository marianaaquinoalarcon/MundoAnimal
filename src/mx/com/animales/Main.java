package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Perro objPerro = new Perro("Perro peludo", 2);
        objPerro.mostrarInformacion();
        objPerro.hacerSonido();


        Gato objGato = new Gato("Gato esponjado", 1);
        objGato.mostrarInformacion();
        objGato.hacerSonido();


        Vaca objVaca = new Vaca("Vaca lechera", 3);
        objVaca.mostrarInformacion();
        objVaca.hacerSonido();

    }
}
