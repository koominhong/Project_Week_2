import java.util.Random;

public class Player {

    private int Position;
    private int NowPosition;
    private int NumberOfCompletion;


    public Player (int Position, int NowPosition, int NumberOfCompletion) {
        this.Position = Position;
        this.NowPosition = NowPosition;
        this.NumberOfCompletion = NumberOfCompletion;
    }

    public void RollTheDiceOnce() {
        Random a = new Random();
        int dice1 = a.nextInt(6) + 1;
        System.out.println("============== Result ===============");
        System.out.println("Player Rolled Num: 1");
        System.out.println("[Dice.1] " + dice1);
        System.out.println("Average Sum = " + dice1);
        System.out.println("======================================");

        Position = + dice1;
        this.NowPosition += Position;
    }
    public void RollTheDiceTwo() {
        Random b = new Random();
        int dice2 = b.nextInt(6) + 1;
        int dice3 = b.nextInt(6) + 1;
        System.out.println("============== Result ===============");
        System.out.println("Player Rolled Num: 2");
        System.out.println("[Dice.1] " + dice2 + " [Dice.2] " + dice3);
        System.out.println("Average Sum = " + (dice2 + dice3) / 2);
        System.out.println("======================================");

        Position = + (dice2 + dice3) / 2;
        NowPosition += Position;
    }
    public void RollTheDiceThree() {
        Random c = new Random();
        int dice4 = c.nextInt(6) + 1;
        int dice5 = c.nextInt(6) + 1;
        int dice6 = c.nextInt(6) + 1;
        System.out.println("============== Result ===============");
        System.out.println("Player Rolled Num: 3");
        System.out.println("[Dice.1] " + dice4 + " [Dice.2] " + dice5 + " [Dice.3] " + dice6);
        System.out.println("Average Sum = " + (dice4 + dice5 + dice6) / 3);
        System.out.println("======================================");

        Position = + (dice4 + dice5 + dice6) / 3;
        NowPosition += Position;

    }
    public void PlayerNOC() {
        if (NowPosition >= 20) {
            NowPosition = NowPosition % 20;
            NumberOfCompletion = NumberOfCompletion+1;
        }
        if (NumberOfCompletion >=3) {
            System.out.println("Player's Completed Round: " +3);
            System.out.println("Player Win! Congratulations!");
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
        return this.NowPosition;
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
        String str = "[Player]\n";
        str += ("Current Position: " + this.NowPosition + "\n");
        str += ("Completed  Round: " + this.NumberOfCompletion + "\n");
        return str;
    }


}