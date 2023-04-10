import java.util.Scanner;
public class matrix
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
System.out.print("Enter the number of rows and colums");
int r=s1.nextInt();
int c=s1.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter the element of matrix");
for(int i=0;i<r;i++)
{
for(int j=0;i<r;j++)
{
a[r][c]=s1.nextInt();
}
}
System.out.println("matrix is");
for(int i=0;i<r;i++)
{
for(int j=0;i<r;j++)
{
System.out.print(a[i][j]);
}
}


}
}
