package lista2;

import modelo.FiguraGeometrica;
import modelo.Veiculo;

public class Lista2 {

    public static void main(String[] args) {
        Veiculo V1 = new Veiculo();
        FiguraGeometrica F1 = new FiguraGeometrica();
        
        V1.andar();
        V1.parar();
        
        F1.area();
        F1.perimetro();
        
    }
    
}
