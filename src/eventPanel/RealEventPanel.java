package eventPanel;

public class RealEventPanel implements EventPanel {

	   private String eventName;

	   public RealEventPanel(String eventName){
	      this.eventName = eventName;
	      loadFromDisk(eventName);
	   }

	   @Override
	   public void display() {
	      System.out.println("Displaying " + eventName+" panel.");
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + eventName+" from Database.");
	   }
	}
