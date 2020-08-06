
public class Complaints {

	private String dateRecieved;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
	private String state;
	private String zipCode;
	private String submittedVia;
	private String dateSent;
	private String companyResponseToCustomer;
	private String timelyResponse;
	private String consumerDisputed;
	private String complaintId;
	public String getDateRecieved() {
		return dateRecieved;
	}
	public Complaints() {
		
	}
	public Complaints(String dateRecieved, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedVia, String dateSent,
			String companyResponseToCustomer, String timelyResponse, String consumerDisputed, String complaintId) {
		this.dateRecieved = dateRecieved;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSent = dateSent;
		this.companyResponseToCustomer = companyResponseToCustomer;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		this.complaintId = complaintId;
	}
	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompanyResponseToCustomer() {
		return this.companyResponseToCustomer;
	}
	public void setCompanyResponseToCustomer(String company) {
		this.companyResponseToCustomer = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSubmittedVia() {
		return submittedVia;
	}
	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}
	public String getDateSent() {
		return dateSent;
	}
	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTimelyResponse() {
		return timelyResponse;
	}
	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}
	public String getConsumerDisputed() {
		return consumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	
	@Override
	public String toString() {
		return "Complaints [dateRecieved=" + dateRecieved + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", zipCode=" + zipCode + ", submittedVia=" + submittedVia + ", dateSent=" + dateSent
				+ ", companyResponseToCustomer=" + companyResponseToCustomer + ", timelyResponse=" + timelyResponse
				+ ", consumerDisputed=" + consumerDisputed + ", complaintId=" + complaintId + "]";
	}
	
}
