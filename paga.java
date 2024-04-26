import java.util.Scanner;

public class paga {

   double totaltota, carteira;
   String paga;
  
  public void calot() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("O total a dos produtos é R$" +totaltota+ " Ao adicionar o frete de R$20,00" + " O valor total a pagar é R$" + (totaltota+20));
    
    System.out.println("Selecione a forma de pagamento");
    paga = teclado.nextLine();
    
    System.out.println("Valor de sua carteira");
    carteira = teclado.nextDouble();

    if (carteira > totaltota+20 ){
       System.out.println("Sem dinheiro suficiente:/ ");
    }else{
       System.out.println("Pagamento realizado com sucesso:) ");
    }

  }
}