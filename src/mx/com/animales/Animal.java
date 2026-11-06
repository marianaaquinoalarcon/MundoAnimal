package mx.com.animales;

abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public  void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }

    public void mostrarInformacion(){
        System.out.println("El nombre del animal es "+this.nombre);
        System.out.println("La edad del animal es "+this.edad);
    }

    abstract void hacerSonido();
}
