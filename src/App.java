import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Engine engine = Engine.getInstance();     // singLeton Pattern
        engine.init();
        engine.run();


    }
}
