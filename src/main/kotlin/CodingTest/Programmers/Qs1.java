package CodingTest.Programmers;

public class Qs1 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for (int i = 0; i<count+1; i++){
            total += price * i;
        }
        if (money<total){
            answer = total- money;
        }
        else
            answer = 0;
        return answer;
    }
}
