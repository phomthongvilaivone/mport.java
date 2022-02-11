mport java.util.*;

public class person {

    protected String name;
    protected int age;
        private void setAge(int age) {
        this.age = age;
    }
    private int getAge(){
        return this.age;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String getName() {
        return this.name;
    }
    public void printInfomation() {
        System.out.println("Full name: "+ getName() + ", age: " + getAge() + " years");
    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Phomthongvilaivone");
        p1.setAge(10);
        p1.printInfomation();
    }    
}

class students extends person {
    protected int year;
    Set<select> own;
}
class select {
    protected float mark;
    protected String location;
    @Size(max = 2) Set<course> choice;
    @Size(max = 2) Set<students> make;
}
class course {
    protected String name;
    protected double grade;
    Set<select> lesson;
    Set<instructor> tech;
}
class instructor extends person {
    private @Size(max = 2) Set<course> teacher;
    public interface assign {
    }
}
