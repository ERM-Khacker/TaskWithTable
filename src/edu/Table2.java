package edu;

public class Table2 {
    public static void main(String[] args) {
        String[][] matrix = {{"11111", "22222222", "33333333", "444"}, {"11", "222", "3333", "4444444"},
                {"11111111", "222222", "33333333", "4"}, {"1", "2222222222", "3", "444444444444444"}};

        buildTable(matrix);
    }

    static void buildTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%-13s", table[i][j]);
            }
            System.out.println();
        }
    }
}
