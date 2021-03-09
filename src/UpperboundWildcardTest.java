import java.util.Arrays;
import java.util.List;

public class UpperboundWildcardTest {
    public static void main(String[] args) {
         List<Integer> integerList= Arrays.asList(20,30,40,10);
         sumOfElements(integerList);
         List<Double> doubleList=Arrays.asList(30.2,40.4);
        sumOfElements(doubleList);




    }


    private  static double sumOfElements(List<? extends Number> list){//solution code ,USE OF UPPER BOUND
        double sum=0;
        for(Number num:list){
            sum=sum+num.doubleValue();

        }

        System.out.println(list+"sum of list is "+sum);
        return sum;
    }
//    private  static int sumOfElements(List<Number> list){//problem code
//        int sum=0;
//        for(Number num:list){
//            sum=sum+num.intValue();
//
//        }
//        return sum;
//    }
}
