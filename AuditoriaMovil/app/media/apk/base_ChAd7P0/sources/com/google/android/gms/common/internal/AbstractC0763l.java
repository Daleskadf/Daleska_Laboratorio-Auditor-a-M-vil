package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.common.internal.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0763l extends AbstractC0757f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C0760i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC0763l(android.content.Context r9, android.os.Looper r10, int r11, com.google.android.gms.common.internal.C0760i r12, com.google.android.gms.common.api.internal.InterfaceC0734h r13, com.google.android.gms.common.api.internal.r r14) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.T r3 = com.google.android.gms.common.internal.AbstractC0764m.a(r9)
            java.lang.Object r0 = W2.e.f6169c
            com.google.android.gms.common.internal.I.i(r13)
            com.google.android.gms.common.internal.I.i(r14)
            com.google.android.gms.common.internal.v r5 = new com.google.android.gms.common.internal.v
            r5.<init>(r13)
            com.google.android.gms.common.internal.v r6 = new com.google.android.gms.common.internal.v
            r6.<init>(r14)
            java.lang.String r7 = r12.f9358e
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.zab = r12
            r9 = 0
            r8.zad = r9
            java.util.Set r9 = r12.f9355b
            java.util.Set r10 = r8.validateScopes(r9)
            java.util.Iterator r11 = r10.iterator()
        L2e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L49
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r9.contains(r12)
            if (r12 == 0) goto L41
            goto L2e
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Expanding scopes is not permitted, use implied scopes instead"
            r9.<init>(r10)
            throw r9
        L49:
            r8.zac = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0763l.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.i, com.google.android.gms.common.api.internal.h, com.google.android.gms.common.api.internal.r):void");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C0760i getClientSettings() {
        return this.zab;
    }

    public W2.d[] getRequiredFeatures() {
        return new W2.d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
