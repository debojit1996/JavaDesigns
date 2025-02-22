package anotherExample;

public class SchoolStudentAdapter implements Student {
    private String name;
    private String surname;
    private String email;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.name = schoolStudent.getFirstName();
        this.surname = schoolStudent.getLastName();
        this.email = schoolStudent.getEmailAddress();
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
