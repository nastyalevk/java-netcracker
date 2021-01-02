package strategy.lambdaStrategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static strategy.lambdaStrategy.Discounter.*;

public class LambdaDiscounterDriver {
    public static void main(String[] args) {
        Discounter staffDiscounterAnonType = new Discounter() {
            @Override
            public BigDecimal apply(BigDecimal amount) {
                return amount.multiply(BigDecimal.valueOf(0.5));
            }
        };
        final BigDecimal discountedValueAnonType = staffDiscounterAnonType
                .apply(BigDecimal.valueOf(100));
        System.out.println(discountedValueAnonType + "  " + BigDecimal.valueOf(50));


        Discounter staffDiscounterWLambda = amount -> amount.multiply(BigDecimal.valueOf(0.5));
        final BigDecimal discountedValueWLambda = staffDiscounterWLambda
                .apply(BigDecimal.valueOf(100));
        System.out.println(discountedValueWLambda + "  " + BigDecimal.valueOf(50));


        List<Discounter> allDiscounts = Arrays.asList(christmas(), newYear(), easter());
        BigDecimal amount = BigDecimal.valueOf(100);
        final Discounter combinedDiscounter = allDiscounts
                .stream()
                .reduce(v -> v, Discounter::combine);

        System.out.println(combinedDiscounter.apply(amount));


        final Function<BigDecimal, BigDecimal> combinedDiscounters = Discounter
                .christmas()
                .andThen(newYear());

        System.out.println(combinedDiscounters.apply(BigDecimal.valueOf(100)));
    }
}
