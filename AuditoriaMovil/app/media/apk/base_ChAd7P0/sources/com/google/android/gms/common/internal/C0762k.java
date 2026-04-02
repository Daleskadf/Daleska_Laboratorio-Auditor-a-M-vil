package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
/* renamed from: com.google.android.gms.common.internal.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762k extends X2.a {
    public static final Parcelable.Creator<C0762k> CREATOR = new android.support.v4.media.session.b(12);

    /* renamed from: j0  reason: collision with root package name */
    public static final Scope[] f9365j0 = new Scope[0];

    /* renamed from: k0  reason: collision with root package name */
    public static final W2.d[] f9366k0 = new W2.d[0];

    /* renamed from: X  reason: collision with root package name */
    public Bundle f9367X;

    /* renamed from: Y  reason: collision with root package name */
    public Account f9368Y;

    /* renamed from: Z  reason: collision with root package name */
    public W2.d[] f9369Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f9370a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9371b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9372c;

    /* renamed from: d  reason: collision with root package name */
    public String f9373d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f9374e;

    /* renamed from: e0  reason: collision with root package name */
    public W2.d[] f9375e0;
    public Scope[] f;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f9376f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f9377g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9378h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f9379i0;

    public C0762k(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, W2.d[] dVarArr, W2.d[] dVarArr2, boolean z7, int i10, boolean z8, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        W2.d[] dVarArr3;
        Account account2;
        IInterface zzaVar;
        if (scopeArr == null) {
            scopeArr2 = f9365j0;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        W2.d[] dVarArr4 = f9366k0;
        if (dVarArr == null) {
            dVarArr3 = dVarArr4;
        } else {
            dVarArr3 = dVarArr;
        }
        dVarArr4 = dVarArr2 != null ? dVarArr2 : dVarArr4;
        this.f9370a = i7;
        this.f9371b = i8;
        this.f9372c = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f9373d = "com.google.android.gms";
        } else {
            this.f9373d = str;
        }
        if (i7 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0752a.f9348a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC0766o) {
                    zzaVar = (InterfaceC0766o) queryLocalInterface;
                } else {
                    zzaVar = new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                }
                if (zzaVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            V v6 = (V) zzaVar;
                            Parcel zzB = v6.zzB(2, v6.zza());
                            Account account3 = (Account) zzc.zza(zzB, Account.CREATOR);
                            zzB.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f9374e = iBinder;
            account2 = account;
        }
        this.f9368Y = account2;
        this.f = scopeArr2;
        this.f9367X = bundle2;
        this.f9369Z = dVarArr3;
        this.f9375e0 = dVarArr4;
        this.f9376f0 = z7;
        this.f9377g0 = i10;
        this.f9378h0 = z8;
        this.f9379i0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        android.support.v4.media.session.b.a(this, parcel, i7);
    }
}
