package org.apache.tika.extractor;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class AbstractEmbeddedDocumentBytesHandler implements EmbeddedDocumentBytesHandler {
    List<Integer> ids = new ArrayList();

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i7, Metadata metadata, InputStream inputStream) {
        this.ids.add(Integer.valueOf(i7));
    }

    public String getEmitKey(String str, int i7, EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig, Metadata metadata) {
        String num;
        if (embeddedDocumentBytesConfig.getZeroPadName() > 0) {
            num = StringUtils.leftPad(Integer.toString(i7), embeddedDocumentBytesConfig.getZeroPadName(), "0");
        } else {
            num = Integer.toString(i7);
        }
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitKeyBase())) {
            sb.append(str);
            sb.append("/");
            sb.append(FilenameUtils.getName(str));
        } else {
            sb.append(embeddedDocumentBytesConfig.getEmitKeyBase());
        }
        sb.append(embeddedDocumentBytesConfig.getEmbeddedIdPrefix());
        sb.append(num);
        if (embeddedDocumentBytesConfig.getSuffixStrategy().equals(EmbeddedDocumentBytesConfig.SUFFIX_STRATEGY.EXISTING)) {
            sb.append(FilenameUtils.getSuffixFromPath(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY)).toLowerCase(Locale.US));
        }
        return sb.toString();
    }

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public List<Integer> getIds() {
        return this.ids;
    }
}
