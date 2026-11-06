package mx.com.animales;

class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
