import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("sua altura");
      double altura = sc.nextDouble();
       System.out.println("seu peso");
        Double peso = sc.nextDouble();
          double imc = peso / (altura * altura);
           System.out.printf("seu imc é %.2f", imc);
    sc.close();

  }

}