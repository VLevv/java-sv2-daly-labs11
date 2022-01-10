package day04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    void testShop() {
        Website website = new Website(List.of(
                new Product("csoki",300, LocalDate.of(2022,1,7)),
                new Service("repair",3000,LocalDate.of(2022,1,8))
        ),List.of(
                new User("pali",10000),
                new User("nem pali",3500)
        ));
        website.shop("pali","csoki");
        website.shop("nem pali","repair");
        website.shop("nem pali","csoki");
        assertEquals(200,website.getUsers().get(1).getWallet());
        System.out.println(website.getUsers().get(0).getSellables().get(0).getExpirationDate());
    }
}