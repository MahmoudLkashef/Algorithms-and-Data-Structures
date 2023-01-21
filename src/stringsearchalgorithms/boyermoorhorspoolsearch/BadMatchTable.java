package stringsearchalgorithms.boyermoorhorspoolsearch;

import java.util.HashMap;
import java.util.Map;

public class BadMatchTable {
    int missing;
        Map<Character,Integer> table ;

    public BadMatchTable(String pattern)
    {
        missing=pattern.length();
        table=new HashMap<>();

        for(int i=0; i<pattern.length()-1;i++)
        {
            table.put(pattern.charAt(i),pattern.length()-i-1);
        }
    }
    public int getValue(char character)
    {
        if(!table.containsKey(character))return missing;
        return table.get(character);
    }
}
