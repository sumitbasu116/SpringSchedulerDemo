package com.sumit.event.schdeluer;
import java.util.logging.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class ScheduledTasks {
    private static final Logger log = Logger.getLogger(ScheduledTasks.class.getName());
    @Scheduled(fixedDelay = 2000)
    public void autoLoadMessage() {
    	//define the task to do
    	log.info("Ending autoLoadMessage in Scheduler");
    }
    @Scheduled(fixedRate = 2000)
    public void autoLoadGreet() {
    	//define the task to do
        log.info("Ending autoLoadGreet in Scheduler");
    }
}
