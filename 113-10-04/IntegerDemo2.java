
public class IntegerDemo2 {
    public static void main(String[] args) {
        int data1 = 200;
        Integer wrapper1 = data1;     //自動裝箱
        Integer wrapper2 = 200;  
        int data2 = wrapper2;       //自動拆箱
        
        //如果兩個值介於-128到127之間，則會指向同一個物件
       
        //wrapper1和wrapper2皆為參考型別，所以使用==比較的是記憶體位置
        if(wrapper1 == wrapper2) {
            System.out.println("wrapper1 == wrapper2");
        } else {
            System.out.println("wrapper1 != wrapper2");
        }
    }
}
