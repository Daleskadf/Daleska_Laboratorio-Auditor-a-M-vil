package com.google.android.recaptcha.internal;

import io.flutter.plugins.pathprovider.b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzok {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzoi zzoiVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzoiVar, sb, 0);
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
                sb.append(zzpg.zza(new zzlc(((String) obj).getBytes(zznl.zza))));
                sb.append('\"');
            } else if (obj instanceof zzle) {
                sb.append(": \"");
                sb.append(zzpg.zza((zzle) obj));
                sb.append('\"');
            } else if (obj instanceof zznd) {
                sb.append(" {");
                zzd((zznd) obj, sb, i7 + 2);
                sb.append("\n");
                zzc(i7, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i9 = i7 + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
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

    private static void zzd(zzoi zzoiVar, StringBuilder sb, int i7) {
        int i8;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzoiVar.getClass().getDeclaredMethods();
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
                zzb(sb, i7, substring.substring(0, substring.length() - 4), zznd.zzE(method2, zzoiVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, substring.substring(0, substring.length() - 3), zznd.zzE(method, zzoiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzE = zznd.zzE(method4, zzoiVar, new Object[0]);
                    if (method5 == null) {
                        if (zzE instanceof Boolean) {
                            if (!((Boolean) zzE).booleanValue()) {
                            }
                            zzb(sb, i7, substring, zzE);
                        } else if (zzE instanceof Integer) {
                            if (((Integer) zzE).intValue() == 0) {
                            }
                            zzb(sb, i7, substring, zzE);
                        } else if (zzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE).floatValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzE);
                        } else if (zzE instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzE);
                        } else {
                            if (zzE instanceof String) {
                                equals = zzE.equals(StringUtils.EMPTY);
                            } else if (zzE instanceof zzle) {
                                equals = zzE.equals(zzle.zzb);
                            } else if (zzE instanceof zzoi) {
                                if (zzE == ((zzoi) zzE).zzm()) {
                                }
                                zzb(sb, i7, substring, zzE);
                            } else {
                                if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                                }
                                zzb(sb, i7, substring, zzE);
                            }
                            if (equals) {
                            }
                            zzb(sb, i7, substring, zzE);
                        }
                    } else {
                        if (!((Boolean) zznd.zzE(method5, zzoiVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i7, substring, zzE);
                    }
                }
            }
            i8 = 3;
        }
        if (zzoiVar instanceof zzna) {
            Iterator zzf = ((zzna) zzoiVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb, i7, b.f("[", ((zznb) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzpm zzpmVar = ((zznd) zzoiVar).zzc;
        if (zzpmVar != null) {
            zzpmVar.zzi(sb, i7);
        }
    }
}
