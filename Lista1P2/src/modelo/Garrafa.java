package modelo;

public class Garrafa {
    private boolean tampada ;
    public float capacidade ;
    protected float carga ;
    public String modelo;
    public String cor;
    
    
    public Garrafa(String modelo, String cor, float capacidade){
        tampada = true;
        carga = 0;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    
    
    public void tomar(){
        if(tampada){
            System.out.println("Sua garrafa esta tampada");
        }
        else if(carga >= 0.2){
            System.out.println("Tomando um gole...");
            carga -= 0.2;
        }
        else if(carga != 0){
            System.out.println("Tomando o resto de agua...");
            carga = 0;
        }
        else{
            System.out.println("Não tem mais agua");
        }
    }
    
    public void derubar(){
        if(tampada){
            System.out.println("Sua garrafa esta tampada");
        }
        else if(carga >= 0.5){
            System.out.println("Derrubando agua...");
            carga -= 0.5;
        }
        else if(carga != 0){
            System.out.println("Derubando o resto de agua...");
            carga = 0;
        }
        else{
            System.out.println("Não tem mais agua");
        }
    }
    
    public void encher(){
        if(tampada){
            System.out.println("Sua garrafa esta tampada");
            
        }
        else{
            System.out.println("Enchendo a garrafa");
            carga = capacidade;
        }
    }
    
    public void tampar(){
        if(!tampada){
            System.out.println("Tampando garrafa");
            tampada = true;
        }
    }
    
    public void destampar(){
        if(tampada){
            System.out.println("Destampando garrafa");
            tampada = false;
        }
    }

    @Override
    public String toString() {
        return "Garrafa{" + "tampada=" + tampada + ", capacidade=" + capacidade + ", carga=" + carga + ", modelo=" + modelo + ", cor=" + cor + '}';
    }
}
