package via.sdj3.jaxw.service.server;
import via.sdj3.jaxw.service.services.WakeUpMsgServiceImpl;

import javax.xml.ws.Endpoint;

public class ServerApp {
    public static void main(String[] args) throws InterruptedException {
        WakeUpMsgServiceImpl serviceImpl = new WakeUpMsgServiceImpl();
        String address = "http://localhost:9000/cfx-jaxws-demo";
        Endpoint.publish(address, serviceImpl);

        System.out.println("The server is now ready ...");
        Thread.sleep(20 * 60 * 1000);
        System.out.println("Exit");
        System.exit(0);
    }
}
