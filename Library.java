import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***************************Welcome to the College library******************");
		System.out.println("                           select from the following options               ");
		System.out.println("***************************************************************************");
		Books ob = new Books();
		Students obStudent = new Students();
		int choice;
		int searchChoice;
		do {
			ob.dispMenu();
			choice = input.nextInt();
			switch (choice) {
			case 1:
				Book b = new Book();
				ob.addBook(b);
				break;
			case 2:
				ob.upgradeBookQty();
				break;
			case 3:
				System.out.println(" press 1 to Search with Book Serial No.");
				System.out.println(" Press 2 to Search with Book's Author Name.");
				searchChoice = input.nextInt();
				switch (searchChoice) {
				case 1:
					ob.searchBySno();
					break;

				// Case
				case 2:
					ob.searchByAuthorName();
				break;
				}
				break;
			case 4:ob.showAllBooks();
			break;
			case 5:Student s=new Student();
			obStudent.addStudent(s);
			break;
			case 6:obStudent.showAllStudents();
			break;
			case 7:obStudent.checkOutBooks(ob);
			break;
			case 8:obStudent.checkInBook(ob);
			break;
			default:
				System.out.println("Enter between 0 to 8");
			}
		}
		while(choice!=0);
	}	
}

		
		
