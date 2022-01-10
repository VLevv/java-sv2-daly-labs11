package day04;

import java.util.ArrayList;
import java.util.List;

public class Website {
    private List<Sellable> sellables;
    private List<User> users;

    public Website(List<Sellable> sellables, List<User> users) {
        this.sellables = sellables;
        this.users = users;
    }

    public List<Sellable> getSellables() {
        return sellables;
    }

    public List<User> getUsers() {
        return users;
    }

    public void shop(String userName, String productName){
        for (User u : users) {
            if(u.getUserName().equals(userName)){
                for (Sellable s : sellables) {
                    if (s instanceof Service && ((Service) s).getName().equals(productName)) {
                        u.buy(s);
                    }
                    if (s instanceof Product && ((Product) s).getName().equals(productName)) {
                        u.buy(s);
                    }
                }
            }
        }
    }

}
