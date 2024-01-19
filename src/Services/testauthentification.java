package Services;

public class testauthentification {

    public static void main(String[] args) {

        Services.Authentification authService = new Services.Authentification();

        String[] user = {"samir", "root", "root"};
        String[] pwd = {"sankou7", "", "pwd"};

        // Tester l'authentification pour chaque paire d'identifiants
        for (int i = 0; i < user.length; i++) {
            boolean isAuthenticated = authService.authenticate(user[i], pwd[i]);

            if (isAuthenticated) {
                System.out.println("Authentification réussie pour " + user[i]);
            } else {
                System.out.println("Échec d'authentification pour " + pwd[i]);
            }
        }
    }


}