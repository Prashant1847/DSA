package step_1__learn_the_basics.lec_2__build_up_logical_thinking;

class Patterns{

  
  /*
    * * * *
    * * * *
    * * * *
    * * * *
    * * * *
*/

  void Pattern1(){
    for(int j=1; j<=5; j++){
      for(int i=1; i<=4; i++){
          System.out.print("* ");
      }
      System.out.println("");
    }
  }
 
  
  /*
  *
  * *
  * * *
  * * * *
  * * * * * 
  */

  void Pattern2(int rows){
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=i; j++){
          System.out.print("* ");
      }
      System.out.println("");
     }
  }


  /* 
  1
  1 2
  1 2 3 
  1 2 3 4
  1 2 3 4 5
  */
  void Pattern3(int rows){
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=i; j++){
          System.out.print(j + " ");
      }
      System.out.println("");
     }
  }


  /* 
  1
  2 2 
  3 3 3 
  4 4 4 4 
  5 5 5 5 5
  */
  void Pattern5(int rows){
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=i; j++){
          System.out.print(i + " ");
      }
      System.out.println("");
     }

  }


  /* 
  * * * * * 
  * * * * 
  * * *
  * * 
  *
  */


  void Pattern6(int rows){
    for(int i=5; i>=1; i--){
      for(int j=i; j>=1; j--){
          System.out.print("* ");
      }
      System.out.println("");
    }
  }



  /*
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * * 
  */

  void Pattern7(int rows){
    for(int i=1; i<=rows; i++){
      //space
      for(int j=1; j<=(rows- i); j++) System.out.print(" ");
      //star
      for(int j=1; j<=(2*i - 1); j++) System.out.print("*");
      //space
      for(int j=1; j<=(rows- i); j++) System.out.print(" ");
      System.out.println();
    }
  }


  void Pattern7_withSpaces(int rows){
    for(int i=1; i<=rows; i++){
      //space
      for(int j=1; j<=((rows- i) * 2); j++) System.out.print(" ");

      //star
      for(int j=1; j<=(2*i - 1); j++) System.out.print("* ");

      System.out.println();
    }
  }


/* 
  *
  **
  ***
  ****
  *****
  ****
  ***
  **
  *
 */
  void Pattern9(int rows){
    for(int i=1; i<= 2*rows -1; i++){
      int stars = i;
      if(i > rows)  stars = 2 * rows  - i;
      for(int j=1; j <= stars; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }


/*
  1
  0 1
  1 0 1
  0 1 0 1
  1 0 1 0 1
 */
 void Pattern10(int rows){
  for(int i=1; i<=rows; i++){
      for(int j=1; j<=i; j++){
          if(j % 2 == i % 2) System.out.print("1");
          else System.out.print("0");
      }
      System.out.println();
  }
 }
 void Pattern10_striverMethod(int rows){
    int start = 1;
    for(int i=0; i<rows; i++){
      if(i % 2 == 0) start = 1;
      else start = 0;

      for(int j=0; j<=i; j++){
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
 }



 /*
  1      1
  12    21
  123  321
  12344321
*/

 void Pattern12(int rows){
  for(int i=1; i<=rows; i++){
    //numbers
    for(int j=1; j<=i; j++) System.out.print(j);


    //spaces
    int spaces = 2 * (rows - i);
    for(int j=1; j<= spaces; j++) System.out.print(" ");

    //reverse number
    for(int j=i; j>=1; j--) System.out.print(j);

    //new line
    System.out.println();
  }
 }



 /*
  1 
  2 3 
  4 5 6 
  7 8 9 10 
  */

 void Pattern13(int rows){
  int number = 1;
  for(int i=1; i<=rows; i++){
    for(int j=1; j<=i; j++){
      System.out.print(number+ " ");
      number++;
    }
    System.out.println();
  }
 }



 /*
  A 
  A B 
  A B C 
  A B C D
 */

 void Pattern14(int rows){

   for(int i=1; i<=rows; i++){
     char alphabet = 'A';
     for(int j=1; j<=i; j++){
      System.out.print(alphabet+ " ");
      alphabet++;
    }
    System.out.println();
  }
 }



 /*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
  */
 void Pattern17(int rows){
    for(int i=1; i<=rows; i++){
      //space
      for(int j=1; j<=(rows- i); j++) System.out.print(" ");
      //star

      char alpha = 'A';
      for(int j=1; j<=(2*i - 1); j++) {
        System.out.print(alpha);
        if(j >= i) alpha--;
        else alpha ++;
      }
      
      System.out.println();
    }
 }




 /*
    E
    DE
    CDE
    BCDE

  */

 void Pattern18(int rows){
  for(int i=0; i<rows; i++){
    for(char ch = (char)('E' - i); ch <= 'E'; ch++){
      System.out.print(ch);
    }
    System.out.println();
  }
 }



/*
  *      *
  **    **
  ***  ***
  ********
  ***  ***
  **    **
  *      *
 */

 void Pattern20(int rows){
  int stars = 1;
  int spaces = (rows - 1) * 2;

  for(int i=1; i<=(2*rows -1); i++){
    if(i > rows){
      stars--;
      spaces += 2;
    }else{
      stars = i;
      spaces = (rows - i) * 2;
    }
    //stars
      for(int j=1; j<=stars; j++) System.out.print("*");

      //spaces
      for(int j=1; j<=spaces; j++) System.out.print(" ");

      //stars
      for(int j=1; j<=stars; j++) System.out.print("*");

      System.out.println();
  }
 }

 void Pattern21(int rows){
  for(int i=1; i<=rows; i++){
    for(int j=1; j<=rows; j++){
      if(j == 1 || j == rows || i == rows || i == 1) System.out.print("*");
      else System.out.print(" ");
    }
    System.out.println();
  }
 }

 void Pattern22(int rows){
   int numberChange = 0;
   int sameNumber = rows*2 -1;
   int number = rows;

    for(int i=0; i< (rows*2 -1); i++){
  
      for(int j=0; j < numberChange; j++){
        System.out.print(number);
        number--;
      }

      for(int j=0; j< sameNumber; j++) System.out.print(number);

      for(int j=0; j < numberChange; j++){
        number++;
        System.out.print(number);
      }

      System.out.println();

      if(i >= rows-1){
        numberChange--;
        sameNumber += 2;
      } 
      else{
        numberChange++;
        sameNumber -= 2;
      } 

     }
    }
 }


public class Index{
  public static void main(String[] args){
    Patterns generator = new Patterns();
    generator.Pattern21(4);
  }

}