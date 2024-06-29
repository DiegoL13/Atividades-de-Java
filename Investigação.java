import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Responda ás questões utilizando 1 para sim ou 2 para não.");
    int telefonou;
    int presenciou;
    int mora;
    int devia;
    int trabalhou;
    int contador=0;
    Scanner input= new Scanner(System.in);
    System.out.print("Você telefonou para a vítima? ");
    telefonou=input.nextInt();
    if (telefonou==1){
      contador=contador+1;
    }
    System.out.print("Esteve no local do crime? ");
    presenciou=input.nextInt();
    if (presenciou==1){
      contador=contador+1;
    }
    System.out.print("Mora perto da vítima? ");
    mora=input.nextInt();
    if (mora==1){
      contador=contador+1;
    }
    System.out.print("Devia para a vítima? ");
    devia=input.nextInt();
    if (devia==1){
      contador=contador+1;
    }
    System.out.print("Já trabalhou com a vítima? ");
    trabalhou=input.nextInt();
    if (trabalhou==1){
      contador=contador+1;
    }
    if (contador==2){
      System.out.println("Suspeito");
    }
    else if (contador==3 || contador==4){
      System.out.println("Cumplice");
    }
    else if (contador==5){
      System.out.println("Assassino");
    }
    else if (contador<2){
      System.out.println("Inocente");
    }
  }
}
