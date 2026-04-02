package X3;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.json.JSONException;
import org.json.JSONObject;
import w.C1935t;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f6373a;

    /* renamed from: b  reason: collision with root package name */
    public long f6374b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6375c;

    public a(long j, long j8, String str) {
        I.e(str);
        this.f6375c = str;
        this.f6374b = j;
        this.f6373a = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: UnsupportedEncodingException -> 0x006c, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x006c, blocks: (B:6:0x0025, B:19:0x0067, B:14:0x0049, B:16:0x005e, B:17:0x0061, B:9:0x003a, B:11:0x0043), top: B:35:0x0025, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X3.a a(java.lang.String r12) {
        /*
            com.google.android.gms.common.internal.I.i(r12)
            com.google.android.gms.common.internal.I.e(r12)
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r0 = r12.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            r3 = 0
            java.lang.String r4 = "FirebaseAppCheck"
            if (r1 >= r2) goto L22
            java.lang.String r0 = "Invalid token (too few subsections):\n"
            java.lang.String r0 = r0.concat(r12)
            android.util.Log.e(r4, r0, r3)
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L82
        L22:
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L6c
            r2 = 11
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L6c
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L6c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.io.UnsupportedEncodingException -> L6c
            if (r0 == 0) goto L3a
        L38:
            r0 = r3
            goto L65
        L3a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r0.<init>(r1)     // Catch: java.lang.Exception -> L48
            java.lang.Object r1 = org.json.JSONObject.NULL     // Catch: java.lang.Exception -> L48
            if (r0 == r1) goto L38
            S.f r0 = F.f.C(r0)     // Catch: java.lang.Exception -> L48
            goto L65
        L48:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L6c
            java.lang.String r2 = "Failed to parse JSONObject into Map:\n"
            r1.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L6c
            r1.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L6c
            java.lang.String r0 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L6c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L6c
            if (r1 == 0) goto L61
            android.util.Log.d(r4, r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L6c
        L61:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.io.UnsupportedEncodingException -> L6c
        L65:
            if (r0 != 0) goto L82
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.io.UnsupportedEncodingException -> L6c
            goto L82
        L6c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to decode token (charset unknown):\n"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0, r3)
            java.util.Map r0 = java.util.Collections.emptyMap()
        L82:
            com.google.android.gms.common.internal.I.i(r0)
            java.lang.String r1 = "iat"
            com.google.android.gms.common.internal.I.e(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 != 0) goto L96
            r4 = r2
            goto L9a
        L96:
            long r4 = r1.longValue()
        L9a:
            java.lang.String r1 = "exp"
            com.google.android.gms.common.internal.I.e(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto La8
            goto Lac
        La8:
            long r2 = r0.longValue()
        Lac:
            long r2 = r2 - r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r2 * r0
            X3.a r2 = new X3.a
            long r9 = r4 * r0
            r6 = r2
            r11 = r12
            r6.<init>(r7, r9, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.a(java.lang.String):X3.a");
    }

    public static a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("token");
            return new a(jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"), string);
        } catch (JSONException e7) {
            Log.e("X3.a", "Could not deserialize token: " + e7.getMessage());
            return null;
        }
    }

    public int c() {
        if (!((C1935t) this.f6375c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f6374b == -1) {
            this.f6374b = uptimeMillis;
        }
        long j = uptimeMillis - this.f6374b;
        if (j <= 120000) {
            return PipesIterator.DEFAULT_QUEUE_SIZE;
        }
        if (j <= 300000) {
            return 2000;
        }
        return 4000;
    }

    public int d() {
        boolean c8 = ((C1935t) this.f6375c).c();
        long j = this.f6373a;
        if (!c8) {
            if (j <= 0) {
                return 10000;
            }
            return Math.min((int) j, 10000);
        } else if (j <= 0) {
            return 1800000;
        } else {
            return Math.min((int) j, 1800000);
        }
    }

    public a(C1935t c1935t, long j) {
        this.f6375c = c1935t;
        this.f6374b = -1L;
        this.f6373a = j;
    }
}
