package ChainOfResponsibility;

public class DomainHandler extends Handler{

    @Override
    protected void process(String url) {
        int index = url.indexOf("://");
        int dotIndex = url.indexOf(":");
        if (index == -1 || dotIndex == -1) {
            System.out.println("NO DOMAIN");
        } else {
            System.out.println("DOMAIN : " + url.substring(index, dotIndex));
        }
    }
}
