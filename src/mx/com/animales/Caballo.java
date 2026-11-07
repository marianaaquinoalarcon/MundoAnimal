package mx.com.animales;

class Caballo extends Animal implements Movible {
    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.print(" |    Sonido: hiii");
    }

    @Override
    public void moverse() {
        System.out.print(" |    Movimiento: trota");
    }
}
