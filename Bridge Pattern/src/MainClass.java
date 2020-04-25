import Remote.RemoteControl;
import Remote.RemoteSimple;
import Remote.RemoteSmart;
import Television.ITelevision;
import Television.SonyTelevision;
import Television.XiaomiTelevision;
import Television.SamsungSmartTelevision;

public class MainClass {
    public static void main(String[] args) {
        ITelevision sonyTelevision = new SonyTelevision();
        RemoteControl simpleRemoteControl = new RemoteSimple(sonyTelevision);

        ITelevision xiaomiTelevision = new XiaomiTelevision();
        simpleRemoteControl = new RemoteSimple(xiaomiTelevision);

        ITelevision samsungSmartTelevision = new SamsungSmartTelevision();
        RemoteControl smartRemoteControl = new RemoteSmart(samsungSmartTelevision);
    }
}
