class Student{
    private int rollno;
    private String name;
    private int mark;
    
    public void setRollNo(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMark(int mark){
        this.mark=mark;
    }
    
    public int getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getMark(){
        return mark;
    }
}

public class Main
{
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setRollNo(101);
		s.setName("vimal");
		s.setMark(95);
		
		System.out.println("Roll No:"+s.getRollNo());
		System.out.println("Name:"+s.getName());
		System.out.println("Mark:"+s.getMark());
	}
}
