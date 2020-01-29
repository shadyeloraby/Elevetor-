
import java.time.*;
import java.util.Arrays;

public class Elevator implements Runnable {

	
	private LocalTime time;
	
	private int[] floors;
	
	private int Elevnum;
	
	private boolean[] buttons;
	
	public Elevator() {
		
	}
	public Elevator(int Elevnum,int floor) {
		
		
		this.Elevnum = Elevnum;
		
		this.floors =  new int[floor];
		
		this.buttons = new boolean[floor];
		
		Arrays.fill(this.buttons, false);
	
		
	}


	@Override
	public void run() {
		System.out.println("`i am ");
		
		
	}
	
	
	
	
	
}
