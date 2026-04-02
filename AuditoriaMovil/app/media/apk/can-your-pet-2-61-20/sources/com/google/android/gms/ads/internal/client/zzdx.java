package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes.dex */
public final class zzdx {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final Map zze;
    private final String zzf;
    private final String zzg;
    @NotOnlyInitialized
    private final SearchAdRequest zzh;
    private final int zzi;
    private final Set zzj;
    private final Bundle zzk;
    private final Set zzl;
    private final boolean zzm;
    private final String zzn;
    private final int zzo;
    private final long zzp = System.currentTimeMillis();

    public zzdx(zzdw zzdwVar, SearchAdRequest searchAdRequest) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z;
        String str4;
        int i2;
        str = zzdwVar.zzg;
        this.zza = str;
        list = zzdwVar.zzh;
        this.zzb = list;
        hashSet = zzdwVar.zza;
        this.zzc = Collections.unmodifiableSet(hashSet);
        bundle = zzdwVar.zzb;
        this.zzd = bundle;
        hashMap = zzdwVar.zzc;
        this.zze = Collections.unmodifiableMap(hashMap);
        str2 = zzdwVar.zzi;
        this.zzf = str2;
        str3 = zzdwVar.zzj;
        this.zzg = str3;
        this.zzh = searchAdRequest;
        i = zzdwVar.zzk;
        this.zzi = i;
        hashSet2 = zzdwVar.zzd;
        this.zzj = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzdwVar.zze;
        this.zzk = bundle2;
        hashSet3 = zzdwVar.zzf;
        this.zzl = Collections.unmodifiableSet(hashSet3);
        z = zzdwVar.zzl;
        this.zzm = z;
        str4 = zzdwVar.zzm;
        this.zzn = str4;
        i2 = zzdwVar.zzn;
        this.zzo = i2;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzp;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzk;
    }

    public final Bundle zzf(Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.zzd;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.zze.get(cls);
    }

    public final SearchAdRequest zzi() {
        return this.zzh;
    }

    public final String zzj() {
        return this.zzn;
    }

    public final String zzk() {
        return this.zza;
    }

    public final String zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final List zzn() {
        return new ArrayList(this.zzb);
    }

    public final Set zzo() {
        return this.zzl;
    }

    public final Set zzp() {
        return this.zzc;
    }

    @Deprecated
    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr(Context context) {
        RequestConfiguration zzc = zzej.zzf().zzc();
        zzay.zzb();
        Set set = this.zzj;
        String zzz = com.google.android.gms.ads.internal.util.client.zzf.zzz(context);
        return set.contains(zzz) || zzc.getTestDeviceIds().contains(zzz);
    }
}
