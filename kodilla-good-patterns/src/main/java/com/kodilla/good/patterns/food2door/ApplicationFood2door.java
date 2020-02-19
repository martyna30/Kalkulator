package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFood2door {
    public static void main(String[] args) {
        List<Supplier> suppliers = new ArrayList<>();

        List<Product> productsListForExtraFoodShop = new ArrayList<>();
        List<Product> productsForHealthyShop = new ArrayList<>();
        List<Product> productsForGlutenFreeShop = new ArrayList<>();
        List<Product> productsForPysznePl = new ArrayList<>();

        suppliers.add(new Supplier(0, "ExtraFoodShop") {
            @Override
            double addComplimentaryProduct(Product product) {
                return product.addComplimentaryProduct();
            }
            @Override
            void process() {
              System.out.println("If you have ordered minimum ten products, you receive one product for free gift!");
            }
            List<Product> listProducts() {
                    productsListForExtraFoodShop.add(new Product(0,10,6,"butter"));
                    productsListForExtraFoodShop.add(new Product(1,9,9,"beetroot"));
                    return productsListForExtraFoodShop;
                }
        });
        suppliers.add(new Supplier(1, "HealthyShop)") {

            @Override
            double addComplimentaryProduct(Product product) {
                return product.getQuantity();
            }
            @Override
            void process() {
                System.out.println("You receive discount!");
            }

            List<Product> listProducts() {
                   productsForHealthyShop.add(new Product(0,20,14,"buckwheat noodles"));
                   return productsForHealthyShop;
                }
        });

        suppliers.add(new Supplier(2, "GlutenFreeShop") {

            @Override
            double addComplimentaryProduct(Product product) {
                return product.addComplimentaryProduct();
            }
            @Override
            void process() {
                System.out.println("You have received the index our products by e-mail");
            }

            @Override
            List<Product> listProducts() {
               productsForGlutenFreeShop.add(new Product(0,13,12,"Gluten free pasta"));
               return productsForGlutenFreeShop;
            }
        });
        suppliers.add(new Supplier(3,"Pyszne.pl") {
            @Override
            double addComplimentaryProduct(Product product) {
                return product.getQuantity();
            }
            @Override
            void process() {
                if(productsForPysznePl.get(0).getQuantity() == 2){
                    System.out.println("You receive chips for free gift!");
                }
            }
            @Override
            List<Product> listProducts() {
                productsForPysznePl.add(new Product(0,4,24,"Hamburger"));
                productsForPysznePl.add(new Product(1,14,42,"beef with rice"));
                return productsForPysznePl;
            }
        });

        OrderService orderService = new OrderService() {
                @Override
                public boolean order(Supplier supplier, Product product) {
                    return true;
                }
            };

        Supplier selectedSupplier = suppliers.get(0);

        Product selectedProducts = suppliers.get(0).listProducts().get(0);

        boolean isOrdered = orderService.order(selectedSupplier, selectedProducts);

        if(isOrdered) {
            System.out.println("You chose supplier " + selectedSupplier.getName());
            System.out.println("You have ordered product "+ selectedProducts.getName() + " in the amount " +  suppliers.get(0).addComplimentaryProduct(selectedProducts));

            suppliers.get(0).process();

            System.out.println("Order has been accepted for completion");
        } else {
            System.out.println("Order hasn't been accepted for completion");
        }
    }
}
