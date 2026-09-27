public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int perSpeed = 221;
        if(speed >= 1 && speed <= 4){
            return speed * perSpeed;
        }
        else if(speed >= 5 && speed <= 8){
            return speed * perSpeed * 0.9;
        }
        else if(speed == 9){
            return speed * perSpeed * 0.8;
        }
        else if(speed == 10){
            return speed * perSpeed * 0.77;
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
