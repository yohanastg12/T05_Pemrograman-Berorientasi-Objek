package academic.model;

public class Enrollment {
    private String code;
    private String id;
    private String academicYear;
    private String semester;
    private String grade = "None";

    public Enrollment(String code, String id, String academicYear, String semester) {
        this.code = code;
        this.id = id;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return code + "|" + id + "|" + academicYear + "|" + semester + "|" + grade;
    }
}
