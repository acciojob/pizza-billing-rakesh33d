package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private boolean extracheeseadded;
    private boolean extratoppingsadded;
    private boolean istakeawayadded;
    private int baseprice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg==true){
            //this.baseprice=300;
            this.price=300;
            this.toppings=70;
        }
        else{
            //this.baseprice=400;
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.extracheeseadded=false;
        this.extratoppingsadded=false;
        this.istakeawayadded=false;
        this.bill="";
        this.bill+= "Base Price Of The Pizza: "+price+"\n";
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(extracheeseadded==false){
           this.price = price + cheese;
           extracheeseadded=true;
       }

    }

    public void addExtraToppings(){
        if(extratoppingsadded==false){
            this.price = price + toppings;
            extratoppingsadded=true;
        }
    }

    public void addTakeaway(){
        if(istakeawayadded==false){
            this.price = price + 20;
            istakeawayadded=true;
        }
    }

    public String getBill(){

        if(extracheeseadded)bill+="Extra Cheese Added: 80"+"\n";
        if(extratoppingsadded)bill+="Extra Toppings Added: "+toppings+"\n";
        if(istakeawayadded)bill+="Paperbag Added: 20"+"\n";
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
