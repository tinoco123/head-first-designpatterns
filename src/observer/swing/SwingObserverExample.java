package observer.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on, do it!");
        }
    }
}
