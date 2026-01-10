package interviews;

import model.Product;
import model.ShoppingCart;

public class RewardsService {
    public static Double calculateRewardPoints(ShoppingCart cart, Integer rewardsPerDollor){
        Double totalCost = 0d;
        for(Product product : cart.getProducts()){
            totalCost += product.getPrice();
        }
        return totalCost*rewardsPerDollor;
    }
}
