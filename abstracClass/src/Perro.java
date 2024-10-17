public class Perro extends Animal {
    private String colorPelo;

    public Perro(String nombre, int edad, String colorPelo) {
        super(nombre, edad);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau!");
    }

    @Override
    public void sonido() {

    }

    @Override
    public String deponer() {
        return "El Perro se ha hecho mierda";
    }

    @Override
    public String deponer(boolean tipo) {
        return tipo ? "mierda" : "mear";
    }

    @Override
    public void sonido(String texto) {
        System.out.println("El perro ha emitido un sonido" + texto);        
    }

    
}