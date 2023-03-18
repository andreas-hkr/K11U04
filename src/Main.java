import java.util.Arrays;

public class Main {
    static void arraycopy(double[] from, int fromIndex, double[] to, int toIndex, int count) {
        for (int i=0, f=fromIndex, t=toIndex; i < count; i++, f++, t++) {
            to[t] = from[f];
        }
    }

    public static void main(String[] args) {
        // Skapa en metod som fungerar som System.arraycopy
        //  - Array att kopiera från
        //  - Startindex i "frånarrayen"
        //  - Array att kopiera till
        //  - Startindex i "tillarrayen"
        //  - Antal komponenter/element att kopiera

        double[] from = {1, 2, 3, 4, 5};
        double[] to = {9, 8, 7, 6, 5};

        arraycopy(from,1,to,2,2);

        System.out.println(Arrays.toString(from));
        System.out.println(Arrays.toString(to));
    }
}