package j$.util;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1218l extends C1214h implements java.util.Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f12971b) {
            equals = this.f12970a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.f12971b) {
            hashCode = this.f12970a.hashCode();
        }
        return hashCode;
    }
}
