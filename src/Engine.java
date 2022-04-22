public class Engine {
    private static Engine unique_Engine = new Engine();

    private GlobalState globalState;
    private Painter painter;
    private InputGetter inputGetter;
    private Updater updater;

    public Engine() {
        this.globalState = new GlobalState();
        this.painter = new Painter();
        this.inputGetter = new InputGetter();
        this.updater = new Updater ();
    }

    public static Engine getInstance() {
        return unique_Engine;
    }

    public void init () {
        this.painter.init(this.globalState);
        this.inputGetter.init(this.globalState);
        this.updater.init(this.globalState);
    }

    public void run() {
        do {

            this.painter.paint();
            int chosen = this.inputGetter.getInput();
            this.updater.update(chosen);

        } while(!this.updater.checkTermination);
    }
}
