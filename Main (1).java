import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    senha senha = new senha();
    prodt prodt = new prodt();
    paga paga = new paga();
    
    int cpf;
    String id, cadastro, prod;
    double total, salario;

    System.out.println("Digite o seu id: ");
    id = teclado.nextLine();
    System.out.println("Digite o seu cpf: ");
    cpf = teclado.nextInt();
    
    senha.user();
    
    System.out.println("Bem vindo a loja!!");
    System.out.println("Gostaria de escolher algum produto disponivel?");

  
    prodt.p1();
    prodt.p2();

    paga.calot();
 
  }
}