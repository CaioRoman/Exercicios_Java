package modelo;

public class Livro {
    private int pagina_maxima ;
    private int pagina_marcada ;
    protected int numero_da_pagina;
    public String autor;
    public String editora;
    public String titulo;
    
    public Livro(String autor, String editora, String titulo){
        pagina_maxima = 256;
        pagina_marcada = 1;
        numero_da_pagina = 0;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getPagina_maxima() {
        return pagina_maxima;
    }

    public void setPagina_maxima(int pagina_maxima) {
        this.pagina_maxima = pagina_maxima;
    }

    public int getPagina_marcada() {
        return pagina_marcada;
    }

    public void setPagina_marcada(int pagina_marcada) {
        this.pagina_marcada = pagina_marcada;
    }

    public int getNumero_da_pagina() {
        return numero_da_pagina;
    }

    public void setNumero_da_pagina(int numero_da_pagina) {
        this.numero_da_pagina = numero_da_pagina;
    }
    
    public void abrirLivro(){
        System.out.println("Abrindo o livro...");
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
            System.out.println("Passando pagina");
            numero_da_pagina += 1;
        }
        else{
            System.out.println("Voce esta na ultima pagina");
        }
    }
    
    public void pularPaginas(){
        if(numero_da_pagina < (pagina_maxima - 10)){
            System.out.println("Pulando 10 paginas");
            numero_da_pagina += 10;
        }
        else if(numero_da_pagina != pagina_maxima){
            System.out.println("Indo para a ultima pagina");
        }
        else{
            System.out.println("Voce esta na ultima pagina");
        }
    }
    
    public void voltarPagina(){
        if(numero_da_pagina >= 0){
            System.out.println("Voltando a pagina");
            numero_da_pagina -= 1;
        }
        else{
            System.out.println("Voce esta na primeira pagina");
        }
    }

    @Override
    public String toString() {
        return "Livro{" + "pagina_marcada=" + pagina_marcada + ", numero_da_pagina=" + numero_da_pagina + ", autor=" + autor + ", editora=" + editora + ", titulo=" + titulo + '}';
    } 
}
