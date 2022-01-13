package via.sdj3.jaxw.service.services;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WakeUpMsgService {
    String wakeUp(@WebParam(name = "name") String name);
    String goToSleep(@WebParam(name = "name") String name);
}
