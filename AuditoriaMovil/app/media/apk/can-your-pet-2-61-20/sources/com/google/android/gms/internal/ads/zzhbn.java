package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhbn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzhbl zzhblVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzhblVar, sb, 0);
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
                sb.append(zzhcv.zza(zzgyj.zzw((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgyj) {
                sb.append(": \"");
                sb.append(zzhcv.zza((zzgyj) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgzv) {
                sb.append(" {");
                zzd((zzgzv) obj, sb, i + 2);
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

    private static void zzd(zzhbl zzhblVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhblVar.getClass().getDeclaredMethods();
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
                            Object zzbQ = zzgzv.zzbQ(method4, zzhblVar, new Object[0]);
                            if (method5 == null) {
                                if (zzbQ instanceof Boolean) {
                                    if (!((Boolean) zzbQ).booleanValue()) {
                                    }
                                    zzb(sb, i, substring, zzbQ);
                                } else if (zzbQ instanceof Integer) {
                                    if (((Integer) zzbQ).intValue() == 0) {
                                    }
                                    zzb(sb, i, substring, zzbQ);
                                } else if (zzbQ instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) zzbQ).floatValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzbQ);
                                } else if (zzbQ instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) zzbQ).doubleValue()) == 0) {
                                    }
                                    zzb(sb, i, substring, zzbQ);
                                } else {
                                    if (zzbQ instanceof String) {
                                        equals = zzbQ.equals("");
                                    } else if (zzbQ instanceof zzgyj) {
                                        equals = zzbQ.equals(zzgyj.zzb);
                                    } else if (zzbQ instanceof zzhbl) {
                                        if (zzbQ == ((zzhbl) zzbQ).zzbt()) {
                                        }
                                        zzb(sb, i, substring, zzbQ);
                                    } else {
                                        if ((zzbQ instanceof Enum) && ((Enum) zzbQ).ordinal() == 0) {
                                        }
                                        zzb(sb, i, substring, zzbQ);
                                    }
                                    if (equals) {
                                    }
                                    zzb(sb, i, substring, zzbQ);
                                }
                            } else {
                                if (!((Boolean) zzgzv.zzbQ(method5, zzhblVar, new Object[0])).booleanValue()) {
                                }
                                zzb(sb, i, substring, zzbQ);
                            }
                        }
                    }
                } else {
                    zzb(sb, i, substring.substring(0, substring.length() - 3), zzgzv.zzbQ(method, zzhblVar, new Object[0]));
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzgzv.zzbQ(method2, zzhblVar, new Object[0]));
            }
            i2 = 3;
        }
        if (zzhblVar instanceof zzgzr) {
            Iterator zzg = ((zzgzr) zzhblVar).zza.zzg();
            while (zzg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzg.next();
                int i4 = ((zzgzs) entry2.getKey()).zzb;
                zzb(sb, i, "[" + i4 + "]", entry2.getValue());
            }
        }
        zzhcy zzhcyVar = ((zzgzv) zzhblVar).zzt;
        if (zzhcyVar != null) {
            zzhcyVar.zzi(sb, i);
        }
    }
}
