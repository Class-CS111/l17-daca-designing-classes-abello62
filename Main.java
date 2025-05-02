/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient person1, person2;
    
    person1 = new DACArecipient();
    person2 = new DACArecipient();

    /*person1.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');
    person2.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');*/

    person1.setAll("Walker", "Catherine", "12-3-456", 
    "Canada", 2434852, 2450389, 2459953, 'F');
    /*person2.setAll("Mendez", "Javier", "56-3-445", 
    "El Salvador", 2451564, 3956753, 3956840, 'M');*/
    person2.setAll("Walker", "Catherine", "12-3-456", 
    "Canada", 2434852, 2450389, 2459953, 'F');
        /*person1.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

        DACArecipient person2 = new DACArecipient();
        person2.setAll("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F')*/

    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.equals(person2));

    System.out.println(person1.printCard());
  }
}