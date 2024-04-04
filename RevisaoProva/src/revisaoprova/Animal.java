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
public class Animal {

    private String race;
    private String name;
    private int age;
    private float weight;
    private boolean health_plan;
    private static int id;

    public Animal(String race, String name, boolean health_plan, int id) {
        this.race = race;
        this.name = name;
        this.health_plan = health_plan;
        this.id = id;
    }
   
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isHealth_plan() {
        return health_plan;
    }

    public void setHealth_plan(boolean health_plan) {
        this.health_plan = health_plan;
    }
    
        public void showRegister() {
        String option;

        if (this.health_plan) {
            option = "SIM";
        } else {
            option = "NÃO";
        }
        
        System.out.println("+======================================+");
        System.out.println("Raça: " + this.race);
        System.out.println("Nome: " + this.name);
        System.out.println("Peso: " + this.weight);
        System.out.println("Idade: " + this.age);
        System.out.println("Atendimento plano: " + option);
    }
}
