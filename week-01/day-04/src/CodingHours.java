public class CodingHours {
    public static void main(String[] args) {
        int CodePerDay = 6;
        int WeekCoding = 5 * CodePerDay;
        int SemesterWeeks = 17;
        int FullTime = SemesterWeeks * 52;

        System.out.println(WeekCoding * SemesterWeeks);
        System.out.println(WeekCoding / 52. * 100);
        System.out.println(FullTime);

    }

}
