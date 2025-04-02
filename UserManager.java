import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users = new ArrayList<>();
    private int userCount = 0;


    public void addUser(User user) {


        for (User existingUser : users) {
            if (existingUser.getName().equals(user.getName())) {
                System.out.println("Erro: O nome de usuário já está em uso.");
                return;
                }
            }

        if (userCount < 3) {
            users.add(user);
            userCount++;
            System.out.println("Usuário " + user.getName() + " adicionado com sucesso!");
        } else {

            System.out.println("Limite de 3 usuários atingido. Não é possível adicionar mais.");
        }
    }
}



