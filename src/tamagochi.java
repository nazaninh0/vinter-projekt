import java.util.ArrayList;
import java.util.Random;

public class tamagochi {
    private int hunger ;
    private int boredom=0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive=true;
    private Random generator =new Random();
    private String name;
    public tamagochi(String name){
        this.name=name;
    }
    public void feed (){
     hunger--;
    }
    public void Hi (){
        System.out.println(generator);
        ReduceBoredom();

    }
    public void teach ( String word ){
        words.add(word);
        ReduceBoredom();

    }
    public void Tick (){
        hunger++;
        boredom++;
        if( hunger>10 || boredom > 10){
            boolean isAlive =false ;
        }
        else {
            boolean isAlive = true;
        }
    }
    public void PrintStats(){
        System.out.println("Hunger: " +hunger);
        System.out.println(boredom);
        System.out.println(isAlive);

    }
    public boolean GetAlive (){
        return isAlive;
    }
    public void ReduceBoredom(){
        boredom--;

    }
}
