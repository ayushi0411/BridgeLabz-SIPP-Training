package Workshop;
import java.util.LinkedList;
abstract class Notification {
    String message;
    public Notification(String message){
        this.message = message;
    }
    public abstract String getNotification();
}
class LikeNotification extends Notification {
    public LikeNotification(String message) {
        super(message);
    }
    @Override
    public String getNotification() {
        return "Like: " + message;
    }
}
class CommentNotification extends Notification {
    public CommentNotification(String message) {
        super(message);
    }
    @Override
    public String getNotification(){
        return "Comment: " + message;
    }
}
class NotificationFeed {
    private LinkedList<Notification> feed;

    public NotificationFeed() {
        feed = new LinkedList<>();
    }
    public void addNotification(Notification notification) {
        feed.addFirst(notification);
    }
    public void displayFeed() {
        System.out.println("User Notification Feed:");
        for (Notification n : feed) {
            System.out.println(n.getNotification());
        }
    }
}
public class SocialMediaNotificationFeed {
    public static void main(String[] args) {
        NotificationFeed userFeed = new NotificationFeed();
        userFeed.addNotification(new LikeNotification("Ayushi liked your post."));
        userFeed.addNotification(new CommentNotification("Abhijeet commented: Amazing!"));
        userFeed.addNotification(new LikeNotification("Vyom liked your photo."));
        userFeed.displayFeed();
    }
}

