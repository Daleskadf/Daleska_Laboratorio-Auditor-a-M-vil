package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.entity.ConnType;
/* loaded from: classes.dex */
public final class zzs {
    private final zzfr zza;

    public zzs(zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    public final void zza(String str, Bundle bundle) {
        String uri;
        this.zza.zzaz().zzg();
        if (!this.zza.zzJ()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = ConnType.PK_AUTO;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.zza.zzm().zzq.zzb(uri);
                this.zza.zzm().zzr.zzb(this.zza.zzav().currentTimeMillis());
            }
        }
    }

    public final void zzb() {
        String str;
        this.zza.zzaz().zzg();
        if (!zzd()) {
            return;
        }
        if (zze()) {
            this.zza.zzm().zzq.zzb(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.zza.zzq().zzG(ConnType.PK_AUTO, "_cmpx", bundle);
        } else {
            String zza = this.zza.zzm().zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                this.zza.zzay().zzh().zza("Cache still valid but referrer not found");
            } else {
                long zza2 = ((this.zza.zzm().zzr.zza() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(zza);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", zza2);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.zza.zzq().zzG(str, "_cmp", (Bundle) pair.second);
            }
            this.zza.zzm().zzq.zzb(null);
        }
        this.zza.zzm().zzr.zzb(0L);
    }

    public final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzq.zzb(null);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzm().zzr.zza() > 0) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        if (!zzd() || this.zza.zzav().currentTimeMillis() - this.zza.zzm().zzr.zza() <= this.zza.zzf().zzi(null, zzdu.zzQ)) {
            return false;
        }
        return true;
    }
}
