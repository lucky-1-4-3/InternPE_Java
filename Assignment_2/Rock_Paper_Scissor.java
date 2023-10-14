package Assignment_2;
import java.util.*;
public class Rock_Paper_Scissor
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("please! enter how many times you want to play this game");
        int n=sc.nextInt();
        System.out.println("Here are the options you have to choose during playing game");
        System.out.println("0 :is for rock");
        System.out.println("1 :is for paper");
        System.out.println("2 :is for scissor");
        int computer_choice;
        int computer_won=0,my_choice,me=0;        
        for(int game=1;game<=n;game++)
        {
            Random rand=new Random();
            computer_choice=rand.nextInt(2);
            my_choice=sc.nextInt();
            switch(my_choice)
            {
                case 0:
                        System.out.println("you choose rock");
                        break;
                case 1:
                        System.out.println("you choose paper");
                        break;
                case 2:
                        System.out.println("you choose scissor");
                        break;
            }
            switch(computer_choice)
            {
                 case 0:
                        System.out.println("computer choose rock");
                        break;
                case 1:
                        System.out.println("computer choose paper");
                        break;
                case 2:
                        System.out.println("computer choose scissor");
                        break;
            }
            if(computer_choice==my_choice)
            {
                System.out.println("match tie");
            }
            else if(computer_choice==0 && my_choice==1)
            {
                System.out.println("you won and computer lost");
                me++;
            }
            else if(computer_choice==0 && my_choice==2)
            {
                System.out.println("computer won,you lost");
                computer_won++;
            }
            else if(computer_choice==1 && my_choice==0)
            {
                System.out.println("computer won,you lost");
                computer_won++;
            }
            else if(computer_choice==1 && my_choice==2)
            {
                System.out.println("you won,computer loose");
                me++;
            }
            else if(computer_choice==2 && my_choice==0)
            {
                System.out.println("you won,computer loose");
                me++;
            }
            else if(computer_choice==2 && my_choice==1)
            {
                System.out.println("computer won,you loose");
                computer_won++;
            }
            if(game==5)
            {
                break;
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("computer= "+computer_won);
        System.out.println("yours= "+me);
        System.out.println("-----------------------------------------------------------------");
        if(computer_won>me)
        {
            System.out.println("finally computer won beyonds all the sessions");
        }
        else if(computer_won<me)
        {
            System.out.println("finally you won beyond all the sessions");
        }
        else if(computer_won==me)
        {
            System.out.println("oops!match tie");
        }
        else
        {
            System.out.println("ha ha!you won,computer need more practice");
        }
    }
}