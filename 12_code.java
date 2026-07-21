/*Question: A senior engineer claims that a variable declared to hold
very large whole numbers (larger than what a standard 32-bit integer
can hold) will silently produce an incorrect result if the wrong data
type is chosen. Declare a variable meant to store the number of atoms
in a small sample (a number in the trillions), assign it correctly, and
print it to demonstrate the correct choice.
Brief Explanation: This tests knowledge of the range limitations of
Java’s numeric primitive types and awareness that silent overflow is a
real and dangerous bug, not just a theoretical concern. Candidates
must recognize which type is large enough*/
class code_11{
  public static void main(Strings[] args){
    int sample = 1000000000;
    sampe = sample + 2000000000;
     System.out.println(sample);
    long no_atoms = 1000000000;
    no_atoms = no_atoms + 2000000000;
    System.out.println(no_atoms);
  }
}
