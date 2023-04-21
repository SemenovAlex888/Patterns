package chain_of_responsibilitys.chain_of_responsibility_1.middleware;

import chain_of_responsibilitys.chain_of_responsibility_1.server.Server;

/**
 * @author Semenov Alexey
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}
