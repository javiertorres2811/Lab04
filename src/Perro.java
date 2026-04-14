public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza= raza;
    }

    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }
}