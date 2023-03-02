package HomeWork.HomeWork6;

public class Laptop {
    String brand;
    String os;
    String processor;
    String ram;
    String diagonalScreen;



    public Laptop(String brand, String os, String processor, String ram, String diagonalScreen){
        this.brand = brand;
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.diagonalScreen = diagonalScreen;
    }

    @Override
    public String toString() {
        
        return  "Brend: " + brand + " OS: " + os + " Processor: " + processor + " RAM: " + ram +  " Diagonal Screen: " + diagonalScreen + "\n";
    }
    
   
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Laptop)){
            return false;
        }

        Laptop laptop = (Laptop) obj;
        if(this.brand.equals(laptop.brand)){
            return true;
        }
        else if(this.os.equals(laptop.os))
        {
            return true;
        }
        else if(this.processor.equals(laptop.processor))
        {
            return true;
        }
        else if(this.ram.equals(laptop.ram))
        {
            return true;
        }
        else if(this.diagonalScreen.equals(laptop.diagonalScreen))
        {
            return true;
        }
        {
            return false;
        } 
    }
}
