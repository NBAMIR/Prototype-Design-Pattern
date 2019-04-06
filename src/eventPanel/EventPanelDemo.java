package eventPanel;

public class EventPanelDemo {

	 public static void main(String[] args) {
	      EventPanel panel = new ProxyEventPanel("testEvent");

	      //image will be loaded from disk
	      panel.display(); 
	 }      
}
