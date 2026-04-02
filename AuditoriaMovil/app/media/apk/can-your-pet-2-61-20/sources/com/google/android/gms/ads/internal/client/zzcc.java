package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes.dex */
public final class zzcc extends zzazo implements zzce {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(3, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzdb.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(13, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(10, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(9, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzdb.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(17, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzdb.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhi zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, iObjectWrapper2);
        Parcel zzdb = zzdb(5, zza);
        zzbhi zzdA = zzbhh.zzdA(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbho zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, iObjectWrapper2);
        zzazq.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        zzbho zze = zzbhn.zze(zzdb.readStrongBinder());
        zzdb.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbma zzk(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i, zzblx zzblxVar) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        zzazq.zzf(zza, zzblxVar);
        Parcel zzdb = zzdb(16, zza);
        zzbma zzb = zzblz.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbui zzl(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(15, zza);
        zzbui zzb = zzbuh.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbup zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(8, zza);
        zzbup zzI = zzbuo.zzI(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxt zzn(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyj zzo(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(12, zza);
        zzbyj zzq = zzbyi.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcap zzp(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzazq.zzf(zza, iObjectWrapper);
        zzazq.zzf(zza, zzbqoVar);
        zza.writeInt(241199000);
        Parcel zzdb = zzdb(14, zza);
        zzcap zzb = zzcao.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }
}
