abstract class Figura {
     int base;
     int altura;
   
    abstract void calcularArea();
}

class Rectangulo extends Figura {
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    void calcularArea() {
        int area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
}

class Triangulo extends Figura {
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    void calcularArea() {
        int area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}

class PruebaFigura {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(3, 22);
        rec.calcularArea();
        
        Triangulo tri = new Triangulo(3, 15);
        tri.calcularArea();
    }
}
