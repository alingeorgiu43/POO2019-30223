import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleMatrix extends GenericMatrix<Double> {
	@Override
	protected Double add(Double o1, Double o2) {
		return o1 + o2;
	}

	@Override
	protected Double multiply(Double o1, Double o2) {
		double o3 = 01 * 02;
		BigDecimal bd = new BigDecimal(o3).setScale(2, RoundingMode.HALF_UP);
		double newO3 = bd.doubleValue();
		return newO3;
	}

	@Override
	protected Double zero() {
		return 0.00;
	}

}
