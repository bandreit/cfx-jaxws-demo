package via.sdj3.jaxw.service.services;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Random;

@WebService(endpointInterface = "via.sdj3.jaxw.service.services.WakeUpMsgService", serviceName = "WakeUpMsgService")
public class WakeUpMsgServiceImpl implements WakeUpMsgService {

    public String wakeUp(@WebParam(name = "") String name) {
        return getRandomMsg() + ", " + name;
    }

    public String goToSleep(@WebParam(name = "") String name) {return "Go to sleep, " + name; }

    private String getRandomMsg() {
        ArrayList<String> wakeUpMsgs = new ArrayList<String>();
        wakeUpMsgs.add("Have a good day");
        wakeUpMsgs.add("It's gonna be ok");
        wakeUpMsgs.add("Don't worry, be happy");
        wakeUpMsgs.add("Here is a warm coffee");
        return wakeUpMsgs.get(new Random().nextInt(wakeUpMsgs.size()));
    }
}
