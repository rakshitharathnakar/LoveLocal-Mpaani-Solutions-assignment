import java.util.Scanner;

public class Easy1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = lstwrd(input);
        System.out.println(length);
        sc.close();
    }

    public static int lstwrd(String s) {
        s = s.trim();
        int lstspcindx = s.lastIndexOf(' ');
        return s.length() - lstspcindx - 1;
    }

}


