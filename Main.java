package breakandcontinue;
public class Main {
    public static void main(String[] args)
    {
  int i = 10;
  int j = 5;
  for(i=0;i<5;i++){
      for(j=0;j<=i;j++){
          if(i==2)
          {
              break;
          }
          if(j==3)
          {
              continue;
          }
          System.out.print(j+"  ");
      }
      {
          System.out.println();
      }
  }
  }

}