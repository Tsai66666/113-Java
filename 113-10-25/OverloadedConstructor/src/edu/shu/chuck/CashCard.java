package edu.shu.chuck;

public class CashCard {
   private String number;
   private int balance;
   private int bonus;

   public CashCard(){
       setNumber("Unknown");
   }
   public CashCard(String number){setNumber(number);}

    public CashCard(String number, int balance) {
        setNumber(number);
        setBalance(balance);
    }

    public CashCard(String number, int balance, int bonus) {
        setNumber(number);
        setBalance(balance);
        setBonus(bonus);
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

    public void charge(int money){
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

    public int exchange(int bonus){
        if(bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }

}
