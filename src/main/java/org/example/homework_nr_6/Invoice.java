package org.example.homework_nr_6;

public class Invoice {

    private String model;
    private String description;
    private Integer quantity;
    private Double price;

    public Invoice(String model, String description, Integer quantity, Double price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(Double price) {
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }


    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return quantity * price;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Samsung G20", "Mobile phone", 24, 102.0);
        invoice.setQuantity(invoice.getQuantity());
        invoice.setPrice(invoice.getPrice());

        System.out.println("Model: " + invoice.getModel());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Amount : " + invoice.getAmount());
        System.out.println("Total $: " + invoice.getAmount());

    }

}
