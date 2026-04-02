package com.google.android.gms.internal.p002firebaseauthapi;

import Z2.a;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import p3.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafi  reason: invalid package */
/* loaded from: classes.dex */
public final class zzafi extends zzadp {
    private final String zza;
    private final /* synthetic */ zzafd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafi(zzafd zzafdVar, zzadp zzadpVar, String str) {
        super(zzadpVar);
        this.zzb = zzafdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadp
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzafd.zza;
        StringBuilder m7 = Y.m("SMS verification code request failed: ", z.a(status.f9153a), StringUtils.SPACE);
        m7.append(status.f9154b);
        aVar.c(m7.toString(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        for (zzadp zzadpVar : zzafkVar.zzb) {
            zzadpVar.zza(status);
        }
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadp
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzafd.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        for (zzadp zzadpVar : zzafkVar.zzb) {
            zzadpVar.zzb(str);
        }
        zzafkVar.zzg = true;
        zzafkVar.zzd = str;
        if (zzafkVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzafkVar.zzc) {
            this.zzb.zzd(this.zza);
        } else if (!zzae.zzc(zzafkVar.zze)) {
            zzafd.zzb(this.zzb, this.zza);
        }
    }
}
