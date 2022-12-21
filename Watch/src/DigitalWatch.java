public class DigitalWatch extends BasicWatch
{
    public DigitalWatch(String material, String caseType, int width, int height, int thickness, int weight)
    {
        super(material, caseType, width, height, weight, thickness);
    }
     private int alarmHour;
     private int  alarmMinute;
     private String alarmPeriod;


    public void setAlaramMinute(int alarmMinute) {
        if(alarmMinute >=00 && alarmMinute <60)
        {
            this.alarmMinute = alarmMinute;
        }
    }

    public void setAlarmHour(int  alarmHour) {
        if(alarmHour >= 00 && alarmHour < 24)
        {
            this.alarmHour = alarmHour;
        }
    }
    public void setAlarmPeriod(String alarmPeriod) {
        if(alarmPeriod.equals("PM") || alarmPeriod.equals("AM") )
        {
            this.alarmPeriod = alarmPeriod;
        }
    }
    public void getAlarmTime()
    {
        System.out.println(alarmHour+":"+alarmMinute+":"+alarmPeriod);
    }

}