import java.util.Scanner;
public class MiniSimulator {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        System.out.print("Original Array list:");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        int choice=0;
        do {
        System.out.println("Main Menu -Click Option below:");
        System.out.println("1.Update an element");
        System.out.println("2.Access an element");
        System.out.println("3.Print the whole array");
        System.out.println("4.Exit");
        choice= sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter index ,you want to update:");
                    int index = sc.nextInt();
                    System.out.println("Enter new value ,you want to replace:");
                    int newvalue = sc.nextInt();
                    arr[index] = newvalue;
                    System.out.println("Update successful!");
                    break;
                case 2:
                    System.out.println("enter index:");
                    int indexnum = sc.nextInt();
                    System.out.println("Index value:");
                    System.out.println(arr[indexnum]);
                    break;

                case 3:
                    System.out.print("Print array:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting loop");
                    break;

                default:
                    System.out.println("Please enter correct option");

            }
      }while (choice!=4);
        sc.close();
    }
}
