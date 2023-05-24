package entities;

public class Produto {
  private String nome;
  private Double preco;
  private Integer qntd;

  public Produto(String nome, Double preco, Integer qntd){
    this.nome = nome;
    this.preco = preco;
    this.qntd = qntd;
  }

  public String getNome(){
    return nome;
  }
  public Double valorTotal(){
    return preco * qntd;
  }
}
