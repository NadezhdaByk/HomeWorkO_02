package re.gb.oseminar.data.StudentView;

import re.gb.oseminar.data.data.Student;
import re.gb.oseminar.data.data.User;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class groupView {

    public void sendOnConsole(Map<Long, List<Long>> group){
        Logger logger = Logger.getAnonymousLogger();

        for (Long key: group.keySet()){
            logger.info(group.toString());
        }
    }
}
