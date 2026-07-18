/*Question: Two variables hold a person’s savings for January and
February. Without using a third variable of a different name, swap
their values so that January’s variable holds February’s amount and
vice versa, then print both.
Brief Explanation: This introduces the classic variable-swap logic
problem. It tests whether you understand assignment order and how
overwriting a variable destroys its previous value unless handled
carefully — a concept that appears constantly in later array and
sorting problems.*/
class code7{
  int jan = 4049;
  int feb = 8920;
  jan = jan + feb; // total = container1 + container2  --> store total in any one container 
  feb = jan - feb; // container2 = total - container1  
  jan = jan - feb; // container1 = total - container2
System.out.println(jan);
System.out.println(feb);
}
