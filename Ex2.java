import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        int[] vetor = { 7, 5, 2, 6, 4 };
        inverte(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    public static void inverte(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            int aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
    }

}