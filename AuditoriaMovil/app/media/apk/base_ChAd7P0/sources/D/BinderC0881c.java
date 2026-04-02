package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: d.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0881c extends Binder implements InterfaceC0880b {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f10159b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0882d f10160a;

    public BinderC0881c(C0882d c0882d) {
        this.f10160a = c0882d;
        attachInterface(this, InterfaceC0880b.f10158h);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        Object obj;
        String str = InterfaceC0880b.f10158h;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            C0882d c0882d = this.f10160a;
            c0882d.getClass();
            c0882d.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
