package com.google.android.gms.internal.p002firebaseauthapi;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanh  reason: invalid package */
/* loaded from: classes.dex */
public class zzanh {
    public static final zzanh zza;
    public static final zzanh zzb;
    public static final zzanh zzc;
    public static final zzanh zzd;
    public static final zzanh zze;
    public static final zzanh zzf;
    public static final zzanh zzg;
    public static final zzanh zzh;
    public static final zzanh zzi;
    public static final zzanh zzj;
    public static final zzanh zzk;
    public static final zzanh zzl;
    public static final zzanh zzm;
    public static final zzanh zzn;
    public static final zzanh zzo;
    public static final zzanh zzp;
    public static final zzanh zzq;
    public static final zzanh zzr;
    private static final /* synthetic */ zzanh[] zzs;
    private final zzank zzt;
    private final int zzu;

    static {
        zzanh zzanhVar = new zzanh("DOUBLE", 0, zzank.DOUBLE, 1);
        zza = zzanhVar;
        zzanh zzanhVar2 = new zzanh("FLOAT", 1, zzank.FLOAT, 5);
        zzb = zzanhVar2;
        zzank zzankVar = zzank.LONG;
        zzanh zzanhVar3 = new zzanh("INT64", 2, zzankVar, 0);
        zzc = zzanhVar3;
        zzanh zzanhVar4 = new zzanh("UINT64", 3, zzankVar, 0);
        zzd = zzanhVar4;
        zzank zzankVar2 = zzank.INT;
        zzanh zzanhVar5 = new zzanh("INT32", 4, zzankVar2, 0);
        zze = zzanhVar5;
        zzanh zzanhVar6 = new zzanh("FIXED64", 5, zzankVar, 1);
        zzf = zzanhVar6;
        zzanh zzanhVar7 = new zzanh("FIXED32", 6, zzankVar2, 5);
        zzg = zzanhVar7;
        zzanh zzanhVar8 = new zzanh("BOOL", 7, zzank.BOOLEAN, 0);
        zzh = zzanhVar8;
        zzang zzangVar = new zzang("STRING", zzank.STRING);
        zzi = zzangVar;
        zzank zzankVar3 = zzank.MESSAGE;
        zzanj zzanjVar = new zzanj("GROUP", zzankVar3);
        zzj = zzanjVar;
        zzani zzaniVar = new zzani("MESSAGE", zzankVar3);
        zzk = zzaniVar;
        zzanl zzanlVar = new zzanl("BYTES", zzank.BYTE_STRING);
        zzl = zzanlVar;
        zzanh zzanhVar9 = new zzanh("UINT32", 12, zzankVar2, 0);
        zzm = zzanhVar9;
        zzanh zzanhVar10 = new zzanh("ENUM", 13, zzank.ENUM, 0);
        zzn = zzanhVar10;
        zzanh zzanhVar11 = new zzanh("SFIXED32", 14, zzankVar2, 5);
        zzo = zzanhVar11;
        zzanh zzanhVar12 = new zzanh("SFIXED64", 15, zzankVar, 1);
        zzp = zzanhVar12;
        zzanh zzanhVar13 = new zzanh("SINT32", 16, zzankVar2, 0);
        zzq = zzanhVar13;
        zzanh zzanhVar14 = new zzanh("SINT64", 17, zzankVar, 0);
        zzr = zzanhVar14;
        zzs = new zzanh[]{zzanhVar, zzanhVar2, zzanhVar3, zzanhVar4, zzanhVar5, zzanhVar6, zzanhVar7, zzanhVar8, zzangVar, zzanjVar, zzaniVar, zzanlVar, zzanhVar9, zzanhVar10, zzanhVar11, zzanhVar12, zzanhVar13, zzanhVar14};
    }

    public static zzanh[] values() {
        return (zzanh[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzank zzb() {
        return this.zzt;
    }

    private zzanh(String str, int i7, zzank zzankVar, int i8) {
        this.zzt = zzankVar;
        this.zzu = i8;
    }
}
