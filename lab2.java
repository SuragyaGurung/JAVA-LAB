import java.util.Scanner;
public class lab2 {
public static void main(String[] args)
{
    int roll_no,marks;
    String name,grade;
  Scanner scanner= new Scanner(System.in);
  System.out.println("enter your name:");
  name = scanner.nextLine();
  System.out.println("enter your roll_no:");
  roll_no = scanner.nextInt(); 
  scanner.nextLine();
  System.out.println("enter your marks(0-100):");
  marks = scanner.nextInt();
  if (marks>90) 
  {
    grade= "A+";
  }
  else if (marks>=80) 
  {
    grade= "A";  
  }
  else if (marks>=70) 
  {
    grade= "B+";
  }
  else if (marks>=60) 
  {
    grade= "B";
  }
  else if (marks>=50) 
  {
    grade= "C";
  }
  else if (marks>=40) 
  {
    grade= "D";
  }
  else 
  {
    grade= "NG";
  }
  System.out.println("Name = "+name);
  System.out.println("Roll No = "+roll_no);
  System.out.println("Marks = "+marks);
  System.out.println("Grade = "+grade);
  scanner.close();
}
}