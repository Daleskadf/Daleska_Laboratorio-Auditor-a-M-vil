package org.apache.tika.utils;

import D.AbstractC0059i;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCalendar;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class DateUtils {
    private final List<DateFormat> iso8601InputFormats = loadDateFormats();
    public static final TimeZone UTC = DesugarTimeZone.getTimeZone("UTC");
    public static final TimeZone MIDDAY = DesugarTimeZone.getTimeZone("GMT-12:00");

    private static DateFormat createDateFormat(String str, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new DateFormatSymbols(Locale.US));
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    private static String doFormatDate(Calendar calendar) {
        return DesugarCalendar.toInstant(calendar).truncatedTo(ChronoUnit.SECONDS).toString();
    }

    public static String formatDate(Date date) {
        Calendar calendar = Calendar.getInstance(UTC, Locale.US);
        calendar.setTime(date);
        return doFormatDate(calendar);
    }

    public static String formatDateUnknownTimezone(Date date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        calendar.setTime(date);
        String formatDate = formatDate(calendar);
        return formatDate.substring(0, formatDate.length() - 1);
    }

    private List<DateFormat> loadDateFormats() {
        ArrayList arrayList = new ArrayList();
        TimeZone timeZone = UTC;
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", timeZone));
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", null));
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ss", null));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ss'Z'", timeZone));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ssZ", null));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ss", null));
        TimeZone timeZone2 = MIDDAY;
        arrayList.add(createDateFormat("yyyy-MM-dd", timeZone2));
        arrayList.add(createDateFormat("yyyy:MM:dd", timeZone2));
        return arrayList;
    }

    public Date tryToParse(String str) {
        int length = str.length();
        int i7 = length - 3;
        if (str.charAt(i7) == ':') {
            int i8 = length - 6;
            if (str.charAt(i8) == '+' || str.charAt(i8) == '-') {
                str = AbstractC0059i.z(str.substring(0, i7), str.substring(length - 2));
            }
        }
        for (DateFormat dateFormat : this.iso8601InputFormats) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static String formatDate(Calendar calendar) {
        return doFormatDate(calendar);
    }
}
