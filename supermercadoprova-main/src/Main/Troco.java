package Main;

import java.util.Scanner;



public class Troco {
    public static void trocoValor() {
        Scanner scan = new Scanner(System.in);
        double troco;
        double valorPago;
        double valorTotaldoPedido;
        
        System.out.println("Informe o total do pedido: ");
        valorTotaldoPedido = scan.nextDouble();
        
        System.out.println("Informe o valor pago: ");
        valorPago = scan.nextDouble();
        
       
                troco = valorPago - valorTotaldoPedido;
                
                if (troco >0) {
                    System.out.println("O troco a ser dado é de: "+ troco + " Reais");
                } else { 
                    System.out.println("Não tem troco.");
                }
    }
}
