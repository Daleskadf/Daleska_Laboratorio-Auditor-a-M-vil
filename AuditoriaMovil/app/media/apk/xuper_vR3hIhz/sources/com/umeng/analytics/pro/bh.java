package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public class bh {
    public static be a() {
        String str = Build.BRAND;
        bs.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (br.d()) {
            return new bi();
        }
        if (br.e()) {
            return new bj();
        }
        if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
            if (str.equalsIgnoreCase("vivo")) {
                return new bp();
            }
            if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                    if (str.equalsIgnoreCase("nubia")) {
                        return new bm();
                    }
                    if (str.equalsIgnoreCase("samsung")) {
                        return new bo();
                    }
                    if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu") && !br.a()) {
                        if (!br.f()) {
                            return null;
                        }
                        return new bg();
                    }
                    return new bl();
                }
                return new bk();
            }
            return new bn();
        }
        return new bq();
    }
}
