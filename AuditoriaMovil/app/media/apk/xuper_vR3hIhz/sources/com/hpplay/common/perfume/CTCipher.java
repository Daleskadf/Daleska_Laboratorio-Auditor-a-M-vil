package com.hpplay.common.perfume;

import android.text.TextUtils;
import com.hpplay.common.log.LeLog;
/* loaded from: classes2.dex */
public class CTCipher {
    private final String TAG = "CTCipher";
    private String mKey;

    public CTCipher(String str) {
        this.mKey = str;
    }

    private String encipher(String str) {
        int i10;
        byte b10;
        if (!TextUtils.isEmpty(this.mKey) && !TextUtils.isEmpty(str)) {
            byte[] bytes = this.mKey.getBytes();
            int length = bytes.length;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < bytes.length; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < bytes.length) {
                        b10 = bytes[i12];
                        if (b10 >= 0) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        b10 = -1;
                        break;
                    }
                }
                for (int i13 = 0; i13 < bytes.length; i13++) {
                    byte b11 = bytes[i13];
                    if (b11 >= 0 && b11 < b10) {
                        i12 = i13;
                        b10 = b11;
                    }
                }
                bytes[i12] = -1;
                iArr[i12] = i11;
            }
            String str2 = "";
            for (int i14 = 0; i14 < bytes.length; i14++) {
                int arrayIndex = getArrayIndex(iArr, i14);
                if (arrayIndex < 0) {
                    LeLog.w("CTCipher", "encrypt failed");
                    return "";
                }
                int i15 = 0;
                while (true) {
                    if ((length * i15) + arrayIndex < str.length()) {
                        str2 = str2 + str.charAt(i10);
                        i15++;
                    }
                }
            }
            return str2;
        }
        LeLog.w("CTCipher", "encrypt invalid input");
        return "";
    }

    private int getArrayIndex(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public String encrypt(String str) {
        return encipher(str);
    }
}
