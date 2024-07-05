public class SecondTest {
    public String RemoveWhiteSpace(String inputString) {
        if (inputString.isEmpty()) {
            System.out.println("Must provide a non empty string!");
            return inputString;
        }

        var sb = new StringBuilder();

        for (char character : inputString.toCharArray()) {
            if (!Character.isWhitespace(character)) {
                sb.append(character);
            }
        }

        return sb.toString();
    }
}
