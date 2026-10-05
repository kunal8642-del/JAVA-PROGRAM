class Calculator {
    int add(int a, int b) {
        return a + b;
    }
int add(int a, int b, int c) {
    return a + b + c;
    }
double add(double a, double b) {
    return a + b;
    }
}
class Student {
    String name;
 int age;

    Student(){
        name = "unknown";
        age = 0;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
    void display(){
        System.out.println("name : " + name + ", Age : " + age);

    }
    Student getStudent() {
        return this;
    }
  }  
  public class FunctionDemo{
    public static  void main(String[] args) {
        Calculator calc= new Calculator();
        System.out.println("Add two integer: " + calc.add(5, 10));
        System.out.println("Add three integer : " + calc.add(5, 10, 15));
        System.out.println("Add two Double : " + calc.add(5.5, 4.8));

        Student s1 = new Student();
        Student s2 = new Student("Kunal",21);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();


        Student s4 = s2.getStudent();
        System.out.println("student s4 details (reference to s2):");
        s4.display();
    }
  }    
