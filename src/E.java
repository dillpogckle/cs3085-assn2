import java.math.BigDecimal;
import java.math.MathContext;

public class E {
    public static BigDecimal taylor(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        MathContext mc = new MathContext(20); // precision
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigDecimal.ONE.divide(new BigDecimal(Fac.factorial(i)), mc));
        }
        return sum;

    }
}
