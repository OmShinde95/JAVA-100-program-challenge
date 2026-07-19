/*Question: A quiz scoring system uses a variable to track a player’s
score, which starts at zero. Three separate rounds add different fixed
point values to the score, and one round deducts points for a wrong
answer. Print the score after each of the four updates on separate
lines, showing its evolving state.
Brief Explanation: This tests understanding that a variable retains
its updated value across multiple operations, and that the order of
updates directly affects intermediate outputs — an important mental
model for later loop-based accumulation problems.*/
class code10{
  public static void main (String[] args){
    //start
    double score = 0;
    //First round
    score = score + 1.50;
    System.out.printf("%.2f%n",score);
    //Second round
    score = score + 2.50;
    System.out.printf("%.2f%n",score);
    //Third round
    score = score + 3.50;
    System.out.printf("%.2f%n",score);
    //Fourth round
    score = score - 1; // Wrong answer didduct marks
    System.out.printf("%.2f%n",score);
    
  }
}
