package Eje3;
interface Volador {
    void volar();
}
interface Nadador {
    void nadar();
}
class Pato implements Volador, Nadador {

    @Override
   public void volar() {
      System.out.println("El pato esta volando sobre el lago.");
    }

   @Override
   public void nadar() {
        System.out.println("El pato esta nadando en el agua.");
    }
}


abstract class Animal {

   //default 
   void comer() {
        System.out.println("El animal esta comiendo.");
    }

    
   
}
 class Prueba {
    public static void main(String[] args) {

        Pato pato = new Pato();

        pato.volar();
        pato.nadar();
       
}
}