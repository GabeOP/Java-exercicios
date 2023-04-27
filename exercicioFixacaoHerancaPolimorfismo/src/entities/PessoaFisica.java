package entities;

public class PessoaFisica extends Pessoa{
  private Double gastosSaude;

  public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude){
    super(nome, rendaAnual);
    this.gastosSaude = gastosSaude;
  }

  public Double getGastosSaude(){
    return gastosSaude;
  }
  public void setGastosSaude(Double gastosSaude){
    this.gastosSaude = gastosSaude;
  }

  @Override
  public Double imposto() {
    double valorImposto = 0.0;
    if(rendaAnual < 20000.0 ){
      valorImposto = rendaAnual * 15 / 100;
    }else if(rendaAnual >= 20000.0){
      valorImposto = rendaAnual * 25 / 100;
    }
    if(gastosSaude > 0.0){
      valorImposto -= (gastosSaude * 50 / 100);
    }
    return valorImposto;
  }
}
