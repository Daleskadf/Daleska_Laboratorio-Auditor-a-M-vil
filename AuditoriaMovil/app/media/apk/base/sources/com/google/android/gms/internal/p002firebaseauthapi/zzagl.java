package com.google.android.gms.internal.p002firebaseauthapi;

import a4.J;
import a4.K;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagl  reason: invalid package */
/* loaded from: classes.dex */
public final class zzagl {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahb zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private K zzk;
    private List<zzagz> zzl;
    private zzaj<J> zzm;

    public zzagl() {
        this.zzf = new zzahb();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzaj<J> zzd() {
        return this.zzm;
    }

    public final K zze() {
        return this.zzk;
    }

    public final zzahb zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzagz> zzk() {
        return this.zzl;
    }

    public final List<zzahc> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzagl zza(K k2) {
        this.zzk = k2;
        return this;
    }

    public final zzagl zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzagl zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzagl zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzagl(String str, String str2, boolean z7, String str3, String str4, zzahb zzahbVar, String str5, String str6, long j, long j8, boolean z8, K k2, List<zzagz> list, zzaj<J> zzajVar) {
        zzahb zzahbVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z7;
        this.zzd = str3;
        this.zze = str4;
        if (zzahbVar == null) {
            zzahbVar2 = new zzahb();
        } else {
            List<zzahc> zza = zzahbVar.zza();
            zzahb zzahbVar3 = new zzahb();
            if (zza != null) {
                zzahbVar3.zza().addAll(zza);
            }
            zzahbVar2 = zzahbVar3;
        }
        this.zzf = zzahbVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j8;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final zzagl zza(boolean z7) {
        this.zzj = z7;
        return this;
    }

    public final zzagl zza(zzaj<J> zzajVar) {
        I.i(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    public final zzagl zza(List<zzahc> list) {
        I.i(list);
        zzahb zzahbVar = new zzahb();
        this.zzf = zzahbVar;
        zzahbVar.zza().addAll(list);
        return this;
    }
}
