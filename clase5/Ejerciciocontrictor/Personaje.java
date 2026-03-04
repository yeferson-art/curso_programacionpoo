package clase5.Ejerciciocontrictor;

public class Personaje {

    //atributos 
    String nombre;
    int nivel;
    
    //contructor que obliga a dar un nombre al crear un personaje 
    public Personaje(String nombre,int nivel){
        this.nombre=nombre;
        this.nivel =nivel; //todos enpiezan en nivel 1 por defecto


    }
    public void mostrarinfo(){
        System.out.println( " heroe : " + nombre + " | nivel : " + nivel);
    }

}
