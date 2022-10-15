package modelo;

public abstract class VeículoMatorizado extends Veiculo{
    private String cavalos;

    public String getCavalos() {
        return cavalos;
    }

    public void setCavalos(String cavalos) {
        this.cavalos = cavalos;
    }
    
    public void ligar(){
        System.out.println("ligando");
    }
    public void desligar(){
        System.out.println("Desligando");
    }
}
