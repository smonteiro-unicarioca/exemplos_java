
import java.util.Scanner;
public class Main {
  private int n;
  private double vetor[];
  public static void main(String args[]){
    Main objmain = new Main();    
    objmain.tamanhoVetor();
    objmain.valoresVetor();
    objmain.imprimirMaior();
  }
  
  public void tamanhoVetor() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Digite o tamanho do vetor: ");
	  this.n = scanner.nextInt();
  }

  public void valoresVetor() {
    Scanner scanner = new Scanner(System.in);
    this.vetor = new double[this.n];	    
    for(int i=0; i< this.n; i++){
      System.out.println("Digite o elemento ["+(i+1)+"]: ");
      this.vetor[i] = scanner.nextDouble();
      }    
  }
  public void imprimirMaior() {
	  double maior=this.vetor[0];
	  for(int i=1; i< this.n; i++){
		  if(maior<this.vetor[i])
			  maior=this.vetor[i];
		  }
	  System.out.println("O maior elemento do vetor eh: ["+(maior)+"] ");
	  }  
}
