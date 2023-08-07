package mini.tax;

public class TariffTable {
    /**
     * TAX_BASE : 과세표준
     * TARIFF : 세율
     * PROGRESSIVE_DEDUCTION : 누진공제
     */
    public static final long[] TAX_BASE = new long[]{
            0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000
    };

    public static final long[] TARIFF = new long[]{
            6, 15, 24, 35, 38, 40, 42, 45
    };

    public static final long[] PROGRESSIVE_DEDUCTION = new long[]{
            0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000
    };
}
