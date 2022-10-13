package lista1p2;

import modelo.Estudante;
import modelo.Funcionario;
import modelo.Garrafa;
import modelo.Livro;

public class Lista1P2 {

    public static void main(String[] args) {
        Livro L1 = new Livro("caio", "Roman", "CaioRoman");
        
        L1.abrirLivro();
        L1.passarPagina();
        L1.pularPaginas();
        L1.marcarPagina();
        L1.fechandoLivro();
        
        System.out.println("Pagina Marcada: "+L1.getPagina_marcada());
        
        Garrafa G1 = new Garrafa("não sei", "Azul", 6.0f);
        
        G1.encher();
        G1.destampar();
        G1.encher();
        G1.derubar();
        G1.tomar();
        G1.tampar();
        
        System.out.println("Carga: "+G1.getCarga());
        
        Estudante E1 = new Estudante("Caio Roman", "BV32151981", "Engearia automação");
        
        E1.trocarPeriodoNoturno();
        E1.trocarPeriodoMatutino();
        E1.trocarPeriodoVespetino();
        E1.trocarPeriodoNoturno();
        
        System.out.println("Periodo: "+E1.getPeriodo());
        
        Funcionario F1 = new Funcionario("Caio", "Faxineiro");
        
        F1.almentarSalario();
        F1.diminuindoSalario();
        
        System.out.println("Salario: "+F1.getSalario());
    }
    
}
