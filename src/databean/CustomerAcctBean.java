package databean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;



public class CustomerAcctBean {
	private String fname;
	private String lname;
	private String birth_month;
	private String birth_day;
	private String birth_year;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String phone_number;
	private String email;
	private boolean isEnrolled;
	private String password;
	private String confirm_password;
	private String hashedPassword = "*";
	private int salt = 0;
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBirth_month() {
		return birth_month;
	}
	public void setBirth_month(String birth_month) {
		this.birth_month = birth_month;
	}
	public String getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}
	public String getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnrolled() {
		return isEnrolled;
	}
	public void setEnrolled(boolean isEntrolled) {
		this.isEnrolled = isEntrolled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	
	public int hashCode() {
        return email.hashCode();
    }
	
	public int getSalt() {
		return salt;
	}
	public void setSalt(int salt) {
		this.salt = salt;
	}
	public boolean checkPassword(String password) {
        return hashedPassword.equals(hash(password));
    }
    
    public void encodePassword(String s) {
        salt = newSalt();
        hashedPassword = hash(s);
    }
    
    private String hash(String clearPassword) {
        if (salt == 0) return null;

        MessageDigest md = null;
        try {
          md = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
          throw new AssertionError("Can't find the SHA1 algorithm in the java.security package");
        }

        String saltString = String.valueOf(salt);
        
        md.update(saltString.getBytes());
        md.update(clearPassword.getBytes());
        byte[] digestBytes = md.digest();

        // Format the digest as a String
        StringBuffer digestSB = new StringBuffer();
        for (int i=0; i<digestBytes.length; i++) {
          int lowNibble = digestBytes[i] & 0x0f;
          int highNibble = (digestBytes[i]>>4) & 0x0f;
          digestSB.append(Integer.toHexString(highNibble));
          digestSB.append(Integer.toHexString(lowNibble));
        }
        String digestStr = digestSB.toString();

        return digestStr;
    }
    
    private int newSalt() {
        Random random = new Random();
        return random.nextInt(8192)+1;  // salt cannot be zero
    }
}
