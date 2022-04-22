public class GlobalState {
    public Player player;
    public Computer computer;

    public GlobalState () {
        this.player = new Player(
                Constant.PlAYER_POSITION,
                Constant.PLAYER_NOW_POSITION,
                Constant.PLAYER_NUMBER_OF_COMPLETION);

        this.computer = new Computer(
                Constant.COMPUTER_POSITION,
                Constant.COMPUTER_NOW_POSITION,
                Constant.COMPUTER_NUMBER_OF_COMPLETION);

    }
}
