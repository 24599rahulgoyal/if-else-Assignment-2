import java.util.Scanner;
class Squarecheck{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  double l = sc.nextDouble();
  double b = sc.nextDouble();

  if(l == b){
	System.out.println("It is a Square");
}
  else{
	System.out.println("It is not a Square");
}
}
}
