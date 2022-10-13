package parte1;

public class Livro {
    public int pagina_maxima = 100;
    public int pagina_marcada = 1;
    protected int numero_da_pagina;
    public String altor;
    public String editora;
    public String titulo;
    
    public void abrirLivro(){
        System.out.println("abrindo o livro...");
        numero_da_pagina = pagina_marcada;
    }
    
    public void fechandoLivro(){
        System.out.println("Fechando o livro...");
        numero_da_pagina = 0;
    }
    
    public void marcarPagina(){
        System.out.println("Marcando pagina...");
        pagina_marcada = numero_da_pagina;
    }
    
    public void passarPagina(){
        if(numero_da_pagina < pagina_maxima){
            System.out.println("passando pagina");
            numero_da_pagina += 1;
        }
        else{
            System.out.println("Voce esta na ultima pagina");
        }
    }
    
    public void voltarPagina(){
        if(numero_da_pagina >= 0){
            System.out.println("voltando a pagina");
            numero_da_pagina -= 1;
        }
        else{
            System.out.println("Voce esta na primeira pagina");
        }
    }

    @Override
    public String toString() {
        return "Livro{" + "pagina_marcada=" + pagina_marcada + ", numero_da_pagina=" + numero_da_pagina + ", altor=" + altor + ", editora=" + editora + ", titulo=" + titulo + '}';
    }
    
    
    
    
    
    
}
