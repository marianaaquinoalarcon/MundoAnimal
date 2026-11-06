package mx.com.animales;

class Gato extends Animal implements Movible {
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public void moverse() {
        System.out.println("Los gatos corren");
    }
}
