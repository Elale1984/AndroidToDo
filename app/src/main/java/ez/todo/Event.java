package ez.todo;

public class Event {

    int sHour, sMin, sDay, sMonth, sYear;
    int eHour, eMin, eDay, eMonth, eYear;
    String title, note, description, startDate, endDate, startTime, endTime, eMaridian, sMaridian;

    public String geteMaridian() {
        return eMaridian;
    }

    public void seteMaridian(String emaridian) {
        this.eMaridian = emaridian;
    }

    public String getsMaridian() {
        return sMaridian;
    }

    public void setsMaridian(String sMaridian) {
        this.sMaridian = sMaridian;
    }
    public int getsHour() {
        return sHour;
    }

    public void setsHour(int sHour) {
        this.sHour = sHour;
    }

    public int getsMin() {
        return sMin;
    }

    public void setsMin(int sMin) {
        this.sMin = sMin;
    }

    public int getsDay() {
        return sDay;
    }

    public void setsDay(int sDay) {
        this.sDay = sDay;
    }

    public int getsMonth() {
        return sMonth;
    }

    public void setsMonth(int sMonth) {
        this.sMonth = sMonth;
    }

    public int getsYear() {
        return sYear;
    }

    public void setsYear(int sYear) {
        this.sYear = sYear;
    }

    public int geteHour() {
        return eHour;
    }

    public void seteHour(int eHour) {
        this.eHour = eHour;
    }

    public int geteMin() {
        return eMin;
    }

    public void seteMin(int eMin) {
        this.eMin = eMin;
    }

    public int geteDay() {
        return eDay;
    }

    public void seteDay(int eDay) {
        this.eDay = eDay;
    }

    public int geteMonth() {
        return eMonth;
    }

    public void seteMonth(int e) {
        this.eMonth = eMonth;
    }

    public int geteYear() {
        return eYear;
    }

    public void seteYear(int eYear) {
        this.eYear = eYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {

        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = sMonth + "/" + sDay + "/" +sYear;;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = eMonth + "/" + eDay + "/" +eYear;;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = sHour + ":" + sMin + " " + sMaridian;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = eHour + ":" + eMin + " " + eMaridian;;
    }

    public Event(int sHour, int sMin, int sDay, int sMonth, int sYear, int eHour, int eMin,
                 int eDay, int eMonth, int eYear, String title, String note, String description,
                 String startDate, String endDate, String startTime, String endTime, String sMaridian, String eMaridian) {
        this.sHour = sHour;
        this.sMin = sMin;
        this.sDay = sDay;
        this.sMonth = sMonth;
        this.sYear = sYear;
        this.eHour = eHour;
        this.eMin = eMin;
        this.eDay = eDay;
        this.eMonth = eMonth;
        this.eYear = eYear;
        this.title = title;
        this.note = note;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sMaridian = sMaridian;
        this.eMaridian = eMaridian;
    }
}
