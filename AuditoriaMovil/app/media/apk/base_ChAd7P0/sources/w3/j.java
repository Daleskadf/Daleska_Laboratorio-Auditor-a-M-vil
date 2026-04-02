package w3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class j extends Binder implements IInterface {
    public j(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 > 16777215) {
            if (super.onTransact(i7, parcel, parcel2, i8)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return a(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
