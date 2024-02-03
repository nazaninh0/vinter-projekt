import java.util.ArrayList;
import java.util.Random;

// en class skapas för att hantera hunger och bordom
public class tamagochi {
    private int hunger;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive = true;
    private Random generator = new Random();
    private String name;
// Class för
    public tamagochi(String name) {
        this.name = name;
        this.hunger = 0;
        this.boredom = 0;
        this.words = new ArrayList<>();
        this.isAlive = true;
        this.generator = new Random();
    }
//metod att mata tamagochin och minska hunger
    public void feed() {
        hunger--;
        System.out.println(name + "hunger decreases");

    }
// en metod för att säga hej , minksa bordom och uppdatera statusen
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
// metod att lära nya ord
    public void teach(String word) {
        words.add(word);
        ReduceBoredom();
        System.out.println(name + "learned a new word" + word);

    }

    public void Tick() {
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10) {
            boolean isAlive = false;
            System.out.println(name + "is no longer alive");
        } else {
            boolean isAlive = true;
            System.out.println(name +"is alive");
        }
    }
// skriva ut statusen
    public void PrintStats() {
        System.out.println("Hunger: " + hunger);
        System.out.println("boredom" + boredom);
        System.out.println("is alive" + isAlive);

    }
// kollar om tgamagochi är fortfarande levande
    public boolean GetAlive() {
        return isAlive;
    }
// metod för minska boredom
    public void ReduceBoredom() {
        boredom--;
        System.out.println(name + "'s boredom decreased.");

    }

}
