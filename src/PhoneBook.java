import lombok.Getter;
import java.util.Objects;

@Getter
public class PhoneBook {
    private final String fullName;

    private final String phoneNumber;

    public PhoneBook(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(fullName, phoneBook.fullName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return fullName + ", номер телефона - " + phoneNumber;

    }
}


