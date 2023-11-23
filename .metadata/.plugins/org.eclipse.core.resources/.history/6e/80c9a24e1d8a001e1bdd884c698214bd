package DTO_Practice;


public class Address {
	public static final String NO_DATA = (String)DtoDefaultEnum.NO_DATA.getValue();
	
    private String street = NO_DATA;
    private String city = NO_DATA;
    private String zipCode = NO_DATA;

    public Address() {}
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public boolean hasError() {
		if(this.street.equals("noData") ||
				this.city.equals("noData") ||
				this.zipCode.equals("noData")) return true;
		return false;
	}
}