package com;
public class Contact {

    //Initialize all the parameters
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public long phno;
	public String email;


    //called contact class for creating contacts with given details
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String string, String email, long phno) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phno = phno;
        this.email = email;
    }

    /*getting and setting the firstName, lastName, address , city , state, zip , phone number, email*/

    public Contact(String firstName2, String lastName2, String address2, String city2, String state2, String zip2,
			long phoneNo, String email) {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getPhoneNo() {
        return phno;
    }

    public void setPhoneNo(long phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [firstName: " + firstName + " , " + "lastName: " + lastName + " , " + "address: " + address + " , " + "city: " + city + " , " +
                "state: " + state + " , " + "zip: " + zip + " , " + "phoneNo: " + phno + " , " + "email: " + email + "]";
    }

}
