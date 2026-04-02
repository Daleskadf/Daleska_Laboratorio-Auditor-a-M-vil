package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.distriqt.core.auth.AuthorisationStatus;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zziq {
    public static final zziq zza = new zziq(null, null, 100);
    private final EnumMap<zza, zzit> zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean zza(int i, int i2) {
        return ((i == -20 && i2 == -30) || ((i == -30 && i2 == -20) || i == i2)) || i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char zza(zzit zzitVar) {
        if (zzitVar != null) {
            int ordinal = zzitVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return ordinal != 3 ? '-' : '1';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
    /* loaded from: classes3.dex */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        
        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        for (zzit zzitVar : this.zzb.values()) {
            i = (i * 31) + zzitVar.hashCode();
        }
        return i;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zzit> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzit zza(String str) {
        if (str == null) {
            return zzit.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzit.GRANTED;
        }
        if (str.equals(AuthorisationStatus.DENIED)) {
            return zzit.DENIED;
        }
        return zzit.UNINITIALIZED;
    }

    public final zzit zzc() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    public final zzit zzd() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzit zza(char c) {
        if (c != '+') {
            if (c != '0') {
                if (c == '1') {
                    return zzit.GRANTED;
                }
                return zzit.UNINITIALIZED;
            }
            return zzit.DENIED;
        }
        return zzit.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzit zza(Boolean bool) {
        if (bool == null) {
            return zzit.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzit.GRANTED;
        }
        return zzit.DENIED;
    }

    public static zziq zza(Bundle bundle, int i) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zziq(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzis.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zziq(enumMap, i);
    }

    public static zziq zza(zzit zzitVar, zzit zzitVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzitVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzitVar2);
        return new zziq(enumMap, -10);
    }

    public static zziq zzb(String str) {
        return zza(str, 100);
    }

    public static zziq zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zza2 = zzis.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            zza zzaVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzit.UNINITIALIZED);
            }
        }
        return new zziq(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zziq zza(com.google.android.gms.measurement.internal.zziq r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zziq$zza> r1 = com.google.android.gms.measurement.internal.zziq.zza.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzis r1 = com.google.android.gms.measurement.internal.zzis.STORAGE
            com.google.android.gms.measurement.internal.zziq$zza[] r1 = com.google.android.gms.measurement.internal.zzis.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L54
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzit> r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzit r5 = (com.google.android.gms.measurement.internal.zzit) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzit> r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzit r6 = (com.google.android.gms.measurement.internal.zzit) r6
            if (r5 != 0) goto L26
            goto L37
        L26:
            if (r6 != 0) goto L29
            goto L4c
        L29:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L37
        L2e:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.UNINITIALIZED
            if (r6 != r7) goto L33
            goto L4c
        L33:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DEFAULT
            if (r5 != r7) goto L39
        L37:
            r5 = r6
            goto L4c
        L39:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DEFAULT
            if (r6 != r7) goto L3e
            goto L4c
        L3e:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DENIED
            if (r5 == r7) goto L4a
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.DENIED
            if (r6 != r5) goto L47
            goto L4a
        L47:
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.GRANTED
            goto L4c
        L4a:
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.DENIED
        L4c:
            if (r5 == 0) goto L51
            r0.put(r4, r5)
        L51:
            int r3 = r3 + 1
            goto Lf
        L54:
            com.google.android.gms.measurement.internal.zziq r9 = new com.google.android.gms.measurement.internal.zziq
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziq.zza(com.google.android.gms.measurement.internal.zziq):com.google.android.gms.measurement.internal.zziq");
    }

    public final zziq zzb(zziq zziqVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzis.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == zzit.UNINITIALIZED) {
                zzitVar = zziqVar.zzb.get(zzaVar);
            }
            if (zzitVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzitVar);
            }
        }
        return new zziq(enumMap, this.zzc);
    }

    public final Boolean zze() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        if (zzitVar != null) {
            int ordinal = zzitVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
                if (ordinal != 3) {
                    return null;
                }
            }
            return true;
        }
        return null;
    }

    public final Boolean zzf() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzitVar != null) {
            int ordinal = zzitVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
                if (ordinal != 3) {
                    return null;
                }
            }
            return true;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(zzit zzitVar) {
        int ordinal = zzitVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return null;
            }
            return "granted";
        }
        return AuthorisationStatus.DENIED;
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzis.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (string.equals(AuthorisationStatus.DENIED)) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public final String zzg() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzis.STORAGE.zza()) {
            zzit zzitVar = this.zzb.get(zzaVar);
            char c = '-';
            if (zzitVar != null && (ordinal = zzitVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzis.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        zzaVarArr = zzis.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zzitVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("default");
                } else if (ordinal == 2) {
                    sb.append(AuthorisationStatus.DENIED);
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        return sb.toString();
    }

    private zziq(EnumMap<zza, zzit> enumMap, int i) {
        EnumMap<zza, zzit> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public zziq(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzit> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzit>) zza.AD_STORAGE, (zza) zza(bool));
        enumMap.put((EnumMap<zza, zzit>) zza.ANALYTICS_STORAGE, (zza) zza(bool2));
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (obj instanceof zziq) {
            zziq zziqVar = (zziq) obj;
            zzaVarArr = zzis.STORAGE.zzd;
            for (zza zzaVar : zzaVarArr) {
                if (this.zzb.get(zzaVar) != zziqVar.zzb.get(zzaVar)) {
                    return false;
                }
            }
            return this.zzc == zziqVar.zzc;
        }
        return false;
    }

    public final boolean zza(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zziqVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzit.DENIED;
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        for (zzit zzitVar : this.zzb.values()) {
            if (zzitVar != zzit.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zziq zziqVar) {
        return zzb(zziqVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final boolean zzb(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzit zzitVar = this.zzb.get(zzaVar);
            zzit zzitVar2 = zziqVar.zzb.get(zzaVar);
            if (zzitVar == zzit.DENIED && zzitVar2 != zzit.DENIED) {
                return true;
            }
        }
        return false;
    }
}
