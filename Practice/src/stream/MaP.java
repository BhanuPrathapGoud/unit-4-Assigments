package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaP {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bhanu","Prathap","goud");
        List<String>list1 =  list.stream().map(iteam -> iteam.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
