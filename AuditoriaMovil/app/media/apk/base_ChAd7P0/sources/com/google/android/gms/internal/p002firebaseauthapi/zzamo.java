package com.google.android.gms.internal.p002firebaseauthapi;

import H4.e1;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamo  reason: invalid package */
/* loaded from: classes.dex */
final class zzamo {
    public static String zza(zzaiw zzaiwVar) {
        zzamr zzamrVar = new zzamr(zzaiwVar);
        StringBuilder sb = new StringBuilder(zzamrVar.zza());
        for (int i7 = 0; i7 < zzamrVar.zza(); i7++) {
            byte zza = zzamrVar.zza(i7);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb.append((char) zza);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zza >>> 6) & 3) + 48));
                                    sb.append((char) (((zza >>> 3) & 7) + 48));
                                    sb.append((char) ((zza & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
