package FinalProject.model;

// 상품에 대한 DTO
public class productDTO {
	public productDTO() {
		super();
	}
	private String product_name;
	private int product_price;
	private String product_description;
	private String product_filesystemName;
	private String product_originalFileName;
	private String product_contentType;
	private long product_length;
	private String product_user_id;
	public String getProduct_user_id() {
		return product_user_id;
	}
	public void setProduct_user_id(String product_user_id) {
		this.product_user_id = product_user_id;
	}
	public String getProduct_filesystemName() {
		return product_filesystemName;
	}
	public void setProduct_filesystemName(String product_filesystemName) {
		this.product_filesystemName = product_filesystemName;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_originalFileName() {
		return product_originalFileName;
	}
	public void setProduct_originalFileName(String product_originalFileName) {
		this.product_originalFileName = product_originalFileName;
	}
	public String getProduct_contentType() {
		return product_contentType;
	}
	public void setProduct_contentType(String product_contentType) {
		this.product_contentType = product_contentType;
	}
	public long getProduct_length() {
		return product_length;
	}
	public void setProduct_length(long product_length) {
		this.product_length = product_length;
	}
	
}
