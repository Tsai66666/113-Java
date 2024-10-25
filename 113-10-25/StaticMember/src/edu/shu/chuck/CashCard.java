package edu.shu.chuck;

public class CashCard {
   private String number;
   private int balance;
   private int bonus;
   private final int BOUNSCASH = 10;
   private static int cardOrder;

    public CashCard(){
        setNumber("Unknown");
    }
    public CashCard(String number) {
        setNumber(number);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }

    public CashCard(String number, int balance) {
        setNumber(number);
        setBalance(balance);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }

    public CashCard(String number, int balance, int bonus) {
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
        System.out.printf("第 %d 張卡%n", ++this.cardOrder);
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance)
    {
        if(balance >= 0)
        {
            this.balance = balance;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }

    public void setBonus(int bonus)
    {
        if(bonus >= 0)
        {
            this.bonus = balance;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }

    public int getBonus(){
        return this.bonus;
    }



    //儲值
         public void store(int money){
        topUp(money);
        }

        public void store(String number, int money)
        {
            if(this.number.equals(number)){
                topUp(money);
            }
            else{
                System.out.println("卡號不符");
            }
        }

        private void topUp (int money){
            if(money >0) {
                this.balance += money;
                if (money > 1000) {
                    this.balance += money / 1000;
                }
            }
            else {
                System.out.println("儲值金額為負，來亂的");
            }
        }
    //扣款

    public void charge(String number , int money){
        if(this.number.equals(number))
        {
            deduction(money);
        }
        else{
            System.out.println("卡號不符");
        }
    }

    public void charge(String number, int money, int bonus){
        if(this.number.equals(number))
        {
            exchange(bonus);
            deduction(money);
        }
        else{
            System.out.println("卡號不符");
        }
    }

    private void deduction(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("餘額不足，可憐阿");
            }
        }
        else {
            System.out.println("扣除金額為負的，來亂的");
        }
    }

    private int exchange(int bonus){
        if(bonus > 0 && this.bonus >= bonus){
            this.bonus -= bonus;
            setBalance(this.balance + bonus * BOUNSCASH);
        }
        else {
            System.out.println("點數不足");
        }
        return this.bonus;
    }

}
