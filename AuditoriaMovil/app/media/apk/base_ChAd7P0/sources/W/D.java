package W;

import android.app.Notification;
import android.app.NotificationManager;
/* loaded from: classes.dex */
public abstract class D {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z7) {
        builder.setAllowGeneratedReplies(z7);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
