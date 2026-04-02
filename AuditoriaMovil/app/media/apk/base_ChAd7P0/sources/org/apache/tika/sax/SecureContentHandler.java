package org.apache.tika.sax;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public class SecureContentHandler extends ContentHandlerDecorator {
    private long characterCount;
    private int currentDepth;
    private int maxDepth;
    private int maxPackageEntryDepth;
    private final LinkedList<Integer> packageEntryDepths;
    private long ratio;
    private final TikaInputStream stream;
    private long threshold;

    /* loaded from: classes.dex */
    public class SecureSAXException extends SAXException {
        private static final long serialVersionUID = 2285245380321771445L;

        public SecureSAXException(String str) {
            super(str);
        }

        public boolean isCausedBy(SecureContentHandler secureContentHandler) {
            if (SecureContentHandler.this == secureContentHandler) {
                return true;
            }
            return false;
        }
    }

    public SecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream) {
        super(contentHandler);
        this.packageEntryDepths = new LinkedList<>();
        this.characterCount = 0L;
        this.currentDepth = 0;
        this.threshold = 1000000L;
        this.ratio = 100L;
        this.maxDepth = 100;
        this.maxPackageEntryDepth = 10;
        this.stream = tikaInputStream;
    }

    private long getByteCount() {
        try {
            if (this.stream.hasLength()) {
                return this.stream.getLength();
            }
            return this.stream.getPosition();
        } catch (IOException e7) {
            throw new SAXException("Unable to get stream length", e7);
        }
    }

    public void advance(int i7) {
        this.characterCount += i7;
        long byteCount = getByteCount();
        long j = this.characterCount;
        if (j > this.threshold && j > this.ratio * byteCount) {
            long j8 = this.characterCount;
            StringBuilder sb = new StringBuilder("Suspected zip bomb: ");
            sb.append(byteCount);
            sb.append(" input bytes produced ");
            throw new SecureSAXException(AbstractC0059i.C(sb, j8, " output characters"));
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        advance(i8);
        super.characters(cArr, i7, i8);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        super.endElement(str, str2, str3);
        if (!this.packageEntryDepths.isEmpty() && this.packageEntryDepths.getLast().intValue() == this.currentDepth) {
            this.packageEntryDepths.removeLast();
        }
        this.currentDepth--;
    }

    public long getMaximumCompressionRatio() {
        return this.ratio;
    }

    public int getMaximumDepth() {
        return this.maxDepth;
    }

    public int getMaximumPackageEntryDepth() {
        return this.maxPackageEntryDepth;
    }

    public long getOutputThreshold() {
        return this.threshold;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i7, int i8) {
        advance(i8);
        super.ignorableWhitespace(cArr, i7, i8);
    }

    public void setMaximumCompressionRatio(long j) {
        this.ratio = j;
    }

    public void setMaximumDepth(int i7) {
        this.maxDepth = i7;
    }

    public void setMaximumPackageEntryDepth(int i7) {
        this.maxPackageEntryDepth = i7;
    }

    public void setOutputThreshold(long j) {
        this.threshold = j;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        int i7 = this.currentDepth + 1;
        this.currentDepth = i7;
        if (i7 < this.maxDepth) {
            if ("div".equals(str3) && "package-entry".equals(attributes.getValue("class"))) {
                this.packageEntryDepths.addLast(Integer.valueOf(this.currentDepth));
                if (this.packageEntryDepths.size() >= this.maxPackageEntryDepth) {
                    throw new SecureSAXException(b.f("Suspected zip bomb: ", this.packageEntryDepths.size(), " levels of package entry nesting"));
                }
            }
            super.startElement(str, str2, str3, attributes);
            return;
        }
        throw new SecureSAXException(b.f("Suspected zip bomb: ", this.currentDepth, " levels of XML element nesting"));
    }

    public void throwIfCauseOf(SAXException sAXException) {
        if ((sAXException instanceof SecureSAXException) && ((SecureSAXException) sAXException).isCausedBy(this)) {
            throw new TikaException("Zip bomb detected!", sAXException);
        }
    }
}
