package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications;
    }

    private NotificationApiHelperForM() {
    }
}
