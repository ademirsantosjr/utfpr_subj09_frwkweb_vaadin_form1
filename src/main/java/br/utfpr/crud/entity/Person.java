package br.utfpr.crud.entity;

public class Person {
    
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String phone;
    private long cep;
    private String address;
    private String buindingNumber;
    private String instructionLevel;
    private String additionalInfo;

    public Person (String firstName,
                   String lastName,
                   String email,
                   String address,
                   String buindingNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.buindingNumber = buindingNumber;
    }

    public Person (String firstName,
                   String lastName,
                   String birthDate,
                   String email,
                   String phone,
                   long cep,
                   String address,
                   String buindingNumber,
                   String instructionLevel,
                   String additionalInfo) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.address = address;
        this.buindingNumber = buindingNumber;
        this.instructionLevel = instructionLevel;
        this.additionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public long getCep() {
        return cep;
    }

    public String getAddress() {
        return address;
    }

    public String getBuildingNumber() {
        return buindingNumber;
    }

    public String getInstructionLevel() {
        return instructionLevel;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String buindingNumber) {
        this.buindingNumber = buindingNumber;
    }

    public void setInstructionLevel(String instructionLevel) {
        this.instructionLevel = instructionLevel;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
