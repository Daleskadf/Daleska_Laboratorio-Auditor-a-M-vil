package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.os.Handler;
import android.view.MenuItem;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public abstract class b {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float b(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float e(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float f(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean g(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean h(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean i(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        if ((i7 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, d.obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1);
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7);
    }

    public static void l(MenuItem menuItem, char c8, int i7) {
        menuItem.setAlphabeticShortcut(c8, i7);
    }

    public static void m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void n(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void o(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void p(MenuItem menuItem, char c8, int i7) {
        menuItem.setNumericShortcut(c8, i7);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void r(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
