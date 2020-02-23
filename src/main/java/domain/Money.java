package domain;

public class Money {
    private final int money;

    public Money(int money) {
        validateMoney(money);
        this.money = money;
    }

    private void validateMoney(int money) {
        validateMoneyRange(money);
        validateMoneyUnit(money);
    }

    public int getNumberOfTickets() {
        return this.money / 1000;
    }

    private void validateMoneyRange(int money) {
        if (money < 0 || money > 50000) {
            throw new IllegalArgumentException("0원 이상, 5만원 이하 금액만 구매 가능합니다.");
        }
    }

    private void validateMoneyUnit(int money) {
        if (money % 1000 != 0) {
            throw new IllegalArgumentException("천 원 단위로만 구매 가능합니다.");
        }
    }

    public int getMoney() {
        return this.money;
    }
}
