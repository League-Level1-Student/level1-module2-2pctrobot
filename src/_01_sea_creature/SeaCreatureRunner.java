package _01_sea_creature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SeaCreatureRunner implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	public static void main(String[] args) {
		SeaCreature patrick = new SeaCreature("Spongebob");
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature squidward = new SeaCreature("Spongebob");
		
	}
	

JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();	
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
void setup() {
frame.setVisible(true);
panel.setVisible(true);
frame.add(panel);
panel.add(button);
button.setText("Info");
panel.add(button2);
button2.setText("Overtake");
panel.add(button3);
button3.setText("Pitstop");
panel.add(button4);
button4.setText("Info");
panel.add(button5);
button5.setText("Overtake");
panel.add(button6);
button6.setText("Pitstop");
frame.pack();
button.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(button)) {
		
	}else if(buttonPressed.equals(button2)) {
		
	}else if(buttonPressed.equals(button3)) {
		
	}else if(buttonPressed.equals(button4)) {
		
	}else if(buttonPressed.equals(button5)) {
		
	}else if(buttonPressed.equals(button6)) {
		
	}
}
}