package beggining.defaultM.optional;

import java.util.Optional;

//////Good example of Optional class

public class EmailCheck {
    public static void main(String[] args) {
        Inimene inimene = new Inimene("james", "JAMes@GMail.coM"); //or null
        String email = inimene
                .getEmail()
                .map(String::toLowerCase)
                .orElse("no emeail");
        System.out.println(email);
    }

}

//////
class Inimene {
    private final String name;
    private final String email;

    public String getName() {
        return name;
    }
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
        public Inimene(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
