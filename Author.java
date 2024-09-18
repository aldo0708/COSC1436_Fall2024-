public class Author {
    private String name;
    private String email;
    private String Nationality;

    // Constructor
    public Author(String name, String email, String Nationality) {
        this.name = name;
        this.email = email;
        this.Nationality = Nationality;
    }

    // Getter methods for name and email
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getNationaily(){
        return Nationality;
    }

    // Override toString() for Author class
    @Override
    public String toString() {
        return ("Author: " + name + ", Email: " + email);
    }
}