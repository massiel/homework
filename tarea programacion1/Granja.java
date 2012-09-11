
package granja;


public class Granja {

   
    public static void main(String[] args) {
      
        gato g=new gato();
        System.out.println("El nombre del gato es "+g.QUIENSOY());
        Perro p=new Perro();
        System.out.println("El nombre del Perro es "+p.QUIENSOY());
        gallina gn=new gallina ();
        System.out.println("El nombre de la gallina es "+gn.QUIENSOY());
        
    }
}
