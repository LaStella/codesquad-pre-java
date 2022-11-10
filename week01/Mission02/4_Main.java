import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
            MyDate date1 = new MyDate(30, 2, 2000);
            System.out.println(date1.isValid());
            MyDate date2 = new MyDate(2, 10, 2006);
            System.out.println(date2.isValid());

//		date1.day =10;   에러
//		date1.month = 3; 에러
//		date1.year = 2020; 에러

    }
}
