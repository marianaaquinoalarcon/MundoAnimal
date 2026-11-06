package mx.com.animales;

class Gato extends Animal {
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("El gato maulla");
    }
}
