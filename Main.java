public class Main {
    public static void main(String[] args) {
        Animal spider = new Spider();
        spider.walk();
        spider.eat();

        Pet cat = new Cat("Blacky");
        cat.play();
        cat.setName("Blacky");
        System.out.println("Cat's name is: " + cat.getName());
        cat.eat();

        Animal fish = new Fish();
        ((Pet) fish).setName("Nemo"); 
        ((Pet) fish).play(); 
        fish.walk(); 
        fish.eat();
    }
}