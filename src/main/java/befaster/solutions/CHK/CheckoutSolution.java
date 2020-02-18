package befaster.solutions.CHK;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        if(skus.equals("")){
            return 0;
        }

        Basket basket = new Basket();
        String[] products = skus.split("");

        for(String product : products) {
            try {
                basket.addItem(product);
            } catch (IllegalInputException e) {
                return -1;
            }
        }

        return basket.checkout();
    }
}

