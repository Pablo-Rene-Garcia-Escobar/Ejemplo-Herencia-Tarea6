package EjemploHerencia;

public class SubclaseEjemploHerencia extends SuperclaseEjemploHerencia {
    
    public static final long serialVersionUID = 700L;

    //La clase hija hereda de la clase padre gracias al constructor
    public SubclaseEjemploHerencia(int a, int b) {
        super(a, b);
    }    
    
}
