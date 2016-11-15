
/**
 * 
 * @author Heather Kemp
 * the Master/Visualizer.java class is a mock version of the Visualizer.java object, created simply to test the Master's ability to
 * cycle through events.
 * It only implements the methods required by the Event interface.
 *
 */

public class Visualizer implements Event{
	
	/**
	 * Constructor initializes nothing, as everything is handled in the mock methods.
	 */
	
	public Visualizer(){
		
	}

	/**
	 * Performs an action. Extracts the method to be executed and parameters from the method strong and then executes these
	 * methods.
	 * @input - a string which contains a method name/key and parameters, seperated by commas
	 */
	
	public void performAction(String Method){
		System.out.println("Visualizer did something");
	}
	
	/**
	 * Gets the event. Returns this object as an Event
	 */
	
	public Event getEvent(){

	     return (Event) this;
	   }
	        
	/**
	 * Gets the parameters. Returns the parameter for the next call of this method.
	 */
	
	public String getPara(){
	    return "Null";
	   }
}
