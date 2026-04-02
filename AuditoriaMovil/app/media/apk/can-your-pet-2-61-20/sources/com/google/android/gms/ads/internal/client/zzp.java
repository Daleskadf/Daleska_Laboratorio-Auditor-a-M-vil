package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    protected zzp() {
    }

    public final zzl zza(Context context, zzdx zzdxVar) {
        Context context2;
        List list;
        String str;
        String zzk = zzdxVar.zzk();
        Set zzp = zzdxVar.zzp();
        if (zzp.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(zzp));
            context2 = context;
        }
        boolean zzr = zzdxVar.zzr(context2);
        Bundle zzf = zzdxVar.zzf(AdMobAdapter.class);
        String zzl = zzdxVar.zzl();
        SearchAdRequest zzi = zzdxVar.zzi();
        zzfh zzfhVar = zzi != null ? new zzfh(zzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            str = com.google.android.gms.ads.internal.util.client.zzf.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzq = zzdxVar.zzq();
        RequestConfiguration zzc = zzej.zzf().zzc();
        return new zzl(8, -1L, zzf, -1, list, zzr, Math.max(zzdxVar.zzb(), zzc.getTagForChildDirectedTreatment()), false, zzl, zzfhVar, null, zzk, zzdxVar.zzg(), zzdxVar.zze(), Collections.unmodifiableList(new ArrayList(zzdxVar.zzo())), zzdxVar.zzm(), str, zzq, null, zzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, zzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RequestConfiguration.zza.indexOf((String) obj) - RequestConfiguration.zza.indexOf((String) obj2);
            }
        }), zzdxVar.zzn(), zzdxVar.zza(), zzdxVar.zzj(), zzc.getPublisherPrivacyPersonalizationState().getValue(), zzdxVar.zzc());
    }
}
