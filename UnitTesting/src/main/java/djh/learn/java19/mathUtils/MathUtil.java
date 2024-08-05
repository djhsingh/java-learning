package djh.learn.java19.mathUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathUtil {

    public int add(int a, int b){
        return a+b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int sub(int a, int b){
        return a-b;
    }


    public int div(int a, int b) throws Exception{
        if(a==0 || b==0){
            throw new RuntimeException("Dividing by Zero");
        }
        return a/b;
    }

    public boolean isEven(int a){
        return a%2==0;
    }

    public Integer divForNull(int a, int b) throws Exception{
        if(a==0 ){
            return null;
        }
        return a/b;
    }

    public int random(int limit){
        return new Random().nextInt(limit);
    }

    public int[] duplicateArray(Integer[] numbers){
        return Arrays.stream(numbers).mapToInt(e-> e*2).toArray();
    }

    public List<Integer> duplicateArray(List<Integer> numbers){
        return numbers.stream().map(e-> e*2).collect(Collectors.toList());
    }
}
