package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzem {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzek zzekVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzekVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzfk.zza(new zzbz(((String) obj).getBytes(zzdl.zzb))));
                sb.append(Typography.quote);
            } else if (obj instanceof zzcc) {
                sb.append(": \"");
                sb.append(zzfk.zza((zzcc) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzdd) {
                sb.append(" {");
                zzd((zzdd) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                zzb(sb, i3, "key", entry2.getKey());
                zzb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzek zzekVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzekVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                        if (method4 != null) {
                            Object zzp = zzdd.zzp(method4, zzekVar, new Object[0]);
                            if (method5 == null) {
                                if (zzp instanceof Boolean) {
                                    if (!((Boolean) zzp).booleanValue()) {
                                    }
                                    zzb(sb, i, substring, zzp);
                                } else if (zzp instanceof Integer) {
                                    if (((Integer) zzp).intValue() == 0) {
                                    }
                                    zzb(sb, i, substring, zzp);
                                } else if (zzp instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) zzp).floatValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzp);
                                } else if (zzp instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) zzp).doubleValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzp);
                                } else {
                                    if (zzp instanceof String) {
                                        equals = zzp.equals("");
                                    } else if (zzp instanceof zzcc) {
                                        equals = zzp.equals(zzcc.zzb);
                                    } else if (zzp instanceof zzek) {
                                        if (zzp == ((zzek) zzp).zzf()) {
                                        }
                                        zzb(sb, i, substring, zzp);
                                    } else {
                                        if ((zzp instanceof Enum) && ((Enum) zzp).ordinal() == 0) {
                                        }
                                        zzb(sb, i, substring, zzp);
                                    }
                                    if (equals) {
                                    }
                                    zzb(sb, i, substring, zzp);
                                }
                            } else {
                                if (!((Boolean) zzdd.zzp(method5, zzekVar, new Object[0])).booleanValue()) {
                                }
                                zzb(sb, i, substring, zzp);
                            }
                        }
                    }
                } else {
                    zzb(sb, i, substring.substring(0, substring.length() - 3), zzdd.zzp(method, zzekVar, new Object[0]));
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzdd.zzp(method2, zzekVar, new Object[0]));
            }
            i2 = 3;
        }
        if (!(zzekVar instanceof zzda)) {
            zzfn zzfnVar = ((zzdd) zzekVar).zzc;
            if (zzfnVar != null) {
                zzfnVar.zzi(sb, i);
                return;
            }
            return;
        }
        zzcu zzcuVar = ((zzda) zzekVar).zzb;
        throw null;
    }
}
