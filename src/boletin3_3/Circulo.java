
package boletin3_3;

public class Circulo {
    private double radio;
    private final double Pi = 3.14;
    
    public Circulo(){
        radio = 0;
    }
    
    public void setRadio(double r){
        radio = r;
    }
    
    public double getRadio(){
        return radio;
    }

    public double calcularArea(){
        double area;
        return(area = Pi*Math.pow(radio, radio));
    }
    
    public double calcularLonxitude(){
        return Pi*radio;
    }
}
