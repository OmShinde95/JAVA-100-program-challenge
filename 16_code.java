/*Question: A delivery company charges a base fee plus an amount per
kilometer, and additionally applies a small surcharge only if the
distance exceeds a certain threshold conceptually (though for this
question, just compute the base scenario without conditionals). Given
a fixed distance and per-km rate, compute and print the total charge
using arithmetic operators only.
Brief Explanation: This is a straightforward test of arithmetic
operator usage and operator precedence in a real-world billing
formula. The trap is candidates misordering multiplication and
addition due to unclear formula construction.*/
class code{
  public static void main(String[] args){
    int base_amt = 35;
    double per_km_charge = 10;
    double fixed_dist = 25;
    double dist_traveled = 26.6;
    double formula = base_amt + fixed_dist * per_km_charge + (dist_traveled - fixed_dist) * per_km_charge;
    System.out.println("Total Charge : " + formula + "/-");
    
  }
}
