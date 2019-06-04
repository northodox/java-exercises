package org.launchcode.school;

import java.util.ArrayList;

public class Course {
    //has-a relationships
    //name String
    //course ID Int
    //description String
    //time Date
    //semester String
    //credit hours double
    //roster ArrayList<students>
    //instructor(s) String
    //grades HashMap<Student, Double>
    //capacity int
    //prerequisites String
    //location String

    private String name;
    private String number;
    private ArrayList<Student> roster;

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    public Course(String name, String number) {
        this.name = name;
        this.number = number;
        this.roster = new ArrayList<>();
    }

    //Behaviors
    //*addStudent(Student) public void
    //grade student
    //*dropStudent(Student) public void
    //*printRoster(Roster) public void

    public boolean addStudent(Student s) {
        if (!this.roster.contains(s)){
            this.roster.add(s);
            return true;
        }
        return false;
    }

    public boolean dropStudent(Student s) {
        if (!this.roster.contains(s)) {
            this.roster.remove(s);
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        Course lc101 = new Course("LaunchCode","LC101");
        Student s = new Student("Keanu Reeves");
        Student s2 = new Student("Carrie Anne Moss");
        lc101.addStudent(s);
        lc101.addStudent(s2);

    }

}
