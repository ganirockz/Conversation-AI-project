package conversationAIPlatform;
import java.util.*;

public class DialogTask {
	private String name;
	private Node node;
	private DialogTask next;
	private ArrayList<String> utterances;
	
	public DialogTask() {
		this.name = "";
		this.node = null;
		this.next = null;
		this.utterances = new ArrayList<String>();
	}
	
	public DialogTask(String name) {
		this.name = name;
		this.node = null;
		this.next = null;
		this.utterances = new ArrayList<>();
		this.utterances.add(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNode(Node node) {
		this.node = node;
	}
	
	public void setNext(DialogTask next) {
		this.next = next;
	}
	
	public String getName() {
		return name;
	}
	
	public Node getNode() {
		return node;
	}
	
	public DialogTask getNext() {
		return next;
	}
	
	public String toString() {
		return "Dialog task - Name :"+this.name+", Utterences: "+ this.utterances;
	}
	
	public void addUtterence(String utterence) {
		this.utterances.add(utterence);
	}
}
