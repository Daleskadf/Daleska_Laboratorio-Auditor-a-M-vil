package W;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: W.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370m extends C {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6048e;
    public Object f;

    public C0370m(int i7) {
        this.f6048e = i7;
        switch (i7) {
            case 1:
                this.f = new ArrayList();
                return;
            default:
                return;
        }
    }

    @Override // W.C
    public final void b(B.a aVar) {
        switch (this.f6048e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) aVar.f225c).setBigContentTitle(this.f5992b).bigText((CharSequence) this.f);
                if (this.f5994d) {
                    bigText.setSummaryText(this.f5993c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) aVar.f225c).setBigContentTitle(this.f5992b);
                if (this.f5994d) {
                    bigContentTitle.setSummaryText(this.f5993c);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                return;
        }
    }

    @Override // W.C
    public final String c() {
        switch (this.f6048e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // W.C
    public final void g(Bundle bundle) {
        switch (this.f6048e) {
            case 0:
                super.g(bundle);
                this.f = bundle.getCharSequence("android.bigText");
                return;
            default:
                super.g(bundle);
                ArrayList arrayList = (ArrayList) this.f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                    return;
                }
                return;
        }
    }
}
