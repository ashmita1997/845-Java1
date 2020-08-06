
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class readCsv {
	

	String line = "";
	String splitBy = ",";
	List<Complaints> data = new ArrayList<Complaints>();
	public readCsv() throws IOException {
		try
		{
			List<String> lines = Files.readAllLines(Paths.get("E:\\complaints.csv"));
			for(String line : lines)
			{
				line = line.replace("\"", "");
				String[] fields = line.split(",");
				if(fields.length > 0)
				{
					Complaints dataObject = new Complaints();
					dataObject.setDateRecieved(fields[0]);
					dataObject.setProduct(fields[1]);
					dataObject.setSubProduct(fields[2]);
					if(fields.length > 14)
					{
						String extraData = fields[3];
						if(fields.length == 15)
						{
							extraData += fields[4];
							dataObject.setIssue(extraData);
							dataObject.setSubIssue(fields[5]);
							dataObject.setCompany(fields[6]);
							dataObject.setState(fields[7]);
							dataObject.setZipCode(fields[8]);
							dataObject.setSubmittedVia(fields[9]);
							dataObject.setDateSent(fields[10]);
							dataObject.setCompanyResponseToCustomer(fields[11]);
							dataObject.setTimelyResponse(fields[12]);
							dataObject.setConsumerDisputed(fields[13]);
							dataObject.setComplaintId(fields[14]);
							data.add(dataObject);
						}
						else if(fields.length == 16)
						{
							extraData += fields[5];
							dataObject.setIssue(extraData);
							dataObject.setSubIssue(fields[6]);
							dataObject.setCompany(fields[7]);
							dataObject.setState(fields[8]);
							dataObject.setZipCode(fields[9]);
							dataObject.setSubmittedVia(fields[10]);
							dataObject.setDateSent(fields[11]);
							dataObject.setCompanyResponseToCustomer(fields[12]);
							dataObject.setTimelyResponse(fields[13]);
							dataObject.setConsumerDisputed(fields[14]);
							dataObject.setComplaintId(fields[15]);
							data.add(dataObject);
						}
						else if(fields.length == 17)
						{
							extraData += fields[6];
							dataObject.setIssue(extraData);
							dataObject.setSubIssue(fields[7]);
							dataObject.setCompany(fields[8]);
							dataObject.setState(fields[9]);
							dataObject.setZipCode(fields[10]);
							dataObject.setSubmittedVia(fields[11]);
							dataObject.setDateSent(fields[12]);
							dataObject.setCompanyResponseToCustomer(fields[13]);
							dataObject.setTimelyResponse(fields[14]);
							dataObject.setConsumerDisputed(fields[15]);
							dataObject.setComplaintId(fields[16]);
							data.add(dataObject);
						}
					}
					else
					{
						dataObject.setIssue(fields[3]);
						dataObject.setSubIssue(fields[4]);
						dataObject.setCompany(fields[5]);
						dataObject.setState(fields[6]);
						dataObject.setZipCode(fields[7]);
						dataObject.setSubmittedVia(fields[8]);
						dataObject.setDateSent(fields[9]);
						dataObject.setCompanyResponseToCustomer(fields[10]);
						dataObject.setTimelyResponse(fields[11]);
						dataObject.setConsumerDisputed(fields[12]);
						dataObject.setComplaintId(fields[13]);
						data.add(dataObject);
					}
					
				}
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//reader.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void returnByYear(int year)
	{
		Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
		for(Complaints i : data)
		{
			String[] date = i.getDateRecieved().split("//|");
			if(date.length!=10) continue;
			String newYear = date[6]+date[7]+date[8]+date[9];
			if(!myMap.containsKey(newYear))
			{
				ArrayList<String> complaints = new ArrayList<String>();
				complaints.add(i.getIssue());
				myMap.put(newYear,complaints);
			}
			else
			{
				ArrayList<String> complaints = myMap.get(newYear);
				complaints.add(i.getIssue());
			}
		}
		System.out.println("Complaints in Year "+year+" are as follows-->");
		try
		{
			for(Object v : myMap.get(String.valueOf(year)))
			{
				System.out.println("Complaint : " + String.valueOf(v));
			}
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("No value of this Year present"+e.getMessage());
		}
		
	}
	
	public void returnByBankName(String bankName) 
	{
		Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
		for(Complaints i : data)
		{
			String bankData = i.getCompany();
			if(!myMap.containsKey(bankData))
			{
				ArrayList<String> complaints = new ArrayList<String>();
				complaints.add(i.getIssue());
				myMap.put(bankData,complaints);
			}
			else
			{
				ArrayList<String> complaints = myMap.get(bankData);
				complaints.add(i.getIssue());
			}
		}
		System.out.println("Complaints by Bank "+bankName+" are as follows-->");
		try
		{
			for(Object v : myMap.get(String.valueOf(bankName)))
			{
				System.out.println("Bank Name : "+String.valueOf(v));
			}
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("No value of this Bank present"+e.getMessage());
		}
		
	}
	
	public void returnByComplaintId(String complaintId)
	{
		Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
		for(Complaints i : this.data)
		{
			String cmpIdData = i.getCompany();
			if(!myMap.containsKey(cmpIdData))
			{
				ArrayList<String> complaints = new ArrayList<String>();
				complaints.add(i.getIssue());
				myMap.put(cmpIdData,complaints);
			}
			else
			{
				ArrayList<String> complaints = myMap.get(cmpIdData);
				complaints.add(i.getIssue());
			}
		}
		System.out.println("Complaints by Complaint Id "+complaintId+" are as follows-->");
		try
		{
			for(Object v : myMap.get(String.valueOf(complaintId)))
			{
				System.out.println("Complaint Id : "+String.valueOf(v));
			}
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("No value of this Complaint Id present"+e.getMessage());
		}
		
	}
}