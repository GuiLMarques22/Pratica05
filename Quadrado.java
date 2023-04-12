public class Quadrado extends  PoligonoRegular{
    public Quadrado(int numLados, float tamLado) {
        super(numLados, tamLado);
    }

    @Override
    public float calcularperimetro() {
        return 0;
    }

    @Override
    public float calcularArea() {
        return (tamLado*tamLado)/2;
    }

}
