package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlo<T> implements zzma<T> {
    private final zzli zza;
    private final zzmv<?, ?> zzb;
    private final boolean zzc;
    private final zzjk<?> zzd;

    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zza(T t) {
        zzmv<?, ?> zzmvVar = this.zzb;
        int zzb = zzmvVar.zzb(zzmvVar.zzd(t)) + 0;
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzlo<T> zza(zzmv<?, ?> zzmvVar, zzjk<?> zzjkVar, zzli zzliVar) {
        return new zzlo<>(zzmvVar, zzjkVar, zzliVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final T zza() {
        zzli zzliVar = this.zza;
        if (zzliVar instanceof zzjv) {
            return (T) ((zzjv) zzliVar).zzcb();
        }
        return (T) zzliVar.zzcf().zzai();
    }

    private zzlo(zzmv<?, ?> zzmvVar, zzjk<?> zzjkVar, zzli zzliVar) {
        this.zzb = zzmvVar;
        this.zzc = zzjkVar.zza(zzliVar);
        this.zzd = zzjkVar;
        this.zza = zzliVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zzc(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, T t2) {
        zzmc.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzmc.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, zzlx zzlxVar, zzji zzjiVar) throws IOException {
        boolean z;
        zzmv<?, ?> zzmvVar = this.zzb;
        zzjk<?> zzjkVar = this.zzd;
        Object zzc = zzmvVar.zzc(t);
        zzjl<?> zzb = zzjkVar.zzb(t);
        do {
            try {
                if (zzlxVar.zzc() == Integer.MAX_VALUE) {
                    return;
                }
                int zzd = zzlxVar.zzd();
                if (zzd == 11) {
                    Object obj = null;
                    zzii zziiVar = null;
                    int i = 0;
                    while (zzlxVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzlxVar.zzd();
                        if (zzd2 == 16) {
                            i = zzlxVar.zzj();
                            obj = zzjkVar.zza(zzjiVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzjkVar.zza(zzlxVar, obj, zzjiVar, zzb);
                            } else {
                                zziiVar = zzlxVar.zzp();
                            }
                        } else if (!zzlxVar.zzt()) {
                            break;
                        }
                    }
                    if (zzlxVar.zzd() != 12) {
                        throw zzkd.zzb();
                    } else if (zziiVar != null) {
                        if (obj != null) {
                            zzjkVar.zza(zziiVar, obj, zzjiVar, zzb);
                        } else {
                            zzmvVar.zza((zzmv<?, ?>) zzc, i, zziiVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zzjkVar.zza(zzjiVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zzjkVar.zza(zzlxVar, zza, zzjiVar, zzb);
                    } else {
                        z = zzmvVar.zza((zzmv<?, ?>) zzc, zzlxVar);
                        continue;
                    }
                } else {
                    z = zzlxVar.zzt();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzmvVar.zzb((Object) t, (T) zzc);
            }
        } while (z);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzih r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzjv r0 = (com.google.android.gms.internal.measurement.zzjv) r0
            com.google.android.gms.internal.measurement.zzmy r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzmy r2 = com.google.android.gms.internal.measurement.zzmy.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzmy r1 = com.google.android.gms.internal.measurement.zzmy.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzjv$zzb r10 = (com.google.android.gms.internal.measurement.zzjv.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzie.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzjk<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzji r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzli r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzjv$zzd r0 = (com.google.android.gms.internal.measurement.zzjv.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzie.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzlw.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzie.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzie.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzie.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzii r2 = (com.google.android.gms.internal.measurement.zzii) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzlw.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzie.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zzjk<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzji r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzli r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzjv$zzd r0 = (com.google.android.gms.internal.measurement.zzjv.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzie.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzkd r10 = com.google.android.gms.internal.measurement.zzkd.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzih):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final void zza(T t, zznv zznvVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzjn zzjnVar = (zzjn) next.getKey();
            if (zzjnVar.zzc() != zzns.MESSAGE || zzjnVar.zze() || zzjnVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzkh) {
                zznvVar.zza(zzjnVar.zza(), (Object) ((zzkh) next).zza().zzc());
            } else {
                zznvVar.zza(zzjnVar.zza(), next.getValue());
            }
        }
        zzmv<?, ?> zzmvVar = this.zzb;
        zzmvVar.zza((zzmv<?, ?>) zzmvVar.zzd(t), zznvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean zzb(T t, T t2) {
        if (this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            if (this.zzc) {
                return this.zzd.zza(t).equals(this.zzd.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzma
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzg();
    }
}
