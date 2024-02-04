package _01_sea_creature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SeaCreatureRunner implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	SeaCreature patrick = new SeaCreature("Spongebob");
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature squidward = new SeaCreature("Spongebob");
	public static void main(String[] args) {
		
		SeaCreatureRunner sea = new SeaCreatureRunner();
		
		sea.setup();
	}
	
	
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();	
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();

void setup() {
frame.setVisible(true);
panel.setVisible(true);
frame.add(panel);
panel.add(button1);
button1.setText("Spongebob Laugh");
panel.add(button2);
button2.setText("Spongebob Eat");
panel.add(button3);
button3.setText("Spongebob Name");
panel.add(button4);
button4.setText("Squidward Laugh");
panel.add(button5);
button5.setText("Squidward Eat");
panel.add(button6);
button6.setText("Squidward Name");
panel.add(button7);
button7.setText("Patrick Laugh");
panel.add(button8);
button8.setText("Patrick Eat");
panel.add(button9);
button9.setText("Patrick Name");
frame.pack();
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(button1)) {
		spongebob.laugh();
	}else if(buttonPressed.equals(button2)) {
		spongebob.eat();
	}else if(buttonPressed.equals(button3)) {
		spongebob.getName();
	}else if(buttonPressed.equals(button4)) {
		squidward.laugh();
	}else if(buttonPressed.equals(button5)) {
		squidward.eat();
	}else if(buttonPressed.equals(button6)) {
		squidward.getName();
	}else if(buttonPressed.equals(button7)) {
		patrick.laugh();
	}else if(buttonPressed.equals(button8)) {
		patrick.eat();
	}else if(buttonPressed.equals(button9)) {
		patrick.getName();
	}
}
}