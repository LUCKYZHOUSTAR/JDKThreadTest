package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:chaoqiang.zhou
 * @Description:
 * @Date:Create in 15:29 2017/5/11
(params) -> expression
(params) -> statement
(params) -> { statements }
 */
public class Lambda {


    //()可以代替匿名替换类的信息
    public void runable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java8，too much coe for too little");
            }
        }).start();

        //java8
        new Thread(() -> System.out.println("in java8,lambca expression")).start();


    }


    public void list() {

        // Java 8之前：
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature);
        }


        features.forEach(n -> System.out.println(n));
    }



}
