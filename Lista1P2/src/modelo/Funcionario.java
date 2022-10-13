package modelo;

public class Funcionario {
    public String nome;
    public String cargo;
    private float salario;
    
    
    public Funcionario(String nome, String cargo){
        salario = 1535.25f;
        this.nome = nome;
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
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
