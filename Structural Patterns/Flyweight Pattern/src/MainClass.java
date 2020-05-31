public class MainClass {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if (i%2 == 1) {
                IPlayer terrorist = PlayerFactory.getTerroristPlayer();
                terrorist.assignWeapon("Terrorist Weapon " + String.valueOf(i));
                System.out.println(terrorist);
            } else {
                IPlayer counterTerrorist = PlayerFactory.getCounterTerroristPlayer();
                counterTerrorist.assignWeapon("Counter terrorist Weapon " + String.valueOf(i));
                System.out.println(counterTerrorist);
            }
        }
    }
}
