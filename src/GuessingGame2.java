import java.util.Random;
import dummiesFrame.DummiesFrame;

public class GuessingGame2 {

    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Guessing Game");
        frame.addRow("Enter an int from 1 to 10");
        frame.setButtonText("Submit your guess");
        frame.go();
    }

    public static String calculate(int inputNumber){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;

        if (inputNumber == randomNumber) {
            return "You win.";
        } else {
            return "You Lose. The random number was " + randomNumber + ".";
        }
    }
}
