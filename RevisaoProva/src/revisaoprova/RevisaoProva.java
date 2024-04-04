/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoprova;

/**
 *
 * @author ALUNO
 */
public class RevisaoProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal("testew", "teste",true, 1);
        a1.showRegister();
        
        int id = 0;
        Cliente c1 = new Cliente("Cauã", "0000000000", "000000000", id++);
        c1.showClient();
        
        Estoque e1 = new Estoque("Garrafa", "Guaraná");
        e1.addProduct(12);
        e1.showEstoque();
    }
}
