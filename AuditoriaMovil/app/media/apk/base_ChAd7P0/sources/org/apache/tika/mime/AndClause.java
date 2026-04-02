package org.apache.tika.mime;

import io.flutter.plugins.pathprovider.b;
import java.util.Arrays;
/* loaded from: classes.dex */
class AndClause implements Clause {
    private final Clause[] clauses;

    public AndClause(Clause... clauseArr) {
        this.clauses = clauseArr;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        for (Clause clause : this.clauses) {
            if (!clause.eval(bArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        int i7 = 0;
        for (Clause clause : this.clauses) {
            i7 += clause.size();
        }
        return i7;
    }

    public String toString() {
        return b.h("and", Arrays.toString(this.clauses));
    }
}
