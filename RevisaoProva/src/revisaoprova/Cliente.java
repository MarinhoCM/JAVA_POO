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
class Cliente {

    private String name;
    private String CPF;
    private String phone_number;
    private String address;
    private int[] id = new int[10];

    public Cliente(String name, String CPF, String phone_number, int id) {
        this.name = name;
        this.CPF = CPF;
        this.phone_number = phone_number;
        this.id[0] = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getId() {
        return id;
    }
    
    public void showClient(){
        System.out.println("+========================================+");
        System.out.println("Name: " + this.name);
        System.out.println("cpf: "+this.CPF);
        System.out.println("Telefone: "+ this.phone_number);
        System.out.println("Address: "+this.address);
        System.out.println("Id: "+this.id[0]);
    }
}
