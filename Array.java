
/**
 Lower Bound will be "-1" when the array is empty and "0" when value is in array

 Upper Bound will be the present value in the array

 Operations in the below code are
 1. check whether the array is empty or not
 2. check whether their is only one element in the array
 3. findout the size of the array
 4. insert into array
 5. delete from array
 6. traverse the elements
 7. Search an element in the array
 8. find memory location of a value -> formula -> memory location = base index + size of the datatype * (current index - lower bound)
      (8.a) consider the base index as '1001'
*/

import java.util.Scanner;

class Array {

    // Checks whether the array is empty or not
    public static String isEmpty(int lb, int ub) {
        if (lb == -1 && ub == -1) {
            return "Array is Empty";
        } else {
            return "Array is not empty";
        }
    }

    // checks whether their is only one element present in the array
    public static String isOne(int lb, int ub) {
        if (lb == 0 && ub == 0) {
            return "Only one value is present in the array";
        } else if (lb == -1 && ub == -1) {
            return "No value is present in the array";
        } else {
            return "More than One value is present in the array";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creation of the array
        int arr[] = new int[5];

        // lb -> Lower Bound
        // ub -> upper Bound
        int lb, ub, max_val;
        max_val = 5 - 1;

        lb = -1;
        ub = -1;

        int base_index = 1001;
        int size_of_datatype = 4;
        int current_location = -1;

        while (true) {

            System.out.println("Enter your choice: ");
            System.out.println("\t 1. check whether the array is empty or not" +
                    "\n\t 2. check whether their is only one element in the array" +
                    "\n\t 3. findout the size of the array" +
                    "\n\t 4. insert into array" +
                    "\n\t 5. delete from array" +
                    "\n\t 6. traverse the elements" +
                    "\n\t 7. Search an element in the array" +
                    "\n\t 8. find memory location of a value");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println(isEmpty(lb, ub));
                    System.out.println("Lower Bound: " + lb);
                    System.out.println("Upper Bound: " + ub);
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println(isOne(lb, ub));
                    System.out.println("Lower Bound: " + lb);
                    System.out.println("Upper Bound: " + ub);
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------");

                    if (lb == -1 && ub == -1) {
                        System.out.println("Array is empty. Therefore the size of the array is -1");
                        System.out.println("--------------------------------");
                    }

                    else {
                        int length_array = ub - lb + 1;

                        System.out.println("Length of the array is: " + length_array);
                        System.out.println("--------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    System.out.println("Enter the value you want to insert: ");
                    int value = sc.nextInt();
                    if (lb == -1 && ub == -1) {
                        lb = 0;
                        ub = 0;
                        arr[ub] = value;
                        System.out.println("Value inserted succssfully");
                        System.out.println("Lower Bound: " + lb);
                        System.out.println("Upper Bound: " + ub);
                        System.out.println("Elements in array: ");
                        System.out.print("|");
                        for (int i = 0; i <= ub; i++) {
                            System.out.print(" " + arr[i] + " ");
                        }
                        System.out.print("|");
                        System.out.println();
                        System.out.println("--------------------------------");
                    } else if (ub == max_val) {
                        System.out.println("Array is full. Can't insert value in array");
                        System.out.println();
                        System.out.println("Lower Bound: " + lb);
                        System.out.println("Upper Bound: " + ub);
                        System.out.println();
                        System.out.println("Elements in array: ");
                        System.out.print("|");
                        for (int i = 0; i <= ub; i++) {
                            System.out.print(" " + arr[i] + " ");
                        }
                        System.out.print("|");
                        System.out.println();
                        System.out.println("--------------------------------");
                    } else {
                        ub = ub + 1;
                        arr[ub] = value;
                        System.out.println("Value inserted succssfully");
                        System.out.println("Lower Bound: " + lb);
                        System.out.println("Upper Bound: " + ub);

                        System.out.println("Elements in array: ");
                        System.out.print("|");
                        for (int i = 0; i <= ub; i++) {
                            System.out.print(" " + arr[i] + " ");
                        }
                        System.out.print("|");
                        System.out.println();
                        System.out.println("--------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    if (lb == -1 && ub == -1) {
                        System.out.println("Array is already Empty. Can't delete elements from the array.");
                        System.out.println("Lower Bound: " + lb);
                        System.out.println("Upper Bound: " + ub);

                        System.out.println("Elements in array: ");
                        System.out.print("|");
                        for (int i = 0; i <= ub; i++) {
                            System.out.print(" " + arr[i] + " ");
                        }
                        System.out.print("|");
                        System.out.println();
                        System.out.println("--------------------------------");
                    } else {
                        ub = ub - 1;
                        System.out.println("Value removed from the array successfully");
                        System.out.println("Lower Bound: " + lb);
                        System.out.println("Upper Bound: " + ub);

                        System.out.println("Elements in array: ");
                        System.out.print("|");
                        for (int i = 0; i <= ub; i++) {
                            System.out.print(" " + arr[i] + " ");
                        }
                        System.out.print("|");
                        System.out.println();
                        System.out.println("--------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("--------------------------------");
                    System.out.print("|");
                    for (int i = 0; i <= ub; i++) {
                        System.out.print(" " + arr[i] + " ");
                    }
                    System.out.print("|");
                    System.out.println();
                    System.out.println("--------------------------------");
                    break;
                case 7:
                    System.out.println("--------------------------------");
                    System.out.println("Search an element in the array: ");
                    int Search = sc.nextInt();
                    int index = -1;

                    for (int i = 0; i <= ub; i++) {
                        if (Search == arr[i]) {
                            index = i;
                        }
                    }
                    if (index != -1) {
                        System.out.println("Value is present in the array at index " + (index + 1));
                        System.out.println("--------------------------------");
                    } else {
                        System.out.println("Value isn't present in the array");
                        System.out.println("--------------------------------");
                    }
                    break;
                case 8:
                    System.out.println("--------------------------------");
                    System.out.println("Enter the value whose memory location you wants to find out: ");
                    int val = sc.nextInt();

                    int count = -1;

                    for (int i = 0; i <= ub; i++) {
                        if (val == arr[i]) {

                            count = i;

                        }
                    }

                    if (count != -1) {
                        current_location = count;
                        int multiplicated_val = 0;
                        multiplicated_val = current_location - lb;

                        int memory_location = base_index + (size_of_datatype * multiplicated_val);

                        System.out.println("The Memory Location is : " + memory_location);
                        System.out.println("--------------------------------");
                    } else {
                        System.out.println("Value isn't present in the array");
                        System.out.println("--------------------------------");
                    }

                    break;
                default:
                    System.out.println("--------------------------------");
                    System.out.println("Invalid choice");
                    System.out.println("--------------------------------");
            }
        }
    }
}