public class ConditionalStstements {
    public static void main(String args[])
    {
        int day=3;
        //using if else
        if(day==0)
        {
            System.out.println("Sunday");
        }
        else if(day==1)
        {
            System.out.println("Monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if(day==3)
        {
            System.out.println("Wednesday");
        }
        else if(day==4)
        {
            System.out.println("Thursday");
        }
        else if(day==5)
        {
            System.out.println("Friday");
        }
        else if(day==6)
        {
            System.out.println("Saturday");
        }
        else{
            System.out.println("Invalid");
        }
        //using ternary operator
        System.out.println(day==0?"Sunday":day==1?"Monday":day==2?"Tuesday":day==3?"Wednesday":day==4?"Thursday":day==5?"Friday":day==6?"Saturday":"Invalid Number");
        //using switch 
        switch(day)
        {
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            default:System.out.println("Invalid day");
        }
        //using switch expression
        switch(day)
        {
            case 0->System.out.println("Sunday");
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            default->System.out.println("Invalid day");
        }
    }
    
}
