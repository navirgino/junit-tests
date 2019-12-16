import java.util.ArrayList;

public class Student {
    public long id;
    public String name;

    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's id

    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);

    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
     double sum = 0;
     for(int grade: this.grades){
         sum += grade;
     }
     return sum / this.grades.size();

    }


//    public ArrayList<Integer> updateGrade(int index, int grade){
//        this.grades.remove(index);
//        this.grades.add(grade);
//        return this.grades;
//
//    }
//    public void deleteGrade(){
//        System.out.println("What grade would you like to delete?");
//        for(int grade: this.grades){
//            System.out.println(grade);
//        }
//    }



}