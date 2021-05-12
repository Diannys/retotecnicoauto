package co.com.choucair.retotecnicoauto.model;

public class RegistrationModel {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String cityLocation;
    private String postalCode;
    private String mobileOption;
    private String mobileModel;
    private String systemOperative;
    private String password;
    private String passwordConfirm;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getBirthMonth() {
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(String birthYear){
        this.birthYear = birthYear;
    }

    public String getCityLocation() {
        return cityLocation;
    }
    public void setCityLocation(String cityLocation){
        this.cityLocation = cityLocation;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getMobileOption() {
        return mobileOption;
    }
    public void setMobileOption(String mobileOption){
        this.mobileOption = mobileOption;
    }

    public String getMobileModel() {
        return mobileModel;
    }
    public void setMobileModel(String mobileModel){
        this.mobileModel = mobileModel;
    }

    public String getSystemOperative() {
        return systemOperative;
    }
    public void setSystemOperative(String systemOperative){
        this.systemOperative = systemOperative;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }
    public void setPasswordConfirm(String passwordConfirm){
        this.passwordConfirm = passwordConfirm;
    }

}