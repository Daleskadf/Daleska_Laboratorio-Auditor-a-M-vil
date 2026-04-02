package org.apache.tika.mime;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class MimeType implements Comparable<MimeType>, Serializable {
    private static final long serialVersionUID = 4357830439860729201L;
    private final MediaType type;
    private final int minLength = 0;
    private String acronym = StringUtils.EMPTY;
    private String uti = StringUtils.EMPTY;
    private List<URI> links = Collections.emptyList();
    private String description = StringUtils.EMPTY;
    private List<Magic> magics = null;
    private List<RootXML> rootXML = null;
    private List<String> extensions = null;
    private boolean isInterpreted = false;

    /* loaded from: classes.dex */
    public static class RootXML implements Serializable {
        private static final long serialVersionUID = 5140496601491000730L;
        private String localName;
        private String namespaceURI;
        private MimeType type;

        public RootXML(MimeType mimeType, String str, String str2) {
            this.type = null;
            this.namespaceURI = null;
            this.localName = null;
            if (isEmpty(str) && isEmpty(str2)) {
                throw new IllegalArgumentException("Both namespaceURI and localName cannot be empty");
            }
            this.type = mimeType;
            this.namespaceURI = str;
            this.localName = str2;
        }

        private boolean isEmpty(String str) {
            if (str != null && !str.equals(StringUtils.EMPTY)) {
                return false;
            }
            return true;
        }

        public String getLocalName() {
            return this.localName;
        }

        public String getNameSpaceURI() {
            return this.namespaceURI;
        }

        public MimeType getType() {
            return this.type;
        }

        public boolean matches(String str, String str2) {
            if (!isEmpty(this.namespaceURI)) {
                if (!this.namespaceURI.equals(str)) {
                    return false;
                }
            } else if (!isEmpty(str)) {
                return false;
            }
            if (!isEmpty(this.localName)) {
                return this.localName.equals(str2);
            }
            return isEmpty(str2);
        }

        public String toString() {
            MimeType mimeType = this.type;
            String str = this.namespaceURI;
            String str2 = this.localName;
            return mimeType + ", " + str + ", " + str2;
        }
    }

    public MimeType(MediaType mediaType) {
        if (mediaType != null) {
            this.type = mediaType;
            return;
        }
        throw new IllegalArgumentException("Media type name is missing");
    }

    public static boolean isValid(String str) {
        if (str != null) {
            boolean z7 = false;
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (charAt <= ' ' || charAt >= 127 || charAt == '(' || charAt == ')' || charAt == '<' || charAt == '>' || charAt == '@' || charAt == ',' || charAt == ';' || charAt == ':' || charAt == '\\' || charAt == '\"' || charAt == '[' || charAt == ']' || charAt == '?' || charAt == '=') {
                    return false;
                }
                if (charAt == '/') {
                    if (z7 || i7 == 0 || i7 + 1 == str.length()) {
                        return false;
                    }
                    z7 = true;
                }
            }
            return z7;
        }
        throw new IllegalArgumentException("Name is missing");
    }

    public void addExtension(String str) {
        List<String> list = this.extensions;
        if (list == null) {
            this.extensions = Collections.singletonList(str);
        } else if (list.size() == 1) {
            this.extensions = new ArrayList(this.extensions);
        }
        if (!this.extensions.contains(str)) {
            this.extensions.add(str);
        }
    }

    public void addLink(URI uri) {
        if (uri != null) {
            ArrayList arrayList = new ArrayList(this.links.size() + 1);
            arrayList.addAll(this.links);
            arrayList.add(uri);
            this.links = DesugarCollections.unmodifiableList(arrayList);
            return;
        }
        throw new IllegalArgumentException("Missing Link");
    }

    public void addMagic(Magic magic) {
        if (magic == null) {
            return;
        }
        if (this.magics == null) {
            this.magics = new ArrayList();
        }
        this.magics.add(magic);
    }

    public void addRootXML(String str, String str2) {
        if (this.rootXML == null) {
            this.rootXML = new ArrayList();
        }
        this.rootXML.add(new RootXML(this, str, str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof MimeType) {
            return this.type.equals(((MimeType) obj).type);
        }
        return false;
    }

    public String getAcronym() {
        return this.acronym;
    }

    public String getDescription() {
        return this.description;
    }

    public String getExtension() {
        List<String> list = this.extensions;
        if (list == null) {
            return StringUtils.EMPTY;
        }
        return list.get(0);
    }

    public List<String> getExtensions() {
        List<String> list = this.extensions;
        if (list != null) {
            return DesugarCollections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public List<URI> getLinks() {
        return this.links;
    }

    public List<Magic> getMagics() {
        List<Magic> list = this.magics;
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public int getMinLength() {
        return 0;
    }

    public String getName() {
        return this.type.toString();
    }

    public MediaType getType() {
        return this.type;
    }

    public String getUniformTypeIdentifier() {
        return this.uti;
    }

    public boolean hasMagic() {
        if (this.magics != null) {
            return true;
        }
        return false;
    }

    public boolean hasRootXML() {
        if (this.rootXML != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public boolean isInterpreted() {
        return this.isInterpreted;
    }

    public boolean matches(byte[] bArr) {
        return matchesMagic(bArr);
    }

    public boolean matchesMagic(byte[] bArr) {
        int i7 = 0;
        while (true) {
            List<Magic> list = this.magics;
            if (list == null || i7 >= list.size()) {
                break;
            } else if (this.magics.get(i7).eval(bArr)) {
                return true;
            } else {
                i7++;
            }
        }
        return false;
    }

    public boolean matchesXML(String str, String str2) {
        List<RootXML> list = this.rootXML;
        if (list != null) {
            for (RootXML rootXML : list) {
                if (rootXML.matches(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void setAcronym(String str) {
        if (str != null) {
            this.acronym = str;
            return;
        }
        throw new IllegalArgumentException("Acronym is missing");
    }

    public void setDescription(String str) {
        if (str != null) {
            this.description = str;
            return;
        }
        throw new IllegalArgumentException("Description is missing");
    }

    public void setInterpreted(boolean z7) {
        this.isInterpreted = z7;
    }

    public void setUniformTypeIdentifier(String str) {
        if (str != null) {
            this.uti = str;
            return;
        }
        throw new IllegalArgumentException("Uniform Type Identifier is missing");
    }

    public String toString() {
        return this.type.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(MimeType mimeType) {
        return this.type.compareTo(mimeType.type);
    }
}
