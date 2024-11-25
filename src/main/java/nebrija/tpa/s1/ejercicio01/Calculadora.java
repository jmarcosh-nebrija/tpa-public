package nebrija.tpa.s1.ejercicio01;

public class Calculadora {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int suma() {
        return this.x + this.y;
    }
}
