import java.io.Console;

public class CodingTime {
  public static void main(String[] args) {
    Integer dayBefore = askHowLongDidYouCode("the day before yesterday");
    Integer yesterday = askHowLongDidYouCode("yesterday");
    Integer today = askHowLongDidYouCode("today");
    Integer total = 0;
    Integer[] totalTime = {dayBefore, yesterday, today};
    for ( Integer currentTime : totalTime) {
      total += currentTime;
    }
    System.out.println("You coded for a total of " + total + " hours.");
}
  public static Integer askHowLongDidYouCode(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you code for " + day + "?");
    String stringYourTime = myConsole.readLine();

    Integer yourTime = Integer.parseInt(stringYourTime);

    System.out.println("You coded for" + yourTime + " hours " + day + ".");
    return yourTime;
  }
}
