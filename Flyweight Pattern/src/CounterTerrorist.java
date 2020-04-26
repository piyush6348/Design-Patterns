public class CounterTerrorist implements IPlayer{
    // Intrinsic property
    private String task;

    // Extrinsic property
    private String weapon;

    public CounterTerrorist() {
        task = "Diffuse Bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "CounterTerrorist{" +
                "task='" + task + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
