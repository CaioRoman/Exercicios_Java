package parte1;

public class Garrafa {
    private boolean tampada = true;
    public float capacidade = (float) 2.0;
    protected float carga = 0;
    public String modelo;
    public String cor;
    
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
