class ParkingSystem {
    int[] spots;

    public ParkingSystem(int big, int medium, int small) {
        spots = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (spots[carType] > 0) {
            spots[carType]--;
            return true;
        }
        return false;
    }
}
