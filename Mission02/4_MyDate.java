public class MyDate {
    private int day, month, year;
    int[] valid_day = {0, 31, 28, 31, 30, 31, 30 ,31 ,31 ,30 ,31 ,30 ,31};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid() {
        StringBuilder sb = new StringBuilder();
        sb.append(year+"년"+month+"월"+day+"일은 ");

        // 해당 월에 유효한 일인지 확인
        if (day <= valid_day[month]) {
            sb.append("유효한 날짜입니다.");
            return sb.toString();
        }

        // 윤년 계산
        if (month == 2 && day == 29) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                sb.append("유효한 날짜입니다.");
                return sb.toString();
            }
        }

        sb.append("유효하지 않은 날짜입니다.");
        return sb.toString();
    }
}
