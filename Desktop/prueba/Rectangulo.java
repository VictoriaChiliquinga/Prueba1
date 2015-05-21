package figuras;


public class Rectangulo {
    
    public  static double base;
    public static double altura;
    public static double area;
    public static double perimetro;
    
   //Mètodos get & set
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArea() {
        return area;
    }
    public void setÁrea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    // CALCULO DE ÀREAS Y PERÌMETROS--------------
    
    public static double CalcularPerimetro(){
     perimetro=base+base+altura+altura;
     return perimetro;
    }
    public static double CalcularArea() {
     area=(base*altura);
     return area;
    }
    
    public  static void Imprimir(){  
    System.out.println("EL ÁREA ES: "+area+"\n EL PERÍMETRO ES: "+perimetro);
    }
}
