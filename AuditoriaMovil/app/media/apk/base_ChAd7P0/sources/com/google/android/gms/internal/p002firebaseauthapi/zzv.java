package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzv {
    private final zzf zza;
    private final zzab zzb;
    private final int zzc;

    private zzv(zzab zzabVar) {
        this(zzabVar, false, zzj.zza, f.API_PRIORITY_OTHER);
    }

    public static zzv zza(char c8) {
        zzh zzhVar = new zzh(c8);
        zzw.zza(zzhVar);
        return new zzv(new zzy(zzhVar));
    }

    private zzv(zzab zzabVar, boolean z7, zzf zzfVar, int i7) {
        this.zzb = zzabVar;
        this.zza = zzfVar;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzv zza(String str) {
        zzl zza = zzr.zza(str);
        if (!zza.zza(StringUtils.EMPTY).zzc()) {
            return new zzv(new zzaa(zza));
        }
        throw new IllegalArgumentException(zzae.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzw.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
