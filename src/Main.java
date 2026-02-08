class Student{
    // our student "fields"
    private String name;
    private double gpa;

    // adding methods/functions added via rightclick->source action
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override // not neccessary
    public String toString(){
        return name + ", " + gpa;
    }

    // constructors
}

public class Main {
    public static void main(String[] args) {
        Student s1, s2; // s1 and s2 is a reference to a student type variable
        //Student [] array = new Student[100];

        s1 = new Student();
        
        s1.setName("Aaron Singh");
        s1.setGpa(3.68);

        System.out.println(s1.toString());

    }
}
