package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfu;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzy {
    private zzfu.zze zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfu.zze zza(String str, zzfu.zze zzeVar) {
        String zzg = zzeVar.zzg();
        List<zzfu.zzg> zzh = zzeVar.zzh();
        this.zzd.g_();
        Long l = (Long) zznr.zzb(zzeVar, "_eid");
        boolean z = true;
        boolean z2 = l != null;
        if ((z2 && zzg.equals("_ep")) ? false : false) {
            Preconditions.checkNotNull(l);
            this.zzd.g_();
            zzg = (String) zznr.zzb(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzm().zza("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                Pair<zzfu.zze, Long> zza = this.zzd.zzh().zza(str, l);
                if (zza == null || zza.first == null) {
                    this.zzd.zzj().zzm().zza("Extra parameter without existing main event. eventName, eventId", zzg, l);
                    return null;
                }
                this.zza = (zzfu.zze) zza.first;
                this.zzc = ((Long) zza.second).longValue();
                this.zzd.g_();
                this.zzb = (Long) zznr.zzb(this.zza, "_eid");
            }
            long j = this.zzc - 1;
            this.zzc = j;
            if (j <= 0) {
                zzal zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzh2.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    zzh2.zzj().zzg().zza("Error clearing complex main event", e);
                }
            } else {
                this.zzd.zzh().zza(str, l, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfu.zzg zzgVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zznr.zza(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zzh);
                zzh = arrayList;
            } else {
                this.zzd.zzj().zzm().zza("No unique parameters in main event. eventName", zzg);
            }
        } else if (z2) {
            this.zzb = l;
            this.zza = zzeVar;
            this.zzd.g_();
            Object zzb = zznr.zzb(zzeVar, "_epc");
            long longValue = ((Long) (zzb != null ? zzb : 0L)).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzm().zza("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l), this.zzc, zzeVar);
            }
        }
        return (zzfu.zze) ((com.google.android.gms.internal.measurement.zzjv) zzeVar.zzca().zza(zzg).zzd().zza(zzh).zzah());
    }

    private zzy(zzu zzuVar) {
        this.zzd = zzuVar;
    }
}
