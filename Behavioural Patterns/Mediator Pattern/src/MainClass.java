public class MainClass {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();
        User user1 = new UserImpl(mediator, "Piyush");
        User user2 = new UserImpl(mediator, "Nimit");
        User user3 = new UserImpl(mediator, "Shubham");
        User user4 = new UserImpl(mediator, "Mukul");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi all");
    }
}
