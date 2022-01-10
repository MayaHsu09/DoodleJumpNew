import java.awt.Image;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Platform {
	
	private int x; 
	private int y; 
	private Image img;
	private AffineTransform tx;
	private int velocity = 2; 
		
	//constructor 
	public Platform (int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/plat.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.025, .025);
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

//code for moving a platform back and forth across the screen by switching velocity's sign when 
	//it reaches the end of the screen
	public void move() {
		x += velocity;
		if (x>=350) {
			velocity = -2;
		}
	
		if (x<=0) {
			velocity = velocity * -1;
	}
}

	public void paint(Graphics g) {
		// these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;

		tx.setToTranslation(x, y);
		tx.scale(.025, .025);

		// call update to update the actually picture location
		g2.drawImage(img, tx, null);
	}

	//getters and setters to call in frame, for example utilized in collisions by getting the x & y coordinates
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
		tx.setToTranslation(x,y);
	
	}
}


