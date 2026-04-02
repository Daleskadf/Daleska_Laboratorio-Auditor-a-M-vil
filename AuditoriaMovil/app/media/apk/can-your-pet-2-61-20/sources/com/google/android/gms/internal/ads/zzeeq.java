package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdg;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeeq {
    private final zzbcx zza;
    private final Context zzb;
    private final zzedv zzc;
    private final VersionInfoParcel zzd;

    public zzeeq(Context context, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, zzedv zzedvVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbcxVar;
        this.zzc = zzedvVar;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzeen
                @Override // com.google.android.gms.internal.ads.zzfjq
                public final Object zza(Object obj) {
                    zzeeq.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbdg.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhak e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbdg.zzaf.zzc zzi = zzbdg.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzeek.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzeek.zza(sQLiteDatabase, 1));
            zzi.zzx(zzeek.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzi.zzB(zzeek.zzb(sQLiteDatabase, 2));
            final zzbdg.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                zzbdg.zzaf.zza zzaVar = (zzbdg.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == zzbdg.zzq.ENUM_TRUE && zzaVar.zze() > j) {
                    j = zzaVar.zze();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzeeo
                @Override // com.google.android.gms.internal.ads.zzbcw
                public final void zza(zzbdg.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbdg.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbdg.zzar.zza zzd = zzbdg.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(this.zzd.clientJarVersion);
            zzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbdg.zzar zzbr2 = zzd.zzbr();
            this.zza.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzeep
                @Override // com.google.android.gms.internal.ads.zzbcw
                public final void zza(zzbdg.zzt.zza zzaVar2) {
                    zzbdg.zzm.zza zzcZ = zzaVar2.zzg().zzcZ();
                    zzcZ.zzw(zzbdg.zzar.this);
                    zzaVar2.zzK(zzcZ);
                }
            });
            this.zza.zzb(zzbcz.OFFLINE_UPLOAD);
            zzeek.zze(sQLiteDatabase);
        } else {
            this.zzb.deleteDatabase("OfflineUpload.db");
        }
        return null;
    }
}
