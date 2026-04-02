package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzajq implements zzanm {
    private final zzajo zza;

    private zzajq(zzajo zzajoVar) {
        zzajo zzajoVar2 = (zzajo) zzaki.zza(zzajoVar, "output");
        this.zza = zzajoVar2;
        zzajoVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, List<Double> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzajt)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zza(list.get(i10).doubleValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzb(list.get(i8).doubleValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzb(i7, list.get(i8).doubleValue());
                i8++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzajtVar.size(); i12++) {
                i11 += zzajo.zza(zzajtVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzajtVar.size()) {
                this.zza.zzb(zzajtVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzajtVar.size()) {
            this.zza.zzb(i7, zzajtVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzakj)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zza(list.get(i10).intValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzj(list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzh(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzakjVar.size(); i12++) {
                i11 += zzajo.zza(zzakjVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzakjVar.size()) {
                this.zza.zzj(zzakjVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzakjVar.size()) {
            this.zza.zzh(i7, zzakjVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzakj)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zzb(list.get(i10).intValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzi(list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzg(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzakjVar.size(); i12++) {
                i11 += zzajo.zzb(zzakjVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzakjVar.size()) {
                this.zza.zzi(zzakjVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzakjVar.size()) {
            this.zza.zzg(i7, zzakjVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzaky)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zza(list.get(i10).longValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzf(list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzf(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzakyVar.size(); i12++) {
                i11 += zzajo.zza(zzakyVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzakyVar.size()) {
                this.zza.zzf(zzakyVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzakyVar.size()) {
            this.zza.zzf(i7, zzakyVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i7, List<Float> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzake)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zza(list.get(i10).floatValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzb(list.get(i8).floatValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzb(i7, list.get(i8).floatValue());
                i8++;
            }
            return;
        }
        zzake zzakeVar = (zzake) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzakeVar.size(); i12++) {
                i11 += zzajo.zza(zzakeVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzakeVar.size()) {
                this.zza.zzb(zzakeVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzakeVar.size()) {
            this.zza.zzb(i7, zzakeVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzg(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakjVar.size(); i10++) {
                    i9 += zzajo.zzc(zzakjVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakjVar.size()) {
                    this.zza.zzj(zzakjVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakjVar.size()) {
                this.zza.zzh(i7, zzakjVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzc(list.get(i12).intValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzj(list.get(i8).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, list.get(i8).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzh(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakyVar.size(); i10++) {
                    i9 += zzajo.zzb(zzakyVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakyVar.size()) {
                    this.zza.zzh(zzakyVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakyVar.size()) {
                this.zza.zzh(i7, zzakyVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzb(list.get(i12).longValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, list.get(i8).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzi(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakjVar.size(); i10++) {
                    i9 += zzajo.zze(zzakjVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakjVar.size()) {
                    this.zza.zzi(zzakjVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakjVar.size()) {
                this.zza.zzg(i7, zzakjVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zze(list.get(i12).intValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzi(list.get(i8).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzg(i7, list.get(i8).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzj(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakyVar.size(); i10++) {
                    i9 += zzajo.zzc(zzakyVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakyVar.size()) {
                    this.zza.zzf(zzakyVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakyVar.size()) {
                this.zza.zzf(i7, zzakyVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzc(list.get(i12).longValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzf(list.get(i8).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzf(i7, list.get(i8).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzk(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakjVar.size(); i10++) {
                    i9 += zzajo.zzf(zzakjVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakjVar.size()) {
                    this.zza.zzk(zzakjVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakjVar.size()) {
                this.zza.zzi(i7, zzakjVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzf(list.get(i12).intValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzk(list.get(i8).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzi(i7, list.get(i8).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzl(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakyVar.size(); i10++) {
                    i9 += zzajo.zzd(zzakyVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakyVar.size()) {
                    this.zza.zzg(zzakyVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakyVar.size()) {
                this.zza.zzg(i7, zzakyVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzd(list.get(i12).longValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzg(list.get(i8).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzg(i7, list.get(i8).longValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzm(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakjVar.size(); i10++) {
                    i9 += zzajo.zzh(zzakjVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakjVar.size()) {
                    this.zza.zzl(zzakjVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakjVar.size()) {
                this.zza.zzk(i7, zzakjVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zzh(list.get(i12).intValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzl(list.get(i8).intValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzk(i7, list.get(i8).intValue());
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzn(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < zzakyVar.size(); i10++) {
                    i9 += zzajo.zze(zzakyVar.zzb(i10));
                }
                this.zza.zzl(i9);
                while (i8 < zzakyVar.size()) {
                    this.zza.zzh(zzakyVar.zzb(i8));
                    i8++;
                }
                return;
            }
            while (i8 < zzakyVar.size()) {
                this.zza.zzh(i7, zzakyVar.zzb(i8));
                i8++;
            }
        } else if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzajo.zze(list.get(i12).longValue());
            }
            this.zza.zzl(i11);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
        } else {
            while (i8 < list.size()) {
                this.zza.zzh(i7, list.get(i8).longValue());
                i8++;
            }
        }
    }

    public static zzajq zza(zzajo zzajoVar) {
        zzajq zzajqVar = zzajoVar.zza;
        return zzajqVar != null ? zzajqVar : new zzajq(zzajoVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, boolean z7) {
        this.zza.zzb(i7, z7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, List<Boolean> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzaiu)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajo.zza(list.get(i10).booleanValue());
                }
                this.zza.zzl(i9);
                while (i8 < list.size()) {
                    this.zza.zzb(list.get(i8).booleanValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzb(i7, list.get(i8).booleanValue());
                i8++;
            }
            return;
        }
        zzaiu zzaiuVar = (zzaiu) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzaiuVar.size(); i12++) {
                i11 += zzajo.zza(zzaiuVar.zzb(i12));
            }
            this.zza.zzl(i11);
            while (i8 < zzaiuVar.size()) {
                this.zza.zzb(zzaiuVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzaiuVar.size()) {
            this.zza.zzb(i7, zzaiuVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i7, int i8) {
        this.zza.zzi(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i7, int i8) {
        this.zza.zzk(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i7, long j) {
        this.zza.zzg(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, Object obj, zzamc zzamcVar) {
        this.zza.zzc(i7, (zzaln) obj, zzamcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, zzaiw zzaiwVar) {
        this.zza.zzc(i7, zzaiwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, List<?> list, zzamc zzamcVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzb(i7, list.get(i8), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, List<zzaiw> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzc(i7, list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zzb(int i7) {
        this.zza.zzj(i7, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, double d7) {
        this.zza.zzb(i7, d7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i7, List<String> list) {
        int i8 = 0;
        if (list instanceof zzaku) {
            zzaku zzakuVar = (zzaku) list;
            while (i8 < list.size()) {
                Object zza = zzakuVar.zza(i8);
                if (zza instanceof String) {
                    this.zza.zzb(i7, (String) zza);
                } else {
                    this.zza.zzc(i7, (zzaiw) zza);
                }
                i8++;
            }
            return;
        }
        while (i8 < list.size()) {
            this.zza.zzb(i7, list.get(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zza(int i7) {
        this.zza.zzj(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, float f) {
        this.zza.zzb(i7, f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, Object obj, zzamc zzamcVar) {
        zzajo zzajoVar = this.zza;
        zzajoVar.zzj(i7, 3);
        zzamcVar.zza((zzamc) ((zzaln) obj), (zzanm) zzajoVar.zza);
        zzajoVar.zzj(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, List<?> list, zzamc zzamcVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zza(i7, list.get(i8), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final <K, V> void zza(int i7, zzale<K, V> zzaleVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i7, 2);
            this.zza.zzl(zzalf.zza(zzaleVar, entry.getKey(), entry.getValue()));
            zzalf.zza(this.zza, zzaleVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, Object obj) {
        if (obj instanceof zzaiw) {
            this.zza.zzd(i7, (zzaiw) obj);
        } else {
            this.zza.zzb(i7, (zzaln) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i7, String str) {
        this.zza.zzb(i7, str);
    }
}
