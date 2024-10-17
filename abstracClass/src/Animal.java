public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void hacerRuido();

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + " Años";
    }

    public abstract void sonido();
    public abstract void sonido(String texto);
    public abstract String deponer();
    public abstract String deponer(boolean tipo);
}

// ensayo repositorio github.