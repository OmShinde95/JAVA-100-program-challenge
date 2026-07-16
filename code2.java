/*Question: Write a program that reads nothing from the user but
declares three separate pieces of information about a fictional
employee — an ID number, a department name, and a joining year —
directly in the code, then prints them in a single formatted line: ID:
<id>, Dept: <dept>, Year: <year>.
Brief Explanation: This tests whether you can correctly mix multiple
data types in one print statement and understand string concatenation
versus separate print calls. Watch how spacing and punctuation must
match exactly.*/
class code2{
  public static void main(String[] args){
    String Emp_ID = "Emp101";
    char Dept = "R&D";
    String Date = 16/7/26;

    System.out.println("Employee ID =" + Emp_ID +',' + "Department =" + Dept + ',' + "Date =" + Date);
      
  }
}
