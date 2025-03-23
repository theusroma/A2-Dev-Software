public class Calculadora {
    float numero1;
    float numero2;

    void calcularSoma(){
        float resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }
    void calcularSubtracao(){
        float resultado = numero1 - numero2;
        System.out.println("Resultado: " + resultado);
    }
    void calcularMulti(){
        float resultado = numero1 / numero2;
        System.out.println("Resultado: " + resultado);
    }
    void calcularDiv(){
        float resultado = numero1 * numero2;
        System.out.println("Resultado: " + resultado);
    }
}
