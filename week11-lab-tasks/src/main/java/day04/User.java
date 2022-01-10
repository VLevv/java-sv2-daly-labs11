package day04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private int wallet;
    private List<Sellable> sellables=new ArrayList<>();

    public User(String userName, int wallet) {
        this.userName = userName;
        this.wallet = wallet;
    }

    public String getUserName() {
        return userName;
    }

    public List<Sellable> getSellables() {
        return sellables;
    }

    public int getWallet() {
        return wallet;
    }

    public void buy(Sellable sellable){
        if(sellable instanceof Service){
            if (((Service) sellable).getPrice()<wallet){
                wallet-=((Service) sellable).getPrice();
                sellables.add(new Product(((Service) sellable).getName(),((Service) sellable).getPrice(),((Service) sellable).getBuyDate()));
                sellables.get(sellables.size()-1).getExpirationDate(this);
            }else {
                throw new IllegalArgumentException("Not enough money in wallet!");
            }
        }
        if(sellable instanceof Product){
            if (((Product) sellable).getPrice()<wallet){
                wallet-=((Product) sellable).getPrice();
                sellables.add(new Product(((Product) sellable).getName(),((Product) sellable).getPrice(),((Product) sellable).getBuyTime()));
                sellables.get(sellables.size()-1).getExpirationDate(this);

            }else {
                throw new IllegalArgumentException("Not enough money in wallet!");
            }
        }
    }
}
