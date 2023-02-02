class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    List<Integer> res = new ArrayList<>();
        for(String s:queries){
            int c = 0;
            for(String s1:strings){
                if(s.equals(s1))
                c++;
            }
            res.add(c);
        }
        return res;

        }
    }

