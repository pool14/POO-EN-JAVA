package FigurasGeometricas;

public class Circulo {
    private float radio;
    
    public Circulo (float radio){
    this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area;
        area=3.14*(radio*2);
        System.out.println("El radio del circulo es "+ radio +" y su area es "+ area);
    
     }
}
