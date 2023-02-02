class Result {
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
    for(int i:a){
        if(mp.containsKey(i)){
            mp.put(i,mp.get(i)+1);
        }
        else{
            mp.put(i,1);
        }
    }
      for (Map.Entry<Integer,Integer> e : mp.entrySet()){
         if(e.getValue()==1) return e.getKey();
      }
    
    return -1;
    }

}
