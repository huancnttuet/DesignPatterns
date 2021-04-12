package StructuralPatterns.Brigde;

import StructuralPatterns.Brigde.devices.Device;
import StructuralPatterns.Brigde.devices.Radio;
import StructuralPatterns.Brigde.devices.Tv;
import StructuralPatterns.Brigde.remotes.AdvancedRemote;
import StructuralPatterns.Brigde.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
