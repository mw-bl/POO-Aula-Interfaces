public class Quadrado implements FormaGeometrica{
    private int lado;

    public Quadrado (int lado) {
        this.lado = lado;
    }
   
    @Override
    public float calcularArea(){
        return lado * lado;
    }
    
    @Override
    public float calcularPerimetro(){
        return 4 * lado;
    }

}
