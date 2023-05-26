import entities.Usuario;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Usuario> set = new HashSet<>();

    System.out.print("How many students for course A? ");
    int courseA = sc.nextInt();
    for(int i = 0; i<courseA; i++){
      Integer id = sc.nextInt();

      Usuario usuario = new Usuario(id);
      set.add(usuario);
    }

    System.out.print("How many students for course B? ");
    int courseB = sc.nextInt();
    for(int i = 0; i<courseB; i++){
      Integer id = sc.nextInt();

      Usuario usuario = new Usuario(id);
      set.add(usuario);
    }

    System.out.print("How many students for course C? ");
    int courseC = sc.nextInt();
    for(int i = 0; i<courseC; i++){
      Integer id = sc.nextInt();

      Usuario usuario = new Usuario(id);
      set.add(usuario);
    }

    System.out.print("Total students: " + set.size());

    sc.close();
  }
}