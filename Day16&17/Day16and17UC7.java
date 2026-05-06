package Day16;

public class Day16and17UC7 {
    public static void main(String[] args) {

        String[] sentences = {
                "Java is fun",
                "I love coding",
                "Binary search is fast"
        };

        String target = "coding";
        String result = "Not Found";

        for (String s : sentences) {
            if (s.contains(target)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
    }
}
