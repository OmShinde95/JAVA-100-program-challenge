/*Question: A security system checks three separate sensor states
(each true or false) and should report a single combined status: alert
should trigger only if at least two of the three sensors are
simultaneously triggered. Using only logical and comparison
operators (no if-statements), compute and print this combined boolean
result directly.
Brief Explanation: This tests the ability to express conditional logic
purely through boolean and relational operators, without branching
statements — a skill often probed to check true understanding of
boolean algebra versus reliance on if-else scaffolding.*/
class code_18{
  public static void main (String[] args){
    boolean s = true;
    boolean s1 = true;
    boolean s2 = false;
    boolean alert = (s&&s1||s1&&s2||s2&&s);
    System.out.println(alert);
  }
}
