import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

// Creation of Me as a Student
    Student student2 = new Student();

    student2.setName("Sam Dobrowolski");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

// Printing of the student Information
  student1.print();
  student2.print();

  //Creation of Array, Summation of Array, Average of total Summation
  ArrayList<Double> gpas = new ArrayList<Double>();
  gpas.add(0, student1.gpa);
  gpas.add(1, student2.gpa);

  double sum = 0;
    for (int number = 0; number < gpas.size(); number++)
      sum += gpas.get(number);
  
  double average = sum / gpas.size();
  System.out.println("The average GPA is " + average);

  //System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor();

// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  }
}

class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

// Creation of Print Method
  void print() {
    System.out.println("The student's name is " + name);
    System.out.println("The student's GPA is " + gpa);
    System.out.println("The student's major is " + major);
  }
}