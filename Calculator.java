/**
 * Description : This program is inspired from python running on my Systems Comand Prompt terminal.
 * I started this program witht the idea of making a calculator
 * Later i open my window and thought about what if i make it feel like python running
 * But its actually JAVA my old buddy :-)
 * ------------------------------------------------------------------------------------------------
 * @Rohit_Roy 
 * @version 2021.0 (created on 01.12.2021)
 * @Student, Bsc CS Hons. (1st Year)
 * @SXC, Kolkata
 * ------------------------------------------------------------------------------------------------
 */
import java.util.*;
public class Calculator
{
    static String inputs; // gets the string from user
    static double num[]; // to store the numbers or the operands
    static char opera[]; // to store the operators
    static int size; // stores the number of operators

    public static void accept()
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Your Calculator is here...");
        System.out.print("\n>>> ");
        inputs = sc.nextLine();
        int len=inputs.length();
        size=0;
        for(int i=0;i<len;i++)
        {
            char ch=inputs.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' || ch=='^')
            {
                size++;
            }
        }

    } // end of accept()
    
    // Recursive function to store operators and operands seperately in arrays:
    public static void fillArray(String x, String temp, int i, int j)
    {
        //System.out.println(i + ", " +j);
        if(j==size+1 || x.equals(""))
            System.out.print("");
        else
        {
            char ch=x.charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' || ch=='^')
            {
                if(!temp.equals(""))
                {
                    num[j]=Double.parseDouble(temp);
                    j+=1;
                }
                opera[i]=ch;
                fillArray(x.substring(1),"",i+1,j);
            }
            else if(Character.isDigit(ch) || ( ch=='.' && Character.isDigit( x.charAt(1) ) ) )
            {
                temp+=ch;
                fillArray(x.substring(1),temp,i,j);
            }
            else
            {
                if(!temp.equals(""))
                {
                    num[j]=Double.parseDouble(temp);
                    j+=1;
                }
                fillArray(x.substring(1),"",i,j);
            }
        }
    } // end of fillArray()
    
    //inputsulations of the instructuions given by user:
    public static double operator(char c, double a, double b)
    {
        double cal=0.0d;
        switch(c)
        {
            case '+':
            cal=a+b;
            break;

            case '-':
            cal=a-b;
            break;

            case '*':
            cal=a*b;
            break;

            case '/':
            cal=a / b;
            break;
            
            case '%':
            cal=a % b;
            break;

            case '^':
            cal=Math.pow(a,b);
            break;

        }
        return cal;
    } // end of operator()
    
    public static void main(String[] args)
    {
        accept();
        if(inputs.equals("exit()") || inputs.equals("exit(0)"))
        {
            System.exit(0);
        }
        else
        {
            num=new double[size+1];
            opera=new char[size];
            fillArray(inputs+" ","",0,0);
            
            double result=0.0d;
            int j=0;
            for(int i=0;i<size+1;i++)
            {      
                if(j<size)
                {
                    result=operator(opera[j],num[i],num[i+1]);
                    num[i+1]=result;
                    j+=1;
                }
            }
            
            if(size>0)
                System.out.println(result);
            else
                System.out.println(inputs);
        }
        main(args); // calls the main function
    }// end of main()
} // end of class
