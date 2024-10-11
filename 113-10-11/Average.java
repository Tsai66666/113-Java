

public class Average {
    public static void main(String[] args) {
        long sum = 0;
        for(String arg : args) {    //args是字串陣列所以用String
            sum += Long.parseLong(arg); //字串轉成整數
        }
        System.out.println("平均：" + (double) sum / args.length); //args.length是字串陣列的長度
    }
}
