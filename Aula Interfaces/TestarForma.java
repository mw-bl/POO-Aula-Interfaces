public class TestarForma {
    public static void main(String[] args) {

        System.out.println("\n### CIRCULO ###");

        FormaGeometrica circulo = new Circulo(5);
        System.out.println("\nArea do Circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do Circulo: " + circulo.calcularPerimetro());

        System.out.println("\n### QUADRADO ###");

        FormaGeometrica quadrado = new Quadrado(10);
        System.out.println("\nArea do Circulo: " + quadrado.calcularArea());
        System.out.println("Perimetro do Circulo: " + quadrado.calcularPerimetro());
    }
}
