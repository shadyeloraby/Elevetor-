import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Elevatorsys {
	
	
	 private String UpDown; //direction lamps
		
	    private int floor;
	    
	    private int car;
	    
	    
	    private SimpleDateFormat time;
		
		

		public void elevatorsys(String upDown, int floor, int car, SimpleDateFormat time) {
			
			
			this.time = time;

			
			this.floor = floor;
		
			
			this.UpDown = upDown;
			
			this.car = car;
			
		}
		
		
		
		public void SetElev(int newFloor, SimpleDateFormat newtime) {
			
			this.floor = newFloor;
			
			this.time = newtime;
			
			
		}
	
		public String GetDwnUp() {return this.UpDown;}
		
		public int GetCar() { return this.car;}
		
		public int Getfloor() { return this.floor;}
		
		public SimpleDateFormat getTime(){return this.time;}

}
