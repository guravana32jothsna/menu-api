//package com.food.fullstackcomplete.schedulers;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//@Component
//@Slf4j
//public class Scheduler {
//    @Scheduled(fixedDelay = 1000)
//
//    public void scheduler() throws InterruptedException {
//        LocalDateTime curr = LocalDateTime.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDateTime = curr.format(format);
//        log.info("Scheduled time " + formattedDateTime);
//    }
//}
