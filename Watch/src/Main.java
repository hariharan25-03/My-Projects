public class Main {
    public static void main(String[] args)
    {
       BasicWatch watch = new BasicWatch("stainlessSteel","Silicone",35,40,5,2);
       DigitalWatch digital = new DigitalWatch("Alloy","leather",30,42,4,6);
       SmartWatch smart = new SmartWatch("titanium","rubber",18,20,3,2);
       watch.showDate();
       watch.showTime();

       digital.setAlarmHour(12);
       digital.setAlaramMinute(45);
       digital.setAlarmPeriod("PM");
       digital.getAlarmTime();
       smart.bluetooth();
       smart.pulseRate();
       smart.stepCount();


    }
}