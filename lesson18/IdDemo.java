package lesson18;

public class IdDemo {
    public static void main(String[] args) {
        System.out.println(isAuthenticait("login", "password", "password"));
        System.out.println(isAuthenticait("login", "password111", "password22"));
    }

    public static boolean isAuthenticait(String login, String password, String confimPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (password.length() > 20 || !password.equals(confimPassword)) {
                throw new WrongPasswordException("Неправильный пароль");
            }
        } catch (WrongLoginException | WrongPasswordException e ) {
            System.out.println(e.getMessage());
            return false;
        } /*catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } */
        finally {
            System.out.printf(" логин %s, пароль %s, повтор .. пароль %s%n", login, password, confimPassword);
        }
        return true;
    }
}
