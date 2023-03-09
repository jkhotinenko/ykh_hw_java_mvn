package hw_3.hw_3_2;

class Gitare implements Instrument {
    int nStr;

    public Gitare(int nStr) {
        this.nStr = nStr;
    }

    public Gitare() {
    }

    @Override
    public void Play() {
        System.out.println("Play the Gitare");
    }
}
