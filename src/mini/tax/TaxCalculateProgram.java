package mini.tax;

public class TaxCalculateProgram {
    private long[] taxBaseDiffs;
    private long taxByTeriff = 0;
    private long taxByProgressiveDeduction = 0;

    public TaxCalculateProgram() {
        System.out.println("[과세금액 계산 프로그램]");

        taxBaseDiffs = new long[TariffTable.TAX_BASE.length - 1];
        for (int i = 0; i < TariffTable.TAX_BASE.length - 1; i++) {
            taxBaseDiffs[i] = TariffTable.TAX_BASE[i + 1] - TariffTable.TAX_BASE[i];
        }
    }

    public void calculate(long salary) {
        taxByTeriff = 0;
        for (int i = TariffTable.TAX_BASE.length - 1; i >= 0; i--) {
            if (salary > TariffTable.TAX_BASE[i]) {
                taxByProgressiveDeduction = salary * TariffTable.TARIFF[i] / 100 - TariffTable.PROGRESSIVE_DEDUCTION[i];
                long lastSection = salary - TariffTable.TAX_BASE[i];
                long laseSetionTax = lastSection  * TariffTable.TARIFF[i] / 100;

                for (int j = 0; j < i; j++) {
                    long sectionTax = taxBaseDiffs[j] * TariffTable.TARIFF[j] / 100;
                    taxByTeriff += sectionTax;
                    System.out.printf("%10d * %2d%% =\t%10d\n", taxBaseDiffs[j], TariffTable.TARIFF[j], sectionTax);
                }
                taxByTeriff += laseSetionTax;
                System.out.printf("%10d * %2d%% =\t%10d\n", lastSection, TariffTable.TARIFF[i], laseSetionTax);
                break;
            }
        }
    }

    public void printByTariff() {
        System.out.printf("[세율에 의한 세금]:\t\t%10d", taxByTeriff);
    }

    public void printByProgressiveDeduction() {
        System.out.printf("[누진공제 계산에 의한 세금]:\t%10d", taxByProgressiveDeduction);
    }
}


