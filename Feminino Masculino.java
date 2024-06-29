import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    char letra;
    System.out.print("Digite F para feminino ou M para masculino:");
    letra= input.next().charAt(0);
    
    if (letra=='M' || letra=='m'){
      System.out.println("Masculino");
    }
    else if (letra=='F' || letra=='f'){
      System.out.println("Feminino");
    }
  }
}
