package mx.com.animales;

class Perro extends Animal implements Movible{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void moverse() {
        System.out.println("EL perro trota");
    }
}
