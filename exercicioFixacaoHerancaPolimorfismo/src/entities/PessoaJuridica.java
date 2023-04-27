package entities;

public class PessoaJuridica extends Pessoa{

  private int numeroFuncionarios;


  public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios){
    super(nome, rendaAnual);
    this.numeroFuncionarios = numeroFuncionarios;
  }
  public int getNumeroFuncionarios(){
    return numeroFuncionarios;
  }
  public void setNumeroFuncionarios(int numeroFuncionarios){
    this.numeroFuncionarios = numeroFuncionarios;
  }
  @Override
  public Double imposto() {
    double valorImposto;
    if(numeroFuncionarios > 10){
      return valorImposto = rendaAnual * 14 / 100;
    }
    return valorImposto = rendaAnual * 16 / 100;
  }
}
