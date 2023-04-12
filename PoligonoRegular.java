public abstract class PoligonoRegular {
    public int numLados;
    public float tamLado;

    public PoligonoRegular(int numLados, float tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public float calcularperimetro(){

        return numLados*tamLado;
    }
    public abstract float calcularArea();

    }

