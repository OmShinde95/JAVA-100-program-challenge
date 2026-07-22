/*Question: A survey stores answers as true/false values for five
separate yes-or-no questions. Store all five responses using the most
memory-appropriate type, then print how many of the five were
answered “true” without using any advanced counting structures —
just the five individual variables.
Brief Explanation: This tests correct use of the boolean type and
basic conditional counting logic using individual variables rather than
a collection, reinforcing fundamentals before arrays are introduced.*/
class code{
  public static void main(Stings[] args){
     boolean a = true;
     System.out.println("Are you roll no 1 ? : " + a);
     boolean b = true;
     System.out.println("Are your friends Gay ? : " + b);
     boolean c = false;
     System.out.println("Do you have Girlfriend ? : " + c);
     boolean d = true;
     System.out.println("Do you have Ex ? : " + d);
     boolean e = true;
     System.out.println("Are you Happy ? : " + e);
     
     int i = 0;
    
     if(a==true) {
         i++;
     }
    if(b==true) {
        i++;
    }
    if(c==true) {
        i++;
    }if(d==true) {
        i++;
    }
    if(e==true) {
        i++;
    }
    System.out.println("No. of true answers : " + i);
  }
}
