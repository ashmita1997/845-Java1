import java.io.IOException;
import java.util.Scanner;

public class Display {
public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		readCsv r = new readCsv();
		
		System.out.println("Welcome.....  Choose Option\n");
		System.out.println("1. Search By Date\n2. Search By Bank Name\n3. Search By Complaint Id ");
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Enter Year(YYYY) :");
				int year = sc.nextInt();
				r.returnByYear(year);
				break;
			case 2:
				System.out.println("Enter Bank Name :");
				String bankName = sc.next();
				r.returnByBankName(bankName);
				break;
			case 3:
				System.out.println("Enter ComplaintId :");
				String complaintId = sc.next();
				r.returnByComplaintId(complaintId);
				break;
			default:
				System.out.println("Invalid Input");
		}
		
		sc.close();
		
	}
}