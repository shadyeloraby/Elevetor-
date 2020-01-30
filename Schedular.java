import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;



public class Schedular implements Runnable{
	 
	
	private Elevatorsys elevator;
   
	
    private boolean empty; 
	
    private int nfl;
    
    private int test;
    
    private String shady;
    private  SimpleDateFormat newTime; 
    
    
    public Schedular() {
    	
    	this.elevator = new Elevatorsys();
    	
    	this.empty = true;
    	
    	
    }
    
    
	public  void get_floor(String upDown, int floor, int car, SimpleDateFormat time) {
		
		
		this.elevator.elevatorsys(upDown, floor, car, time);
	
		this.empty = false;
		
		
	}
	
	public void get_elev( int s, String upDown, int t) {
		
		
		this.shady = upDown;
		
		this.test = s;
		
		this.nfl = t;
		
		
		System.out.println(" first print statment floor: " + this.test + this.shady + "Time: " + this.nfl); 
	}
	
	public synchronized void ReceiveFlr() {
		
		
		System.out.println("floor: " + this.test + this.shady + "Time: " + this.nfl);
		
	}
	
	
	public synchronized void receiveELev(){
			
	
		System.out.println("floor: " + this.test + this.shady + "Time: " + this.nfl);
		
	}
	
	
	
	//public void  upDownWard() {
		
	//	if (upWard) {
			
			
			
			
	//	}else if(downWard){
			
			
			
			
	//	}else {
			
	//	}
		
	//}
	
	
	
	
	@Override
	public void run() {

		
		receiveELev();
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}

