package p2;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import h0.C1036P;
import kotlin.jvm.internal.j;
/* renamed from: p2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1658a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1658a f15081a = new Object();

    public final C1036P a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        j.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        j.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return C1036P.c(null, windowInsets);
    }
}
