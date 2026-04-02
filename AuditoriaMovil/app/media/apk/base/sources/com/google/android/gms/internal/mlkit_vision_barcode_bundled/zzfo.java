package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class zzfo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfm zzfmVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzfmVar, sb, 0);
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
                sb.append(zzgq.zza(new zzde(((String) obj).getBytes(zzep.zza))));
                sb.append('\"');
            } else if (obj instanceof zzdf) {
                sb.append(": \"");
                sb.append(zzgq.zza((zzdf) obj));
                sb.append('\"');
            } else if (obj instanceof zzeh) {
                sb.append(" {");
                zzd((zzeh) obj, sb, i7 + 2);
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

    private static void zzd(zzfm zzfmVar, StringBuilder sb, int i7) {
        int i8;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfmVar.getClass().getDeclaredMethods();
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
                zzb(sb, i7, substring.substring(0, substring.length() - 4), zzeh.zzR(method2, zzfmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, substring.substring(0, substring.length() - 3), zzeh.zzR(method, zzfmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzR = zzeh.zzR(method4, zzfmVar, new Object[0]);
                    if (method5 == null) {
                        if (zzR instanceof Boolean) {
                            if (!((Boolean) zzR).booleanValue()) {
                            }
                            zzb(sb, i7, substring, zzR);
                        } else if (zzR instanceof Integer) {
                            if (((Integer) zzR).intValue() == 0) {
                            }
                            zzb(sb, i7, substring, zzR);
                        } else if (zzR instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzR).floatValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzR);
                        } else if (zzR instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzR).doubleValue()) == 0) {
                            }
                            zzb(sb, i7, substring, zzR);
                        } else {
                            if (zzR instanceof String) {
                                equals = zzR.equals(StringUtils.EMPTY);
                            } else if (zzR instanceof zzdf) {
                                equals = zzR.equals(zzdf.zzb);
                            } else if (zzR instanceof zzfm) {
                                if (zzR == ((zzfm) zzR).zzac()) {
                                }
                                zzb(sb, i7, substring, zzR);
                            } else {
                                if ((zzR instanceof Enum) && ((Enum) zzR).ordinal() == 0) {
                                }
                                zzb(sb, i7, substring, zzR);
                            }
                            if (equals) {
                            }
                            zzb(sb, i7, substring, zzR);
                        }
                    } else {
                        if (!((Boolean) zzeh.zzR(method5, zzfmVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i7, substring, zzR);
                    }
                }
            }
            i8 = 3;
        }
        if (zzfmVar instanceof zzed) {
            Iterator zzf = ((zzed) zzfmVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb, i7, b.f("[", ((zzee) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzgt zzgtVar = ((zzeh) zzfmVar).zzc;
        if (zzgtVar != null) {
            zzgtVar.zzi(sb, i7);
        }
    }
}
