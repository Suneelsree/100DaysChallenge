class FrequencyCount{

    public static void main(String[] args) {
        String str ;
      char ch;
      Scanner s=new Scanner(System.in);
      System.out.println("enter String");
      str=s.nextLine();
       System.out.println("enter Character");
       ch=s.nextLine();
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
