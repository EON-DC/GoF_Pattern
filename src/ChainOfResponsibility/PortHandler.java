package ChainOfResponsibility;

public class PortHandler extends Handler{

    @Override
    protected void process(String url) {
        int dotIndex = url.lastIndexOf(":");
        if (dotIndex == -1) {
            System.out.println("NO Port");
        } else {
            System.out.println("Port : " + url.substring(dotIndex));
        }
    }
}
