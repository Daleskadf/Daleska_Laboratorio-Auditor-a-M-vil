package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfx zzfxVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzfxVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i7, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i7, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i7, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i8 = 1; i8 < str.length(); i8++) {
                    char charAt = str.charAt(i8);
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
                sb.append(zzgx.zza(new zzec(((String) obj).getBytes(zzfa.zzb))));
                sb.append('\"');
            } else if (obj instanceof zzef) {
                sb.append(": \"");
                sb.append(zzgx.zza((zzef) obj));
                sb.append('\"');
            } else if (obj instanceof zzev) {
                sb.append(" {");
                zzd((zzev) obj, sb, i7 + 2);
                sb.append("\n");
                zzc(i7, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i9 = i7 + 2;
                zzb(sb, i9, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry2.getKey());
                zzb(sb, i9, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry2.getValue());
                sb.append("\n");
                zzc(i7, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(zza, 0, i8);
            i7 -= i8;
        }
    }

    private static void zzd(zzfx zzfxVar, StringBuilder sb, int i7) {
        int i8;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
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
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i8);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i7, substring.substring(0, substring.length() - 4), zzev.zzg(method2, zzfxVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, substring.substring(0, substring.length() - 3), zzev.zzg(method, zzfxVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzg = zzev.zzg(method4, zzfxVar, new Object[0]);
                    if (method5 == null) {
                        if (zzg instanceof Boolean) {
                            if (!((Boolean) zzg).booleanValue()) {
                            }
                            zzb(sb, i7, substring, zzg);
                        } else if (zzg instanceof Integer) {
                            if (((Integer) zzg).intValue() == 0) {
                            }
                            zzb(sb, i7, substring, zzg);
                        } else if (zzg instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzg).floatValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzg);
                        } else if (zzg instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzg).doubleValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzg);
                        } else {
                            if (zzg instanceof String) {
                                equals = zzg.equals(StringUtils.EMPTY);
                            } else if (zzg instanceof zzef) {
                                equals = zzg.equals(zzef.zzb);
                            } else if (zzg instanceof zzfx) {
                                if (zzg == ((zzfx) zzg).zze()) {
                                }
                                zzb(sb, i7, substring, zzg);
                            } else {
                                if ((zzg instanceof Enum) && ((Enum) zzg).ordinal() == 0) {
                                }
                                zzb(sb, i7, substring, zzg);
                            }
                            if (equals) {
                            }
                            zzb(sb, i7, substring, zzg);
                        }
                    } else {
                        if (!((Boolean) zzev.zzg(method5, zzfxVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i7, substring, zzg);
                    }
                }
            }
            i8 = 3;
        }
        if (!(zzfxVar instanceof zzeu)) {
            zzha zzhaVar = ((zzev) zzfxVar).zzc;
            if (zzhaVar != null) {
                zzhaVar.zzg(sb, i7);
                return;
            }
            return;
        }
        zzeu zzeuVar = (zzeu) zzfxVar;
        throw null;
    }
}
