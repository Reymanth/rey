/*void main() {
/*    int[][] marks = new int[5][3];
    int[][] studentsmarks = {
            {78, 90, 34}, {89, 65, 89}, {12, 34, 56}, {66, 12, 89}, {33, 77, 88}
    };


    for (int row = 0; row < studentsmarks.length; row++) {


        for (int col = 0; col < studentsmarks[row].length; col++) {

            System.out.print(studentsmarks[row][col] + " ");
        }
        System.out.println();
    }
}

 */
/*
    int[][] studentsattendance = {
            {0, 1, 0}, {1, 0, 0}, {1, 1, 1}, {1, 0, 1}, {0, 0, 0}
    };
    for (int row = 0; row < studentsattendance.length; row++){
        System.out.println("student " + (row + 1));

for ( int col=0; col< studentsattendance[row].length; col++ ){
    if ( studentsattendance[row][col] == 1){
        System.out.println("class" + (col + 1)"present");
    }
    else{
        System.out.println("class" + (col + 1)"absent");
    }
}
}
    System.out.println();
}

    */

/*

    int[][] studentsattendance = {
            {1, 0, 1},
            {1, 1, 1},
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 0}
    };

    for (int row = 0; row < studentsattendance.length; row++) {
        System.out.println("Student " + (row + 1));
        for (int col = 0; col < studentsattendance[row].length; col++){
            if (studentsattendance[row][col] == 1) {
                System.out.println("class " + (col + 1) + ":present");
            }

                if (studentsattendance[row][col] == 0) {
                    System.out.println("class " + (col + 1) + ":absent");
                    System.out.print(col + "");
                }
            }
        System.out.println();
        }
    }

 */
void main(){
    System.out.println(add(4, 5));
    System.out.println(sub(5, 7));
    System.out.println(multiply(2, 9));
    System.out.println(div(4, 8));
}
public int add(int a,int b){
    return a+b;
}
public int sub(int a,int b){
    return a-b;
}
public int multiply(int a, int b){
    return a*b;
}
public int div(int a, int b){
    return a/b;
}















