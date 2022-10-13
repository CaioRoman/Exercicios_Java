package parte1;

public class Estudante {
    public String nome;
    public String prontuario;
    public String curso;
    protected String periodo = "Noturno";
    
    public void trocarPeriodoNoturno(){
        if(periodo != "Noturno"){
            System.out.println("agora o estudante é do periodo Noturno");
            periodo = "Noturno";
        }
        else{
            System.out.println("O estudante ja estuda neste periodo");
        }
    }
    public void trocarPeriodoVespetino(){
        if( periodo != "Vespetino"){
            System.out.println("agora o estudante é do periodo Vespetino");
            periodo = "Vespetino";
        }
        else{
            System.out.println("O estudante ja estuda neste periodo");
        }
    }
    public void trocarPeriodoMatutino(){
        if(periodo != "Matutino"){
            System.out.println("agora o estudante é do periodo Matutino");
            periodo = "Matutino";
        }
        else{
            System.out.println("O estudante ja estuda neste periodo");
        }
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", prontuario=" + prontuario + ", curso=" + curso + ", periodo=" + periodo + '}';
    }
    
    
}
