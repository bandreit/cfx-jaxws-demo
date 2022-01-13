package via.sdj3.jaxw.service.client;

import via.sdj3.jaxw.service.services.WakeUpMsgService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:9000/cfx-jaxws-demo?wsdl");
        QName SERVICE_NAME = new QName("http://services.service.jaxw.sdj3.via/", "WakeUpMsgService");
        Service service = Service.create(wsdlURL, SERVICE_NAME);
        System.out.println("The SOAP service is now created");
        //consume the service
        //obtain the service interface by using getPort
        WakeUpMsgService ws = service.getPort(WakeUpMsgService.class);
    }
}
