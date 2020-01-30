import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Arrays;

public class Elevator implements Runnable {


	
	private boolean[] buttons;
	
	private Schedular schedular;
	
	public Elevator() {
		
		
	}
	public Elevator(int Elevnum,int floor) {
		
		this.buttons = new boolean[floor];
		
		Arrays.fill(this.buttons, false);
	
		
	}

	public void send () {

		
		//this.time.applyLocalizedPattern("here");
		
		this.schedular.get_elev( 1, "up", 11);
		
	}

	@Override
	public void run() {
		//System.out.println("`i am ");
	
		send();
	}
	
	
	
	
	
}
