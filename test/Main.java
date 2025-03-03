class CPU {
    private String manufacturer;
    private double price;

    // Constructor for CPU
    public CPU(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Inner class Processor
    class Processor {
        private int numCores;
        private String manufacturer;
        private double cache;

        // Constructor for Processor
        public Processor(int numCores, String manufacturer, double cache) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
            this.cache = cache;
        }

        private double getCache() {
            return cache;
        }

        private void setCache(double cache) {
            this.cache = cache;
        }

        public void displayProcessorDetails() {
            System.out.println("Processor Manufacturer: " + manufacturer);
            System.out.println("Processor Cores: " + numCores);
            System.out.println("Processor Cache: " + getCache() + " MB");
        }
    }

    // Inner class RAM
    class RAM {
        private double memory;
        private String manufacturer;
        private double clockSpeed;

        // Constructor for RAM
        public RAM(double memory, String manufacturer, double clockSpeed) {
            this.memory = memory;
            this.manufacturer = manufacturer;
            this.clockSpeed = clockSpeed;
        }

        private double getClockSpeed() {
            return clockSpeed;
        }

        private void setClockSpeed(double clockSpeed) {
            this.clockSpeed = clockSpeed;
        }

        public void displayRAMDetails() {
            System.out.println("RAM Manufacturer: " + manufacturer);
            System.out.println("RAM Size: " + memory + " GB");
            System.out.println("RAM Clock Speed: " + getClockSpeed() + " MHz");
        }
    }

    public void displayCPUDetails() {
        System.out.println("CPU Manufacturer: " + manufacturer);
        System.out.println("CPU Price: $" + price);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Create CPU object
        CPU cpu = new CPU("Intel", 25000);

        // Create Processor object
        CPU.Processor processor = cpu.new Processor(8, "Intel", 16);

        // Create RAM object
        CPU.RAM ram = cpu.new RAM(16, "Corsair", 3200);

        // Display details
        cpu.displayCPUDetails();
        System.out.println();
        processor.displayProcessorDetails();
        System.out.println();
        ram.displayRAMDetails();
    }
}
