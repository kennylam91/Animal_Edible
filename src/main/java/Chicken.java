public class Chicken extends Animal implements Edible {
    Chicken(){

    }

    @Override
    public String makeSound() {
        return "Chicken: OoooooOOO!";
    }

    @Override
    public String howtoEat() {
        return "could be fried!";
    }
}
