/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author 2024122760121
 */
public class PagPix extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix");
    }
    
}
