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
        JPanel mainPanel  = new JPanel(new BorderLayout(2,1));
        JPanel menuPanel  = new JPanel();
        GraphPanel graphPanel = new GraphPanel();

        JButton buildButton = new JButton("Build Graph");
        buildButton.addActionListener(e -> graphPanel.setScores(createRandomScores()));

        menuPanel.add(buildButton);

        mainPanel.add(graphPanel, BorderLayout.CENTER);
        mainPanel.add(menuPanel,  BorderLayout.SOUTH);
        frame.add(mainPanel);
    }

    private List<Double> createRandomScores() {
        List<Double> scores = new ArrayList<>();
        Random random = new Random();
        int maxDataPoints = 40;
        int maxScore = 10;
        for (int i = 0; i < maxDataPoints; i++) {
            scores.add(random.nextDouble() * maxScore);
        }

        return  scores;
    }
}
