package day04;

import java.time.LocalDate;

public class Product implements Sellable{
    private String name;
    private int price;
    private LocalDate buyTime;
    private LocalDate expirationDate;

    public Product(String name, int price, LocalDate buyTime) {
        this.name = name;
        this.price = price;
        this.buyTime = buyTime;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getBuyTime() {
        return buyTime;
    }

    public LocalDate getExpirationDate() {
        return LocalDate.of(expirationDate.minusYears(LocalDate.now().getYear()).getYear(),expirationDate.minusMonths(LocalDate.now().getMonthValue()).getMonth(),expirationDate.minusDays(LocalDate.now().getDayOfMonth()).getDayOfMonth());
    }

    public boolean isExtended(User user){
        if(price*3<=user.getWallet()){
            return true;
        }
        return false;
    }

    @Override
    public void getExpirationDate(User user) {
        if(isExtended(user)){
            price+=price*0.1;
            expirationDate = buyTime.plusYears(3);
        }else{
            expirationDate=buyTime.plusMonths(3);
        }
    }
}
