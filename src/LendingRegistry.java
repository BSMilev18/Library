import java.util.ArrayList;

public class LendingRegistry {

    private String registryNumber;
    private String dateOfReturn;
    private ArrayList<Book> lentBook;
    private ArrayList<Reader> registeredUser;

    public LendingRegistry() {
        this.registryNumber = "0001";
        this.dateOfReturn = "10-7-2022";
        this.lentBook = new ArrayList<Book>();
        this.registeredUser = new ArrayList<Reader>();
    }

    public LendingRegistry(String registryNumber, String dateOfReturn, ArrayList<Book> lentBook, ArrayList<Reader> registeredUser) {
        this.registryNumber = registryNumber;
        this.dateOfReturn = dateOfReturn;
        this.lentBook = lentBook;
        this.registeredUser = registeredUser;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public ArrayList<Book> getLentBook() {
        return lentBook;
    }

    public void setLentBook(ArrayList<Book> lentBook) {
        this.lentBook = lentBook;
    }

    public ArrayList<Reader> getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(ArrayList<Reader> registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "LendingRegistry{" +
                "registryNumber='" + registryNumber + '\'' +
                ", dateOfReturn='" + dateOfReturn + '\'' +
                ", lentBook=" + lentBook +
                ", registeredUser=" + registeredUser +
                '}';
    }
}
