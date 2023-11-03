package com.example.flowerstore.flowers;

public class SpecialItem extends ItemDecorator{
    private Item item;

    public SpecialItem(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() * 0.8;
    }

    public String toString(){
        return "You are lucky to get cheap wares!";
    }

}
