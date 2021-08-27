package EjemploHerencia;

public class SuperclaseEjemploHerencia {
    
    private int a;
    private int b;
    private int c;

    public SuperclaseEjemploHerencia(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public int sumar(){
        c=a+b;
        return c;
    }

    
    
}

