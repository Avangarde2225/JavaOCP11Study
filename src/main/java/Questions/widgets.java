package Questions;

import java.util.List;
import java.util.stream.Stream;

public class widgets {
    public static void main(String[] args) {
        List widgets = List.of( new Widget("Basic Widget", 19.55),
                                new Widget("Enhanced Widget", 35.00),
                                new Widget("Super Widget", 55.55)
        );
        Stream <Widget> widgetStream = widgets.stream();
        //widgetStream.filter(a ->((Widget) a ).getPrice() > 20.00). forEach(System.out::println);
    }
}
