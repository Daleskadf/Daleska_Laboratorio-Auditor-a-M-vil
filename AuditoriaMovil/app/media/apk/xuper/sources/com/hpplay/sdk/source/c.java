package com.hpplay.sdk.source;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes3.dex */
public interface c extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements c {
        private static final String DESCRIPTOR = "com.hpplay.sdk.source.AICloudMirrorPlayListener";
        static final int TRANSACTION_onCloudMessage = 3;
        static final int TRANSACTION_onCloudMirrorStart = 1;
        static final int TRANSACTION_onCloudMirrorStop = 2;

        /* renamed from: com.hpplay.sdk.source.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0127a implements c {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7597a;

            public C0127a(IBinder iBinder) {
                this.f7597a = iBinder;
            }

            public String a() {
                return a.DESCRIPTOR;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7597a;
            }

            @Override // com.hpplay.sdk.source.c
            public void onCloudMessage(long j10, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeLong(j10);
                    obtain.writeString(str);
                    this.f7597a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hpplay.sdk.source.c
            public void onCloudMirrorStart(boolean z10, String str, String str2, String str3, String str4, String str5) {
                int i10;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    this.f7597a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.hpplay.sdk.source.c
            public void onCloudMirrorStop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    this.f7597a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0127a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 1598968902) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        parcel2.writeString(DESCRIPTOR);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    onCloudMessage(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onCloudMirrorStop();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            onCloudMirrorStart(z10, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onCloudMessage(long j10, String str);

    void onCloudMirrorStart(boolean z10, String str, String str2, String str3, String str4, String str5);

    void onCloudMirrorStop();
}
