/*
  Ter três produtos catalogados => Nome
  Pedir o nome do produto => Novo ou de um ja existente
  Verificar se o produto está catalogado
  Se sim, podemos escolher alterar o preço ou não
    Alterar o preço, exibir a classificação (Abaixo)
    Se não alterar, encerrar o programa
  Se não, pedir o preço do produto
    Exibir a classificação
    Classificações:
    Preço < 50 = Barato
    50 a 100 = moderado
    > 100 = caro
  Exibir no fim o nome do produto e preço
 */

package secao7_classificacaoProduto;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String produto1 = "Teclado";
      String produto2 = "Mouse";
      String produto3 = "Monitor";
      double preco = 0;
      
      System.out.println("Digite o nome do produto: ");
      String nomeProduto = scanner.nextLine();

      if(produto1.equalsIgnoreCase(nomeProduto) || 
      produto2.equalsIgnoreCase(nomeProduto) || 
      produto3.equalsIgnoreCase(nomeProduto)) {

        System.out.println("Produto já existe. Quer atualizar o preço? (Sim/Não)");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("sim")) {
          System.out.println("Insira o novo preço: ");
          preco = scanner.nextDouble();

        } else {

          System.out.println("Preço não atualizado!");
          scanner.close();
          return;
        }

      } else {

        System.out.println("Insira o preço do produto: ");
        preco = scanner.nextDouble();

      }

      if(preco < 50) {
        System.out.println("Classificação: barato");
      } else if(preco >= 50 && preco <= 100) {
        System.out.println("Classificação: moderado");
      } else {
        System.out.println("Classificação: caro");
      }
        
      System.out.println("Produto: " + nomeProduto + ". Preço: " + preco);

      scanner.close();
    }

}