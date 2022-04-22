public class Painter {
    private GlobalState globalState;
    private GlobalState NowPosition;


    public Painter() {

    }

    public void init(GlobalState globalState) {
        this.globalState = globalState;

    }

    private  void paintStatus() {
        System.out.println();
        System.out.println();
        System.out.println("=============== Status ===============");
        System.out.println(this.globalState.player.toString());
        System.out.println(this.globalState.computer.toString());
        System.out.println("======================================");

    }

    private void paintMenu() {
        System.out.println("Enter the number of dice to roll: ");

    }

    public void paint() {
        this.paintStatus();
        this.paintMenu();

    }
}
