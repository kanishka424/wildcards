import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardTest {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(23,34,5,6);
        printElements(integerList);
        List<Double> doubleList=Arrays.asList(23.1,34.5,56.5,55.3);
        printElements(doubleList);

    }

    private static void printElements(List<?> list){//HOW TO USE UNBOUNDED WILD CARDS
        for(Object obj:list){
            System.out.println(obj);
            System.out.println(obj.toString());
        }
    }
}
