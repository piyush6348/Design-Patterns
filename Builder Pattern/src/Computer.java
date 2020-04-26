public class Computer {
    // Required parameters
    String HDD;
    String RAM;

    // Optional parameters
    String graphicCard;
    String speaker;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.graphicCard = builder.graphicCard;
        this.speaker  = builder.speaker;
    }

    public static class ComputerBuilder {
        // Required parameters
        private String HDD;
        private String RAM;

        // Optional parameters
        private String graphicCard;
        private String speaker;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
