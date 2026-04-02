package com.google.android.recaptcha.internal;

import H4.e1;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int zzd;
        int zzA;
        zzpw zzd2 = zzmsVar.zzd();
        int zza = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA2 = zzln.zzA(zza << 3);
        if (zzd2 == zzpw.zzj) {
            byte[] bArr = zznl.zzb;
            if (!(((zzoi) obj) instanceof zzkp)) {
                zzA2 += zzA2;
            } else {
                throw null;
            }
        }
        zzpx zzpxVar = zzpx.INT;
        int i7 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i7 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                break;
            case 2:
                i7 = zzln.zzB(((Long) obj).longValue());
                break;
            case 3:
                i7 = zzln.zzB(((Long) obj).longValue());
                break;
            case 4:
                i7 = zzln.zzB(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                i7 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                break;
            case 7:
                ((Boolean) obj).getClass();
                i7 = 1;
                break;
            case 8:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                    i7 = zzA + zzd;
                    break;
                } else {
                    i7 = zzln.zzz((String) obj);
                    break;
                }
            case 9:
                i7 = ((zzoi) obj).zzo();
                break;
            case 10:
                if (obj instanceof zzns) {
                    zzd = ((zzns) obj).zza();
                    zzA = zzln.zzA(zzd);
                    i7 = zzA + zzd;
                    break;
                } else {
                    i7 = zzln.zzx((zzoi) obj);
                    break;
                }
            case 11:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzln.zzA(zzd);
                }
                i7 = zzA + zzd;
                break;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                i7 = zzln.zzA(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zznf) {
                    i7 = zzln.zzB(((zznf) obj).zza());
                    break;
                } else {
                    i7 = zzln.zzB(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                break;
            case 15:
                ((Long) obj).getClass();
                i7 = 8;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue = ((Integer) obj).intValue();
                i7 = zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i7 = zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzA2 + i7;
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzm(Map.Entry entry) {
        zzoi zzk;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z7 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            Object zze = zze(zzmsVar);
            if (zze == null) {
                this.zza.put(zzmsVar, zzl(value));
                if (z7) {
                    this.zzd = true;
                }
            } else if (!z7) {
                if (zze instanceof zzon) {
                    zzk = zzmsVar.zzc((zzon) zze, (zzon) value);
                } else {
                    zzk = zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk();
                }
                this.zza.put(zzmsVar, zzk);
            } else {
                throw null;
            }
        } else if (!z7) {
            this.zza.put(zzmsVar, zzl(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i7;
        int zzA;
        int zzx;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (value instanceof zzns) {
                int zza = ((zzms) entry.getKey()).zza();
                int zzA2 = zzln.zzA(8);
                i7 = zzA2 + zzA2;
                zzA = zzln.zzA(zza) + zzln.zzA(16);
                int zzA3 = zzln.zzA(24);
                int zza2 = ((zzns) value).zza();
                zzx = Y.q(zza2, zza2, zzA3);
            } else {
                int zza3 = ((zzms) entry.getKey()).zza();
                int zzA4 = zzln.zzA(8);
                i7 = zzA4 + zzA4;
                zzA = zzln.zzA(zza3) + zzln.zzA(16);
                zzx = zzln.zzx((zzoi) value) + zzln.zzA(24);
            }
            return i7 + zzA + zzx;
        }
        return zza(zzmsVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmt)) {
            return false;
        }
        return this.zza.equals(((zzmt) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int zzc = this.zza.zzc();
        int i7 = 0;
        for (int i8 = 0; i8 < zzc; i8++) {
            i7 += zzo(this.zza.zzg(i8));
        }
        for (Map.Entry entry : this.zza.zzd()) {
            i7 += zzo(entry);
        }
        return i7;
    }

    /* renamed from: zzc */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zznq(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            Object value = this.zza.zzg(i7).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        for (Map.Entry entry : this.zza.zzd()) {
            Object value2 = entry.getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int zzc = zzmtVar.zza.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            zzm(zzmtVar.zza.zzg(i7));
        }
        for (Map.Entry entry : zzmtVar.zza.zzd()) {
            zzm(entry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r7 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r6.zzg()
            com.google.android.recaptcha.internal.zzpw r1 = r6.zzd()
            byte[] r2 = com.google.android.recaptcha.internal.zznl.zzb
            r7.getClass()
            com.google.android.recaptcha.internal.zzpw r2 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r2 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r1 = r1.zza()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzoi
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r1 == 0) goto L57
            goto L4b
        L26:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zznf
            if (r1 == 0) goto L57
            goto L4b
        L2f:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzle
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L57
            goto L4b
        L38:
            boolean r1 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r1 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r1 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r1 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r1 = r7 instanceof java.lang.Integer
        L49:
            if (r1 == 0) goto L57
        L4b:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r1 == 0) goto L51
            r5.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzpe r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.recaptcha.internal.zzpw r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzpx r6 = r6.zza()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            if (!zzn(this.zza.zzg(i7))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzd()) {
            if (!zzn(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzmt(boolean z7) {
        zzg();
        zzg();
    }
}
