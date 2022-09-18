import java.util.ArrayList;
import java.util.Scanner;

public class Persons{
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("1.Добавить студента\n2.Добавить учителя\n3.Найти человека\nВывести последних 10 человек");
            String answer = scan.nextLine();
            switch (answer){
                case "1":
                    System.out.println("Введите gpa, ИИН, имя ");
                    int gpa = scan.nextInt();
                    int IIN = scan.nextInt();
                    scan.nextLine();
                    String name = scan.nextLine();
                    Student student = new Student(gpa,name,IIN);
                    break;
                case "2":
                    System.out.println("Введите ИИН, предмет, имя ");
                    int IIN_teach = scan.nextInt();
                    scan.nextLine();
                    String subject = scan.nextLine();
                    String name_teach = scan.nextLine();
                    Teacher teacher = new Teacher(subject,name_teach,IIN_teach);
                    break;
                case "3":
                    System.out.println("Введите ИИН, имя");
                    try {
                        for (int i = 0; i<=9; i++){
                            System.out.println(persons.get(i).toString());
                        }
                    }catch (Exception e ){
                        System.out.println("Not enough students");
                    }
                    break;
            }
        }
    }
}
class Person {
    private int IIN;
    private String name;

    public Person(){}
    public Person(String name, int IIN){
        this.name = name;
        this.IIN = IIN;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getIIN(){
        return IIN;
    }
    public void setIIN(int IIN){
        this.IIN = IIN;
    }
    @Override
    public String toString(){
        return "Name: " + name + " IIN: " + IIN;
    }
}
class Student extends Person{
    private int GPA;
   public Student(int GPA,String name, int IIN){
       super.setIIN(IIN);
       super.setName(name);
       this.GPA = GPA;
   }
    @Override
    public String toString(){
        return "Name: " + this.getName() + " IIN: " +  this.getIIN() + " GPA: " + GPA;
    }

}
class Teacher extends Person{
    private String subject;
    public Teacher(String subject, String name, int IIN){
        this.subject = subject;
        super.setIIN(IIN);
        super.setName(name);
    }
    @Override
    public String toString(){
        return "Name: " + this.getName() + " IIN: " + this.getIIN() + " Subject: " + subject;
    }
}