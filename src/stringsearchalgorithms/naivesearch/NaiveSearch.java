package stringsearchalgorithms.naivesearch;

public class NaiveSearch {
    public static void search(String toFind , String toSearch)
    {
        if(toFind==null || toSearch==null)throw new NullPointerException();

        int result=0;
        for(int startIndex=0;startIndex<=toSearch.length()-toFind.length() ; startIndex++)
        {
            int matchCount=0;
            while(toFind.charAt(matchCount) == toSearch.charAt(startIndex+matchCount))
            {
                matchCount++;

                //match found
                if(toFind.length()==matchCount){startIndex+=matchCount-1;result++;break;}
            }
        }
        System.out.println("Match Found = "+result);
    }
}
