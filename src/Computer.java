public class Computer {

    int year;
    double price;
    boolean isNotebook;
    int hardDriveMemory;
    int freeMemory;
    String operatingSystem;

    public void setOperatingSystem(String input) {
        operatingSystem = input;
    }

    public void useMemory(int memory) {
        if (freeMemory > memory) {
            freeMemory -= memory;
        }
        else {
            System.out.println("Not enough free memory!");
        }
    }

    public void printSpecs(){
        System.out.printf("specs:\nyear = %d\nprice = %f\nmemory = %d\nfree memory = %d\nOS = %s" +
                "\nPortable = %b",year,price,hardDriveMemory,freeMemory,operatingSystem,isNotebook);
    }
}
