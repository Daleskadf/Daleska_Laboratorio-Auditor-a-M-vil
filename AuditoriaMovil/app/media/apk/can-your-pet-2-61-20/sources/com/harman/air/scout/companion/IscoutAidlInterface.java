package com.harman.air.scout.companion;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes4.dex */
public interface IscoutAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "com.harman.air.scout.companion.IscoutAidlInterface";

    /* loaded from: classes4.dex */
    public static class Default implements IscoutAidlInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.harman.air.scout.companion.IscoutAidlInterface
        public Map getScoutConfigure() throws RemoteException {
            return null;
        }
    }

    Map getScoutConfigure() throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IscoutAidlInterface {
        static final int TRANSACTION_getScoutConfigure = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IscoutAidlInterface.DESCRIPTOR);
        }

        public static IscoutAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IscoutAidlInterface.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IscoutAidlInterface)) {
                return (IscoutAidlInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IscoutAidlInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IscoutAidlInterface.DESCRIPTOR);
                return true;
            } else if (i == 1) {
                Map scoutConfigure = getScoutConfigure();
                parcel2.writeNoException();
                parcel2.writeMap(scoutConfigure);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes4.dex */
        private static class Proxy implements IscoutAidlInterface {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IscoutAidlInterface.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.harman.air.scout.companion.IscoutAidlInterface
            public Map getScoutConfigure() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IscoutAidlInterface.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
