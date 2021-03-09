import java.util.ArrayList;
import java.util.List;

public class LowerboundedWildcardTest {
    public static void main(String[] args) {
        List<Object> objectList=new ArrayList<>();
        addNumbers(objectList);
        List<Number> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        addNumbers(integerList);

    }

    private static void addNumbers(List<? super Integer> list){//USE OF LOWER BOUND WILDCAARDS
        for (int i=0;i<10;i++){
            list.add(i);
        }

        System.out.println(list);
    }
}
