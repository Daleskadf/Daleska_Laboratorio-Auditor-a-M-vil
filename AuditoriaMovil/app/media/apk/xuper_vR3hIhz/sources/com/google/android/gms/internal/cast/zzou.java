package com.google.android.gms.internal.cast;
/* loaded from: classes.dex */
final class zzou implements zzqc {
    private static final zzou zza = new zzou();

    private zzou() {
    }

    public static zzou zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.cast.zzqc
    public final zzqb zzb(Class<?> cls) {
        String str;
        String str2;
        if (!zzoy.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (zzqb) zzoy.zzt(cls.asSubclass(zzoy.class)).zzb(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzqc
    public final boolean zzc(Class<?> cls) {
        return zzoy.class.isAssignableFrom(cls);
    }
}
