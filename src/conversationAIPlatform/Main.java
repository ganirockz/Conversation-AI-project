package conversationAIPlatform;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		DialogTask welcomeTask = new DialogTask("Welcome");
		
		Node node1 = new Node("Welcome","Welcome","Hi, Welcome to ABC Hospital.How may i assist you?\n 1) Book appointment\n 2) Reschedule appointment\n 3) Cancel Appointment\n 4) Info of appointment","Entity");
		
		welcomeTask.setNode(node1);
		
		DialogTask bookAppointment = new DialogTask("Book Appointment");
		
		Node node2 = new Node("Name","Get User Name","Please provide your name","Entity");
		Node node3 = new Node("Phone Number","Get User Phone Number","Please provide your phone number","Entity");
		node2.setNextNode(node3);
		Node node4 = new Node("appointmentDate","User appointment Date","Please provide appointment date","Entity");
		node3.setNextNode(node4);
		Node node5 = new Node("ThankYou","Greetings to User","Thank you! We have booked your appointment.","Message");
		node4.setNextNode(node5);
		
		bookAppointment.setNode(node2);
		
		welcomeTask.setNext(bookAppointment);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bot starting......");
		
		DialogTask currentTask = welcomeTask;
		
		while(currentTask != null) {
			
			System.out.println("Current Task: "+ currentTask);
			
			Node currentNode = currentTask.getNode();
			
			while(currentNode != null) {				
				if(currentNode.getTypeOfNode() == "Message") {
					System.out.println(currentNode.getMessage());
				}else {
					System.out.println(currentNode.getMessage());
					String str = sc.nextLine();
				}
				
				currentNode = currentNode.getNextNode();
			}
			
			currentTask = currentTask.getNext();
		}
		
		System.out.println("End of bot tasks..............");
		
		
		
		
		

	}

}
