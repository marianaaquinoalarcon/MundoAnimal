package mx.com.animales;

class Vaca extends Animal{
public Vaca(String nombre, int edad){
    super(nombre, edad);
}

    @Override
    void hacerSonido() {
        System.out.println("La vaca muge");
    }
}
