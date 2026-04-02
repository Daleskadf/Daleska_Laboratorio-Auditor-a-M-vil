package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzph {
    static final zzfzq zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzph zza = new zzph(zzfzn.zzn(zzpf.zza));
    private static final zzfzn zzc = zzfzn.zzp(2, 5, 6);

    static {
        zzfzp zzfzpVar = new zzfzp();
        zzfzpVar.zza(5, 6);
        zzfzpVar.zza(17, 6);
        zzfzpVar.zza(7, 6);
        zzfzpVar.zza(30, 10);
        zzfzpVar.zza(18, 6);
        zzfzpVar.zza(6, 8);
        zzfzpVar.zza(8, 8);
        zzfzpVar.zza(14, 8);
        zzb = zzfzpVar.zzc();
    }

    private zzph(List list) {
        this.zzd = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            zzpf zzpfVar = (zzpf) list.get(i);
            this.zzd.put(zzpfVar.zzb, zzpfVar);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzpf) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzph zzc(Context context, zzk zzkVar, zzpp zzppVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzkVar, zzppVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzph zzd(Context context, Intent intent, zzk zzkVar, zzpp zzppVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzppVar == null) {
            zzppVar = zzfx.zza >= 33 ? zzpe.zzb(audioManager, zzkVar) : null;
        }
        if (zzfx.zza < 33 || (!zzfx.zzM(context) && !zzfx.zzJ(context))) {
            if (zzfx.zza < 23 || !zzpc.zza(audioManager, zzppVar)) {
                zzfzr zzfzrVar = new zzfzr();
                zzfzrVar.zzf((Object) 2);
                if (zzfx.zza < 29 || (!zzfx.zzM(context) && !zzfx.zzJ(context))) {
                    ContentResolver contentResolver = context.getContentResolver();
                    boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
                    if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                        zzfzrVar.zzh(zzc);
                    }
                    if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                        return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), 10));
                    }
                    int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                    if (intArrayExtra != null) {
                        zzfzrVar.zzh(zzgcl.zzf(intArrayExtra));
                    }
                    return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
                }
                zzfzrVar.zzh(zzpd.zzb(zzkVar));
                return new zzph(zze(zzgcl.zzg(zzfzrVar.zzi()), 10));
            }
            return zza;
        }
        return zzpe.zza(audioManager, zzkVar);
    }

    private static zzfzn zze(int[] iArr, int i) {
        zzfzk zzfzkVar = new zzfzk();
        for (int i2 : iArr) {
            zzfzkVar.zzf(new zzpf(i2, i));
        }
        return zzfzkVar.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(zzfx.zzc) || "Xiaomi".equals(zzfx.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzph
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzph r9 = (com.google.android.gms.internal.ads.zzph) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzfx.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.zzox$$ExternalSyntheticApiModelOutline1.m(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = 0
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzph.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = zzfx.zza;
        SparseArray sparseArray = this.zzd;
        if (i2 < 31) {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        } else {
            i = sparseArray.contentHashCode();
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + obj + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (com.google.android.gms.internal.ads.zzfx.zzH(r8.zzd, 30) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r6 != 5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzam r9, com.google.android.gms.internal.ads.zzk r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzm
            r0.getClass()
            java.lang.String r1 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzcb.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfzq r1 = com.google.android.gms.internal.ads.zzph.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc8
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L2d
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzfx.zzH(r0, r4)
            if (r0 != 0) goto L2b
            r0 = 6
            goto L49
        L2b:
            r0 = 18
        L2d:
            if (r0 != r3) goto L3c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzfx.zzH(r0, r3)
            if (r0 == 0) goto L3a
            r0 = 8
            goto L3c
        L3a:
            r0 = 7
            goto L49
        L3c:
            r5 = 30
            if (r0 != r5) goto L49
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzfx.zzH(r6, r5)
            if (r5 != 0) goto L49
            goto L3a
        L49:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzfx.zzH(r5, r0)
            if (r5 == 0) goto Lc8
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzpf r5 = (com.google.android.gms.internal.ads.zzpf) r5
            r5.getClass()
            int r6 = r9.zzz
            r7 = -1
            if (r6 == r7) goto L80
            if (r0 != r4) goto L64
            goto L80
        L64:
            java.lang.String r9 = r9.zzm
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L79
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 33
            if (r9 >= r10) goto L79
            r9 = 10
            if (r6 <= r9) goto L8b
            goto Lc8
        L79:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L8b
            goto Lc8
        L80:
            int r9 = r9.zzA
            if (r9 != r7) goto L87
            r9 = 48000(0xbb80, float:6.7262E-41)
        L87:
            int r6 = r5.zza(r9, r10)
        L8b:
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 28
            if (r9 > r10) goto La0
            if (r6 != r1) goto L96
            r2 = 8
            goto La1
        L96:
            r9 = 3
            if (r6 == r9) goto La1
            r9 = 4
            if (r6 == r9) goto La1
            r9 = 5
            if (r6 != r9) goto La0
            goto La1
        La0:
            r2 = r6
        La1:
            int r9 = com.google.android.gms.internal.ads.zzfx.zza
            r10 = 26
            if (r9 > r10) goto Lb5
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfx.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb5
            r9 = 1
            if (r2 != r9) goto Lb5
            r2 = 2
        Lb5:
            int r9 = com.google.android.gms.internal.ads.zzfx.zzh(r2)
            if (r9 == 0) goto Lc8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc8:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzph.zzb(com.google.android.gms.internal.ads.zzam, com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }
}
