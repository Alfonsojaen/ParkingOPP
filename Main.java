import Controller.MainController;
import View.UI;

public class Main {
    public static void main(String[] args) {
        String name= UI.readString("Inserte nombre del parking");
        int spots = UI.readInt("Inserte número de plazas");
        MainController.startApp(name,spots);
    }
}
