package Day5_Program;
import java.util.Stack;
interface NavigationManager {
    void visit(String tab);
    void backward();
    void forward();
    void currentPage();
}
class DesktopBrowser implements NavigationManager {
    private Stack<String> forwardStack = new Stack<>();
    private Stack<String> backwardStack = new Stack<>();
    private String currenttab;
    
    @Override
    public void visit(String tab) {
        if (currenttab != null) {
            backwardStack.push(currenttab);
        }
        currenttab = tab;
        forwardStack.clear();
        System.out.println("Visiting: " + currenttab);
    }
    @Override
    public void backward() {
        if (!backwardStack.isEmpty()) {
            forwardStack.push(currenttab);
            currenttab = backwardStack.pop();
            System.out.println("Back to: " + currenttab);
        } else {
            System.out.println("No previous ");
        }
    }
    @Override
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backwardStack.push(currenttab);
            currenttab = forwardStack.pop();
            System.out.println("Forward to: " + currenttab);
        } else {
            System.out.println("No forward ");
        }
    }
    @Override
    public void currentPage() {
        System.out.println("Current tab: " + currenttab);
    }
}
class MobileBrowser extends DesktopBrowser {
    @Override
    public void visit(String tab) {
        super.visit(tab);
        System.out.println("(Mobile View) Now viewing: " + tab);
    }
}
public class WebbrowserTabNavigation {
    public static void main(String[] args) {
        System.out.println("Mobile Browser:");
        NavigationManager mobile = new MobileBrowser();
        mobile.visit("Instagram");
        mobile.visit("Snapchat");
        mobile.visit("Google");
        mobile.backward();
        mobile.forward();
        mobile.currentPage();

        System.out.println("\nDesktop Browser:");
        NavigationManager browser = new DesktopBrowser();
        browser.visit("Chatgpt");
        browser.visit("Safari");
        browser.backward();
        browser.forward();
        browser.currentPage();
    }
}



