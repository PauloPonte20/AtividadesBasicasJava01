import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double somaDez = 0;
    double produto1 = 1;
    double produto30 = 1;
    double divisao21 = 1;
    double vetor[];
    vetor = new double[40];
    Scanner scan = new Scanner(System.in); 
    System.out.println("Digite 40 números inteiros: ");
    for(int i=0; i<40; i++){
      vetor[i]=scan.nextDouble(); 
       if(i<5){
       produto1= produto1 * vetor[i];
       }
      } 
    somaDez = somaDez + (vetor[9] + vetor[19]); 
    divisao21 = divisao21 * (vetor[20]/vetor[14]);
    produto30 = produto30 * vetor[29] * vetor[39];
    System.out.println("A soma entre o décimo número e o vigésimo: "+somaDez+" . O produto dos cincos primeiros numeros: "+produto1+" . A divisão entre o vigésimo primeiro com o décimo quinto: "+divisao21+" , e o produto do trigésimo com o quadragésimo: "+produto30);
  }
}
