package Lesson9Ex1Of3;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Dima", "Chisinau", "BS Computer Science", 2021, 15000.0);
        System.out.println(student1);

        Staff staff1 = new Staff("Maria", "Ialoveni", "Universitate de Stat", 16000.0);
        System.out.println(staff1);

//Instantiation of Person is not possible for an abstract class
//Student info: Dima, Chisinau, BS Computer Science, 2021, 15000.0
//Staff info: Maria, Ialoveni, Universitate de Stat, 16000.0

    }
}
