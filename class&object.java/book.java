import java.util.*;

class Book{
    int book_no;
    String name;
    double price;
    
    void display(){
        System.out.println("Roll number:"+book_no);
		System.out.println("Student name:"+name);
		System.out.println("Student mark:"+price);
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		Book b = new Book();
		
		System.out.println("Enter the book number:");
		b.book_no = obj.nextInt();
		obj.nextLine();
		
		System.out.println("Enter the book name:");
		b.name = obj.nextLine();
		
		System.out.println("Enter the price:");
		b.price = obj.nextDouble();
		
		b.display();
	}
}
