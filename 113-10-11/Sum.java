

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int number = 0;
        do {
            System.out.print("輸入數字：");
            number = Integer.parseInt(input.nextLine());//讀取字串轉成整數
            sum += number;
        } while(number != 0);
        System.out.println("總合：" + sum);
    }
}
