package weekTask2;

import java.util.Scanner;

public class queueOp {

	public static void main(String[] args) {
		Queue q = new Queue();
		int data;
		try {
			while(true) {
				System.out.println("***********************");
			    System.out.println("To enqueue, press 'e'");
			    System.out.println("To dequeue, press 'd'");
			    System.out.println("To search, press 's'");
			    System.out.println("To get index, press 'i'");
			    System.out.println("To quit, press 'q'");
			    System.out.println("***********************");
				Scanner sc=new Scanner(System.in);
				char ch = sc.next().charAt(0);
				switch(ch) {
					case 'e': System.out.print("Enter number: ");
							  data = sc.nextInt();	       
		                      q.enqueue(data);break;
					case 'd': q.dequeue();break;
					case 'q': break;
					case 's': System.out.print("Enter number to search: ");
								data=sc.nextInt();
								int index=q.searchNo(data);
								if(index==-1)
									System.out.println("Not found");
								else
									System.out.println("Found at index: "+index);
								break;
					case 'i': System.out.println("Enter index: ");
								data=sc.nextInt();
								int num=q.getIndex(data);
								if(num==-1)
									System.out.println("Invalid index");
								else
									System.out.println("Data at index: "+num);
								break;
					default: System.out.println("Invalid input");ch='q';break;
				}
				//print queue
				System.out.println("Front = " + q.front.data);
				System.out.println("Rear = " + q.rear.data);
				if(ch=='q')
					break;
				
			}
		}
		catch(Exception e) {
			System.out.println("Error :(");
		}
	}
	
}
