class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;
    private House(Builder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }
    public static class Builder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;
        public Builder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }
        public Builder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }
        public Builder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }
        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
public class Builder {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println("House created with " + house.numRooms + " rooms and " + house.numFloors + " floors.");
    }
}