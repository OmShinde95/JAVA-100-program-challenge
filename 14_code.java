/*Question: A single character variable stores a grade letter such as ‘A’.
Without changing the variable’s declared type, show how to print both
the character itself and its underlying numeric representation, and
explain in your output which one is which using labels.
Brief Explanation: This checks whether you understand that char is
internally a numeric type in Java and how printing behavior differs
depending on whether the value is treated as a character or coerced
into a number — a subtle but frequently tested distinction.*/
class code{
  public static void main(Strings[] args){
    char a = 'A';
    System.out.println("Character : " + a);
    int v = a; //implicit wideing casting
    System.out.println("Underlying vlaue : " + v);
  }
}
