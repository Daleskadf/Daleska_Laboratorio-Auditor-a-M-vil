package org.apache.tika.exception;

import D.AbstractC0059i;
import java.io.IOException;
/* loaded from: classes.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j, long j8) {
        StringBuilder sb = new StringBuilder("File is ");
        sb.append(j);
        sb.append(" bytes, but ");
        return AbstractC0059i.C(sb, j8, " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.");
    }

    public FileTooLongException(long j, long j8) {
        super(msg(j, j8));
    }
}
