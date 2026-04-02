package W;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public abstract class E {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static List c(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void d(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void e(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void f(Notification.Builder builder, boolean z7) {
        builder.setColorized(z7);
    }

    public static void g(Notification.Builder builder, int i7) {
        builder.setGroupAlertBehavior(i7);
    }

    public static void h(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void i(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void j(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }
}
