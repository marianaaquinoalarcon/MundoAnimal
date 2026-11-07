package mx.com.animales;

class Perro extends Animal implements Movible{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.print(" |    Sonido: guau");
    }

    @Override
    public void moverse() {
        System.out.print(" |    Movmiento: corre");
    }
}
