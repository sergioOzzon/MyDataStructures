public class MyArrayList<T> {

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T item){
        list[size] = item;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(list[i]+ " ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
