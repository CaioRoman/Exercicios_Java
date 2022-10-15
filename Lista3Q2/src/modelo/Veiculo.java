package modelo;

public abstract class Veiculo implements Andavel{
    
    private String modelo;
    private int passageiro;

    public Veiculo() {
        modelo = "Carro";
        passageiro = 26;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }
    
    
    @Override
    public void andar() {
        System.out.println("andando");
    }

    @Override
    public void parar() {
        System.out.println("parando");
    }
    
}
