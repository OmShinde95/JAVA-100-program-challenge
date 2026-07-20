/*Question: A form collects a user’s age, height (with decimal
precision), first initial of their name, and whether they consent to
terms (yes/no). Choose and declare the most appropriate data type for
each of these four pieces of information, assign sample values, and
print them all in one line separated by commas.
Brief Explanation: This tests your ability to match real-world data to
the correct primitive type (integer, floating-point, character, boolean)
rather than defaulting to one type for everything. Interviewers look
for whether candidates default to String for everything, which is a
common beginner mistake.*/
class code_11{
  public staic void main(Strings[] args){
    double age = 73.5;
    double height = 5.5;
    String first_letter = 'O';
    String consent = true;
    System.out.println(age + "," + height + "," + first_letter + "," + consent);
  }
}
