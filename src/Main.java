import javax.swing.*;

public class Main {

    Main() {
        new UserInterface();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
