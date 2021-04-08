package DSAlgorithms;

public class Array {
    private int[] items;
    private int count;

    //        int [] arr = {10,20,30,40,50};
//        System.out.println(Arrays.toString(arr));
    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];

                items = newItems;
            }

            items[count++] = item;
        }
    }

    public void removeAt(int index){
        if(index < 0 || index >=count )
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
            count--;
        }
    }
}
