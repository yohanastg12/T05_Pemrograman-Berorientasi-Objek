//12S22050-YOHANA SITANGGANG
package academic.model;
public class Lecturer extends Ortu {
    private String initial;
    private String email;
    private String studyProgram;

    public Lecturer(String id, String name, String initial, String email, String studyProgram) {
        super(id, name);
        this.initial = initial;
        this.email = email;
        this.studyProgram = studyProgram;
    }

    public String getInitial() {
        return initial;
    }

    public String getEmail() {
        return email;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + initial + "|" + email + "|" + studyProgram;
    }
}
