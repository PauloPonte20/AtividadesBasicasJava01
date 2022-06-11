import java.util.Scanner;
  public class Main{
    public static void main(String[] args) {
      int numero;
      Scanner scan = new Scanner(System.in);
      do{
        int count3 = 3;
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
        } while(numero != 0);
      }
  }
