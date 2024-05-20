import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList implements Daily {
    private ArrayList<Task> tasks;
    private Scanner scan;

    public ToDoList() {
        tasks = new ArrayList<>();
        scan = new Scanner(System.in);
    }

	@Override
	public void addaTask() {
		do {
            //some comment
            System.out.println();
	        System.out.print("Enter the task: ");
	        String taskDescription = scan.nextLine();
	        Task task = new Task(taskDescription);
	        tasks.add(task);
	        System.out.println("Task added successfully.");	
			System.out.println("==========================================");
			
            System.out.print("Do you want to add another task? (yes/no): ");
            String response = scan.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break; 
            }
		}while(true);

	}


	@Override
	public void ViewTasks() {
		if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
		System.out.println("==========================================");

		
	}

	@Override
	public void removeTask() {
		if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }
        
        System.out.print("Enter the index of the task to remove: ");
        int index = scan.nextInt();
        
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid index. Plz enter a number between 1 and " + tasks.size() + ".");
        } else {
            Task removedTask = tasks.remove(index - 1);
            System.out.println("Task '" + removedTask.getDescription() + "' removed successfully.");
        }
		System.out.println("==========================================");
		scan.nextLine();

		
	}

	@Override
	public void markATaskAsCompleted() {
		if (tasks.isEmpty()) {
            System.out.println("No tasks to mark as completed.");
            return;
        }

        System.out.print("Enter the index of the task to mark as completed: ");
        int index = scan.nextInt();

        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid index. Plz enter a number between 1 and " + tasks.size() + ".");
        } else {
            Task task = tasks.get(index - 1);
            task.setCompleted(true);
            System.out.println("Task marked as completed successfully.");
        }
		System.out.println("==========================================");
		scan.nextLine();
		
	}

	@Override
	public void exit() {
		System.exit(0);
		System.out.println("==========================================");
	
	}
	



}
