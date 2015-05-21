/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnicas;

/**
 *
 * @author Usuario
 */
public class Cuadrado extends Figuras {
    public double lado1,lado2,lado3,lado4;
    public Cuadrado(double area, double perimetro, String tipoFigura,double lado1, double lado2, double lado4, double lado3)
    {     
        
        super(area,perimetro,tipoFigura);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.lado4=lado4;
    }
    
    public static double Perimetro(double lado1,double lado2,double lado3,double lado4)
    {
        double perimetro;
        if(lado1+lado2+lado3+lado4<=300)
        {
            perimetro=lado1+lado2+lado3+lado4;
        }
        else
        {
            perimetro=0;
        }
        
        return perimetro;
        
        }
    
    /**
     *
     * @return
     */
    public static double Area(double lado1,double lado2,double lado3,double lado4)
    {
        double area;
        if(lado1+lado2+lado3+lado4<=300)
        {
            area=lado1*lado2;
        }
        else
        {
            area=0;
        }
        
        return area;
    
    }
    
    
    }
  


