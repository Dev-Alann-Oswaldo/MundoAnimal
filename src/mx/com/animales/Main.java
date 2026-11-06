package mx.com.animales;

public class Main {

    public static void main(String[] args) {

        // Crear los animales
        Perro perro = new Perro("Max", 3);
        Gato gato = new Gato("Luna", 2);
        Vaca vaca = new Vaca("Lola", 5);

        // Guardar los animales en un arreglo
        Animal[] animales = {perro, gato, vaca};

        // Recorrer el arreglo
        for (Animal animal : animales) {

            animal.mostrarInformacion();
            animal.hacerSonido();

            // Utilizar la interfaz Movible
            Movible movimiento = (Movible) animal;
            movimiento.moverse();

            System.out.println("-------------------------");
        }
    }
}