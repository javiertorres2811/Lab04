public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro ("Copito", 3, "Kiltro");
        Gato gato = new Gato ("Kuro", 2, true);

        System.out.println ("PERRO");
        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println ("GATO");
        gato.mostrarInfo();
        gato.hacerSonido();
    }
}