package Chapter3;

import Chapter3.sort.ArrayIns;

public class Main2 {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr = new ArrayIns(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(28);

        arr.display();

        System.out.println(arr.median());

        arr.sort();

        arr.display();
    }
}
