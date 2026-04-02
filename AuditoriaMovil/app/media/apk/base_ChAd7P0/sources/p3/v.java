package p3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final DecimalFormat f15139a;

    /* renamed from: b  reason: collision with root package name */
    public static final DecimalFormat f15140b;

    static {
        Locale locale = Locale.ROOT;
        f15139a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f15140b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
