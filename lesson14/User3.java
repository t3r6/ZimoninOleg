package lesson14;

public class User3 {
    static String login;
    static String password;

    static {
        login = "Mr";
        password = "MS";
    }

    static String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User3 user3 = (User3) o;

        if (login != null ? !login.equals(user3.login) : user3.login != null) return false;
        return password != null ? password.equals(user3.password) : user3.password == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User3{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static class Query {
        public void printToLog() {
            System.out.printf("Вот такой то чел с таким то логином %s с таким то паролем %s %n", login, password);
        }
    }

    public static void main(String[] args) {
        User3.Query queryUser3 = new User3.Query();
        queryUser3.printToLog();

        Query queryQ = new Query();
        queryQ.printToLog();
    }
}
