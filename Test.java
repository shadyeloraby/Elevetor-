
public class Test {

	public static void main(String[] args) {
		
		
		Thread Elevator,FloorSubsystem,Schedular;
		
		
		Elevator = new Thread (new Elevator(), "Elevator");
		
		FloorSubsystem = new Thread(new FloorSubsystem(),"Floors");
		
		Schedular = new Thread(new Schedular(), "Schedular");
		
		
		Elevator.start();
		FloorSubsystem.start();
		Schedular.start();
		
		// TODO Auto-generated method stub

	}

}
