package controler;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

@Named(value = "guessNumberBean")
@SessionScoped
public class GuessNumberBean implements Serializable {

    private final long RANDOMNUMBER;
    private long max = 10;
    private long min = 1;
    private String response;
    private int userguess;

    public GuessNumberBean() {
        Random random = new Random();
        RANDOMNUMBER = random.nextInt(10) + 1;
    }

    public String getResponse() {
        if (userguess == RANDOMNUMBER) {
            return "You guessed right!";
        } else if (userguess < RANDOMNUMBER) {
            return "Too low";
        } else {
            return "Sorry, Too high";
        }
    }
    
    public String getImage() {
        if (userguess == RANDOMNUMBER) {
            return "resourses/img/happy.gif";
        } else if (userguess < RANDOMNUMBER) {
            return "resourses/img/sad.gif";
        } else {
            return "resourses/img/sad.gif";
        }
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

}
