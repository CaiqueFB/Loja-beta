import java.util.Scanner;

public class prodt {

  int quantprod = 20, quantprod2 = 50;
  Double preco = 829.99, preco2 = 129.99, total, total2, totaltota;
  String yesno, yesno2;

  public void p1() {
   Scanner teclado = new Scanner(System.in);
    
    System.out.println("Monitor gamer");
    String novaLinha = System.getProperty("line.separator");
    System.out.println("LG ULTRAGEAR, 24 POL IPS, FHD, 1MS, 144HZ, FREESYNC PREMIUM, DP/HDMI");   
    System.out.println("Preço R$829.99");
    System.out.println("Deseja adicionar o produto ao carrinho?(sim/nao)");
    yesno = teclado.nextLine();

   if (yesno.equals("sim")){
       System.out.println("Qual seria a quantidade desejada?");
       quantprod = teclado.nextInt();
      if(quantprod > 2){
         System.out.println("Temos somente 20 unidades disponiveis"); 
      }
      total = preco*quantprod;
      teclado.close();
      
    } else if (yesno.equals("nao")){
      System.out.println("Visuazlizar mais produtos");
    } 
  } 
  
  public void p2() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Cooler para processador");
    System.out.println("COOLER PARA PROCESSADOR DEEPCOOL GAMMAXX AG400, 120MM,");   
    System.out.println("Preço R$129,99");
    System.out.println("Deseja adicionar o produto ao carrinho?(sim/nao)");
    yesno2 = teclado.nextLine();

    if (yesno2.equals("sim")){
       System.out.println("Qual seria a quantidade desejada?");
       quantprod = teclado.nextInt();
      if(quantprod > 50){
         System.out.println("Temos somente 50 unidades disponiveis"); 
      }else if (yesno2.equals("nao")){
      System.out.println("Visuazlizar mais produtos");
    }

    total2 = preco2*quantprod;
    teclado.close();
    totaltota = total + total2;
    System.out.println("O valor total do seu carrinho é R$" + totaltota);
    
    }
  }
}