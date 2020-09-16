public class NumericalOperations{
  public static void main(String args[]){
    //Challenge 1
    double d1=37.9;
    double d2=1004.128;
    int i1=12;
    int i2=18;
    System.out.println(57.2*i1/i2+1);//Prediction:39.333
    System.out.println(57.2*((double)i1/i2)+1);
    //Prediction:39.333
    System.out.println(15-i1*(d1*3)+4);//Prediction:-1345.4
    System.out.println(15-i1*((int)d1*3)+4);
    //Prediction:-1421 (int rounds down)
    System.out.println(15-i1*(int)(d1*3)+4);
    //Predection:-1349 (int rounds down)


    
    //Challenge 2
    int n1=1234;
    int lastNum=n1%10;
    int rev= lastNum*1000;
  
    int n2= n1/10;
    int thirdNum= n2%10;
    int rev2= thirdNum*100;
  
    int n3= n2/10;
    int secondNum= n3%10;
    int rev3= secondNum*10;
  
    int n4= n3/10;
    System.out.println(rev+rev2+rev3+n4);
    
    int number= 123456;
    int placeValue=1;
    int small= number/placeValue;
    int Num=small%10;
    System.out.print(Num);
  
  }
}
