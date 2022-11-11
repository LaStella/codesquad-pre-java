package week02.mission02.two;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/week02/mission02/two/input.txt"));
        String line = br.readLine();
        ArrayList<Student> students = new ArrayList<>();

        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            String name = st.nextToken();
            String major = st.nextToken();

            ArrayList<Integer> points = new ArrayList<>();

            while (st.hasMoreTokens()) {
                int point = Integer.parseInt(st.nextToken());
                points.add(point);
            }

            Student s = new Student(name, major, points);

            students.add(s);

            line = br.readLine();
        }

        for (Student s : students) {
            s.showInfo();
        }
    }
}
