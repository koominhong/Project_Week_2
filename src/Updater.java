import java.util.Random;

public class Updater {
    private GlobalState globalState;
    public boolean checkTermination;

    Random random = new Random();

    public int Position = 0;
    public int NowPosition = 0;
    int numberOfCompletion = 0;


    public Updater() {

    }

    public void init(GlobalState globalState) {
        this.globalState = globalState;

    }

    private void RollTheDiceOnce() {
        this.globalState.player.RollTheDiceOnce();
        this.globalState.computer.RollTheDiceOnce();
    }

    private void RollTheDiceTwo() {
        this.globalState.player.RollTheDiceTwo();
        this.globalState.computer.RollTheDiceOnce();

    }

    private void RollTheDiceThree() {
        this.globalState.player.RollTheDiceThree();
        this.globalState.computer.RollTheDiceOnce();

    }

    private void terminateGame() {
        System.exit(0);
    }

    private void handleWrongInput() {
        System.out.println("Wrong Try again");
    }

    public void update(int chosen) {
        switch (chosen) {

            case 1:
                this.RollTheDiceOnce();
                break;

            case 2:
                this.RollTheDiceTwo();
                break;

            case 3:
                this.RollTheDiceThree();
                break;

            default:
                this.handleWrongInput();
                break;
        }
        if (true) {
            this.globalState.player.PlayerNOC();
            this.globalState.computer.ComputerNOC();
        }
    }


    public boolean checkTermination() {
        if (this.globalState.player.getNumberOfCompletion() >= 3) {
            return true;
        } else if (this.globalState.computer.getNumberOfCompletion() >= 3) {
            return true;
        }

        return false;
    }

}
