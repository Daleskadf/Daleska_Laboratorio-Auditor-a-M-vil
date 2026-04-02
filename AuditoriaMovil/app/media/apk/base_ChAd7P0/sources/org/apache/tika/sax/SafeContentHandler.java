package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;
/* loaded from: classes.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {65533};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    /* loaded from: classes.dex */
    public interface Output {
        void write(char[] cArr, int i7, int i8);
    }

    /* loaded from: classes.dex */
    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(int i7) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i7, int i8) {
            this.builder.append(cArr, i7, i8);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        this.charactersOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f14620b;

            {
                this.f14620b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i7, int i8) {
                switch (r2) {
                    case 0:
                        this.f14620b.lambda$new$0(cArr, i7, i8);
                        return;
                    default:
                        this.f14620b.lambda$new$1(cArr, i7, i8);
                        return;
                }
            }
        };
        this.ignorableWhitespaceOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f14620b;

            {
                this.f14620b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i7, int i8) {
                switch (r2) {
                    case 0:
                        this.f14620b.lambda$new$0(cArr, i7, i8);
                        return;
                    default:
                        this.f14620b.lambda$new$1(cArr, i7, i8);
                        return;
                }
            }
        };
    }

    private void filter(char[] cArr, int i7, int i8, Output output) {
        int i9 = i8 + i7;
        int i10 = i7;
        while (i7 < i9) {
            int codePointAt = Character.codePointAt(cArr, i7, i9);
            int charCount = Character.charCount(codePointAt) + i7;
            if (isInvalid(codePointAt)) {
                if (i7 > i10) {
                    output.write(cArr, i10, i7 - i10);
                }
                writeReplacement(output);
                i10 = charCount;
            }
            i7 = charCount;
        }
        output.write(cArr, i10, i9 - i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(char[] cArr, int i7, int i8) {
        super.characters(cArr, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(char[] cArr, int i7, int i8) {
        super.ignorableWhitespace(cArr, i7, i8);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        filter(cArr, i7, i8, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i7, int i8) {
        filter(cArr, i7, i8, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i7) {
        return i7 < 32 ? (i7 == 9 || i7 == 10 || i7 == 13) ? false : true : i7 < 57344 ? i7 > 55295 : i7 < 65536 ? i7 > 65533 : i7 > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        int i7 = 0;
        while (true) {
            if (i7 >= attributes.getLength()) {
                break;
            } else if (isInvalid(attributes.getValue(i7))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                    String value = attributes.getValue(i8);
                    if (i8 >= i7 && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(0);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i8), attributes.getLocalName(i8), attributes.getQName(i8), attributes.getType(i8), value);
                }
                attributes = attributesImpl;
            } else {
                i7++;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int i7 = 0;
        while (i7 < charArray.length) {
            int codePointAt = Character.codePointAt(charArray, i7);
            if (isInvalid(codePointAt)) {
                return true;
            }
            i7 += Character.charCount(codePointAt);
        }
        return false;
    }
}
