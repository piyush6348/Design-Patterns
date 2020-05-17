public class MainClass {
    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("1 TB", "16 GB");
        Computer computer = builder.setGraphicCard("820 M")
                .setSpeaker("Bose")
                .build();

    }
}
