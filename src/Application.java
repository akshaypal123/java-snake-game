import javax.swing.*;

public class Application {
    public static void main(String[] args) throws Exception {
        final int boardWidth = 600;
        final int boardHeight = 600; 

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
