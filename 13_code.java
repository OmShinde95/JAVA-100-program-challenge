/*Question: A grading system stores a student’s percentage as a
floating-point value. Demonstrate what happens when this percentage
is directly assigned to a variable meant to store only whole-number
grades, and print the resulting value along with a short observation of
what changed.
Brief Explanation: This tests understanding of implicit versus
explicit conversions between floating-point and integer types, and
specifically the truncation (not rounding) behavior that occurs, which
is a very common source of off-by-one bugs in placement rounds.*/
class code_11{
  public static void main(Strings[] args){
    float grade = 97.43f;
    System.out.println(grade);
    int D_grade = (int)grade; //Explicit casting lossy conversion of 0.43.
    System.out.println(D_grade);
  }
}
