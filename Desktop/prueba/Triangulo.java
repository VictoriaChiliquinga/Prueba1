
package triangulo;

public class Triangulo extends Figuras {

    public Triangulo(double area, double perimetro, String tipoFigura) {
        super(area, perimetro, tipoFigura);
    }
    //Metodo del Perimetro
    public void Perimetro(double lado1,double lado2,double lado3)
    {
      
      if((lado1+lado2+lado3) >=100)
      {
         System.out.println("El perimetro no puede ser calculado");
         perimetro=0;
      }
      else
      {
          perimetro = lado1+lado2+lado3;
      }
    }
    
    //Metodo del Area
    
    public void Area (double base,double altura)
    {
        area = (base*altura)/2;
    }
    
    public void Imprimir ()
    {
        System.out.println( "El Area :"+area );
        System.out.println( "El Perimetro :"+perimetro ); 
        System.out.println( "El Tipo de Figura :"+tipoFigura ); 
    
    }

    
}
