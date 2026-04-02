package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzazp implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbqo zzf = zzbqn.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbqo zzf2 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbqo zzf3 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbhi zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzf4 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbxt zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbup zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzazq.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzazq.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbho zzj = zzj(asInterface9, asInterface10, asInterface11);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbqo zzf6 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbyj zzo = zzo(asInterface12, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbqo zzf7 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzc = zzc(asInterface13, zzqVar3, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzf8 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzazq.zzc(parcel);
                zzcap zzp = zzp(asInterface14, zzf8, readInt9);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzf9 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbui zzl = zzl(asInterface15, zzf9, readInt10);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzf10 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzblx zzc2 = zzblw.zzc(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbma zzk = zzk(asInterface16, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzf11 = zzbqn.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzazq.zzc(parcel);
                zzdj zzh = zzh(asInterface17, zzf11, readInt12);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
