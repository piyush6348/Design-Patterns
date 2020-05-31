public class UserImpl extends User {
    public UserImpl(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Message sent " + message + " by " + this.getName());
        this.getMediator().sendMessage(message, this);
    }

    @Override
    void receiveMessage(String message, User sender) {
        System.out.println("Message received " + message + " by " + this.getName()+ " from " + sender.getName());
    }
}
