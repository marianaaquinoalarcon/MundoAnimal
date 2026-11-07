package mx.com.animales;

class Gato extends Animal implements Movible {
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.print(" |    Sonido: miau");
    }

    @Override
    public void moverse() {
        System.out.print(" |    Movimiento: camina");
    }
}
