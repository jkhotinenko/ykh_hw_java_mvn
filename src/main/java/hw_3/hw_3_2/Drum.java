package hw_3.hw_3_2;

class Drum implements Instrument {
    int size;

    public Drum(int size) {
        this.size = size;
    }

    public Drum() {
    }

    @Override
    public void Play() {
        System.out.println("Play the Drum have a size "+this.size+"mm");
    }
}
