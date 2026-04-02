package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfb extends zzcey {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcfb(zzcdn zzcdnVar) {
        super(zzcdnVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfsg.zza(zzfsf.zza(), cacheDir, "admobVideoStreams", zzfsk.zza));
        this.zzg = file;
        if (file.isDirectory() || this.zzg.mkdirs()) {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfsg.zza(zzfsf.zza(), this.zzg, String.valueOf(file.getName()).concat(".done"), zzfsk.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0350, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0356, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x035e, code lost:
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0360, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.zze("Preloaded " + com.google.android.gms.internal.ads.zzcfb.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0383, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x038c, code lost:
        if (r0.isFile() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x038e, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0396, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0414  */
    @Override // com.google.android.gms.internal.ads.zzcey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfb.zzt(java.lang.String):boolean");
    }
}
