package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
/* loaded from: classes2.dex */
public interface IDynamicLinksService extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements IDynamicLinksService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
        public void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) {
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
        public void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IDynamicLinksService {
        private static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
        static final int TRANSACTION_createShortDynamicLink = 2;
        static final int TRANSACTION_getDynamicLink = 1;

        /* loaded from: classes2.dex */
        public static class Proxy implements IDynamicLinksService {
            public static IDynamicLinksService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (iDynamicLinksCallbacks != null) {
                        iBinder = iDynamicLinksCallbacks.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().createShortDynamicLink(iDynamicLinksCallbacks, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (iDynamicLinksCallbacks != null) {
                        iBinder = iDynamicLinksCallbacks.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getDynamicLink(iDynamicLinksCallbacks, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
            }
        }

        public Stub() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        }

        public static IDynamicLinksService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDynamicLinksService)) {
                return (IDynamicLinksService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IDynamicLinksService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDynamicLinksService iDynamicLinksService) {
            if (Proxy.sDefaultImpl == null) {
                if (iDynamicLinksService != null) {
                    Proxy.sDefaultImpl = iDynamicLinksService;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle bundle;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    return true;
                }
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                IDynamicLinksCallbacks asInterface = IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                createShortDynamicLink(asInterface, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            getDynamicLink(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle);

    void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str);
}
