public class Toy {
    String name;
    Toy(String name){
        this.name = name;
    }
    void play(){
        System.out.printf("I am a %s and I am a happy toy!!!\n", this.name);
    }
    public String toString(){
        return this.name;
    }
}
