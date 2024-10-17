public class Caballo extends Animal {

    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Relinchar!");
    }

    @Override
    public void sonido() {

    }

    @Override
    public String deponer() {
        return "El Caballo se ha hecho mierda";
    }

    @Override
    public String deponer(boolean tipo) {
        return tipo ? "Mierda" : "mear";
    }

    @Override
    public void sonido(String texto) {
        System.out.println("El caballo ha emitido un sonido" + texto);        
    }

}
