import java.util.Scanner;

public class senha {
  
   String senha1, senha2;
  
  public void user() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite sua senha: ");
    senha1 = teclado.nextLine();
    System.out.println("Essa é mesmo a sua senha? digite novamente: ");
    senha2 = teclado.nextLine();

    do {
        if (senha1.equals(senha2)) {
          System.out.println("Cadastro realizado com sucesso!");
          break;
        } else {
          System.out.println("Senhas não conferem. Digite novamente.");
          senha1 = teclado.nextLine();
          System.out.println("Essa é´mesmo a sua senha? confira ela: ");
          senha2 = teclado.nextLine();
          teclado.close();
        }
    } while (!senha1.equals(senha2));
    
  }
}
