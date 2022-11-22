package CodingTest.Programmers;

public class Qs2 {
    public String solution(String s) {
        String answer = "";
        answer = s.substring((s.length()-1)/2, s.length()/2+1);
        return answer;
    }
}
