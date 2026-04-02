package com.titans.entity;

import t9.i;
/* loaded from: classes3.dex */
public final class CdnType {
    public static final String DIGITAL_TYPE_AWS = "4";
    public static final String DIGITAL_TYPE_ICDN = "1";
    public static final String DIGITAL_TYPE_PCDN = "5";
    public static final String DIGITAL_TYPE_PEERSTAR = "6";
    public static final String DIGITAL_TYPE_QINIU = "3";
    public static final String DIGITAL_TYPE_WANGSU = "2";
    public static final CdnType INSTANCE = new CdnType();
    public static final String TYPE_AWS = "aws";
    public static final String TYPE_ICDN = "icdn";
    public static final String TYPE_PCDN = "pcdn";
    public static final String TYPE_PEERSTAR = "peerstar";
    public static final String TYPE_QINIU = "qiniu";
    public static final String TYPE_WANGSU = "wangsu";

    private CdnType() {
    }

    public final String transform(String str) {
        i.g(str, "cdnDigital");
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return TYPE_ICDN;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return TYPE_WANGSU;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return TYPE_QINIU;
                }
                break;
            case 53:
                if (str.equals(DIGITAL_TYPE_PCDN)) {
                    return TYPE_PCDN;
                }
                break;
            case 54:
                if (str.equals(DIGITAL_TYPE_PEERSTAR)) {
                    return TYPE_PEERSTAR;
                }
                break;
        }
        return TYPE_AWS;
    }

    public final String transformOnDetectNull(String str) {
        boolean z10;
        i.g(str, "cdnDigital");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "lslb";
        }
        return transform(str);
    }
}
