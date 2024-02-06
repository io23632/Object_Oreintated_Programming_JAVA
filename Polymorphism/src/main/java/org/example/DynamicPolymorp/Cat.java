package org.example.DynamicPolymorp;

class Cat extends Pet{


    Cat(int Price){
        super.Price = Price;
    }
    @Override
    protected void price(){
        System.out.println("Price is: " + Price);
        speak();
    }

    @Override
    protected void speak() {
        System.out.println("Meow");
    }
}
