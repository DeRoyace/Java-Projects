import java.util.*;
public class MINIATURE_QUIZ_P
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name _____________");
        String n=sc.nextLine();
        System.out.println("Welcome "+n+"   Press 'S' to start or Press 'E' to end the program");
        char ch=(sc.next()).charAt(0);
        int correctans=0;int incorrectans=0;float per=0.0f;
        switch(ch)
        {
            case 'S':case 's':
            String Q[]={"1.Which is the capital of India?","Who is the President of India present currently?","3.What does Mohs scale measure?","4.Which of these is used to sterilise drining water and purify swimming pools?","5.Scientifically, which of these is not a tree?","6.Who wrote the famous poem 'If'?","7.Where is the headquater of UNESCO?","8.Which of these is the most widely used non-ferrous metal?","9.Which of these is not of the five inert gases?","10.Which one of the following is commonly known as blue vitrol and is used as a fungicide?","11.Which acid is present in apple?","12.Decomposers are also known as_____________.","13.Which one of the following options belong to phytoplanktons?","14.The __________ is the basis of MRI.","15.Who among the following gave the Left-Hand rule for the direction of force?"};
            String a[]={"a) Kolkata","a) Shri Ramnath Koveind","a) Density","a) Iodine","a) Teak","a) Lewis Carroll","a) Paris","a) Nickel","a) Boron","a) Potassium nitrate","a) Oxalic acid","a) Autotrophs","a) Algae","a) Resistance","a) Fleming"};
            String b[]={"b) New Delhi","b) Shri Pranab Mukherjee","b) Velocity","b) Chlorine","b) Banyan","b) Rudyard Kipling","b) New York","b) Aluminium","b) Xenon","b) Copper sulphate","b) Formic acid","b) Saprotrophs","b) Protozoa","b) Pressure","b) Maxwell"};
            String c[]={"c) Mumbai","c) Shri Venkaiah Naidu","c) Hardness","c) Potassium","c) Bamboo","c) Grimm Brothetrs","c) Geneva","c) Zinc","c) Krypton","c) Sodium carbonate","c) Malic acid","c) Tertiary consumers","c) Fungi","c) Magnetism","c) Oersted"};
            char anskey[]={'b','a','c','b','c','b','a','b','a','b','c','b','a','c','a'};
            char ans;int correct=0;
            int incorrect=0;
            System.out.println("\nGENERAL KNOWLEDGE QUESTIONS [Science, History and Civics, Literature]");
            System.out.println("Multiple Choice Questions(Each question comes with three optipns.Choose the correct answers from the given options:a, b or c):\n");
            for(int i=0;i<15;i++)
            {
                System.out.println(Q[i]);
                System.out.println(a[i]);
                System.out.println(b[i]);
                System.out.println(c[i]);
                System.out.println("Choose your answer from the given options:(a/b/c) and enter your answer.");
                ans=(sc.next()).charAt(0);
                if(ans==anskey[i])
                {
                    correct++;
                    System.out.println("CORRECT");
                }
                else
                {
                    incorrect++;
                    System.out.println("WRONG");
                    System.out.println("The correct answer is: "+anskey[i]);
                    ans=' ';
                }
                System.out.println();
            } // end of for loop
            correctans=correctans+correct;
            incorrectans=incorrectans+incorrect;
            System.out.println("---------------- RESULT ----------------");
            System.out.println("Number of correct answers:"+correctans);
            System.out.println("Number of incorrect answers:"+incorrectans);
            System.out.println(n+" you have scored "+correctans+" out of 15 questions");
            per=(float)((correctans*100)/15);
            System.out.println(n+" your percentage is:"+per+"%");
            if(per>=90)
                System.out.println("Excellent Work");
            else
            if(per>=80 && per<90)
                System.out.println("Very Good");
            else
            if(per<80 && per>=70)
                System.out.println("Good");
            else
            if(per<70 && per>=60)
                System.out.println("Satisfactory");
            else
            if(per<60 && per>=50)
                System.out.println("Fair");
            else
            if(per<50 && per>=40)
                System.out.println("Needs more updation");
            else
                System.out.println("Poor");
            char f;
            while(true)
            {
                System.out.println("\nPress 'F' or 'f' to finish the program");
                f=(sc.next()).charAt(0);
                if(f=='F' || f=='f')
                    System.exit(0);
            } // end of while loop
            case 'E':case 'e':
            System.exit(0);
            default:
            System.out.println("wrong choice");
        } // end of switch case
    } // end of main()
} // end of class