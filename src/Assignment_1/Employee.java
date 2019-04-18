package Assignment_1;

import javax.swing.SingleSelectionModel;

public class Employee {
	    private int x, y;
	    private int width, height;
	        
	    public Employee() {
	        this(0, 0, 1, 1);
	    }
	    public Employee(int width, int height) {
	        this(0, 0, width, height);
	    }
	    public Employee(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.setWidth(width);
	        this.height = height;
	    }
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public int getWidth() {
			return width;
		}
}