package stringsearchalgorithms.boyermoorhorspoolsearch;

public class BoyerMooreHorspool{
    public static void search(String pattern , String toSearch)
    {
        int result=0;
        if(pattern==null || toSearch==null)throw new NullPointerException();

        BadMatchTable badMatchTable=new BadMatchTable(pattern);

        int currentStartIndex=0;
        while (currentStartIndex<=toSearch.length()-pattern.length())
        {
            int charLeftToMatch=pattern.length()-1;
            while(charLeftToMatch >=0 &&
                    pattern.charAt(charLeftToMatch)== toSearch.charAt(currentStartIndex+charLeftToMatch))
            {
                charLeftToMatch--;
            }
            if(charLeftToMatch < 0)
            {
                currentStartIndex+=pattern.length();
                result++;
            }
            else
            {
                currentStartIndex+=badMatchTable.getValue(toSearch.charAt(currentStartIndex+pattern.length()-1));
            }
        }
        System.out.println(result);
    }

}
