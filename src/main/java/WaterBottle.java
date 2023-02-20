public class WaterBottle {
    public int volume;

//    public boolean volume() {
//        if(this.volume > 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
    public WaterBottle (int volume){
        this.volume = volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume = 100;
    }
}
