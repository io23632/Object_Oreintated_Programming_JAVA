package org.example.DynamicPolymorp;

class Dog extends Pet{

    public Dog(int Price) {
        super.Price = Price;
    }

    @Override
    protected void price(){
        System.out.println("Price is: " + Price);
        speak();
    }

    @Override
    protected void speak() {
        System.out.println("Woof");
    }


}
