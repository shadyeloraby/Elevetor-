

import java.time.*;
import java.util.Scanner;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FloorSubsystem implements Runnable{
	
	private SimpleDateFormat time;
	
	private String upDown;
	
	private int floor;
	
	private int carButton;
	
	private Schedular schedular = new Schedular();
	
	private String line;
	
	private String[] seperateData;
	
	
	public FloorSubsystem() {}

	public void readSendData(BufferedReader br) throws IOException{
		
		
		while((line = br.readLine()) != null) { 
    		
			seperateData = line.split(" ");
			
			time.applyLocalizedPattern(seperateData[0]);
			
			floor = Integer.parseInt(seperateData[1]);
			
			upDown = seperateData[2];
			
			carButton = Integer.parseInt(seperateData[3]); 
			
			//*******************SEND***************************
			
			schedular.get_floor(upDown,floor, carButton, time);
				
    	}

	}

	
	@Override
	public void run() {
        
        Scanner scnr = new Scanner(System.in);
      
        BufferedReader br = null; 
        
        try {
        	
        	System.out.print("Please enter the path for the input file: ");
        	
        	String fileName = scnr.next();
        	
        	FileReader f = new FileReader(fileName); //file name is read from user via FilerReader
            
        	br = new BufferedReader(f); 
        	
        	readSendData(br);
        	
        }
        catch(IOException ee){
        	
            System.out.println("File not found");
            
        }finally {
            
            try {
                br.close();
            }
            catch(IOException ie) {
                System.out.println("Error occured while closing the BufferedReader");
            }
            
        }
        
	}
	

}
