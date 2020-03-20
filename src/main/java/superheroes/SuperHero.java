package superheroes;

public class SuperHero {
    // Properties /Instance Variable/ fields
    public String name;
    public String superPower;

    //constructor
    public SuperHero(String name, String superPower){
        this.name = name;
        this.superPower = superPower;
    }
    public void printSuperHero(){
        System.out.println(name + "'s special power is " + superPower);
    }
}
