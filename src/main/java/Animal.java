public class Animal {
    public void makeSound(){
        System.out.println("Some Generic Animal Sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
