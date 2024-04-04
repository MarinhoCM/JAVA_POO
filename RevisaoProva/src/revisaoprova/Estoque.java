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
class Estoque {

    private String product;
    private String partner;
    private int amount;
    private float cost;

    public Estoque(String product, String partner) {
        this.product = product;
        this.partner = partner;
    }
    
    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void addProduct(int value){
        int amount = this.getAmount();
        if (value > 0){
            this.setAmount(amount + value);
        } else {
            System.out.println("Apenas numeros inteiros são válidos");
        }
    }

    public void showEstoque() {
        System.out.println("+=======================================+");
        System.out.println("Produto: " + this.product);
        System.out.println("Fornecedor: " + this.partner);
        System.out.println("Quantidade: " + this.amount);
        System.out.println("Valor: " + this.cost);
    }
}
