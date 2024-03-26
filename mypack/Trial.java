package mypack;
public class Trial {
    public static void main(String[] args) {
    
        Student studentObj = new Student();
        studentObj.index_number = 3359322;
        studentObj.name = "Samuel Desmond Abbey Darko";
        studentObj.programme = "Computer Science";
        
        studentObj.write();
        studentObj.copy();
        studentObj.do_homework();
    }
}

class Student{
    String name;
    int index_number;
    String programme;

    

    void write(){
        System.out.println("Hello, I am returning the write method");
    }
    void copy(){
        System.out.println("Hello, I am returning the copy method");
    }
    void do_homework(){
        System.out.println("Index number: " + index_number + ", " + "Name: " + name + "and " + "Programme: " + programme);
    }
}
