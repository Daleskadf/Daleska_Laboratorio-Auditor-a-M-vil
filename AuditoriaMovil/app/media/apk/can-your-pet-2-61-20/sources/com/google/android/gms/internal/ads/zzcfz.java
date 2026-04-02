package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfz extends zzcde implements zzhy, zzms {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcfk zzc;
    private final zzyx zzd;
    private final zzcdm zze;
    private final WeakReference zzf;
    private final zzwn zzg;
    private zzjj zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdd zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcfm zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzbQ)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
        if (r5.zzj == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ec, code lost:
        if (r5.zzm == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcfq(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
        if (r5.zzi <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcfr(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcfs(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
        if (r5.zzj == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcft(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (r4.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcfu(r5, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcfz(android.content.Context r4, com.google.android.gms.internal.ads.zzcdm r5, com.google.android.gms.internal.ads.zzcdn r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfz.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcdm, com.google.android.gms.internal.ads.zzcdn, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j = this.zzn;
                    Map zze = ((zzht) this.zzs.remove(0)).zze();
                    long j2 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfvx.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzH() {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzL(zzcdd zzcddVar) {
        this.zzk = zzcddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzyx zzyxVar = this.zzd;
            zzyj zzc = zzyxVar.zzf().zzc();
            zzc.zzp(i, !z);
            zzyxVar.zzl(zzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzR(int i) {
        for (WeakReference weakReference : this.zzu) {
            zzcfj zzcfjVar = (zzcfj) weakReference.get();
            if (zzcfjVar != null) {
                zzcfjVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzS(Surface surface, boolean z) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzT(float f, boolean z) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzV() {
        return this.zzh != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgv zzW(String str, boolean z) {
        zzcfz zzcfzVar = true != z ? null : this;
        zzcdm zzcdmVar = this.zze;
        return new zzcgc(str, zzcfzVar, zzcdmVar.zzd, zzcdmVar.zzf, zzcdmVar.zzn, zzcdmVar.zzo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgv zzX(String str, boolean z) {
        zzcfz zzcfzVar = true != z ? null : this;
        zzcdm zzcdmVar = this.zze;
        zzcfj zzcfjVar = new zzcfj(str, zzcfzVar, zzcdmVar.zzd, zzcdmVar.zzf, zzcdmVar.zzi);
        this.zzu.add(new WeakReference(zzcfjVar));
        return zzcfjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgv zzY(String str, boolean z) {
        zzhe zzheVar = new zzhe();
        zzheVar.zzf(str);
        zzheVar.zze(true != z ? null : this);
        zzheVar.zzc(this.zze.zzd);
        zzheVar.zzd(this.zze.zzf);
        zzheVar.zzb(true);
        return zzheVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzgv zzZ(zzgu zzguVar) {
        zzgv zza2 = zzguVar.zza();
        zzcfx zzcfxVar = new zzcfx(this);
        return new zzcfm(this.zzb, zza2, this.zzo, this.zzp, this, zzcfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zza(zzgv zzgvVar, zzhb zzhbVar, boolean z, int i) {
        this.zzl += i;
    }

    final zzvj zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzc = zzarVar.zzc();
        zzwn zzwnVar = this.zzg;
        zzwnVar.zza(this.zze.zzg);
        return zzwnVar.zzb(zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(boolean z, long j) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzi(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzmf[] zzac(Handler handler, zzabv zzabvVar, zzqg zzqgVar, zzxn zzxnVar, zzug zzugVar) {
        zztq zztqVar = zztq.zzb;
        Context context = this.zzb;
        zzrx zzrxVar = new zzrx(context, new zztc(context), zztqVar, false, handler, zzqgVar, new zzrd(context).zzd());
        zztq zztqVar2 = zztq.zzb;
        Context context2 = this.zzb;
        return new zzmf[]{zzrxVar, new zzaaw(context2, new zztc(context2), zztqVar2, 0L, false, handler, zzabvVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzb(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzd(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
        if (zzgvVar instanceof zzht) {
            synchronized (this.zzq) {
                this.zzs.add((zzht) zzgvVar);
            }
        } else if (zzgvVar instanceof zzcfm) {
            this.zzt = (zzcfm) zzgvVar;
            final zzcdn zzcdnVar = (zzcdn) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() && zzcdnVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfv
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcfz.zza;
                        zzcdn.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zze(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcdn zzcdnVar = (zzcdn) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() || zzcdnVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcdnVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzf(zzmq zzmqVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzg(zzmq zzmqVar, zzvd zzvdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzh(zzmq zzmqVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzi(zzco zzcoVar, zzmr zzmrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzmq zzmqVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            if (this.zze.zzk) {
                zzcddVar.zzl("onLoadException", iOException);
            } else {
                zzcddVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzk(zzmq zzmqVar, int i) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzl(zzmq zzmqVar, zzce zzceVar) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzk("onPlayerError", zzceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzm(zzmq zzmqVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzn(zzmq zzmqVar, Object obj, long j) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzo(zzmq zzmqVar, zzir zzirVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzp(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcdn zzcdnVar = (zzcdn) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() || zzcdnVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
        int i = zzamVar.zzr;
        int i2 = zzamVar.zzs;
        hashMap.put("resolution", i + "x" + i2);
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcdnVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzq(zzmq zzmqVar, zzdp zzdpVar) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzD(zzdpVar.zzc, zzdpVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzvj zzvyVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvyVar = zzaa(uriArr[0]);
            } else {
                zzvj[] zzvjVarArr = new zzvj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvjVarArr[i] = zzaa(uriArr[i]);
                }
                zzvyVar = new zzvy(false, false, zzvjVarArr);
            }
            this.zzh.zzB(zzvyVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
