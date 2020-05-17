import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, IPlayer> playerHashMap = new HashMap<>();

    private static final String TERRORIST_PLAYER_KEY = "terrorist";
    private static final String COUNTER_TERRORIST_PLAYER_KEY = "counterTerrorist";

    public static IPlayer getTerroristPlayer() {
        if (playerHashMap.containsKey(TERRORIST_PLAYER_KEY)) {
            return playerHashMap.get(TERRORIST_PLAYER_KEY);
        }
        IPlayer terrorist = new Terrorist();
        playerHashMap.put(TERRORIST_PLAYER_KEY, terrorist);
        return terrorist;
    }

    public static IPlayer getCounterTerroristPlayer() {
        if (playerHashMap.containsKey(COUNTER_TERRORIST_PLAYER_KEY)) {
            return playerHashMap.get(COUNTER_TERRORIST_PLAYER_KEY);
        }
        IPlayer counterTerrorist = new CounterTerrorist();
        playerHashMap.put(COUNTER_TERRORIST_PLAYER_KEY, counterTerrorist);
        return counterTerrorist;
    }
}
