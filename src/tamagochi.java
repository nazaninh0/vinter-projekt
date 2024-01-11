import java.util.ArrayList;
import java.util.Random;

public class tamagochi {
    private int boredom=0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive=true;
    private Random generator =new Random();
    private String name;
    public Tamagochi(String name){
        this.name=name;
    }
}
