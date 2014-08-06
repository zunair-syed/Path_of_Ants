package zunair.syed.pathofants;

public class ellipse {
	//The ellipse class

	private int center_x,  center_y,  x_Radius, y_Radius;//basically 4 properties of the ellipse
	
	public ellipse(int x1, int y1, int x_Radius1, int y_Radius1 ){//have the constructor which makes the shape given the information
		center_x=x1;
		center_y=y1;
		x_Radius=x_Radius1;
		y_Radius=y_Radius1;
	}
	
	
	//And we have this method which basically checks if a given point is in the shape
	public boolean ellipseContainsPoint(int px,int py){
		if(  ( (Math.pow((px - center_x),2)    /   Math.pow(x_Radius,2) ) +  ( Math.pow((py-center_y),2)     /     Math.pow(y_Radius,2) )       )     <=1  ){//this mathematically derived formula checkes if the point is in the shape (WHICH BY THE WAY WAS VERY HARD TO DERIVE)
			return true;//if it is, we return true, otherwise false
		}else{
			return false;
		}
	}
	
	
}
