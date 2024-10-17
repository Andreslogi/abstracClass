public class App {
    public static void main(String[] args) throws Exception {
        Perro perro = new Perro("Firulais", 4, "Golden");
        System.out.println(perro.toString());
        perro.hacerRuido();
        System.out.println(perro.deponer());
        System.out.println(perro.deponer(true));

        Gato gato = new Gato("El michi", 5);
        System.out.println(gato.toString());
        gato.hacerRuido();

        Caballo caballo = new Caballo("Pepe", 15);
        System.out.println(caballo.toString());
        caballo.hacerRuido();
    }
}

