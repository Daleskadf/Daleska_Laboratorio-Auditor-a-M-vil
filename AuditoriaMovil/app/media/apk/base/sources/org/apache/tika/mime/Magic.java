package org.apache.tika.mime;
/* loaded from: classes.dex */
class Magic implements Clause, Comparable<Magic> {
    private final Clause clause;
    private final int priority;
    private final String string;
    private final MimeType type;

    public Magic(MimeType mimeType, int i7, Clause clause) {
        this.type = mimeType;
        this.priority = i7;
        this.clause = clause;
        this.string = "[" + i7 + "/" + clause + "]";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Magic)) {
            return false;
        }
        Magic magic = (Magic) obj;
        if (!this.type.equals(magic.type) || !this.string.equals(magic.string)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        return this.clause.eval(bArr);
    }

    public int getPriority() {
        return this.priority;
    }

    public MimeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() ^ this.string.hashCode();
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return this.clause.size();
    }

    public String toString() {
        return this.string;
    }

    @Override // java.lang.Comparable
    public int compareTo(Magic magic) {
        int i7 = magic.priority - this.priority;
        if (i7 == 0) {
            i7 = magic.size() - size();
        }
        if (i7 == 0) {
            i7 = magic.type.compareTo(this.type);
        }
        return i7 == 0 ? magic.string.compareTo(this.string) : i7;
    }
}
