/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package factorymethod;

/**
 *
 * @author 2024122760121
 */
public class FactoryMethod {
    public static void main(String[] args) {
        PagamentoFactory factory = new CartaoFactory();
        Pagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento();

        PagamentoFactory factory2 = new PixFactory();
        Pagamento pagamento2 = factory2.criarPagamento();
        pagamento2.processarPagamento();
    }
}
