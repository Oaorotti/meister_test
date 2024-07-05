import java.util.List;

public class Main {
    public static void main(String[] args) {

        // First Test
        var firstTest = new FirstTest();

        System.out.println(firstTest.ReturnListOfStrings());

        // End of First Test

        // Second Test

        var secondTest = new SecondTest();

        var whiteSpaceString = "asjkldashjkd     ajkwldajkldakljdwjklad  aajiwdjklawdjklad    awjkldajkldsjkldklasjdl       ";

        System.out.println(whiteSpaceString);

        var noWhiteSpaceString = secondTest.RemoveWhiteSpace(whiteSpaceString);

        System.out.println(noWhiteSpaceString);

        // End of Second Test

        // Third Test
        int x = 12;
        int y = 24;

        ThirdTest.SwapTwoNumbers(12, 24);

        // End of Third Test

        // Fourth Test

        var fourthTest = new FourthTest();

        fourthTest.DoQueries();

        // Fourth Test
    }
}