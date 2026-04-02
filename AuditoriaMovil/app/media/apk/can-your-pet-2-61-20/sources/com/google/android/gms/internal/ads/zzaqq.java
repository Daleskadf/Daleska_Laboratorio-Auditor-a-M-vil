package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzaqq implements Comparable {
    private final zzarb zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaqu zzf;
    private Integer zzg;
    private zzaqt zzh;
    private boolean zzi;
    private zzapz zzj;
    private zzaqp zzk;
    private final zzaqe zzl;

    public zzaqq(int i, String str, zzaqu zzaquVar) {
        Uri parse;
        String host;
        this.zza = zzarb.zza ? new zzarb() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaquVar;
        this.zzl = new zzaqe();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaqq) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzapz zzd() {
        return this.zzj;
    }

    public final zzaqq zze(zzapz zzapzVar) {
        this.zzj = zzapzVar;
        return this;
    }

    public final zzaqq zzf(zzaqt zzaqtVar) {
        this.zzh = zzaqtVar;
        return this;
    }

    public final zzaqq zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzaqw zzh(zzaqm zzaqmVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i != 0) {
            String num = Integer.toString(1);
            return num + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzapy {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzarb.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaqz zzaqzVar) {
        zzaqu zzaquVar;
        synchronized (this.zze) {
            zzaquVar = this.zzf;
        }
        zzaquVar.zza(zzaqzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzaqt zzaqtVar = this.zzh;
        if (zzaqtVar != null) {
            zzaqtVar.zzb(this);
        }
        if (zzarb.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaqo(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzaqp zzaqpVar;
        synchronized (this.zze) {
            zzaqpVar = this.zzk;
        }
        if (zzaqpVar != null) {
            zzaqpVar.zza(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(zzaqw zzaqwVar) {
        zzaqp zzaqpVar;
        synchronized (this.zze) {
            zzaqpVar = this.zzk;
        }
        if (zzaqpVar != null) {
            zzaqpVar.zzb(this, zzaqwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(int i) {
        zzaqt zzaqtVar = this.zzh;
        if (zzaqtVar != null) {
            zzaqtVar.zzc(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(zzaqp zzaqpVar) {
        synchronized (this.zze) {
            this.zzk = zzaqpVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzapy {
        return null;
    }

    public final zzaqe zzy() {
        return this.zzl;
    }
}
