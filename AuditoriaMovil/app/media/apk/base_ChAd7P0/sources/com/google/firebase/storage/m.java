package com.google.firebase.storage;

import android.net.Uri;
import c6.L1;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class m implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f9930a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9931b;

    public m(Uri uri, f fVar) {
        boolean z7;
        if (uri != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("storageUri cannot be null", z7);
        I.a("FirebaseApp cannot be null", fVar != null);
        this.f9930a = uri;
        this.f9931b = fVar;
    }

    public final String a() {
        String path = this.f9930a.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return path.substring(lastIndexOf + 1);
        }
        return path;
    }

    public final V2.k b() {
        return new V2.k(this.f9930a, this.f9931b.f9906h);
    }

    public final Task c(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AbstractC1740d.f15483c.execute(new L1(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9930a.compareTo(((m) obj).f9930a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return ((m) obj).toString().equals(toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        Uri uri = this.f9930a;
        sb.append(uri.getAuthority());
        sb.append(uri.getEncodedPath());
        return sb.toString();
    }
}
