package Pages;

public class ModelForm {
    private String name;
    private String lastName;
     private String email;
     private String age;
     private int profesion;
     private String continent;
     private String seleniumCommand1;
     private String seleniumCommand2;
     private String path;

    public ModelForm(String name, String lastName, String email, String age, int profesion, String continent, String seleniumCommand1, String seleniumCommand2, String path) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.profesion = profesion;
        this.continent = continent;
        this.seleniumCommand1 = seleniumCommand1;
        this.seleniumCommand2 = seleniumCommand2;
        this.path = path;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public int getProfesion() {
        return profesion;
    }

    public String getContinent() {
        return continent;
    }

    public String getSeleniumCommand1() {
        return seleniumCommand1;
    }

    public String getSeleniumCommand2() {
        return seleniumCommand2;
    }

    public String getPath() {
        return path;
    }
}
