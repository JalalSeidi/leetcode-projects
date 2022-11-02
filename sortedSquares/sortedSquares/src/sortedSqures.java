public class sortedSqures {

    public int[] sortedSquares(int[] array) {
        int arrayLength = array.length;
        int[] sortedSquare = new int[arrayLength];
        int start = 0, end = arrayLength-1;

        for(int i = arrayLength-1; i >= 0; i--) {
            int number;

            if (Math.abs(array[start]) > Math.abs(array[end])) {
                number = array[start++];
            } else {
                number = array[end--];
            }
            sortedSquare[i] = number*number;
        }

        return sortedSquare;
    }

    public static void main(String[] args) {
       sortedSqures sortedSqures = new sortedSqures();
       sortedSqures.sortedSquares(new int[]{-7, -3, 2, 3, 11});
    }
}
