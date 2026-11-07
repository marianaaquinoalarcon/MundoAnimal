package mx.com.animales;

class Vaca extends Animal implements Movible{
public Vaca(String nombre, int edad){
    super(nombre, edad);
}

    @Override
    void hacerSonido() {
        System.out.print(" |    Sonido: muuu");
    }

    @Override
    public void moverse() {
        System.out.print(" |    Movimiento: camina");
    }
}
