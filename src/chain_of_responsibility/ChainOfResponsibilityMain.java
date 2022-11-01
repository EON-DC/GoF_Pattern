package chain_of_responsibility;

public class ChainOfResponsibilityMain {
    public static void doGof(){
        System.out.println("==== ChainOfResponsibilityMain.doGof start ====");
        Handler handler = new ProtocolHandler();
        String url = "http://www.google.com:80";
        handler.setNext(new DomainHandler()).setNext(new PortHandler());
        handler.run(url);

        System.out.println("==== ChainOfResponsibilityMain.doGof end ====");
    }
}
