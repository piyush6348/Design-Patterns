public class DataManagerMultiThreadingSafe {
    // Volatile is present so that whenever someone accesses this value.
    // We fetch it from memory and not cache. This is done because multiple threads are involved.
    private volatile static DataManagerMultiThreadingSafe dataManager;

    public static DataManagerMultiThreadingSafe getInstance() {
        if (dataManager == null) {
            synchronized (DataManagerMultiThreadingSafe.class) {
                if (dataManager == null)
                    dataManager = new DataManagerMultiThreadingSafe();
            }
        }
        return dataManager;
    }

    private DataManagerMultiThreadingSafe() {}
}
