package day04;

import java.time.LocalDate;

public interface Sellable {
    LocalDate getExpirationDate();
    void getExpirationDate(User user);
}
