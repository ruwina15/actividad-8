public class Perro
{
    private String nombre, raza, personalidad, genero, tamaño;
    private int edad;

    //getters y setters de Perro
    public void setNombre(String n)
    {
        nombre = n;
    }
    public String getNombre()
    {
        return nombre;
    }


    public String getRaza()
    {
        return raza;
    }
    public void setRaza(String raza)
    {
        this.raza = raza;
    }


    public String getPersonalidad()
    {
        return personalidad;
    }
    public void setPersonalidad(String personalidad)
    {
        this.personalidad = personalidad;
    }


    public String getGenero()
    {
        return genero;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }


    public String getTamaño()
    {
        return tamaño;
    }
    public void setTamaño(String tamaño)
    {
        this.tamaño = tamaño;
    }


    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    //Metodo comer
    double comer (String tipoComida, int gramos)
    {
        if (gramos > 20){
            System.out.println(nombre + " come " + gramos + " gramos de " + tipoComida + " al dia.");
        }
        else{
            System.out.println(nombre + " no ha comido sus gramos necesarios de "+ tipoComida +" del dia. ");
        }
        return gramos;
    }

    //Metodo ladrar
    void ladrar (){
        System.out.println("¡¡Guau guau!!");
    }
}
