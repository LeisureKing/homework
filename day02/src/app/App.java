package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {1,3,2,5,7,3,8,5};
        Sort.selectSort(a);
        System.out.println(Arrays.toString(a));


        Dog 旺财 = new Dog("旺财",45);
        Dog 阿黄 = new Dog("阿黄",67);
        System.out.println(旺财);
        System.out.println(阿黄);
        旺财.bite(阿黄);
    }
}