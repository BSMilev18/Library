public class Reader {

    private String name;
    private String address;
    private String socialNumber;

    public Reader() {
        this.name = "David";
        this.address = "Merrylin Street";
        this.socialNumber = "0350632704";
    }

    public Reader(String name, String address, String socialNumber) {
        this.name = name;
        this.address = address;
        this.socialNumber = socialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }
}
