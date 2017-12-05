import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> predict;

    public EightBall() {
        this.predict = new ArrayList<>();
    }

    public void addResult(String answer) {
        this.predict.add(answer);
    }

    public int getCount(){
        return this.predict.size();
    }

    public String shake() {
        Collections.shuffle(predict);
        return predict.get(0);
    }

}
