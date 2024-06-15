package academic.model;

public class Student extends Ortu {
    private String year;
    private String studyProgram;

    public Student(String id, String name, String year, String studyProgram) {
        super(id, name);
        this.year = year;
        this.studyProgram = studyProgram;
    }

    public String getYear() {
        return year;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

@Override
public String toString() {
    return super.getId() + "|" + super.getName() + "|" + year + "|" + studyProgram;
}
}