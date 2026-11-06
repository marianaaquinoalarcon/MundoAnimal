package mx.com.animales;

class Vaca extends Animal implements Movible{
public Vaca(String nombre, int edad){
    super(nombre, edad);
}

    @Override
    void hacerSonido() {
        System.out.println("La vaca muge");
    }

    @Override
    public void moverse() {
        System.out.println("La vaca camina");
    }
}
