package W;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
/* renamed from: W.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0374q {
    public static void b(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static Parcelable a(Icon icon) {
        return icon;
    }
}
