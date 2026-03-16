package br.ufpb.iago.mlStore;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto() {
        this.id = 0;
        this.nome = "";
        this.preco = 0;
        this.quantidadeEstoque = 0;
    }
    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.quantidadeEstoque += quantidade;
        }
    }
    public boolean vender (int quantidade){
        if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco) + " (" + quantidadeEstoque + " em estoque)";
    }
}
