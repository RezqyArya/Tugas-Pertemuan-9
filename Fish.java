public class Fish extends Animal implements Pet {
    
    private String name;

    public Fish() {
        super(0);
        this.name = ""; 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " the fish is swimming.");
    }

    @Override
    public void walk() {
        System.out.println("Fish don't walk, they swim.");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats aquatic plants.");
    }
}
