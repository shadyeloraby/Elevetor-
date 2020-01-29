import java.time.LocalTime;

public class Schedular implements Runnable{
	
	
	private LocalTime time;
	
	private int[] floors;
	
	private int Elevnum;
	
	private boolean[] buttons;

	
	public Schedular() {}
	
	
	
	public Schedular(LocalTime time,int[] floors,int elevnum,boolean[] btns) {
		
		this.buttons = btns;
		
		this.Elevnum = elevnum;
		
		this.floors = floors;
		
		this.time = time;
		
		
		
	}
	@Override
	public void run() {
		System.out.println("`i am sexy");
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}
