package AccessModifiers.Polymorphism;

/*
Change behavior of an application at runtime even without recompligin your code

REduces coupling because we can depend on abstractions not concrete types

We can use a single variable type to store many types

When to use interface vs abstract???

abstract                                    Interface
When you want to offer some base            Highest level of abstraction
functionality to subclasses                 Highest level of lose coupling
                                            Implement more interfaces
Provide template for future classes

Create abstract members that are not
public
 */

import Methods.RadarTraget;

import java.util.ArrayList;
import java.util.List;

//public interface RadarInterface {
//    List<RadarTarget> readData();
//}
//class Main {
//    public static void main(String[] args) {
//
//
//        List<RadarInterface> radars = List.of(
//                new XmlRadar(),
//                new BinaryRadar()
//        );
//        List<RadarTraget> combinedData = new ArrayList<>();
//        radars.forEach(r -> combinedData.addAll(r.readData()));
//    }
//}
