package org.apache.tika.mime;

import java.util.List;
/* loaded from: classes.dex */
class OrClause implements Clause {
    private final List<Clause> clauses;

    public OrClause(List<Clause> list) {
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        for (Clause clause : this.clauses) {
            if (clause.eval(bArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        int i7 = 0;
        for (Clause clause : this.clauses) {
            i7 = Math.max(i7, clause.size());
        }
        return i7;
    }

    public String toString() {
        List<Clause> list = this.clauses;
        return "or" + list;
    }
}
