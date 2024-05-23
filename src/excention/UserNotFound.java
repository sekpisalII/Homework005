package excention;

public class UserNotFound extends Throwable {
    public UserNotFound() {
        super();
    }
    public UserNotFound(String message) {
        super(message);
    }
}
