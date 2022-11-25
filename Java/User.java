public class User extends Account{
    String id;
    String name;
    String document;
    String email;
    String password;
    public User(String name, String document){
        super(name, document);
    }
}
