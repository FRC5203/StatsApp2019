package desktop;

public class StatMaker {

    public static void main(String[] args){
        Window win = new Window("Stat App");
        win.frame.add(new Form(win.content));
    }

}
