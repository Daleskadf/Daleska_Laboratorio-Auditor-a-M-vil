package com.distriqt.extension.inappbilling.controller;

import com.distriqt.extension.inappbilling.utils.Errors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SubscriptionPeriod {
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    public static final String UNIT_DAY = "day";
    public static final String UNIT_MONTH = "month";
    public static final String UNIT_WEEK = "week";
    public static final String UNIT_YEAR = "year";
    public int numberOfUnits;
    public String unit;

    public SubscriptionPeriod() {
        this.numberOfUnits = 0;
        this.unit = "";
    }

    public SubscriptionPeriod(String str, int i) {
        this.unit = str;
        this.numberOfUnits = i;
    }

    public static SubscriptionPeriod fromIOS8601(String str) {
        SubscriptionPeriod subscriptionPeriod = new SubscriptionPeriod();
        try {
            Matcher matcher = PATTERN.matcher(str);
            if (matcher.matches()) {
                int i = "-".equals(matcher.group(1)) ? -1 : 1;
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                String group4 = matcher.group(5);
                if (group != null || group2 != null || group4 != null || group3 != null) {
                    int parseNumber = parseNumber(group, i);
                    int parseNumber2 = parseNumber(group2, i);
                    int parseNumber3 = parseNumber(group3, i);
                    int parseNumber4 = parseNumber(group4, i);
                    if (parseNumber > 0) {
                        subscriptionPeriod.unit = UNIT_YEAR;
                        subscriptionPeriod.numberOfUnits = parseNumber;
                    } else if (parseNumber2 > 0) {
                        subscriptionPeriod.unit = UNIT_MONTH;
                        subscriptionPeriod.numberOfUnits = parseNumber2;
                    } else if (parseNumber3 > 0) {
                        subscriptionPeriod.unit = UNIT_WEEK;
                        subscriptionPeriod.numberOfUnits = parseNumber3;
                    } else if (parseNumber4 > 0) {
                        subscriptionPeriod.unit = UNIT_DAY;
                        subscriptionPeriod.numberOfUnits = parseNumber4;
                    }
                }
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return subscriptionPeriod;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("numberOfUnits", this.numberOfUnits);
            jSONObject.put("unit", this.unit);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static int parseNumber(String str, int i) throws Exception {
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str) * i;
    }
}
