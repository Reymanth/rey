void main() {
    /*
    int n=5;
    for (int row =1;row <=n;row++ ) {

        for (int col = 1; col <=n; col++) {
            if (row == 1 && col == 1 || row == 1 && col ==2 || row == 1 && col == 4 || row == 1 && col == 5 || row == 2 && col == 1 || row == 2 && col == 5 || row == 4 && col == 1 || row == 4 && col == 5 || row == 5 && col == 1 || row == 5 && col == 2 || row == 5 && col == 4 || row == 5 && col ==5)
            {
                System.out.print("  ");
                continue;
            }
            System.out.print("* ");

        }
        System.out.println(" ");

    }}

     */

    int[] arr = {87,32,44,89,32};
    // How you get the input?

    System.out.print("Pass mark: ");
    for (int i=0;i<=4;i++){
        int val = arr[i];
        if (val > 40) {

            System.out.print(val+" ");
        }

    }
    System.out.print("\nFail mark: ");
    for (int i=0;i<=4;i++){
        int val = arr[i];
        if (val < 40) {
            System.out.print(val+" ");
        }

    }
}



