public class Circulo implements FormaGeometrica{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularArea(){
        return (float) (Math.PI * raio * raio);
    }
    
    @Override
    public float calcularPerimetro(){
        return (float) (2 * Math.PI * raio);
    }
}