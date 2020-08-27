package br.com.itau.desafio2.model;

public class Categoria {
    private Long id;
    private String nome;

    public Categoria(Long id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Categoria [nome=" + nome + ", id=" + id.toString() + "]";
    }
}
