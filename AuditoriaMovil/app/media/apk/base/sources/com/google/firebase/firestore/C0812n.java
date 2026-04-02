package com.google.firebase.firestore;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
/* renamed from: com.google.firebase.firestore.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0812n implements InterfaceC0816s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9830a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9831b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9832c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n0 f9833d;

    public /* synthetic */ C0812n(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, n0 n0Var, int i7) {
        this.f9830a = i7;
        this.f9831b = taskCompletionSource;
        this.f9832c = taskCompletionSource2;
        this.f9833d = n0Var;
    }

    @Override // com.google.firebase.firestore.InterfaceC0816s
    public final void a(Object obj, J j) {
        boolean z7;
        switch (this.f9830a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f9832c;
                r rVar = (r) obj;
                TaskCompletionSource taskCompletionSource2 = this.f9831b;
                if (j != null) {
                    taskCompletionSource2.setException(j);
                    return;
                }
                try {
                    ((Q) Tasks.await(taskCompletionSource.getTask())).remove();
                    q4.n nVar = rVar.f9845c;
                    boolean z8 = false;
                    if (nVar != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z9 = rVar.f9846d.f9829b;
                    if (!z7 && z9) {
                        taskCompletionSource2.setException(new J("Failed to get document because the client is offline.", I.UNAVAILABLE));
                    } else {
                        if (nVar != null) {
                            z8 = true;
                        }
                        if (z8 && z9) {
                            if (this.f9833d == n0.SERVER) {
                                taskCompletionSource2.setException(new J("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", I.UNAVAILABLE));
                            }
                        }
                        taskCompletionSource2.setResult(rVar);
                    }
                    return;
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError.initCause(e7);
                    throw assertionError;
                } catch (ExecutionException e8) {
                    AssertionError assertionError2 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError2.initCause(e8);
                    throw assertionError2;
                }
            default:
                TaskCompletionSource taskCompletionSource3 = this.f9832c;
                j0 j0Var = (j0) obj;
                TaskCompletionSource taskCompletionSource4 = this.f9831b;
                if (j != null) {
                    taskCompletionSource4.setException(j);
                    return;
                }
                try {
                    ((Q) Tasks.await(taskCompletionSource3.getTask())).remove();
                    if (j0Var.f.f9829b) {
                        if (this.f9833d == n0.SERVER) {
                            taskCompletionSource4.setException(new J("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", I.UNAVAILABLE));
                            return;
                        }
                    }
                    taskCompletionSource4.setResult(j0Var);
                    return;
                } catch (InterruptedException e9) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError3 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError3.initCause(e9);
                    throw assertionError3;
                } catch (ExecutionException e10) {
                    AssertionError assertionError4 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError4.initCause(e10);
                    throw assertionError4;
                }
        }
    }
}
