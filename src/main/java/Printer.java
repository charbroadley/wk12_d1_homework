public class Printer {

    private int paperLeft;
    public int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }
    public int print(int copies) {
//         int paperNeeded = pages * copies;
        int result = 0;
        if(this.paperLeft >= copies){
            int printing = paperLeft - copies;
            result += printing;
            this.tonerVolume -= copies;
        }
        return result;

    }
}

//if(this.paperLeft >= copies){
//        this.paperLeft -= copies;
//        this.tonerVolume -= copies;
//        }
