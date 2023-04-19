package conversationAIPlatform;

public class Node {
	
	private String name;
	
	private String description;
	
	private String message;
	
	private String typeOfNode;
	
	private Node nextNode;
	
	public Node() {
		nextNode = null;
	}
	
	public Node(String name,String description,String message,String typeOfNode) {
		this.name = name;
		this.description = description;
		this.message = message;
		this.typeOfNode = typeOfNode;
		this.nextNode = null;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setTypeOfNode(String typeOfNode) {
		this.typeOfNode = typeOfNode;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getName() {
		return name;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public String getTypeOfNode() {
		return typeOfNode;
	}
	
	public String toString() {
		return "Name: "+ this.name+", Description: "+this.description+", message: "+this.message+", Type of Node: "+this.typeOfNode;
	}

}
