package org.simpleframework.xml.stream;

import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class HyphenBuilder implements Style {

    /* loaded from: classes2.dex */
    public class Parser extends Splitter {
        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
            if (i10 + i11 < this.count) {
                this.builder.append(ASCIIPropertyListParser.DATE_DATE_FIELD_DELIMITER);
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i10, int i11) {
            cArr[i10] = toLower(cArr[i10]);
        }

        private Parser(String str) {
            super(str);
        }
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str == null) {
            return null;
        }
        return new Parser(str).process();
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str == null) {
            return null;
        }
        return new Parser(str).process();
    }
}
