import java.util.Arrays;
class PerfumeBottle {
 String name;
 float price;
 PerfumeBottle(String name, float price) {
 this.name = name;
 this.price = price;
 }
}
class Stack {
 private static final int MAX_SIZE = 100;
 private PerfumeBottle[] bottles;
 private int top;
 private int count;
 Stack() {
 bottles = new PerfumeBottle[MAX_SIZE];
 top = -1;
 count = 0;
 }
 void push(PerfumeBottle bottle) {
 if (count == MAX_SIZE) {
 System.out.println("Error: Stack overflow");
 return;
 }
 bottles[count] = bottle;
 count++;
 top = count - 1;
 System.out.printf("Bottle %s with price %.2f inserted successfully\n", 
bottle.name, bottle.price);
 }
 void pop() {
 if (count == 0) {
 System.out.println("Error: Stack underflow");
 return;
 }
 if (count == 1) {
 top = -1;
 count--;
 System.out.println("Bottle in the middle of the stack deleted successfully");
 return;
 }
 int index = count / 2;
 for (int i = index; i < count - 1; i++) {
 bottles[i] = bottles[i + 1];
 }
 count--;
 top = count - 1;
 System.out.println("Bottle in the middle of the stack deleted successfully");
 }
 public static void main(String[] args) {
 Stack stack = new Stack();
 // Example usage
 stack.push(new PerfumeBottle("Perfume 1", 100.0f));
 stack.push(new PerfumeBottle("Perfume 2", 200.0f));
 stack.push(new PerfumeBottle("Perfume 3", 300.0f));
 stack.push(new PerfumeBottle("Perfume 4", 400.0f));
 stack.push(new PerfumeBottle("Perfume 5", 500.0f));
 stack.pop();
 stack.pop();
 }
}
