package Variables.Enums;

import java.time.LocalDateTime;
import java.util.List;

import static Variables.Enums.WakeTurbulance.*;
import static java.time.LocalDateTime.now;
import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
        List<AIRCRAFT> aircraft = of(
                new AIRCRAFT("B737", LIGHT,1000),
                new AIRCRAFT("A320", LIGHT, 1001),
                new AIRCRAFT("A330", MEDIUM, 1002),
                new AIRCRAFT("A380", SUPER, 1004)
        );
        TakeOffDistancingRules takeOffRules = new TakeOffDistancingRules();

        int offset = 0;
        for (AIRCRAFT a : aircraft){
            offset += takeOffRules.calculateWaitTime(a);
            LocalDateTime depTime = now().plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeADecimal() + " takes off at " + depTime.toLocalTime());
        }
    }
}
