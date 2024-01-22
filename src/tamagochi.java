import java.util.ArrayList;
import java.util.Random;

public class tamagochi {
    private int hunger;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive = true;
    private Random generator = new Random();
    private String name;

    public tamagochi(String name) {
        this.name = name;
        this.hunger = 0;
        this.boredom = 0;
        this.words = new ArrayList<>();
        this.isAlive = true;
        this.generator = new Random();
    }

    public void feed() {
        hunger--;

    }

    public void sayHi() {
        System.out.println(generator);
        if (isAlive) {
            System.out.println("Hi, my name is " + name);
            ReduceBoredom();
            Tick();
        } else {
            System.out.println(name + " is no longer alive. You can't interact with it.");
        }

    }

    public void teach(String word) {
        words.add(word);
        ReduceBoredom();

    }

    public void Tick() {
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10) {
            boolean isAlive = false;
        } else {
            boolean isAlive = true;
        }
    }

    public void PrintStats() {
        System.out.println("Hunger: " + hunger);
        System.out.println("boredom" + boredom);
        System.out.println("is alive" + isAlive);

    }

    public boolean GetAlive() {
        return isAlive;
    }

    public void ReduceBoredom() {
        boredom--;

    }

}
