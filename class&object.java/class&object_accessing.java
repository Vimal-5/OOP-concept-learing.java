class Book{
    int bookid;
    String bookname;
    
    void display(){
        System.out.println("Book Id: "+bookid);
        System.out.println("Book Name: "+bookname);
    }
}
public class Main
{
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.bookid = 101;
		b.bookname = "Java Programing";
		
		b.display();
		
	}
}
