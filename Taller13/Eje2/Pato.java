package Eje2;
interface Volodor {
    void volar();
}
interface Nadador {
    void nadar();
}
 public  class Pato implements Volodor, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }
    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }
    }
   class prueba {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
    }
}

