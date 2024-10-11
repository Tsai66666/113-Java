

public class XY2 {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int[]  row : cords) {         //int要加[]
            for(int c : row) {  //巡行二維陣列  y為行數，cords[x].為第x列的陣列
                System.out.printf("%2d", c);//印出陣列元素
            }
            System.out.println();//換行
        }
    }
} 
