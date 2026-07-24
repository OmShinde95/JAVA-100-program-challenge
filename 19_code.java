/*Question: A counter used in an embedded device needs to be
incremented after being read, but a separate log needs to record the
value before incrementation happened. Demonstrate, using a single
expression involving increment operators, how the pre-increment and
post-increment behavior differs by printing both scenarios clearly
labeled.
Brief Explanation: This tests precise understanding of the difference
between pre- and post-increment operators within expressions, a
classic and frequently misunderstood interview trap, especially when
such operators are combined with assignment in the same line.*/
class code{
  public static void main(String[] args){
    int a = 2;
    int logged = a++;
    System.out.println("Logged vlaue = " + logged + "post-increment = " + a);
    int b =2;
    int logged2 = ++b;
     System.out.println("Logged vlaue = " + logged2 + "pre-increment = " + a);
  }
}
