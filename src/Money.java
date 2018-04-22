/**
 * @author johnny
 * 枚举 第五章练习21
 */

public enum Money {
    ONE, FIVE, TEN, FIFTY, HUNDRED;
}

class test21 {
    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println("" + money + " " + money.ordinal());
        }
    }
}

class test22 {
    Money money;

    public test22(Money money) {
        this.money = money;
    }

    public void describe() {
        switch (money) {
            case ONE:
                System.out.println(1);
                break;
            case FIVE:
                System.out.println(5);
                break;
            case TEN:
                System.out.println(10);
                break;
            case FIFTY:
                System.out.println(50);
                break;
            case HUNDRED:
                System.out.println(100);
                break;
                default:System.out.println("No such money");
        }

    }

    public static void main(String[] args) {
        Money money=Money.FIFTY;
        test22 machine=new test22(money);
        machine.describe();
    }
}
