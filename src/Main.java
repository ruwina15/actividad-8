import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Perro perrito1 = new Perro();
        Perro perrito2 = new Perro();
        Scanner teclado = new Scanner(System.in);

        //Datos del perrito 1
        System.out.println("Ingrese los datos del perrito 1");
        System.out.print("Nombre: ");
        perrito1.setNombre(teclado.nextLine());

        System.out.print("Raza: ");
        perrito1.setRaza(teclado.nextLine());

        System.out.print("Edad: ");
        perrito1.setEdad(teclado.nextInt());
        teclado.nextLine();

        System.out.print("Personalidad: ");
        perrito1.setPersonalidad(teclado.nextLine());

        System.out.print("Genero: ");
        perrito1.setGenero(teclado.nextLine());

        System.out.print("Tamaño: ");
        perrito1.setTamaño(teclado.nextLine());

        // Invocar los metodos de comer y ladrar 1
        System.out.print("Tipo de comida para " + perrito1.getNombre() + ": ");
        String tipoComida1 = teclado.nextLine();

        System.out.print("Cantidad de gramos: ");
        int gramos1 = teclado.nextInt();
        teclado.nextLine();

        perrito1.comer(tipoComida1, gramos1);

        perrito1.ladrar();

        //Datos del perrito 2
        System.out.println("Ingrese los datos del perrito 2");
        System.out.print("Nombre: ");
        perrito2.setNombre(teclado.nextLine());

        System.out.print("Raza: ");
        perrito2.setRaza(teclado.nextLine());

        System.out.print("Edad: ");
        perrito2.setEdad(teclado.nextInt());
        teclado.nextLine();

        System.out.print("Personalidad: ");
        perrito2.setPersonalidad(teclado.nextLine());

        System.out.print("Genero: ");
        perrito2.setGenero(teclado.nextLine());

        System.out.print("Tamaño: ");
        perrito2.setTamaño(teclado.nextLine());

        // Invocar los metodos de comer y ladrar 2
        System.out.print("Tipo de comida para " + perrito2.getNombre() + ": ");
        String tipoComida2 = teclado.nextLine();

        System.out.print("Cantidad de gramos: ");
        int gramos2 = teclado.nextInt();
        teclado.nextLine();

        perrito2.comer(tipoComida2, gramos2);
        perrito2.ladrar();

        //Ver los datos de ambos perritos
        System.out.println("Perrito 1: " + perrito1.getNombre() + " "
                + perrito1.getRaza() + " " + perrito1.getEdad() + " "
                + perrito1.getPersonalidad() + " " + perrito1.getGenero()
                + " " + perrito1.getTamaño() + " ");

        System.out.println("Perrito 2: " + perrito2.getNombre() + " "
                + perrito2.getRaza() + " " + perrito2.getEdad() + " "
                + perrito2.getPersonalidad() + " " + perrito2.getGenero()
                + " " + perrito2.getTamaño() + " ");

    }
}