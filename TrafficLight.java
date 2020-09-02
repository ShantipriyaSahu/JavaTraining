package Assignment;

public enum TrafficLight{
	RED(1),
	GREEN(2),
	YELLOW(5);

	private final int time;

	TrafficLight( int time ) { 
		this.time = time;
	}
	public int getTime(){
		return time;
	}
}