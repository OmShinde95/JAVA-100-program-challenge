/*Question: A variable representing a bank account balance is declared
as one numeric type, but the bank later decides all balances must
support paise/cents (fractional currency). Show how you would
change the variable so that no data is lost, and print the balance after
adding a fractional deposit.
Brief Explanation: This checks whether you understand which
numeric types can hold fractional values and the consequences of
choosing an inappropriate type early in a design, a very common realworld
debugging scenario in placement interviews.*/
class code9{
  public static void main(Strings[] args){
    double b_b = 393593;
    b_b = b_b + 0.7358;
    System.out.printf(%.2f%n,b_b); 
  }
}
