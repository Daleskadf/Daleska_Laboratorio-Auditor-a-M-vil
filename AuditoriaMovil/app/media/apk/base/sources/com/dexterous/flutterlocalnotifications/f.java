package com.dexterous.flutterlocalnotifications;

import org.apache.tika.metadata.OfficeOpenXMLExtended;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f None;
    public static final f RequestingExactAlarmsPermission;
    public static final f RequestingFullScreenIntentPermission;
    public static final f RequestingNotificationPermission;
    public static final f RequestingNotificationPolicyAccess;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.f] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.dexterous.flutterlocalnotifications.f] */
    static {
        ?? r52 = new Enum(OfficeOpenXMLExtended.SECURITY_NONE, 0);
        None = r52;
        ?? r62 = new Enum("RequestingNotificationPermission", 1);
        RequestingNotificationPermission = r62;
        ?? r7 = new Enum("RequestingNotificationPolicyAccess", 2);
        RequestingNotificationPolicyAccess = r7;
        ?? r8 = new Enum("RequestingExactAlarmsPermission", 3);
        RequestingExactAlarmsPermission = r8;
        ?? r9 = new Enum("RequestingFullScreenIntentPermission", 4);
        RequestingFullScreenIntentPermission = r9;
        $VALUES = new f[]{r52, r62, r7, r8, r9};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
