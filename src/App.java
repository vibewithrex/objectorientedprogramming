import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] firstNames = {"Reginald", "Sahib", "Covenant", "Gift"};
        String[] lastNames = {"Treasure", "Heavenly", "Menye", "Eliana"};

        List<User> users = new ArrayList<User>();

        for (int i = 0; i < firstNames.length; i++) {
            User u = new User();
            u.setFirstName(firstNames[i]);
            u.setLastName(lastNames[i]);
            users.add(u);
        }

        for (User u : users) {
            System.out.println(u.getFullName());
        }

        App n = new App();
        n.printUser(users.get(0));

    }

    public void printUser(User u) {
        u.getFullName();
    }
}
