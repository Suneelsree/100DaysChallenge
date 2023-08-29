class Main {
  public static void main(String[] args) {

    int num ,reversed = 0;
    System.out.println("Enter number want to reverse");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    System.out.println("Original Number: " + num);
    while(num != 0) {
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      // remove the last digit from num
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
  }
}
