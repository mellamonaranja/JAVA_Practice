
public class LAB03 {

	public static void main(String[] args) {

		int n = 6;
		int s = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
			System.out.print("\n");
			s--;
		}

		s = 0;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < s; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.print("\n");
			s++;
		}

		int n1 = 6;
		int s1 = n1 - 1;

		s1 = 0;
		for (int i = n1; i > 0; i--) {
			for (int j = 0; j < s1; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print(" *");
			System.out.print("\n");
			s1++;
		}

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < s1 - 1; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print(" *");
			System.out.print("\n");
			s1--;
		}

	}

}
