import java.util.Scanner;
public class Godisaprogrammer
{
    private static String yourChoice;
    private static boolean decision = false;
    private static boolean checker = false ;
   
		
        public static void Person(boolean choice)
        {
                if(choice)
                {
                        CarryYou();
                }
                else
                {
                        SelfReliance();
                }
        }





        public static boolean YourChoice()
        {
                
                // create scanner object for keyboard input
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Will you follow Jesus? (Yes or No) : ");
                yourChoice= keyboard.nextLine();
                checker = yourChoice.equalsIgnoreCase("yes") || yourChoice.equalsIgnoreCase("no");
                // validate the input
                while( !checker)
                {
                        //prompt the user to enter a correct value
                        System.out.println("Child, your choice must be Yes or No.");
                        System.out.println("Will you follow Jesus? (Yes or No) : ");
                        yourChoice= keyboard.nextLine();
                        checker = yourChoice.equalsIgnoreCase("yes") || yourChoice.equalsIgnoreCase("no");
                };
                if(yourChoice.equalsIgnoreCase("Yes"))
                {
                    decision = true;
                }
                else
                {
                    decision = false;
                }
                System.out.println("You choose..." + yourChoice);
                return decision;
        }

        public static void CarryYou()
        {
                System.out.println("Psalm 91:14-15. Out of my distress I called on the Lord; the Lord answered me and set me free.");
                System.out.println("Mathew 5:16 In the same way, let your light shine before others, that they may see your good deeds and glorify your Father in heaven.");
                System.out.println("John 16:33 These things I have spoken unto you, that in me ye might have peace. In the world ye shall have tribulation: but be of good cheer; I have overcome the world.");
                System.out.println("You still live in this world and it has presented you another trial.");
                decision = YourChoice();
                Person(decision);
        }



        public static void SelfReliance()
        {
                System.out.println("Proverbs 24:16 The righteous may fall seven times but still get up, but the wicked will stumble into trouble.");
                System.out.println("Your path is your choice.");
		decision = YourChoice();
                Person(decision);
        }

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("In the Beginning, I programmed each of you with one if statement.");
		System.out.println("Your path is your choice.");
		decision = YourChoice();
                Person(decision);  
        }

}


