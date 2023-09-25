class Main {
    public static void main(String[] args) {
  
      int n1, n2 , lcm;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter number 1:");
      n1=s.nextInt();
      System.out.println("Enter number 2:");
      n2=s.nextInt();
      lcm = (n1 > n2) ? n1 : n2;
      while(true) {
        if( lcm % n1 == 0 && lcm % n2 == 0 ) {
          System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
          break;
        }
        ++lcm;
      }
    }
  }