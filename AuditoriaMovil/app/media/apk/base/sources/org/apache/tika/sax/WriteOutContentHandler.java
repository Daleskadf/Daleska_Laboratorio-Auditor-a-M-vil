package org.apache.tika.sax;

import java.io.StringWriter;
import java.io.Writer;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.ParseRecord;
import org.xml.sax.ContentHandler;
/* loaded from: classes.dex */
public class WriteOutContentHandler extends ContentHandlerDecorator {
    private ParseContext parseContext;
    private boolean throwOnWriteLimitReached;
    private int writeCount;
    private final int writeLimit;
    private boolean writeLimitReached;

    public WriteOutContentHandler(ContentHandler contentHandler, int i7) {
        super(contentHandler);
        this.writeCount = 0;
        this.throwOnWriteLimitReached = true;
        this.parseContext = null;
        this.writeLimit = i7;
    }

    private void handleWriteLimitReached() {
        this.writeLimitReached = true;
        this.writeCount = this.writeLimit;
        if (!this.throwOnWriteLimitReached) {
            ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
            if (parseRecord != null) {
                parseRecord.setWriteLimitReached(true);
                return;
            }
            return;
        }
        throw new WriteLimitReachedException(this.writeLimit);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        if (this.writeLimitReached) {
            return;
        }
        int i9 = this.writeLimit;
        if (i9 != -1) {
            int i10 = this.writeCount;
            if (i10 + i8 > i9) {
                super.characters(cArr, i7, i9 - i10);
                handleWriteLimitReached();
                return;
            }
        }
        super.characters(cArr, i7, i8);
        this.writeCount += i8;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i7, int i8) {
        if (this.writeLimitReached) {
            return;
        }
        int i9 = this.writeLimit;
        if (i9 != -1) {
            int i10 = this.writeCount;
            if (i10 + i8 > i9) {
                super.ignorableWhitespace(cArr, i7, i9 - i10);
                handleWriteLimitReached();
                return;
            }
        }
        super.ignorableWhitespace(cArr, i7, i8);
        this.writeCount += i8;
    }

    public WriteOutContentHandler(Writer writer, int i7) {
        this(new ToTextContentHandler(writer), i7);
    }

    public WriteOutContentHandler(Writer writer) {
        this(writer, -1);
    }

    public WriteOutContentHandler(int i7) {
        this(new StringWriter(), i7);
    }

    public WriteOutContentHandler() {
        this(100000);
    }

    public WriteOutContentHandler(ContentHandler contentHandler, int i7, boolean z7, ParseContext parseContext) {
        super(contentHandler);
        this.writeCount = 0;
        this.writeLimit = i7;
        this.throwOnWriteLimitReached = z7;
        this.parseContext = parseContext;
    }
}
