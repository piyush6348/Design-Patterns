import Components.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheatreLights theatreLights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheatreLights theatreLights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theatreLights = theatreLights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        popper.pop();
        theatreLights.on();
        screen.on();
        dvdPlayer.on();
        cdPlayer.on();
        tuner.on();
        amplifier.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        popper.off();
        theatreLights.off();
        screen.off();
        dvdPlayer.off();
        cdPlayer.off();
        tuner.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
