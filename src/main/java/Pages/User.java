package Pages;

public class User {
    public static ModelForm getDataForForm() {
        return new ModelForm((System.getProperty("firstName")),
                (System.getProperty("lastName")),
                (System.getProperty("email")),
                (System.getProperty("age")),
                Integer.parseInt(System.getProperty("profession")),
                (System.getProperty("continent")),
                (System.getProperty("seleniumCommand1")),
                (System.getProperty("seleniumCommand2")),
                (System.getProperty("path")));
    }
}
