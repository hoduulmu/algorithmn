package practice.codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1244_스위치_켜고_끄기 {

    private static int switchCount;
    private static int[] switches;
    private static int[][] students;

    public static void main(String[] args) {
        input();
    }


    public static void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            switchCount = Integer.parseInt(br.readLine());
            switches = new int[switchCount];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < switchCount; i++) {
                switches[i] = Integer.parseInt(st.nextToken());
            }

            int studentCount = Integer.parseInt(br.readLine());
            students = new int[studentCount][2];
            for (int i = 0; i < studentCount; i++) {
                st = new StringTokenizer(br.readLine());
                students[i][0] = Integer.parseInt(st.nextToken());
                students[i][1] = Integer.parseInt(st.nextToken());
            }

            solve(switches, students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solve(int[] switches,
                             int[][] students) {
        for (int[] student : students) {
            if (student[0] == 1) {
                switchByMale(switches, student[1]);
            } else {
                switchByFemale(switches, student[1] - 1);
            }
        }

        printSwitches(switches);
    }

    private static void switchByMale(int[] switches, int multiple) {
        for (int i = multiple; i < switches.length; i += multiple) {
            switches[i - 1] = switchNumber(switches[i - 1]);
        }
    }

    private static void switchByFemale(int[] switches, int index) {
        int startIndex = index;
        int endIndex = index;

        while (switches[startIndex] == switches[endIndex]) {
            int nextStartIndex = startIndex - 1;
            int nextEndIndex = endIndex + 1;
            if (nextStartIndex < 0 || nextEndIndex >= switches.length || switches[nextStartIndex] != switches[nextEndIndex]) {
                break;
            }
            startIndex = nextStartIndex;
            endIndex = nextEndIndex;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            switches[i] = switchNumber(switches[i]);
        }
    }

    private static void printSwitches(int[] switches) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < switches.length; i++) {
            sb.append(switches[i]).append(" ");
            if ((i + 1) % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int switchNumber(int number) {
        return number == 0 ? 1 : 0;
    }
}
