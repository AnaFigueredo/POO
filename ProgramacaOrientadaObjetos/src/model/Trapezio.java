package model;

public class Trapezio extends Quadrilatero {
    private float baseMenor;

    public Trapezio(float base, float baseMenor, float altura) {
        super(base, altura);
        this.baseMenor = baseMenor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calcularArea() {
        return (getBase() + baseMenor) * getAltura() / 2;
    }
}
