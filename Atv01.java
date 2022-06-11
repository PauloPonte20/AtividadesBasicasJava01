import java.util.Scanner;
  public class Main{
    public static void main(String[] args) {
      int numero;
      int count3 = 3;
      int count5 = 5;
      int countpar = 2;
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite um numero");
      numero = scan.nextInt();

      while(count3<numero){
        count3 =count3 +3;
      }
        if(numero == count3) {
          System.out.println("O Numero " + numero + " é multiplo de 3");
        } else if(numero<count3) {
          System.out.println("O Numero " + numero + " não é multiplo de 3");
        }

      while(count5<numero){
        count5 =count5 +5;
      }
        if(numero == count5) {
          System.out.println("O Numero " + numero + " é multiplo de 5");
        } else if(numero<count5) {
          System.out.println("O Numero " + numero + " não é multiplo de 5");
        }

      while(countpar<numero){
        countpar =countpar +2;
      }
        if(numero == countpar) {
          System.out.println("O Numero " + numero + " é par");
        } else if(numero<countpar) {
          System.out.println("O Numero " + numero + " é impar");
        }

      }
  }
