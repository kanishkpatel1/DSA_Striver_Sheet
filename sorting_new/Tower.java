package sorting_new;

public class Tower {
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char x, char y, char z) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + x + " to " + z);
        } else {
            doTowers(topN - 1, x, z, y);
            System.out.println("Disk " + topN + " from " + x + " to " + z);
            doTowers(topN - 1, y, x, z);
        }
    }
}