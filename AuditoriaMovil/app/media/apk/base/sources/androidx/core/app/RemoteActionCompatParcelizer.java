package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e2.AbstractC0961a;
import e2.C0962b;
import e2.InterfaceC0963c;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0961a abstractC0961a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0963c interfaceC0963c = remoteActionCompat.f7700a;
        boolean z7 = true;
        if (abstractC0961a.e(1)) {
            interfaceC0963c = abstractC0961a.h();
        }
        remoteActionCompat.f7700a = (IconCompat) interfaceC0963c;
        CharSequence charSequence = remoteActionCompat.f7701b;
        if (abstractC0961a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0962b) abstractC0961a).f10861e);
        }
        remoteActionCompat.f7701b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f7702c;
        if (abstractC0961a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0962b) abstractC0961a).f10861e);
        }
        remoteActionCompat.f7702c = charSequence2;
        remoteActionCompat.f7703d = (PendingIntent) abstractC0961a.g(remoteActionCompat.f7703d, 4);
        boolean z8 = remoteActionCompat.f7704e;
        if (abstractC0961a.e(5)) {
            if (((C0962b) abstractC0961a).f10861e.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        remoteActionCompat.f7704e = z8;
        boolean z9 = remoteActionCompat.f;
        if (abstractC0961a.e(6)) {
            if (((C0962b) abstractC0961a).f10861e.readInt() == 0) {
                z7 = false;
            }
            z9 = z7;
        }
        remoteActionCompat.f = z9;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        IconCompat iconCompat = remoteActionCompat.f7700a;
        abstractC0961a.i(1);
        abstractC0961a.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f7701b;
        abstractC0961a.i(2);
        Parcel parcel = ((C0962b) abstractC0961a).f10861e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f7702c;
        abstractC0961a.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC0961a.k(remoteActionCompat.f7703d, 4);
        boolean z7 = remoteActionCompat.f7704e;
        abstractC0961a.i(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f;
        abstractC0961a.i(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
