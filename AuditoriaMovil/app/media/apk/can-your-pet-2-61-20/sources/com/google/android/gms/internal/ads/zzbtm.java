package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbtm extends zzbts {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcgm zzk;
    private final Activity zzl;
    private zzcie zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbtt zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbtm(zzcgm zzcgmVar, zzbtt zzbttVar) {
        super(zzcgmVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcgmVar;
        this.zzl = zzcgmVar.zzi();
        this.zzp = zzbttVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm */
    public final void zzc(boolean z) {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzah(this.zzm);
        }
        if (z) {
            zzl("default");
            zzbtt zzbttVar = this.zzp;
            if (zzbttVar != null) {
                zzbttVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzj) {
            if (this.zzq != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzky)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z);
                } else {
                    zzcbr.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbtm.this.zzc(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0267, code lost:
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026d, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e A[Catch: all -> 0x0483, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002f, B:17:0x0034, B:19:0x0036, B:21:0x003e, B:22:0x0043, B:24:0x0045, B:26:0x0053, B:27:0x0064, B:29:0x0072, B:30:0x0083, B:32:0x0091, B:33:0x00a2, B:35:0x00b0, B:36:0x00c1, B:38:0x00cf, B:39:0x00dd, B:41:0x00eb, B:42:0x00ed, B:44:0x00f1, B:46:0x00f5, B:48:0x00fd, B:51:0x0105, B:55:0x012d, B:61:0x0139, B:130:0x0267, B:131:0x026c, B:133:0x026e, B:135:0x028e, B:137:0x0292, B:139:0x029f, B:141:0x02dc, B:173:0x0397, B:180:0x03c6, B:181:0x03de, B:182:0x03ff, B:184:0x0407, B:185:0x040e, B:186:0x0434, B:189:0x0437, B:191:0x0457, B:192:0x046c, B:174:0x039e, B:175:0x03a5, B:176:0x03ac, B:177:0x03b3, B:178:0x03b9, B:179:0x03c0, B:140:0x02d9, B:194:0x046e, B:195:0x0473, B:62:0x0140, B:64:0x0144, B:92:0x0197, B:100:0x01e7, B:102:0x01f2, B:104:0x01f5, B:106:0x01f8, B:108:0x01fd, B:111:0x0203, B:93:0x01a2, B:95:0x01b8, B:97:0x01c3, B:94:0x01ad, B:96:0x01bb, B:98:0x01c8, B:99:0x01dc, B:101:0x01ea, B:112:0x0217, B:120:0x0245, B:126:0x0255, B:123:0x024b, B:125:0x0253, B:116:0x023b, B:118:0x0241, B:127:0x025a, B:128:0x0260, B:197:0x0475, B:198:0x047a, B:200:0x047c, B:201:0x0481), top: B:208:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtm.zzb(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
