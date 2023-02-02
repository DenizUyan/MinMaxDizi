import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int sonsayi = list.length;
        int max = list[sonsayi-1];

        System.out.println("Min:"+min);
        System.out.println("Max:"+max);

    }
}