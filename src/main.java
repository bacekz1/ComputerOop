public class main {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.year = 3;
        comp1.price = 1256.56;
        comp1.hardDriveMemory = 1024;
        comp1.freeMemory = 860;
        comp1.operatingSystem = "Fedora";
        comp1.isNotebook = false;
        comp1.useMemory(100);

        Computer comp2 = new Computer();
        comp2.year = 1;
        comp2.price = 2156.86;
        comp2.hardDriveMemory = 512;
        comp2.freeMemory = 420;
        comp2.operatingSystem = "Windows 11";
        comp2.isNotebook = true;
        comp1.setOperatingSystem("Ubuntu");

        System.out.print("comp1 ");
        comp1.printSpecs();
        System.out.println();
        System.out.println();
        System.out.print("comp2 ");
        comp1.printSpecs();





    }
}
