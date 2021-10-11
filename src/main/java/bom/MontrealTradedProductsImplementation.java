package bom;

import java.util.*;

public class MontrealTradedProductsImplementation implements MontrealTradedProducts{
    //Adding a product to the list
    private List<Product> registeredProductsList = new ArrayList<>();

    //Using Map to hold the products and quantities
    private final Map<Product, Integer> totalProductsMap = new HashMap<>();

    //Finding the Products List Size
    public int registeredProductsListSize() {
        return this.registeredProductsList.size();
    }

    /**
     * Adds a new product to the system that
     * the class will track statistics for
     * @param product add a product available for trading
     * @throws ProductAlreadyRegisteredException thrown
     * when a product is registered twice
     */
    //Adding new products for trading
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        //Check if a product has not been added using optionals
        //Pass Product as a Type in Optional
        Optional<Product> optionalProduct = this.registeredProductsList
                //Stream all products and filter to check if the product already exist
                .stream().filter(p -> p.id.equals(product.getId()))
                //Finding the first product match if there are any
                .findFirst();

        //2. Checking if the product already exist, throw an error
        if (optionalProduct.isPresent()) {
            throw new ProductAlreadyRegisteredException("Product with id : " + product.getId() + " already exist!");
        }
         //3. If product does not exist, add to list
         registeredProductsList.add(product);
    }

    /**
     * Books a quantity against the product traded. If the product
     * has not been registered, no quantity is recorded as
     * it is not a product we are required to track.
     * @param product the product traded
     * @param quantity the quantity traded
     */
    @Override
    public void trade(Product product, int quantity) {
    //Checking if the product is registered before proceeding to the next step
    if (!this.registeredProductsList.contains(product)) {
        return;
    }
    //Checking if the product has been traded before, by checking its key in the totalProductsMap
    if (this.totalProductsMap.containsKey(product)) {
        //Set the key with product and getting the key quantity and adding it to the new quantity
        this.totalProductsMap.put(product, this.totalProductsMap.get(product) + quantity);
    }
    }

    /**
     * Calculates the total quantity of all the registered
     * traded products so far today
     * @return the total quantity traded
     */
    @Override
    public int totalTradeQuantityForDay() {
        //stream all the totalProductsMap List and mapToInt to get all the values(quantities)
        //And add all the sum together
        return this.totalProductsMap.values().stream().mapToInt(quantity -> quantity).sum();
    }

    /**
     * Calculates the total value of all the registered traded products
     * so far today. This is done by multiplying the value by the quantity
     * traded.
     *
     * @return the total value of today's traded products that are
     *         registered in the system
     */
    @Override
    public double totalValueOfDaysTradedProducts() {
        return this.totalProductsMap.keySet().stream().mapToDouble(p -> p.getPrice() * this.totalProductsMap.get(p)).sum();
    }
}
