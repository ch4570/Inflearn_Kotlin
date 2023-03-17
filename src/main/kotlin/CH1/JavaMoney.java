package CH1;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof JavaMoney)) {
            return false;
        }

        JavaMoney money = (JavaMoney) obj;

        return money.amount == this.amount;
    }


    public JavaMoney plus(JavaMoney other) {
        return new JavaMoney(this.amount + other.amount);
    }

    @Override
    public String toString() {
        return "JavaMoney{" +
                "amount=" + amount +
                '}';
    }
}
