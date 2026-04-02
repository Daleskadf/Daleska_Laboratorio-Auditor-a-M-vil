package W;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
/* renamed from: W.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0361d {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z7) {
        builder.setAllowSystemGeneratedContextualActions(z7);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder, boolean z7) {
        builder.setContextual(z7);
    }

    public static void e(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }
}
