package eventPanel;

public class ProxyEventPanel implements EventPanel {
	private RealEventPanel eventpanel;
	   private String eventName;

	   public ProxyEventPanel(String eventName){
	      this.eventName = eventName;
	   }

	   @Override
	   public void display() {
	      if(eventpanel == null){
	    	  eventpanel = new RealEventPanel(eventName);
	      }
	      eventpanel.display();
	   }
}

