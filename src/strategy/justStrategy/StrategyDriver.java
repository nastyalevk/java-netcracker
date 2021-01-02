package strategy.justStrategy;

import strategy.justStrategy.api.Discounter;
import strategy.justStrategy.impl.EasterDiscounter;

import java.math.BigDecimal;

public class StrategyDriver {
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter
                .applyDiscount(BigDecimal.valueOf(100));

        System.out.println(discountedValue + "  " + BigDecimal.valueOf(50));
    }
}
