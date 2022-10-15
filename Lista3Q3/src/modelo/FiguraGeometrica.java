package modelo;

public abstract class FiguraGeometrica implements Calcular{
    
    private int x;
    private int y;
    
    public FiguraGeometrica() {
        x = 5;
        y = 2;
    }

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
    
    
    
    @Override
    public void area() {
        System.out.println("calculando area");
    }

    @Override
    public void perimetro() {
        System.out.println("calculando perimetro");
    }
    
}
