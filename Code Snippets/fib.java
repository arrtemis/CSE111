import java.math.BigDecimal;

public class fib {
  public static void main(String[] args) {
    BigDecimal[] fibNumbers = {
        new BigDecimal(17167680177565.0),
        new BigDecimal(27777890035288.0),
        new BigDecimal(44945570212853.0),
        new BigDecimal(72723460248141.0),
        new BigDecimal(117669030460994.0),
        new BigDecimal(190392490709135.0),
        new BigDecimal(308061521170129.0),
        new BigDecimal(498454011879264.0),
        new BigDecimal(806515533049393.0),
        new BigDecimal(1304969544928657.0),
        new BigDecimal(2111485077978050.0),
        new BigDecimal(3416454622906707.0),
        new BigDecimal(5527939700884757.0),
        new BigDecimal(8944394323791464.0),
        new BigDecimal(14472334024676221.0),
        new BigDecimal(23416728348467685.0),
        new BigDecimal("37889062373143906"), // 81st
        new BigDecimal("61305790721611591"), // 82nd
        new BigDecimal("99194853094755497"), // 83rd
        new BigDecimal("160500643816367088"), // 84th
        new BigDecimal("259695496911122585"), // 85th
        new BigDecimal("420196140727489673"), // 86th
        new BigDecimal("679891637638612258"), // 87th
        new BigDecimal("1100087778366101931"), // 88th
        new BigDecimal("1779979416004714189"), // 89th
        new BigDecimal("2880067194370816120"), // 90th
        new BigDecimal("4660046610375530309"), // 91st
        new BigDecimal("7540113804746346429"), // 92nd
        new BigDecimal("12200160415121876738"), // 93rd
        new BigDecimal("19740274219868223167"), // 94th
        new BigDecimal("31940434634990099905"), // 95th
        new BigDecimal("51680708854858323072"), // 96th
        new BigDecimal("83621143489848422977"), // 97th
        new BigDecimal("135301852344706746049"), // 98th
        new BigDecimal("218922995834555169026"), // 99th
        new BigDecimal("354224848179261915075")

    };
    BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5));
    BigDecimal n1 = new BigDecimal(1);
    BigDecimal n2 = new BigDecimal(2);
    BigDecimal a1 = (n1.add(sqrt5)).divide(n2);
    BigDecimal a2 = (n1.subtract(sqrt5)).divide(n2);
    BigDecimal fn = new BigDecimal(0);
    BigDecimal num;
    BigDecimal diff;
    for (int i = 0; i < fibNumbers.length; i++) {
      num = (a1.pow(i + 65)).subtract(a2.pow(i + 65));
      fn = num.divide(sqrt5);
      diff = fn.subtract(fibNumbers[i]);
      System.out.printf("f_%d = %.2f\n", i+65, fn);
      System.out.printf("%.2f\n", diff);
    }
    // System.out.println(fn);
  }
}
