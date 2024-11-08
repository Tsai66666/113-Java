public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01; // 預設佣金比例為0.01
        this.grossSales = 0; // 預設銷售金額為0
        this.orderCount = 0; // 預設沒有任何訂單
        //預設commissionRate = 0.01
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
        this.grossSales = 0; // 初始銷售金額為0
        this.orderCount = 0; // 初始沒有訂單
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        if (orderCount >= orderArray.length) {
            Order[] newOrderArray = new Order[orderArray.length * 2];
            System.arraycopy(orderArray, 0, newOrderArray, 0, orderArray.length);
            orderArray = newOrderArray; // 更新訂單陣列
        }

        // 新增訂單
        Order order = new Order(itemName, itemPrice, amount);
        orderArray[orderCount] = order;
        orderCount++; // 增加訂單數量
        //*************************
        //(加分項)若陣列長度不足，將陣列長度x2
        //(必要)新增order到orderList
        //*************************
    }

    public double getGrossSales() {
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            total += orderArray[i].totalSale(); // 累加每個訂單的總銷售額
        }
        return total;

        //*************************
        //計算總銷售額，並回傳
        //*************************
    }


    public String getOrders() {

        String orders = "";
        for (int i = 0; i < orderCount; i++) {
            orders += orderArray[i].toString(); // 累加每個訂單的內容
        }
        return orders;

        //****************************************
        //將所有oder的內容，整合為一個字串，並回傳
        //****************************************
    }



public double salary() {
    return getGrossSales() * this.commissionRate;
    //****************************************
    //利用getGrossSales()計算薪資
    //****************************************
}

public String toString() {
    return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
            this.id, this.name, this.grossSales, this.commissionRate, salary() );
}
}

