import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Pessoa> lista = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int taxPayers = sc.nextInt();

    for(int i = 0; i < taxPayers; i++){
      System.out.printf("Tax payer #%d data: %n", i+1);
      System.out.print("Individual or company (i/c)? ");
      char tipoPessoa = sc.next().charAt(0);
      System.out.print("Name: ");
      String name = sc.next();
      System.out.print("Anual income: ");
      Double anualIncome = sc.nextDouble();

      if(tipoPessoa == 'i'){
        System.out.print("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();

        Pessoa pessoaFisica = new PessoaFisica(name, anualIncome, healthExpenditures);
        lista.add(pessoaFisica);
      }else if(tipoPessoa == 'c'){
        System.out.print("Number of employees: ");
        int numberEmployees = sc.nextInt();

        Pessoa pessoaJuridica = new PessoaJuridica(name, anualIncome, numberEmployees);
        lista.add(pessoaJuridica);
      }
      System.out.println();
    }

    System.out.println("TAXES PAID: ");
    double soma = 0;
    for(Pessoa obj : lista){

      System.out.printf("%s: $ %.2f %n", obj.getNome(), obj.imposto());
      soma += obj.imposto();
    }
    System.out.println();
    System.out.printf("TOTAL TAXES: $ %.2f", soma);

    sc.close();
  }
}