package org.apache.tika.mime;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.util.List;
/* loaded from: classes.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i7, List<Clause> list) {
        if (list != null && list.size() != 0) {
            if (i7 <= list.size()) {
                if (i7 > 0) {
                    this.min = i7;
                    this.clauses = list;
                    return;
                }
                throw new IllegalArgumentException(b.e(i7, "min cannot be <= 0: "));
            }
            throw new IllegalArgumentException(AbstractC0059i.y("min (", i7, ") cannot be > clauses.size (", list.size(), ")"));
        }
        throw new IllegalArgumentException("clauses must be not null with size > 0");
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        int i7 = 0;
        for (Clause clause : this.clauses) {
            if (clause.eval(bArr) && (i7 = i7 + 1) >= this.min) {
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
        int i7 = this.min;
        List<Clause> list = this.clauses;
        return "minShouldMatch (min: " + i7 + ") " + list;
    }
}
