package projava;

import one.cafebabe.bc4j.BusinessCalendar;

import java.time.LocalDate;

import static one.cafebabe.bc4j.BusinessCalendar.JAPAN;


public class JapaneseHolidays2022 {
    public static void main(String[] args) {
        BusinessCalendar.newBuilder().holiday(JAPAN.PUBLIC_HOLIDAYS).build()
                .getHolidaysBetween(LocalDate.of(2022, 1, 1),
                        LocalDate.of(2022, 12, 31))
                .forEach(System.out::println);
        isSummerOlympicYear(2022);
    }

    /**
     * 渡された西暦年が夏季近代オリンピック開催年であるかどうかを判定する
     * @param year 西暦年
     * @return 夏季オリンピック開催年であればtrue
     * @throws IllegalArgumentException まだオリンピック開催が確定していない年を渡した場合
     */
    public static boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
        if (2032 < year) {
            throw new IllegalArgumentException("2032年までをサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }
}
