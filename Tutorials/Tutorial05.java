public class Tutorial05 {

    public static void main(String[] args) {

 // 1(a) Declare an array for 12 floating-point numbers
 double[] numbers = new double[12];

 // (b) Initialize an array containing A to E
 char[] letters = {'A', 'B', 'C', 'D', 'E'};
 for (char letter : letters) {
     System.out.println(letter);
 }

 // (c) Declare an array for 100 student names
 String[] students = new String[100];

 // (d) Declare a 2D integer array: 6 rows, 2 columns
 int[][] table = new int[6][2];
 System.out.println("Rows: " + table.length + ", columns: " + table[0].length);

 // (e) Initialize an array with the given values
 int[][] values = {
     {6, 9},
     {2, 5},
     {4, 6}
 };

 // (f) Modify the array
 values[1][1] = 4;
 values[2][1] = 7;

 // (g) Display every element of the students array
 for (int i = 0; i < students.length; i++) {
     System.out.println(students[i]);
 }
  // 2(a)
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        // 2(b)
        int[] num = new int[10];
        int sum = 0;

        for (int k = 0; k < num.length; k++) {
            sum += num[k];
        }

        // 2(c)
        int[][] t = new int[3][3];
        t[1][2] = 5;

        // 2(d)
        int i = 4;
        int[] score = new int[6];

        score[1] = 78;
        score[++i] = 100;
    }

    }