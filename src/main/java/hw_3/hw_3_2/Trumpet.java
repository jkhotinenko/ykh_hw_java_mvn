package hw_3.hw_3_2;

class Trumpet implements Instrument {
    int diametr;

    public Trumpet(int diametr) {
        this.diametr = diametr;
    }

    public Trumpet() {
    }

    @Override
    public void Play() {
        System.out.println("Play the Trumplet with "+this.diametr+"mm diametr");
    }
}
