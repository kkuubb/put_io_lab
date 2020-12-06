package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{

    private int USB_devices = 0;

    @Override
    public void update(SystemMonitor monitor) {
        SystemState lastSystemState = monitor.getLastSystemState();

        if (lastSystemState.getUsbDevices() != USB_devices){
            USB_devices = lastSystemState.getUsbDevices();
            System.out.println("Number of USB devices has changed to " + USB_devices);
        }
    }
}
