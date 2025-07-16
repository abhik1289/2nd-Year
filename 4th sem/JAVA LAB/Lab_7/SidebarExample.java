import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SidebarExample {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Sidebar Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Sidebar panel
        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.LIGHT_GRAY);
        sidebar.setBounds(0, 0, 150, 400);
        sidebar.setLayout(null);

        // Header label
        JLabel header = new JLabel("Menu", SwingConstants.CENTER);
        header.setBounds(0, 10, 150, 30);
        sidebar.add(header);

        // Home button
        JButton homeButton = new JButton("Home");
        homeButton.setBounds(20, 50, 100, 30);
        sidebar.add(homeButton);

        // About Us button
        JButton aboutButton = new JButton("About Us");
        aboutButton.setBounds(20, 90, 100, 30);
        sidebar.add(aboutButton);

        // Main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBounds(160, 20, 300, 300);
        JLabel contentLabel = new JLabel("Welcome!");
        contentPanel.add(contentLabel);

        // Action listeners for buttons
        homeButton.addActionListener(e -> contentLabel.setText("You clicked Home!"));
        aboutButton.addActionListener(e -> contentLabel.setText("You clicked About Us!"));

        // Add components to frame
        frame.add(sidebar);
        frame.add(contentPanel);

        // Show frame
        frame.setVisible(true);
    }
}
