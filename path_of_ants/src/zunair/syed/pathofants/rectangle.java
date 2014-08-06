package zunair.syed.pathofants;

//The rectangle class

public class rectangle {

	private int x,  y,  width, height; //basically 4 properties of the rectanlge
	
	public rectangle(int x1,  int y1,int  width1, int height1){//have the constructor which makes the shape given the information
		x=x1;
		y=y1;
		width=width1;
		height=height1;
	}
	
	
	//And we have this method which basically checks if a given point is in the shape
	public boolean rectContainsPoint(int px,int py){
		if((px>=x && px<=(x+width))  && py>=y  && py<=(y+height)   ){//this mathematically derived formula checkes if the point is in the shape
			
			return true;//if it is, we return true, otherwise false
		}else {
			return false;
		}
		
		
	}
	
	
}
