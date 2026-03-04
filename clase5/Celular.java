package clase5;

public class Celular {

    // atributos
    String marca;
    String modelo;
    int bateria = 100;

    // metodo

    /*
     * firma del metodo
     * publico
     * void --> no retorna
     * el metodo tiene como nombre "llamar"
     * tiene el parametro y es del tipo entero
     * 
     */
    public void llamar(String numero) {
        System.out.println("llamando al " + numero + "........");
        this.bateria -= 5;
        
    }
}
