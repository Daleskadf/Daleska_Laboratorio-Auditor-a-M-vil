package W;

import D.AbstractC0059i;
import android.app.Notification;
import android.os.Parcel;
import c.C0619a;
import c.InterfaceC0621c;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final String f5995a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5996b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5997c;

    /* renamed from: d  reason: collision with root package name */
    public final Notification f5998d;

    public H(String str, int i7, String str2, Notification notification) {
        this.f5995a = str;
        this.f5996b = i7;
        this.f5997c = str2;
        this.f5998d = notification;
    }

    public final void a(InterfaceC0621c interfaceC0621c) {
        String str = this.f5995a;
        int i7 = this.f5996b;
        String str2 = this.f5997c;
        C0619a c0619a = (C0619a) interfaceC0621c;
        c0619a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0621c.f8321g);
            obtain.writeString(str);
            obtain.writeInt(i7);
            obtain.writeString(str2);
            Notification notification = this.f5998d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0619a.f8319a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f5995a);
        sb.append(", id:");
        sb.append(this.f5996b);
        sb.append(", tag:");
        return AbstractC0059i.D(sb, this.f5997c, "]");
    }
}
