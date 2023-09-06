package practice.codingtest.programmers;

import java.util.Arrays;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(q -> {
            String[] splitQ = q.split(" ");
            int actual = calculate(Integer.parseInt(splitQ[0]), Integer.parseInt(splitQ[2]), splitQ[1]);
            int expected = Integer.parseInt(splitQ[4]);
            return actual == expected ? "O" : "X";
        }).toArray(String[]::new);
    }

    public int calculate(int first, int second, String operator) {
        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            default -> throw new IllegalArgumentException();
        };
    }

    public String[] otherSolution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }
}
