package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbsm extends zzazp implements zzbsn {
    public zzbsm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbsn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbsn ? (zzbsn) queryLocalInterface : new zzbsl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbsq zzbsqVar = null;
        zzbry zzbrwVar = null;
        zzbsh zzbsfVar = null;
        zzbsb zzbrzVar = null;
        zzbsk zzbsiVar = null;
        zzbsh zzbsfVar2 = null;
        zzbsk zzbsiVar2 = null;
        zzbse zzbscVar = null;
        zzbsb zzbrzVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbsqVar = queryLocalInterface instanceof zzbsq ? (zzbsq) queryLocalInterface : new zzbso(readStrongBinder);
            }
            zzbsq zzbsqVar2 = zzbsqVar;
            zzazq.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbsqVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbtc zzf = zzf();
            parcel2.writeNoException();
            zzazq.zze(parcel2, zzf);
        } else if (i == 3) {
            zzbtc zzg = zzg();
            parcel2.writeNoException();
            zzazq.zze(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zze = zze();
            parcel2.writeNoException();
            zzazq.zzf(parcel2, zze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrzVar2 = queryLocalInterface2 instanceof zzbsb ? (zzbsb) queryLocalInterface2 : new zzbrz(readStrongBinder2);
                    }
                    zzbsb zzbsbVar = zzbrzVar2;
                    zzazq.zzc(parcel);
                    zzj(readString2, readString3, zzlVar, asInterface2, zzbsbVar, zzbqt.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbscVar = queryLocalInterface3 instanceof zzbse ? (zzbse) queryLocalInterface3 : new zzbsc(readStrongBinder3);
                    }
                    zzbse zzbseVar = zzbscVar;
                    zzbqu zzb = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzl(readString4, readString5, zzlVar2, asInterface3, zzbseVar, zzb);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zzs = zzs(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbsiVar2 = queryLocalInterface4 instanceof zzbsk ? (zzbsk) queryLocalInterface4 : new zzbsi(readStrongBinder4);
                    }
                    zzbsk zzbskVar = zzbsiVar2;
                    zzbqu zzb2 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzp(readString6, readString7, zzlVar3, asInterface5, zzbskVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zzt = zzt(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbsfVar2 = queryLocalInterface5 instanceof zzbsh ? (zzbsh) queryLocalInterface5 : new zzbsf(readStrongBinder5);
                    }
                    zzbsh zzbshVar = zzbsfVar2;
                    zzbqu zzb3 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzm(readString8, readString9, zzlVar4, asInterface7, zzbshVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzazq.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbsiVar = queryLocalInterface6 instanceof zzbsk ? (zzbsk) queryLocalInterface6 : new zzbsi(readStrongBinder6);
                    }
                    zzbsk zzbskVar2 = zzbsiVar;
                    zzbqu zzb4 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzo(readString11, readString12, zzlVar5, asInterface8, zzbskVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrzVar = queryLocalInterface7 instanceof zzbsb ? (zzbsb) queryLocalInterface7 : new zzbrz(readStrongBinder7);
                    }
                    zzbsb zzbsbVar2 = zzbrzVar;
                    zzazq.zzc(parcel);
                    zzk(readString13, readString14, zzlVar6, asInterface9, zzbsbVar2, zzbqt.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbsfVar = queryLocalInterface8 instanceof zzbsh ? (zzbsh) queryLocalInterface8 : new zzbsf(readStrongBinder8);
                    }
                    zzbsh zzbshVar2 = zzbsfVar;
                    zzazq.zzc(parcel);
                    zzn(readString15, readString16, zzlVar7, asInterface10, zzbshVar2, zzbqt.zzb(parcel.readStrongBinder()), (zzbgt) zzazq.zza(parcel, zzbgt.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbrwVar = queryLocalInterface9 instanceof zzbry ? (zzbry) queryLocalInterface9 : new zzbrw(readStrongBinder9);
                    }
                    zzbry zzbryVar = zzbrwVar;
                    zzbqu zzb5 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzi(readString17, readString18, zzlVar8, asInterface11, zzbryVar, zzb5);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zzr = zzr(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
