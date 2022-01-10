package day04;

import java.time.LocalDate;

public class Service implements Sellable{
    private String name;
    private int price;
    private LocalDate buyDate;
    private LocalDate expirationDate;

    public Service(String name, int price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.buyDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public LocalDate getExpirationDate() {
        return LocalDate.of(expirationDate.minusYears(LocalDate.now().getYear()).getYear(),expirationDate.minusMonths(LocalDate.now().getMonthValue()).getMonth(),expirationDate.minusDays(LocalDate.now().getDayOfMonth()).getDayOfMonth());

    }

    @Override
    public void getExpirationDate(User user) {
        expirationDate= buyDate.plusYears(1);
    }
}
