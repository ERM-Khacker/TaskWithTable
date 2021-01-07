package edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table3 {
    public static void main(String[] args) {
        new Table3()
                .addLine("11111", "22222222", "33333333", "444")
                .addLine("11", "222", "3333", "4444444")
                .addLine("11111111", "222222", "33333333", "4")
                .addLine("1", "2222222222", "3", "444444444444444")
                .print();
    }

    List<List<String>> lines = new ArrayList<>();
    List<Integer> maxLengths = new ArrayList<>();
    int numColumns = -1;

    public Table3 addLine(String... line) {
        if (numColumns == -1) {
            numColumns = line.length;
            for (int column = 0; column < numColumns; column++) {
                maxLengths.add(0);
            }
        }

        for (int column = 0; column < numColumns; column++) {
            int length = Math.max(maxLengths.get(column), line[column].length());
            maxLengths.set(column, length);
        }

        lines.add(Arrays.asList(line));
        return this;
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        String result = "";
        for (List<String> line : lines) {
            for (int i = 0; i < numColumns; i++) {
                result += padding(line.get(i), maxLengths.get(i) + 3);
            }
            result += System.lineSeparator();
        }
        return result;
    }

    private String padding(String word, int newLength) {
        while (word.length() < newLength) {
            word += " ";
        }
        return word;
    }

}
