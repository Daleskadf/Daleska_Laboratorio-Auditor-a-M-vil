package com.adobe.air;

import android.content.SharedPreferences;
import android.util.Base64;
/* loaded from: classes.dex */
class AndroidEncryptedLocalStore {
    private static final String LOG_TAG = "AndroidELS -------";

    AndroidEncryptedLocalStore() {
    }

    public boolean setItem(String str, String str2, byte[] bArr) throws OutOfMemoryError {
        String encodeToString = Base64.encodeToString(bArr, 0);
        SharedPreferences.Editor edit = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.putString(str2, encodeToString);
        return edit.commit();
    }

    public byte[] getItem(String str, String str2) throws OutOfMemoryError {
        String string = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getApplicationContext().getSharedPreferences(str, 0).getString(str2, null);
        if (string != null) {
            return Base64.decode(string, 0);
        }
        return null;
    }

    public boolean removeItem(String str, String str2) {
        SharedPreferences.Editor edit = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.remove(str2);
        return edit.commit();
    }

    public boolean reset(String str) {
        SharedPreferences.Editor edit = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.clear();
        return edit.commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r4.length != r6) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] getELSKey(int r6) {
        /*
            com.adobe.air.AndroidActivityWrapper r0 = com.adobe.air.AndroidActivityWrapper.GetAndroidActivityWrapper()
            android.app.Activity r0 = r0.getActivity()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = com.adobe.air.utils.Utils.getRuntimePackageName()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "Adobe_AIR_ELS"
            r3 = 0
            java.lang.String r4 = r0.getString(r1, r3)
            if (r4 == 0) goto L25
            byte[] r4 = android.util.Base64.decode(r4, r2)
            int r5 = r4.length
            if (r5 == r6) goto L26
        L25:
            r4 = r3
        L26:
            if (r4 != 0) goto L46
            byte[] r6 = new byte[r6]
            java.security.SecureRandom r4 = new java.security.SecureRandom
            r4.<init>()
            r4.nextBytes(r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = android.util.Base64.encodeToString(r6, r2)
            r0.putString(r1, r2)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L44
            goto L47
        L44:
            r3 = r6
            goto L47
        L46:
            r3 = r4
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidEncryptedLocalStore.getELSKey(int):byte[]");
    }
}
