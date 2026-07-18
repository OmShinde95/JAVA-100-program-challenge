/*Question: A weather station stores today’s temperature in Celsius as
a variable. Using only that one variable and simple arithmetic,
compute and print the equivalent Fahrenheit value without creating
any additional named variable to hold the intermediate multiplication
result.
Brief Explanation: This tests comfort with combining arithmetic
expressions in a single statement and understanding operator
precedence, since the conversion formula involves both multiplication
and addition in a specific order.*/
class code8 {
  int celsius = 30;
  celsius = (celsius * 9/5) + 32;
  System.out.println(celsius);
}
