import java.util.Scanner;

public class main {
public static void main(String[] args) {
	ToDoList td = new ToDoList();
	
	
	do {
		System.out.println("choose the option to perform operation");
		Scanner scan = new Scanner(System.in);
		System.out.println("option 1 to perform addTask");
		System.out.println("option 2 to perform ViewTasks");
		System.out.println("option 3 to perform removeTask");
		System.out.println("option 4 to perform markATaskAsCompleted");
		System.out.println("option 5 to exit");
		try {
			int n= scan.nextInt();
			switch(n) {
			case 1:
				td.addaTask();
				
				
				break;
			case 2:
				td.ViewTasks();
				break;
				
			case 3:
				td.removeTask();
				break;
				
			case 4:
				
				td.markATaskAsCompleted();
				
				break;
				
			case 5:
				System.out.println("program terminated....");
				td.exit();
				
			default:
					System.out.println("plz enter number till given option");
			}
			
		} catch (Exception e) {
			System.out.println("plz provide option as positive integer: ");
			System.out.println("==========================================");

			
		}
		

	}while(td==td);	
	
	
		
}


}
