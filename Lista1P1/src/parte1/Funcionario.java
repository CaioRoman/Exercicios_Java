package parte1;

public class Funcionario {
    public String nome;
    public String cargo;
    public float salario;
            
    public void almentarSalario(){
        System.out.println("Almentando o salario em 10%");
        salario += salario*0.1;
    }
    public void diminuindoSalario(){
        System.out.println("Diminuindo o salario em 10%");
        salario -= salario*0.1;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
    
}
