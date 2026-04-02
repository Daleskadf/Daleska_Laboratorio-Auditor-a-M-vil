package com.google.android.gms.internal.p002firebaseauthapi;

import org.apache.tika.utils.StringUtils;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzako  reason: invalid package */
/* loaded from: classes.dex */
public final class zzako {
    public static final zzako zza;
    public static final zzako zzb;
    public static final zzako zzc;
    public static final zzako zzd;
    public static final zzako zze;
    public static final zzako zzf;
    public static final zzako zzg;
    public static final zzako zzh;
    public static final zzako zzi;
    public static final zzako zzj;
    private static final /* synthetic */ zzako[] zzk;
    private final Class<?> zzl;

    static {
        zzako zzakoVar = new zzako("VOID", 0, Void.class, Void.class, null);
        zza = zzakoVar;
        Class cls = Integer.TYPE;
        zzako zzakoVar2 = new zzako("INT", 1, cls, Integer.class, 0);
        zzb = zzakoVar2;
        zzako zzakoVar3 = new zzako("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzakoVar3;
        zzako zzakoVar4 = new zzako("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzakoVar4;
        zzako zzakoVar5 = new zzako("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzakoVar5;
        zzako zzakoVar6 = new zzako("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzakoVar6;
        zzako zzakoVar7 = new zzako("STRING", 6, String.class, String.class, StringUtils.EMPTY);
        zzg = zzakoVar7;
        zzako zzakoVar8 = new zzako("BYTE_STRING", 7, zzaiw.class, zzaiw.class, zzaiw.zza);
        zzh = zzakoVar8;
        zzako zzakoVar9 = new zzako("ENUM", 8, cls, Integer.class, null);
        zzi = zzakoVar9;
        zzako zzakoVar10 = new zzako("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzakoVar10;
        zzk = new zzako[]{zzakoVar, zzakoVar2, zzakoVar3, zzakoVar4, zzakoVar5, zzakoVar6, zzakoVar7, zzakoVar8, zzakoVar9, zzakoVar10};
    }

    private zzako(String str, int i7, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzako[] values() {
        return (zzako[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
