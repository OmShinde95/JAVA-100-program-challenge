/*Question: A shop’s billing counter wants a receipt header printed
every time the program runs. Print a receipt header that includes a
title line, a dashed separator line of exactly 20 dashes, and the text
“Thank you for shopping!” — all using appropriately separated
statements.
Brief Explanation: This tests careful, exact text formatting and
shows whether you understand how to construct a separator
programmatically (rather than typing dashes manually) versus as a
literal string. Both approaches are valid, but consistency matters.*/
class code4{
  public static void main(String[] args){
    String sp = "-".repeat(20);
    System.out.println("SUPER MARKET");
    for(int i = 1;i<=20;i++){
      System.out.print("-");
    }//First way by for loop.
    System.out.print("\n"+sp);//Second way by .repeat() method from string class.
      System.out.print("\nThank you for shopping!");
    
  }
}
