

public class SwordsMan extends Role {
    @Override
    public void fight() {
        System.out.println("揮劍攻擊");
    }

    public  String toString() {
        return String.format("劍士 : %s%n", super.toString());
    }
}
