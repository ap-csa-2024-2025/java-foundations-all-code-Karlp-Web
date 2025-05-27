public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(system.in);
        System.out.println(x:"Enter in as a number (1 - January; 12 - December)");
        int month = sc.nextInt();

        switch (month)
        {
            case 1:
                System.out.println(x: "Jan");
                break;
            case 2:
                System.out.println(x: "Feb");
                break;
            case 3:
                System.out.println(x: "Mar");
                break;
            case 4:
                System.out.println(x: "Apr");
                break;
            case 5:
                System.out.println(x: "May");
                break;
            case 6:
                System.out.println(x: "June");
                break;
            case 7:
                System.out.println(x: "July");
                break;
            case 8:
                System.out.println(x: "Aug");
                break;
            case 9:
                System.out.println(x: "Sep");
                break;
            case 10:
                System.out.println(x: "Oct");
                break;
            case 11:
                System.out.println(x: "Nov");
                break;
            case 12:
                System.out.println(x: "Dec");
                break;
            default:
                System.out.println(x: "Invalid month");
        }
        sc.close();
    }
}
