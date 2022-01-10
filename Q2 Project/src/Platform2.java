import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Platform2 {
	
	private int x; 
	private int y; 
	private Image img;
	private AffineTransform tx;	
	private int velocity = 10; 
		
	public Platform2 (int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/plat2.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(.2, .2);
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
	
	public void paint(Graphics g) {
		// these are the 2 lines of code needed draw an image on the screen
			Graphics2D g2 = (Graphics2D) g;
		
			tx.setToTranslation(x, y);
			tx.scale(.20, .20);

		// call update to update the actually picture location
			g2.drawImage(img, tx, null);
	}
	
	public void setY(int y) {
		this.y = y;
		tx.setToTranslation(x,y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}


}

