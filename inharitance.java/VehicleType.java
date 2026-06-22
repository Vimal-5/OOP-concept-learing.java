class Vehicle{
    void displayBrand(){
        System.out.println("Brand: Toyota");
    }
}

class Car extends Vehicle{
    void displayCar(){
        System.out.println("This is a car.");
    }
}

class Main{
    public static void main(String[] args){
        Car c = new Car();
        
        c.displayBrand();
        c.displayCar();
    }
}
