package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes.dex */
final class zzqg {
    public static String zza(zzqe zzqeVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzqeVar, sb, 0);
        return sb.toString();
    }

    public static final void zzb(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzrb.zza(zzoe.zzl((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzoe) {
                sb.append(": \"");
                sb.append(zzrb.zza((zzoe) obj));
                sb.append('\"');
            } else if (obj instanceof zzoy) {
                sb.append(" {");
                zzd((zzoy) obj, sb, i10 + 2);
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                zzb(sb, i13, "key", entry2.getKey());
                zzb(sb, i13, "value", entry2.getValue());
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzqe zzqeVar, StringBuilder sb, int i10) {
        Method[] declaredMethods;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzqeVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i10, zzc(str8), zzoy.zzy(method2, zzqeVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i10, zzc(str7), zzoy.zzy(method3, zzqeVar, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (!hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object zzy = zzoy.zzy(method4, zzqeVar, new Object[0]);
                    if (method5 == null) {
                        if (zzy instanceof Boolean) {
                            if (((Boolean) zzy).booleanValue()) {
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                        } else if (zzy instanceof Integer) {
                            if (((Integer) zzy).intValue() != 0) {
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                        } else if (zzy instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzy).floatValue()) != 0) {
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                        } else if (zzy instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzy).doubleValue()) != 0) {
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                        } else {
                            if (zzy instanceof String) {
                                equals = zzy.equals("");
                            } else if (zzy instanceof zzoe) {
                                equals = zzy.equals(zzoe.zzb);
                            } else if (zzy instanceof zzqe) {
                                if (zzy != ((zzqe) zzy).zzs()) {
                                    zzb(sb, i10, zzc(str3), zzy);
                                }
                            } else {
                                if ((zzy instanceof Enum) && ((Enum) zzy).ordinal() == 0) {
                                }
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                            if (!equals) {
                                zzb(sb, i10, zzc(str3), zzy);
                            }
                        }
                    } else if (((Boolean) zzoy.zzy(method5, zzqeVar, new Object[0])).booleanValue()) {
                        zzb(sb, i10, zzc(str3), zzy);
                    }
                }
            }
        }
        if (!(zzqeVar instanceof zzow)) {
            zzre zzreVar = ((zzoy) zzqeVar).zzc;
            if (zzreVar != null) {
                zzreVar.zze(sb, i10);
                return;
            }
            return;
        }
        zzow zzowVar = (zzow) zzqeVar;
        throw null;
    }
}
