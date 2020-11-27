package Class2_java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap
{

public static void main(String[] args)
{
// TODO Auto-generated method stub
Map<String, List<String>> map= new HashMap<String, List<String>>();
List<String> One = new ArrayList<String>();
One.add("Aayush");
One.add("Aakash");
One.add("Srijan");

List<String> Two = new ArrayList<String>();
Two.add("Utkarsh");
Two.add("Aditya");
Two.add("Anirudh");

map.put("CS", One);
map.put("IT", Two);

System.out.println("Fetching Keys and their values");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values );

}

}
}