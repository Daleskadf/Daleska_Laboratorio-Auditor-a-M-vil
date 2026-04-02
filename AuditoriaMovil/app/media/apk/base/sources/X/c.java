package X;

import D.RunnableC0073x;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import p.C1570C;
/* loaded from: classes.dex */
public abstract class c {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor d(Context context) {
        return context.getMainExecutor();
    }

    public static int e(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String f(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params h(C1570C c1570c) {
        return c1570c.getTextMetricsParams();
    }

    public static int i(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri j(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean k(Handler handler, RunnableC0073x runnableC0073x, long j) {
        return handler.postDelayed(runnableC0073x, "retry_token", j);
    }

    public static void l(TextView textView, int i7) {
        textView.setFirstBaselineToTopHeight(i7);
    }

    public static boolean m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
