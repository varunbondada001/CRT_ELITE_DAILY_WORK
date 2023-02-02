class Result {


    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<100;i++){
        list.add(0);
    }
    for(int value : arr){
            list.set(value, list.get(value)+1);
        }
        return list;

        
    }
}

