import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public class Schedular implements Runnable{
	
    private boolean UpLamp; //direction lamps
	private boolean DownLamp; //""
	
	private boolean upWard; //direction lamps
	private boolean downWard; //""
	
	private LocalTime time;
	
	private  ArrayList<Integer> floors = new ArrayList<>() ;;
	
	private int Elevnum;
	
	private char[] buttons;
	


	

	
	
	
	
	public void getInfo(LocalTime time,int floor,int elevnum,boolean[] btns) {
		
		this.time = time;
		floors.add(floor);
		
		
		
		
	}
	
	public void  upDownWard() {
		
		if (upWard) {
			
			
			
			
		}else if(downWard){
			
			
			
			
		}else {
			
		}
		
	}
	
	
	
	
	@Override
	public void run() {
		System.out.println("`i am sexy");
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}
