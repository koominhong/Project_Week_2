import java.util.Random;

public class Computer {

    private int Position;
    private int NowPosition;
    private int NumberOfCompletion;


    public Computer(int Position, int NowPosition, int NumberOfCompletion) {
        this.Position = Position;
        this.NumberOfCompletion = NumberOfCompletion;
    }

    public void RollTheDiceOnce() {
        Random random = new Random();
        int com = random.nextInt(3) + 1;
        int num1 = random.nextInt(6) + 1;
        int num2 = random.nextInt(6) + 1;
        int num3 = random.nextInt(6) + 1;
        System.out.println("Computer Rolled Num: " + com);
        switch (com) {
            case 1:
                System.out.println("[Dice.1] " + num1);
                System.out.println("Average Num: " + num1/1);
                System.out.println("======================================");

                Position = + num1 / 1;
                NowPosition += Position;
                break;

            case 2:
            System.out.println("[Dice.1] " + num1 + " [Dice.2] " + num2);
            System.out.println("Average Num " + (num1 + num2)/2);
            System.out.println("======================================");

                Position = + (num1 + num2) / 2;
                NowPosition += Position;
            break;

            case 3:
                System.out.println("[Dice.1] " + num1 + " [Dice.2] " + num2 + " [Dice.3] " + num3);
                System.out.println("Average Num: " + (num1 + num2 + num3) /3);
                System.out.println("======================================");

                Position = + (num1 + num2 + num3) / 3;
                NowPosition += Position;
                break;

        }
    }
    public void ComputerNOC() {
        if (NowPosition >= 20) {
            NowPosition = NowPosition % 20;
            NumberOfCompletion = NumberOfCompletion + 1;
        }
        if (NumberOfCompletion >=3) {
            System.out.println("Computer's Completed Round: " +3);
            System.out.println("Computer Win! Congratulations!");
            System.exit(0);
        }
    }

    public int getPosition() {
        return this.Position;
    }

    public void setPosition() {
        this.Position = Position;
    }

    public int getNowPosition() {
        return this.Position;
    }

    public void setNowPosition() {
        this.NowPosition = NowPosition;
    }

    public int getNumberOfCompletion() {
        return this.NumberOfCompletion;
    }

    public void setNumberOfCompletion() {
        this.NumberOfCompletion = NumberOfCompletion;
    }

    public String toString() {
        String str = "[Computer]\n";
        str += ("Current Position: " + this.NowPosition + "\n");
        str += ("Completed  Round: " + this.NumberOfCompletion );

        return str;
    }
}