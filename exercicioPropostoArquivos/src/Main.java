import entities.Produto;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Produto produto;

    System.out.print("Digite o caminho do arquivo: ");
    String path = sc.nextLine();

    File file = new File(path + "\\in.txt");
    boolean success = new File(path + "\\out").mkdir();

    try(BufferedReader br = new BufferedReader(new FileReader(file))){
      String lines = br.readLine();

      while(lines != null){
        String[] fields = lines.split(",");
        String nome = fields[0];
        Double preco = Double.valueOf(fields[1]);
        int qntd = Integer.parseInt(fields[2]);

        produto = new Produto(nome, preco, qntd);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv", true))){
          bw.write(produto.getNome() + "," + produto.valorTotal());
          bw.newLine();
        }
        lines = br.readLine();
      }


    }catch(IOException e){
      System.out.println(e.getMessage());
    }


    sc.close();
  }
}