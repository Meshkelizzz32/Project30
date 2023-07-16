package project18;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class Mixer extends JFrame{
	class ColorSlider extends JPanel{
	JSlider slider;
	JTextField value;
	public ColorSlider(String info) {
		super(new FlowLayout());
		slider=new JSlider(0,200,0);
		value=new JTextField(3);
		add(new JLabel(info));
		add(slider);
	value.setText(""+slider.getValue());
	add(value);
	slider.addChangeListener(new ChangeListener() {
       public void stateChanged(ChangeEvent e) {
			value.setText(""+slider.getValue());
			changeColor();
		}
	});
	}
}
	ColorSlider
red = new ColorSlider("red"),
green = new ColorSlider("green"),
blue = new ColorSlider("blue");
JPanel color = new JPanel();
void changeColor() {
color.setBackground(new Color(
red.slider.getValue(),
green.slider.getValue(),
blue.slider.getValue()));
} 
public Mixer() {
	setLayout(new GridLayout(2,1));
	JPanel jp=new JPanel(new FlowLayout());
	jp.add(red);
	 jp.add(green);
	 jp.add(blue);
	 add(jp);
	 add(color);
	 changeColor();
}
}
public class MixerColors {
	public static void main(String[] args) {
run(new Mixer(),400,300);
}
public static void
run(final Mixer mixer1, final int width, final int height) {
	   SwingUtilities.invokeLater(new Runnable() {
	     public void run() {
	    	 mixer1.setTitle(mixer1.getClass().getSimpleName());
	    	 mixer1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	 mixer1.setSize(width, height);
	    	 mixer1.setVisible(true);
	     }
	   });
	 }
	} 