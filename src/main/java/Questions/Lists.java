package Questions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lists {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<String>();
        Set<String > set1 = new HashSet<String>();
        String [] v = {"a","b","c","b","a"};
        for (String s:v){
            list1.add(s);
            set1.add(s);
        }
        System.out.println(set1.size()+ ""+list1.size() +"");
        HashSet set2 = new HashSet(list1);
        LinkedList list2 = new LinkedList(set1);
        System.out.println(set2.size()+""+ list2.size());
    }
}
