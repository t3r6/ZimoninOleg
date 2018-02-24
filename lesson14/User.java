package lesson14;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Вот такой то чел с таким то логином %s с таким то паролем %s %n", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("Mr. User", "password and");
        user.createQuery();

        User.Query query2 = user.new Query();
        query2.printToLog();

        User.Query query1 = new User("Mr. Login", "Mr.Passwoed").new Query();
        query1.printToLog();
    }
}
