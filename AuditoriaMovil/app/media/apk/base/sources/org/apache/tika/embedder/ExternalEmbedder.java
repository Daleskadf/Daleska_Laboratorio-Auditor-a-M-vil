package org.apache.tika.embedder;

import D.AbstractC0059i;
import D.RunnableC0053c;
import S6.c;
import T6.d;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.emptySet();
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static /* synthetic */ void a(InputStream inputStream, OutputStream outputStream) {
        lambda$multiThreadedStreamCopy$0(inputStream, outputStream);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    public static /* synthetic */ void lambda$multiThreadedStreamCopy$0(InputStream inputStream, OutputStream outputStream) {
        try {
            c.b(inputStream, outputStream);
        } catch (IOException e7) {
            PrintStream printStream = System.out;
            String message = e7.getMessage();
            printStream.println("ERROR: " + message);
        }
    }

    private void multiThreadedStreamCopy(InputStream inputStream, OutputStream outputStream) {
        new Thread(new RunnableC0053c(23, inputStream, outputStream)).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            c.b(process.getInputStream(), outputStream);
        } catch (IOException e7) {
            PrintStream printStream = System.out;
            String message = e7.getMessage();
            printStream.println("ERROR: " + message);
        }
    }

    public static String serializeMetadata(List<String> list) {
        if (list != null) {
            return Arrays.toString(list.toArray());
        }
        return StringUtils.EMPTY;
    }

    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) {
        boolean z7;
        List<String> list;
        Process exec;
        int i7;
        int i8;
        Map<Property, String[]> map = this.metadataCommandArguments;
        if (map != null && !map.isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        TikaInputStream tikaInputStream = TikaInputStream.get(inputStream);
        File file = null;
        if (z7) {
            list = getCommandMetadataSegments(metadata);
        } else {
            list = null;
        }
        String[] strArr = this.command;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = true;
        for (int length = strArr.length; i9 < length; length = i7) {
            String str = strArr[i9];
            String[] strArr2 = strArr;
            if (str.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                i7 = length;
                str = str.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream.getFile().toString());
                z10 = false;
            } else {
                i7 = length;
            }
            if (str.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                file = this.tmp.createTemporaryFile();
                str = str.replace(ExternalParser.OUTPUT_FILE_TOKEN, file.toString());
                z11 = false;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z8 = true;
            }
            if (str.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z7) {
                    arrayList.addAll(list);
                }
                i8 = 1;
                z9 = true;
            } else {
                arrayList.add(str);
                i8 = 1;
            }
            i9 += i8;
            strArr = strArr2;
        }
        if (z7) {
            if (z8) {
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i10, str2.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(list)));
                    }
                    i10++;
                }
            } else if (!z9 && !z8) {
                arrayList.addAll(list);
            }
        }
        if (arrayList.toArray().length == 1) {
            exec = Runtime.getRuntime().exec(((String[]) arrayList.toArray(new String[0]))[0]);
        } else {
            exec = Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
        }
        Process process = exec;
        int i11 = X6.c.f;
        new d();
        X6.c cVar = new X6.c();
        try {
            sendStdErrToOutputStream(process, cVar);
            if (z10) {
                sendInputStreamToStdIn(inputStream, process);
            } else {
                process.getOutputStream().close();
            }
            if (z11) {
                sendStdOutToOutputStream(process, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    process.waitFor();
                } catch (InterruptedException unused) {
                }
                c.b(TikaInputStream.get(file), outputStream);
            }
            if (z11) {
                try {
                    process.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z10) {
                c.a(tikaInputStream);
            }
            c.a(outputStream);
            c.a(cVar);
            if (process.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(cVar.b(), StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z11) {
                try {
                    process.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z10) {
                c.a(tikaInputStream);
            }
            c.a(outputStream);
            c.a(cVar);
            if (process.exitValue() != 0) {
                throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(cVar.b(), StandardCharsets.UTF_8.name()));
            }
            throw th;
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i7;
        Iterator<Property> it;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] names = metadata.names();
            int length = names.length;
            for (int i8 = 0; i8 < length; i8++) {
                String str = names[i8];
                Iterator<Property> it2 = getMetadataCommandArguments().keySet().iterator();
                while (it2.hasNext()) {
                    Property next = it2.next();
                    if (str.equals(next.getName()) && (strArr = getMetadataCommandArguments().get(next)) != null) {
                        int length2 = strArr.length;
                        int i9 = 0;
                        while (i9 < length2) {
                            String str2 = strArr[i9];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i10 = 0;
                                while (true) {
                                    strArr2 = names;
                                    if (i10 >= length3) {
                                        break;
                                    }
                                    String str3 = values[i10];
                                    int i11 = length;
                                    if (this.quoteAssignmentValues) {
                                        str3 = AbstractC0059i.M("'", str3, "'");
                                    }
                                    String str4 = this.commandAppendOperator;
                                    Iterator<Property> it3 = it2;
                                    arrayList.add(str2 + str4 + str3);
                                    i10++;
                                    names = strArr2;
                                    length = i11;
                                    it2 = it3;
                                }
                                i7 = length;
                                it = it2;
                            } else {
                                strArr2 = names;
                                i7 = length;
                                it = it2;
                                String str5 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    str5 = AbstractC0059i.M("'", str5, "'");
                                }
                                String str6 = this.commandAssignmentOperator;
                                arrayList.add(str2 + str6 + str5);
                            }
                            i9++;
                            names = strArr2;
                            length = i7;
                            it2 = it;
                        }
                    }
                    names = names;
                    length = length;
                    it2 = it2;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z7) {
        this.quoteAssignmentValues = z7;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = DesugarCollections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) {
        Process exec;
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            if (strArr.length == 1) {
                exec = Runtime.getRuntime().exec(strArr[0]);
            } else {
                exec = Runtime.getRuntime().exec(strArr);
            }
            int waitFor = exec.waitFor();
            for (int i7 : iArr) {
                if (waitFor == i7) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
