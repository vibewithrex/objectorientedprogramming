import java.util.List;

public class User {
    private String firstName;
    public String lastName;

    public String output() {
        return "Hi! my name is " + firstName + " " + lastName + ".";
    }
    
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public String setFirstName(String fn) {
        return firstName = fn;
    }

    public String getLastName() {
        return lastName.toLowerCase();
    }

    public String setLastName(String ln) {
        return lastName = ln;
    }

    public static int searchList(List<User> users, String fn, String ln) {
        return searchList(users, fn + " " + ln);
    }


    public static int searchList(List<User> users, String fullName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFullName() == fullName) {
                return i;
            }
        }
        return -1;
    }
}
