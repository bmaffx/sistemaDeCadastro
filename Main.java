import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            String name = "";
            while (name.trim().isEmpty()) {
                System.out.print("Digite seu nome de usuário: ");
                name = scanner.nextLine();
            }


            String password = "";
            while (password.trim().isEmpty()) {
                System.out.print("Crie uma senha de acesso: ");
                password = scanner.nextLine();
            }

            User user = new User();
            user.setName(name);
            user.setPassword(password);

            userManager.addUser(user);

        }

        scanner.close();

    }
}