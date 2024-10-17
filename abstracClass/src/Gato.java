public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }

    @Override
    public void sonido() {

    }

    @Override
    public String deponer() {
        return "El Gato ha depuesto algo";
    }

    @Override
    public String deponer(boolean tipo) {
        return tipo ? "bola de pelos" : "vómito";
    }

    @Override
    public void sonido(String texto) {
        System.out.println("El gato ha emitido un sonido" + texto);
    }

}
