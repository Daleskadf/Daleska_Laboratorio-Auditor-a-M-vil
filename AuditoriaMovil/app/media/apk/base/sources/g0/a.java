package G0;

import W.C;
import W.u;
import android.app.Notification;
import android.os.Build;
/* loaded from: classes.dex */
public final class a extends C {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1348e;

    @Override // W.C
    public final void b(B.a aVar) {
        switch (this.f1348e) {
            case 0:
                ((Notification.Builder) aVar.f225c).setStyle(new Notification.MediaStyle());
                return;
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    ((Notification.Builder) aVar.f225c).setStyle(u.a());
                    return;
                }
                return;
        }
    }

    @Override // W.C
    public String c() {
        switch (this.f1348e) {
            case 1:
                return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
            default:
                return super.c();
        }
    }

    @Override // W.C
    public final void d() {
        switch (this.f1348e) {
            case 0:
                return;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f5991a.getClass();
                    this.f5991a.getClass();
                    return;
                }
                return;
        }
    }

    @Override // W.C
    public final void e() {
        switch (this.f1348e) {
            case 0:
                return;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f5991a.getClass();
                    return;
                }
                return;
        }
    }

    @Override // W.C
    public void f() {
        switch (this.f1348e) {
            case 1:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f5991a.getClass();
                    this.f5991a.getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void h() {
    }

    private final void i() {
    }
}
