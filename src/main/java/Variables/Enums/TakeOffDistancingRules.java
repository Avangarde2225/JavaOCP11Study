package Variables.Enums;

import java.util.Map;

import static Variables.Enums.WakeTurbulance.*;
import static java.util.Map.of;

public class TakeOffDistancingRules {

    private Map<WakeTurbulance,Integer> rules;

    public TakeOffDistancingRules(){
        rules = of(
                LIGHT, 60,
                MEDIUM, 90,
                HEAVY, 110,
                SUPER, 180
        );
    }
    public int calculateWaitTime(AIRCRAFT a){
        return rules.get(a.getWakeTurbulance());
    }
}
