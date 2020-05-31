public interface IMediator {
    void addUser(User user);
    void sendMessage(String message, User sender);
}
