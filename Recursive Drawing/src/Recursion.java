import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
	
	int count = 0;
		if(width <= 1) return;
		
		else {
		g.drawOval(x, y, width, width);
			
		concentricCircles(g, width-15, x+20, y+20);
		
		}
	}
	public void concentricCircles2(Graphics g, int width, int x, int y) {
		
		if(width <= 1) return;
		
		else {
		g.drawOval(x, y, width, width);
			
		concentricCircles2(g, width-15, x-10, y+20);
		
		}
	}
	public void concentricCircles3(Graphics g, int width, int x, int y) {
		
		if(width <= 1) return;
		
		else {
		g.drawOval(x, y, width, width);
			
		concentricCircles3(g, width-20, x+26, y-10);
		
		}
	}
	public void concentricCircles4(Graphics g, int width, int x, int y) {
		
		if(width <= 1) return;
		
		else {
		g.drawOval(x, y, width, width);
			
		concentricCircles4(g, width-21, x-20, y-20);
		
		}
	}
	
	public void squares(Graphics g,int count, int x, int y, int height) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
	if(count ==0) return; 
		
	else {
	g.drawRect(x,y, height, height);
	g.fillRect(x, y, height, height);

	squares(g,count-1, x-height, y-height, height/2);
	squares(g,count-1, x+height, y-height, height/2);
	squares(g,count-1, x-height, y+height, height/2);
	squares(g,count-1, x+height, y+height, height/2);

	}
	}
	
	
	
	public void clover(Graphics g) { //What additional variables will you need to draw the shape?
	
	}
	


	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);

		//clover - concentricCircles(Graphics g, int width, int x, int y)
		g.setColor(Color.yellow);
		this.concentricCircles(g, 150, 50, 50);
		this.concentricCircles2(g, 150, 330, 50);
		this.concentricCircles3(g, 150, 50, 310);
		this.concentricCircles4(g, 150, 310, 310);
		
		//public void squares(Graphics g,int count, int x, int y, int height) {
		g.setColor(Color.pink);		
		this.squares(g,5, 220,300, 200);
		
	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(16, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete