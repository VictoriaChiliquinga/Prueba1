

public class TrianguloTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t = new Triangulo(0,0,"Triangulo");
        
        //En el caso que el lado sea mayor a 100
        t.Perimetro(50,25,13);
        t.Area(2.2,1.2);
        
        System.out.println( t.getArea() );
        System.out.println( t.getPerimetro() ); 
        System.out.println( t.getTipoFigura() ); 
        
        //En el caso que el lado sea menor a 100
        
        System.out.println("-------------------------------");
        t.Perimetro(50,25,25);
        t.Area(2.2,1.2);
        
        System.out.println( t.getArea() );
        System.out.println( t.getPerimetro() ); 
        System.out.println( t.getTipoFigura() ); 
    }
    
}
