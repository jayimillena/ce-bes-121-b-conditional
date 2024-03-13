import java.util.Scanner;

public class HoroscopeTarot
{
  public static void main(String[] args) 
  {
    // link https://www.chinahighlights.com/travelguide/chinese-zodiac/
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your birth year: ");

    String birth_year = input.nextLine();

    if (birth_year.equals("1980") || birth_year.equals("2004") || birth_year.equals("2016"))
    {
      System.out.println("You are year of the monkey. , you are generous, friendly, and smart, you tend to be lazy but you are the best like no one ever was.");
    }
    input.close();
  }
}