class Persen{
   String name = "Vimal";
}

class Student extends Persen{
    String name = "Kumar";
    
    void display(){
        System.out.println("Child Name: "+name);
        System.out.println("Parent Name: "+super.name);
    }
}

class Main{
    public static void main(String[] args){
        Student s = new Student();
        
        s.display();
    }
}
