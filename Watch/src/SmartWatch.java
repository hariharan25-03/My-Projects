public class SmartWatch extends BasicWatch{
    public SmartWatch(String material, String caseType, int width, int height, int thickness, int weight)
    {
        super(material, caseType, width, height, weight, thickness);
    }

    public void stepCount()
    {
        System.out.println("The total step count is 1205");
    }

    public void  bluetooth()
    {
        System.out.println("Bluetooth is activated on");
    }
    public void pulseRate()
    {
        System.out.println("Detected Pulse Rate is 120-80mmHg ");
    }

}
















