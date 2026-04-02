package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class eq {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("VerifySliceTaskHandler");
    private final bh b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eq(bh bhVar) {
        this.b = bhVar;
    }

    private final void b(ep epVar, File file) {
        try {
            File o = this.b.o(epVar.l, epVar.a, epVar.b, epVar.c);
            if (o.exists()) {
                try {
                    if (dq.a(eo.a(file, o)).equals(epVar.d)) {
                        a.d("Verification of slice %s of pack %s successful.", epVar.c, epVar.l);
                        return;
                    }
                    throw new ck(String.format("Verification failed for slice %s.", epVar.c), epVar.k);
                } catch (IOException e) {
                    throw new ck(String.format("Could not digest file during verification for slice %s.", epVar.c), e, epVar.k);
                } catch (NoSuchAlgorithmException e2) {
                    throw new ck("SHA256 algorithm not supported.", e2, epVar.k);
                }
            }
            throw new ck(String.format("Cannot find metadata files for slice %s.", epVar.c), epVar.k);
        } catch (IOException e3) {
            throw new ck(String.format("Could not reconstruct slice archive during verification for slice %s.", epVar.c), e3, epVar.k);
        }
    }

    public final void a(ep epVar) {
        File p = this.b.p(epVar.l, epVar.a, epVar.b, epVar.c);
        if (p.exists()) {
            b(epVar, p);
            File q = this.b.q(epVar.l, epVar.a, epVar.b, epVar.c);
            if (!q.exists()) {
                q.mkdirs();
            }
            if (!p.renameTo(q)) {
                throw new ck(String.format("Failed to move slice %s after verification.", epVar.c), epVar.k);
            }
            return;
        }
        throw new ck(String.format("Cannot find unverified files for slice %s.", epVar.c), epVar.k);
    }
}
