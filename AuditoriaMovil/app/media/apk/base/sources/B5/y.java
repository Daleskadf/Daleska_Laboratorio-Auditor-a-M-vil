package B5;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import p.G0;
/* loaded from: classes.dex */
public final class y extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f389a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b5, Handler handler) {
        super(handler);
        this.f390b = b5;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f389a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        Cursor cursor;
        switch (this.f389a) {
            case 0:
                super.onChange(z7);
                B b5 = (B) this.f390b;
                if (b5.f295f0 != null) {
                    b5.d();
                    return;
                }
                return;
            default:
                G0 g02 = (G0) this.f390b;
                if (g02.f14131b && (cursor = g02.f14132c) != null && !cursor.isClosed()) {
                    g02.f14130a = g02.f14132c.requery();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(G0 g02) {
        super(new Handler());
        this.f390b = g02;
    }
}
