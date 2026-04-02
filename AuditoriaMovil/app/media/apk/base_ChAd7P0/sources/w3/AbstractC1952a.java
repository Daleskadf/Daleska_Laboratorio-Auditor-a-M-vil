package w3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: w3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1952a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f16338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16339b;

    public AbstractC1952a(IBinder iBinder, String str) {
        this.f16338a = iBinder;
        this.f16339b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16338a;
    }

    public final void b(int i7, Parcel parcel) {
        try {
            this.f16338a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
