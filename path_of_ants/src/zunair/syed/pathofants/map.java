package zunair.syed.pathofants;



public class map { //the map class

	//we have all the properties of the map class (very descriptive of the names)
	private int ypos;
	private int height;
	private int randAssignedInt;
private String name;
	private int counterRoadRect=0;
	private int counterRestrictedRect=0;
	private int counterRoadEllipse=0;
	private int counterRestrictedEllipse=0;

	//we have 10 (maximum) shapes that we can have (total 40)
	private rectangle roadRect[] = new rectangle[10];
	private rectangle restrictedRect[] = new rectangle[10];

	private ellipse roadEllipse	[] = new ellipse[10];
	private ellipse restrictedEllipse [] = new ellipse[10];


	public map(int ypos1, int height1, String name1){//constructor which defines the height and yposition of the map
		ypos=ypos1;
		height=height1;
		name=name1;

	}
	public String getName(){
		return name;
	}

	public void setrandAssignedInt(int randAssignedInt1){//sets the ypostion of the map to a  new y position
		randAssignedInt=randAssignedInt1;

	}
	
	public int getrandAssignedInt(){//sets the ypostion of the map to a  new y position
		return randAssignedInt;

	}
	
	
	public void setYPositionOfMap(int newYPos){//sets the ypostion of the map to a  new y position
		ypos=newYPos;

	}

	public int getYPositionOfMap(){//gets the current y postion of the map
		return ypos;		
	}

	public int getHeight(){//get the height of the map
		return height;		
	}



	//below are 4 methods which add different shapes into the map. Each time the shape increases we have to increae the counter and make the shape equal to what is passed in
	public void addRestrictedRect(rectangle passedRestrictedRect){
		restrictedRect[counterRestrictedRect]=passedRestrictedRect;
		counterRestrictedRect++;
	}

	public void addRoadRect(rectangle passedRoadRect){
		roadRect[counterRoadRect]=passedRoadRect;
		counterRoadRect++;
	}

	public void addRoadEllipse(ellipse passedRoadellipse){
		roadEllipse[counterRoadEllipse]=passedRoadellipse;
		counterRoadEllipse++;
	}

	public void addRestrictedEllipse(ellipse passedRestrictedEllipse){
		restrictedEllipse[counterRestrictedEllipse]=passedRestrictedEllipse;
		counterRestrictedEllipse++;
	}



	//This method basically checks if a given point is touching the road or not
	public boolean checkOnRoad(int x, int y){
		//basically we go through all the restricted shapes, if we see that our shape is in the current restricted shape, we return false, because IT's not on the road
		for(int i=0; i <counterRestrictedRect; i++){
			if(restrictedRect[i].rectContainsPoint(x, y)){
				return false;				
			}
		}


		for(int i=0; i <counterRestrictedEllipse; i++){
			if(restrictedEllipse[i].ellipseContainsPoint(x, y)){
				return false;				
			}
		}


		//otherwise, if there has been no return yet, we go ahead and see if the point is on a road, and if it is we basically return true for that
		for(int i=0; i <counterRoadRect; i++){
			if(roadRect[i].rectContainsPoint(x, y)){
				return true;				
			}
		}


		for(int i=0; i <counterRoadEllipse; i++){
			if(roadEllipse[i].ellipseContainsPoint(x, y)){
				return true;				
			}
		}
		
		
		
		//otherwise if we hit nothing above, this means that it is not on anyshapes, and thus on emptey map, therefore Not on road and we return false
		return false;

	}





	public void clearAllRoadsAndRestrictions (){//this method does what it name suggests....clears all [if any] shapes by making the counter to 0 and going thru each shape and making them null

		counterRoadRect=0;
		counterRestrictedRect=0;

		counterRoadEllipse=0;
		counterRestrictedEllipse=0;

		for (int i=0; i<10; i++){
			roadRect[i]=null;
			restrictedRect[i]=null;
			roadEllipse[i]=null;
			restrictedEllipse[i]=null;
		}

	}


}


