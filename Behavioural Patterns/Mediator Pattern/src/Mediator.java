import java.util.ArrayList;

public class Mediator implements IMediator {
    // Stores all the people the mediator has to interact with.
    private ArrayList<User> users;

    public Mediator() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for(int i = 0; i < users.size(); i++) {
            if (users.get(i) != sender) {
                users.get(i).receiveMessage(message, sender);
            }
        }
    }
}
