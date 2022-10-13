package parte1;

public class Exercicios {

    public static void main(String[] args) {
        Livro L1 = new Livro();
        L1.autor = "caio";
        L1.editora = "Roman";
        L1.titulo = "CaioRoman";
        L1.pagina_maxima = 249;
        
        L1.abrirLivro();
        L1.passarPagina();
        L1.marcarPagina();
        L1.fechandoLivro();
        
        Garrafa G1 = new Garrafa();
        G1.capacidade =  6 ;
        G1.cor = "Azul";
        G1.modelo = "não sei";
        
        G1.encher();
        G1.destampar();
        G1.encher();
        G1.derubar();
        G1.tomar();
        G1.tampar();
        
        Funcionario F1 = new Funcionario();
        F1.cargo = "Faxineiro";
        F1.salario = (float) 1654.25;
        F1.nome = "Caio";
        
        F1.almentarSalario();
        F1.diminuindoSalario();
        
        Estudante E1 = new Estudante();
        E1.curso = "Engearia automação";
        E1.nome = "Caio Roman";
        E1.prontuario = "BV32151981";
        
        E1.trocarPeriodoNoturno();
        E1.trocarPeriodoMatutino();
        E1.trocarPeriodoVespetino();
        E1.trocarPeriodoNoturno();
        
        System.out.println(L1.toString());
        System.out.println(G1.toString());
        System.out.println(F1.toString());
        System.out.println(E1.toString());
    }
    
}
