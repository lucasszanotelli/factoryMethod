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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagamentoFactory factory = new CartaoFactory();
        Pagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento();
    }
    
}
