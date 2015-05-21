
public class Figuras {
	
	private double area;
	private double perimetro;
    public String tipoFigura;
    
    
    
    public Figuras(double area, double perimetro, String tipoFigura) {
		super();
		this.area = area;
		this.perimetro = perimetro;
		this.tipoFigura = tipoFigura;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getPerimetro() {
		return perimetro;
	}



	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}



	public String getTipoFigura() {
		return tipoFigura;
	}



	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}



	@Override public String toString() {
    
    	return "La figura " + tipoFigura + " " + "tiene un perimetro de: " + perimetro + " " +
    			"y un area de: " + area;
    }
    
	    



}
