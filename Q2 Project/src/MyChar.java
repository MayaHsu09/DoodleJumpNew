import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class MyChar {

	//declaring variables 
	private int velocity;
	private int x;
	private int y;
	private Image img;
	private AffineTransform tx;
	private int count;
	int acceleration = 0;
	private int velX = 0;
	
	//constructor, instantiating velocity 
	public MyChar() {
		velocity = 0; 
	}

	
	public MyChar(int x, int y) {
		this.x = x;
		this.setY(y);
		img = getImage("/imgs/slime.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}

	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.25, .25);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Background.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

	//if character goes off screen from left, appear on the right side
	public void Left() {
		x += velX;
		init(x,getY());
		if (x <= 0) {
			x = 400;
		}
	}
	
	//if character goes off screen from right, appear on the left side
	public void Right() {
		x += velX;
		init(x,getY());
		if (x > 400) {
			x = 0;
		}
	}
	
	//tell program what velocity and acceleration do
	public void update() {
		velocity += acceleration;
		setY(getY() + velocity); 
		
		tx.setToTranslation(x, getY());
		tx.scale(.25,.25);
	}

	public void paint(Graphics g) {
		// these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;

		// call update to update the actually picture location
		update();
		g2.drawImage(img, tx, null);

	}
	
	//gravity goes down
	public void Gravity() {
		acceleration = 1;
	}
	
	public void GravityOff() {
		acceleration = 0;
	}
	
	//remaining code are getters and setters, used in Frame to compare x/y values or set new ones 
	public int getX() {
		return x; 
	}

	public void setX (int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setAcc (int a) {
		this.acceleration = a;
	}
	
	public void setVelX (int velX) {
		this.velX = velX;
	}
	
	public void setVelocity(int v) {
		this.velocity = v;
		return;
	}

}



