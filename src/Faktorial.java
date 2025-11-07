import java.math.BigInteger;

public class Faktorial {
    public Long faktorialLong(Long n) {
        Long sum = 1L;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
    public BigInteger faktorialBigInteger(long n) {
        BigInteger sum = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }


}
