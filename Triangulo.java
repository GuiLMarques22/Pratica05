public class Triangulo extends PoligonoRegular {
    public Triangulo(int numLados, float tamLado) {
        super(numLados, tamLado);
    }

    @Override
    public float calcularperimetro() {
        return 0;
    }

    @Override
    public float calcularArea() {
        return tamLado*tamLado;
    }
}
