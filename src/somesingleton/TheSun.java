package somesingleton;

public final class TheSun {
	private int angleInSky;
	private static TheSun theSun;
	
	//making the constructor private
	//means that no other class can instantiate a new sun
	//(draw-back: also means that the sun can't be sub-classed)
	private TheSun() {
	}
	
	public static TheSun GetTheSun() {
		if(theSun == null) {
			theSun = new TheSun();
		}
		return theSun;
	}
	
	public void update(int timeOfDayInMinutes) {
		angleInSky = timeOfDayInMinutes * (180/720); // or whatever
	}
	
	public boolean isShining() {
		return angleInSky < 180;
	}

}
