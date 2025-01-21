package Day15.SortAList;

import Day15.AverageGPAFinding.FindAverageGPA;
import Day15.ConvertingNmaes.TransfornNamesToUpperCase;
import Day15.FindNameByLetter.FindNames;
import Day15.TopScorer.TopScorers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(0);
        student1.setName("Vignesh");
        student1.setRollNumber(54);
        student1.setGPA(1.99);
        student1.setTotalMark(296);
        student1.setDepartment("CSBS");

        Student student2 = new Student();
        student2.setId(1);
        student2.setName("Shivan");
        student2.setRollNumber(55);
        student2.setGPA(2.99);
        student2.setTotalMark(396);
        student2.setDepartment("IT");

        Student student3 = new Student();
        student3.setId(2);
        student3.setName("Wikki");
        student3.setRollNumber(56);
        student3.setGPA(3.99);
        student3.setTotalMark(346);
        student3.setDepartment("CSE");

        Student student4 = new Student();
        student4.setId(3);
        student4.setName("Ganesh");
        student4.setRollNumber(57);
        student4.setGPA(3.55);
        student4.setTotalMark(186);
        student4.setDepartment("AIDS");

        Student student5 = new Student();
        student5.setId(4);
        student5.setName("Vijay");
        student5.setRollNumber(58);
        student5.setGPA(3.65);
        student5.setTotalMark(500);
        student5.setDepartment("IT");

        Student student6 = new Student();
        student6.setId(5);
        student6.setName("Gokul");
        student6.setRollNumber(59);
        student6.setGPA(4.55);
        student6.setTotalMark(586);
        student6.setDepartment("CSBS");

        Student student7 = new Student();
        student7.setId(6);
        student7.setName("Harish");
        student7.setRollNumber(60);
        student7.setGPA(5.55);
        student7.setTotalMark(686);
        student7.setDepartment("CSBS");

        Student student8 = new Student();
        student8.setId(7);
        student8.setName("Mottiesh");
        student8.setRollNumber(61);
        student8.setGPA(5.55);
        student8.setTotalMark(686);
        student8.setDepartment("IT");

        Student student9 = new Student();
        student9.setId(8);
        student9.setName("Prasanth");
        student9.setRollNumber(62);
        student9.setGPA(6.55);
        student9.setTotalMark(786);
        student9.setDepartment("IT");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);

        // Collections.sort(list, new Comparator<Student>() {
        // @Override
        // public int compare(Student t1, Student t2) {
        // if (t1.getGPA() > t2.getGPA())
        // return 1;
        // else if (t1.getGPA() < t2.getGPA())
        // return -1;
        // return 0;
        // }
        // });

        Collections.sort(list, (list1, list2) -> Double.compare(list1.getGPA(), list2.getGPA()));
        System.out.println("");
        System.out.println("Sorted list...");

        for (Student student : list) {
            System.out.println(student);
            System.out.println("......................");
        }


        System.out.println("");
        System.out.println("Top scorers...");
        TopScorers obj = new TopScorers();
        obj.findTopScorer(list);
        System.out.println("");
        System.out.println("Transform Names To UpperCase...");

        TransfornNamesToUpperCase obj1 = new TransfornNamesToUpperCase();
        obj1.contvertToUpperCase(list);
        System.out.println("");
        System.out.println("Find Average...");

        FindAverageGPA obj2 = new FindAverageGPA();
        obj2.findGPA(list);
        System.out.println("");
        System.out.println("Find Names...");

        FindNames obj3 = new FindNames();
        obj3.findNamesByLetter(list, 'V');

    }

}
