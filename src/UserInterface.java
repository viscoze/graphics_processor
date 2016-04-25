import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserInterface {

    private JFrame frame;

    public UserInterface() {
        this.frame = new JFrame();

        initializeUISettings();
        initializeUI();
    }

    private void initializeUISettings() {
        frame.setTitle("Graph by Vlad");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1000, 600));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initializeUI() {
        JPanel mainPanel  = new JPanel();
        JPanel menuPanel  = new JPanel();
        JPanel graphPanel = new GraphPanel(createRandomScores());

        frame.add(graphPanel);
    }

    private List<Double> createRandomScores() {
        List<Double> scores = new ArrayList<>();
        Random random = new Random();
        int maxDataPoints = 40;
        int maxScore = 10;
        for (int i = 0; i < maxDataPoints; i++) {
            scores.add((double) random.nextDouble() * maxScore);
        }

        return  scores;
    }
}
