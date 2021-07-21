public class Student {

    private String name;
    private int math;
    private int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public int getAverage() {
        return (math + english) / 2;
    }

    public String getGarding() {
        String garding = "F";
        switch (getAverage()/10){
            case 10:
            case 9:
                garding = "A";
                break;
            case 8:
                garding = "B";
                break;
            case 7:
                garding = "C";
                break;
            case 6:
                garding = "D";
                break;
            default:
                break;
        }

        return garding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
