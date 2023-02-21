public class Printer {

    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }
//    public int print(int copies) {
//         int paperNeeded = pages * copies;
//        int result = 0;
//        if(this.paperLeft >= copies){
//            int printing = paperLeft - copies;
//            result += printing;
//            this.tonerVolume -= copies;
//        }
//        return result;
//
//    }
    public int getPaper() {
        return this.paperLeft;
    }
    public void print (int pages, int copies){
        int totalPages = pages * copies;

        if (this.paperLeft >= totalPages){
            this.paperLeft -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }
    public int getToner() {
        return this.tonerVolume;
    }
}

//if(this.paperLeft >= copies){
//        this.paperLeft -= copies;
//        this.tonerVolume -= copies;
//        }
