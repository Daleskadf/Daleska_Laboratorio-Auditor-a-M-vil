package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.EnumMap;
/* loaded from: classes.dex */
public final class zzai {
    public static final zzai zza = new zzai(null, null);
    private final EnumMap zzb;

    public zzai(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzah.AD_STORAGE, (zzah) bool);
        enumMap.put((EnumMap) zzah.ANALYTICS_STORAGE, (zzah) bool2);
    }

    public static zzai zza(Bundle bundle) {
        zzah[] values;
        if (bundle == null) {
            return zza;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            enumMap.put((EnumMap) zzahVar, (zzah) zzn(bundle.getString(zzahVar.zzd)));
        }
        return new zzai(enumMap);
    }

    public static zzai zzb(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                zzah[] zzahVarArr = zzah.zzc;
                int length = zzahVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzah zzahVar = zzahVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) zzahVar, (zzah) bool);
                }
                i10++;
            }
        }
        return new zzai(enumMap);
    }

    public static String zzg(Bundle bundle) {
        zzah[] values;
        String string;
        for (zzah zzahVar : zzah.values()) {
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null && zzn(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzj(int i10, int i11) {
        return i10 <= i11;
    }

    public static final int zzm(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    private static Boolean zzn(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals(NetworkUtil.NETWORK_CLASS_DENIED)) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        zzah[] values;
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        for (zzah zzahVar : zzah.values()) {
            if (zzm((Boolean) this.zzb.get(zzahVar)) != zzm((Boolean) zzaiVar.zzb.get(zzahVar))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 17;
        for (Boolean bool : this.zzb.values()) {
            i10 = (i10 * 31) + zzm(bool);
        }
        return i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzah zzahVar = values[i10];
            if (i10 != 0) {
                sb.append(", ");
            }
            sb.append(zzahVar.name());
            sb.append(Operator.Operation.EQUALS);
            Boolean bool = (Boolean) this.zzb.get(zzahVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = NetworkUtil.NETWORK_CLASS_DENIED;
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public final zzai zzc(zzai zzaiVar) {
        zzah[] values;
        boolean z10;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.zzb.get(zzahVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(z10);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final zzai zzd(zzai zzaiVar) {
        zzah[] values;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzahVar : zzah.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzahVar);
            if (bool == null) {
                bool = (Boolean) zzaiVar.zzb.get(zzahVar);
            }
            enumMap.put((EnumMap) zzahVar, (zzah) bool);
        }
        return new zzai(enumMap);
    }

    public final Boolean zze() {
        return (Boolean) this.zzb.get(zzah.AD_STORAGE);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzah.ANALYTICS_STORAGE);
    }

    public final String zzh() {
        char c10;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahVarArr = zzah.zzc;
        int length = zzahVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.zzb.get(zzahVarArr[i10]);
            if (bool == null) {
                c10 = ASCIIPropertyListParser.DATE_DATE_FIELD_DELIMITER;
            } else if (bool.booleanValue()) {
                c10 = '1';
            } else {
                c10 = '0';
            }
            sb.append(c10);
        }
        return sb.toString();
    }

    public final boolean zzi(zzah zzahVar) {
        Boolean bool = (Boolean) this.zzb.get(zzahVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzk(zzai zzaiVar) {
        return zzl(zzaiVar, (zzah[]) this.zzb.keySet().toArray(new zzah[0]));
    }

    public final boolean zzl(zzai zzaiVar, zzah... zzahVarArr) {
        for (zzah zzahVar : zzahVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzahVar);
            Boolean bool2 = (Boolean) zzaiVar.zzb.get(zzahVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
