package com.umeng.message.proguard;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes3.dex */
public final class dw {
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
        r2.add(5);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:7:0x0018, B:9:0x0023, B:16:0x002e, B:17:0x0035, B:19:0x003c, B:32:0x0080, B:35:0x008a, B:37:0x0090, B:40:0x0097, B:43:0x00a3, B:48:0x00cc, B:51:0x00f1, B:23:0x0048, B:25:0x0050, B:30:0x005b), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:7:0x0018, B:9:0x0023, B:16:0x002e, B:17:0x0035, B:19:0x003c, B:32:0x0080, B:35:0x008a, B:37:0x0090, B:40:0x0097, B:43:0x00a3, B:48:0x00cc, B:51:0x00f1, B:23:0x0048, B:25:0x0050, B:30:0x005b), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:7:0x0018, B:9:0x0023, B:16:0x002e, B:17:0x0035, B:19:0x003c, B:32:0x0080, B:35:0x008a, B:37:0x0090, B:40:0x0097, B:43:0x00a3, B:48:0x00cc, B:51:0x00f1, B:23:0x0048, B:25:0x0050, B:30:0x005b), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:7:0x0018, B:9:0x0023, B:16:0x002e, B:17:0x0035, B:19:0x003c, B:32:0x0080, B:35:0x008a, B:37:0x0090, B:40:0x0097, B:43:0x00a3, B:48:0x00cc, B:51:0x00f1, B:23:0x0048, B:25:0x0050, B:30:0x005b), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0011, B:7:0x0018, B:9:0x0023, B:16:0x002e, B:17:0x0035, B:19:0x003c, B:32:0x0080, B:35:0x008a, B:37:0x0090, B:40:0x0097, B:43:0x00a3, B:48:0x00cc, B:51:0x00f1, B:23:0x0048, B:25:0x0050, B:30:0x005b), top: B:57:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List<java.lang.Integer> a(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.dw.a(android.view.View):java.util.List");
    }

    private static boolean b(View view) {
        boolean z10;
        if (view == null) {
            return false;
        }
        if (view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            do {
                ViewParent parent = view.getParent();
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                if (view.getVisibility() == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } while (z10);
        }
        if (!z10) {
            ce.a("Valid", "expose invalid visible.");
        }
        return z10;
    }
}
