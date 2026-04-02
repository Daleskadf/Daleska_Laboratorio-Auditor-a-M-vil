package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public interface IDynamicLinksCallbacks extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements IDynamicLinksCallbacks {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        }

        @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
        public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IDynamicLinksCallbacks {
        private static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
        static final int TRANSACTION_onCreateShortDynamicLink = 2;
        static final int TRANSACTION_onGetDynamicLink = 1;

        /* loaded from: classes2.dex */
        public static class Proxy implements IDynamicLinksCallbacks {
            public static IDynamicLinksCallbacks sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
            public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (shortDynamicLinkImpl != null) {
                        obtain.writeInt(1);
                        shortDynamicLinkImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onCreateShortDynamicLink(status, shortDynamicLinkImpl);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks
            public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dynamicLinkData != null) {
                        obtain.writeInt(1);
                        dynamicLinkData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onGetDynamicLink(status, dynamicLinkData);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDynamicLinksCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDynamicLinksCallbacks)) {
                return (IDynamicLinksCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IDynamicLinksCallbacks getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDynamicLinksCallbacks iDynamicLinksCallbacks) {
            if (Proxy.sDefaultImpl == null) {
                if (iDynamicLinksCallbacks != null) {
                    Proxy.sDefaultImpl = iDynamicLinksCallbacks;
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
            Status status;
            Status status2;
            DynamicLinkData dynamicLinkData = null;
            ShortDynamicLinkImpl shortDynamicLinkImpl = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    status2 = Status.CREATOR.createFromParcel(parcel);
                } else {
                    status2 = null;
                }
                if (parcel.readInt() != 0) {
                    shortDynamicLinkImpl = ShortDynamicLinkImpl.CREATOR.createFromParcel(parcel);
                }
                onCreateShortDynamicLink(status2, shortDynamicLinkImpl);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                status = Status.CREATOR.createFromParcel(parcel);
            } else {
                status = null;
            }
            if (parcel.readInt() != 0) {
                dynamicLinkData = DynamicLinkData.CREATOR.createFromParcel(parcel);
            }
            onGetDynamicLink(status, dynamicLinkData);
            return true;
        }
    }

    void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl);

    void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData);
}
