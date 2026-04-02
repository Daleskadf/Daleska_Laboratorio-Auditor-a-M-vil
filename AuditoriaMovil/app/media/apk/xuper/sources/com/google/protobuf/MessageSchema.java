package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes2.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.protobuf.MessageSchema$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z12;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z10;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.hasExtensions = z12;
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        if (isFieldPresent(t10, i10) == isFieldPresent(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return UnsafeUtil.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) {
        int i12;
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
        int i13 = registers.int1;
        if (i13 >= 0 && i13 <= i11 - decodeVarint32) {
            int i14 = decodeVarint32 + i13;
            K k10 = metadata.defaultKey;
            V v10 = metadata.defaultValue;
            while (decodeVarint32 < i14) {
                int i15 = decodeVarint32 + 1;
                byte b10 = bArr[decodeVarint32];
                if (b10 < 0) {
                    i12 = ArrayDecoders.decodeVarint32(b10, bArr, i15, registers);
                    b10 = registers.int1;
                } else {
                    i12 = i15;
                }
                int i16 = b10 >>> 3;
                int i17 = b10 & 7;
                if (i16 != 1) {
                    if (i16 == 2 && i17 == metadata.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i12, i11, metadata.valueType, metadata.defaultValue.getClass(), registers);
                        v10 = registers.object1;
                    }
                    decodeVarint32 = ArrayDecoders.skipField(b10, bArr, i12, i11, registers);
                } else if (i17 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i12, i11, metadata.keyType, null, registers);
                    k10 = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(b10, bArr, i12, i11, registers);
                }
            }
            if (decodeVarint32 == i14) {
                map.put(k10, v10);
                return i14;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        boolean z10;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                if (registers.long1 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                registers.object1 = Boolean.valueOf(z10);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i10, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i10, i11, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i10, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return UnsafeUtil.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        int numberAt = numberAt(i10);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i10)));
        if (object == null) {
            return ub;
        }
        Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i10);
        if (enumFieldVerifier == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i10, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i11, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t10, long j10) {
        return UnsafeUtil.getFloat(t10, j10);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) ((Class) this.objects[i11 + 1]));
        this.objects[i11] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t10) {
        int i10;
        int i11;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i13 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int numberAt = numberAt(i13);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i10 = this.buffer[i13 + 2];
                int i17 = i10 & i12;
                i11 = 1 << (i10 >>> 20);
                if (i17 != i15) {
                    i16 = unsafe.getInt(t10, i17);
                    i15 = i17;
                }
            } else {
                i10 = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i13 + 2] & i12;
                i11 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t10, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t10, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t10, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i16 & i11) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i16 & i11) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i14 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i14 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i16 & i11) != 0) {
                        Object object = unsafe.getObject(t10, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i14 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i16 & i11) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i16 & i11) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t10, offset));
                    i14 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                    i14 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t10, offset));
                    i14 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t10, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                    i14 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t10, offset), getMapFieldDefaultEntry(i13));
                    i14 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i14 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i14 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i14 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        Object object2 = unsafe.getObject(t10, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i14 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t10, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, numberAt, i13)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t10, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t10) {
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i10 = 0;
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i11);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i11);
            long offset = offset(typeAndOffsetAt);
            int i12 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i11 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (isFieldPresent(t10, i11)) {
                        Object object = UnsafeUtil.getObject(t10, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t10, offset), getMessageFieldSchema(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (isFieldPresent(t10, i11)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t10, offset), getMessageFieldSchema(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t10, offset), false);
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t10, offset), false);
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(t10, offset), false);
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t10, offset), false);
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(t10, offset), false);
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t10, offset), false);
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t10, offset), false);
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(t10, offset), false);
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(t10, offset));
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(t10, offset), getMessageFieldSchema(i11));
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t10, offset));
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t10, offset), false);
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(t10, offset), false);
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t10, offset), false);
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t10, offset), false);
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t10, offset), false);
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t10, offset), false);
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(t10, offset), getMessageFieldSchema(i11));
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t10, offset), getMapFieldDefaultEntry(i11));
                    break;
                case 51:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        Object object2 = UnsafeUtil.getObject(t10, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                            break;
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t10, offset), getMessageFieldSchema(i11));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t10, offset));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (isOneofPresent(t10, numberAt, i11)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t10, offset), getMessageFieldSchema(i11));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i10 += computeDoubleSize;
        }
        return i10 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return UnsafeUtil.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t10, offset(i10)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema<T> schema = 0;
        for (Object obj : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            boolean isInitialized = schema.isInitialized(obj);
            schema = schema;
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        if (UnsafeUtil.getInt(t10, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t11, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        if (UnsafeUtil.getInt(t10, presenceMaskAndOffsetAt(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j10) {
        return (List) UnsafeUtil.getObject(obj, j10);
    }

    private static <T> long longAt(T t10, long j10) {
        return UnsafeUtil.getLong(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0649 A[Catch: all -> 0x06a1, TRY_LEAVE, TryCatch #0 {all -> 0x06a1, blocks: (B:158:0x061a, B:169:0x0643, B:171:0x0649, B:181:0x0671, B:182:0x0676), top: B:212:0x061a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b3 A[LOOP:2: B:201:0x06af->B:203:0x06b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c8  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.protobuf.UnknownFieldSchema] */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.Reader] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r19, com.google.protobuf.ExtensionSchema<ET> r20, T r21, com.google.protobuf.Reader r22, com.google.protobuf.ExtensionRegistryLite r23) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i10));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i10) {
        if (!isFieldPresent(t11, i10)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t11, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t10, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t10, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t10, offset, newInstance);
                }
                setFieldPresent(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t10, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i10) {
        int numberAt = numberAt(i10);
        if (!isOneofPresent(t11, numberAt, i10)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t11, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t10, numberAt, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t10, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t10, offset, newInstance);
                }
                setOneofPresent(t10, numberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t10, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i10);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putDouble(t10, offset, UnsafeUtil.getDouble(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putFloat(t10, offset, UnsafeUtil.getFloat(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putBoolean(t10, offset, UnsafeUtil.getBoolean(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 9:
                mergeMessage(t10, t11, i10);
                return;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, offset, UnsafeUtil.getInt(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, offset, UnsafeUtil.getLong(t11, offset));
                    setFieldPresent(t10, i10);
                    return;
                }
                return;
            case 17:
                mergeMessage(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t10, t11, offset);
                return;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t10, t11, offset);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, numberAt, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setOneofPresent(t10, numberAt, i10);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, numberAt, i10)) {
                    UnsafeUtil.putObject(t10, offset, UnsafeUtil.getObject(t11, offset));
                    setOneofPresent(t10, numberAt, i10);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i10) {
        Schema messageFieldSchema = getMessageFieldSchema(i10);
        long offset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t10, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t10, int i10, int i11) {
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t10, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z10;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i10;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z10 = true;
        } else {
            z10 = false;
        }
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr3 = null;
        if (i11 > 0) {
            iArr = new int[i11];
        } else {
            iArr = null;
        }
        if (i12 > 0) {
            iArr3 = new int[i12];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr2, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr[i16] = i14;
                i16++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i10 = i14;
                iArr3[i17] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i17++;
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new MessageSchema<>(iArr2, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z10, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r34, com.google.protobuf.NewInstanceSchema r35, com.google.protobuf.ListFieldSchema r36, com.google.protobuf.UnknownFieldSchema<?, ?> r37, com.google.protobuf.ExtensionSchema<?> r38, com.google.protobuf.MapFieldSchema r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) UnsafeUtil.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) UnsafeUtil.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) UnsafeUtil.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) UnsafeUtil.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) UnsafeUtil.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t10, j10, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                    unsafe.putObject(t10, j10, Long.valueOf(registers.long1));
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                    unsafe.putObject(t10, j10, Integer.valueOf(registers.int1));
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                    unsafe.putObject(t10, j10, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                    int i22 = registers.int1;
                    if (i22 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, decodeVarint322, i22, Internal.UTF_8));
                        decodeVarint322 += i22;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i13, i17);
                    int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, registers);
                    storeOneofMessageField(t10, i13, i17, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int decodeBytes = ArrayDecoders.decodeBytes(bArr, i10, registers);
                    unsafe.putObject(t10, j10, registers.object1);
                    unsafe.putInt(t10, j11, i13);
                    return decodeBytes;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                    int i23 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                        getMutableUnknownFields(t10).storeField(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i23));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return decodeVarint323;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                    unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                    unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t10, j11, i13);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i13, i17);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, registers);
                    storeOneofMessageField(t10, i13, i17, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0298, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02db, code lost:
        if (r0 != r15) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02fe, code lost:
        if (r0 != r15) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0301, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0296, code lost:
        if (r0 != r10) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @com.google.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, com.google.protobuf.ArrayDecoders.Registers r34) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, ArrayDecoders.Registers registers) {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufList);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeDoubleList(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFloatList(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint64List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeFixed64List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFixed32List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeBoolList(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & IjkMediaMeta.AV_CH_STEREO_LEFT) == 0) {
                        return ArrayDecoders.decodeStringList(i12, bArr, i10, i11, protobufList, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return ArrayDecoders.decodeBytesList(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                } else if (i14 == 0) {
                    decodeVarint32List = ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) t10, i13, (List<Integer>) protobufList, getEnumFieldVerifier(i15), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt32List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt64List(i12, bArr, i10, i11, protobufList, registers);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                break;
        }
        return i10;
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, Reader reader) {
        if (isEnforceUtf8(i10)) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i10), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, Reader reader) {
        if (isEnforceUtf8(i10)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        java.lang.reflect.Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t10, int i10) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & presenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t10, j10, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        UnsafeUtil.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int numberAt = numberAt(i13);
            if (i10 == numberAt) {
                return i13;
            }
            if (i10 < numberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r4 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r5 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r5
        L23:
            r3 = 0
            goto L6b
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r4 = (int) r2
            int r2 = r0.id()
            boolean r3 = r0.isList()
            if (r3 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r5 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r5
        L51:
            int r3 = r8.getPresenceMask()
            int r3 = java.lang.Integer.numberOfTrailingZeros(r3)
            goto L6b
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L62
            r0 = 0
            goto L23
        L62:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r5 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6b:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7c
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7d
        L7c:
            r6 = 0
        L7d:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L85
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L85:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r4
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r3 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbd
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Lae
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lae:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Lda
        Lbd:
            if (r9 == 0) goto Lc8
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lc8:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t10, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t10, i10);
    }

    private void storeOneofMessageField(T t10, int i10, int i11, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t10, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto2(T r18, com.google.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrderProto3(T r13, com.google.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t10), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t10, t11, i10)) {
                return false;
            }
        }
        if (this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            if (this.hasExtensions) {
                return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
            }
            return true;
        }
        return false;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t10) {
        if (this.proto3) {
            return getSerializedSizeProto3(t10);
        }
        return getSerializedSizeProto2(t10);
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t10) {
        int i10;
        int hashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i12);
            int numberAt = numberAt(i12);
            long offset = offset(typeAndOffsetAt);
            int i13 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t10, offset)));
                    i11 = i10 + hashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t10, offset)).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t10, offset);
                    if (object != null) {
                        i13 = object.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getInt(t10, offset);
                    i11 = i10 + hashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t10, offset));
                    i11 = i10 + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t10, offset);
                    if (object2 != null) {
                        i13 = object2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                    i11 = i10 + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, offset)));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t10, offset)).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = oneofIntAt(t10, offset);
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t10, offset));
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t10, numberAt, i12)) {
                        i10 = i11 * 53;
                        hashLong = UnsafeUtil.getObject(t10, offset).hashCode();
                        i11 = i10 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.checkInitializedCount) {
            int i15 = this.intArray[i14];
            int numberAt = numberAt(i15);
            int typeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = UNSAFE.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t10, i15, i10, i11, i18)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t10, numberAt, i15) && !isInitialized(t10, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t10, typeAndOffsetAt, i15)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t10, typeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (isFieldPresent(t10, i15, i10, i11, i18) && !isInitialized(t10, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t10).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t10) {
        if (!isMutable(t10)) {
            return;
        }
        if (t10 instanceof GeneratedMessageLite) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
            generatedMessageLite.clearMemoizedSerializedSize();
            generatedMessageLite.clearMemoizedHashCode();
            generatedMessageLite.markImmutable();
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i10);
            long offset = offset(typeAndOffsetAt);
            int type = type(typeAndOffsetAt);
            if (type != 9) {
                switch (type) {
                    case 17:
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.listFieldSchema.makeImmutableListAt(t10, offset);
                        continue;
                    case 50:
                        Unsafe unsafe = UNSAFE;
                        Object object = unsafe.getObject(t10, offset);
                        if (object != null) {
                            unsafe.putObject(t10, offset, this.mapFieldSchema.toImmutable(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (isFieldPresent(t10, i10)) {
                getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(t10);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t10);
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @CanIgnoreReturnValue
    public int parseProto2Message(T t10, byte[] bArr, int i10, int i11, int i12, ArrayDecoders.Registers registers) {
        Unsafe unsafe;
        int i13;
        MessageSchema<T> messageSchema;
        int i14;
        int i15;
        int i16;
        int i17;
        T t11;
        byte b10;
        int positionForFieldNumber;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr2;
        int decodeVarint64;
        boolean z10;
        int i28;
        int i29;
        int i30;
        MessageSchema<T> messageSchema2 = this;
        T t12 = t10;
        byte[] bArr3 = bArr;
        int i31 = i11;
        int i32 = i12;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(t10);
        Unsafe unsafe2 = UNSAFE;
        int i33 = i10;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b11 = bArr3[i33];
                if (b11 < 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(b11, bArr3, i39, registers2);
                    b10 = registers2.int1;
                    i39 = decodeVarint32;
                } else {
                    b10 = b11;
                }
                int i40 = b10 >>> 3;
                int i41 = b10 & 7;
                if (i40 > i34) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i40, i35 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i40);
                }
                int i42 = positionForFieldNumber;
                if (i42 == -1) {
                    i18 = i40;
                    i19 = i39;
                    i15 = b10;
                    i20 = i37;
                    i21 = i38;
                    unsafe = unsafe2;
                    i13 = i32;
                    i22 = 0;
                } else {
                    int i43 = messageSchema2.buffer[i42 + 1];
                    int type = type(i43);
                    long offset = offset(i43);
                    int i44 = b10;
                    if (type <= 17) {
                        int i45 = messageSchema2.buffer[i42 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(t12, i38, i37);
                            }
                            i24 = i47;
                            i23 = unsafe2.getInt(t12, i47);
                        } else {
                            i23 = i37;
                            i24 = i38;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 1) {
                                    UnsafeUtil.putDouble(t12, offset, ArrayDecoders.decodeDouble(bArr2, i39));
                                    i33 = i39 + 8;
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 5) {
                                    UnsafeUtil.putFloat(t12, offset, ArrayDecoders.decodeFloat(bArr2, i39));
                                    i33 = i39 + 4;
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i39, registers2);
                                    unsafe2.putLong(t10, offset, registers2.long1);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i33 = decodeVarint64;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = ArrayDecoders.decodeVarint32(bArr2, i39, registers2);
                                    unsafe2.putInt(t12, offset, registers2.int1);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 1) {
                                    unsafe2.putLong(t10, offset, ArrayDecoders.decodeFixed64(bArr2, i39));
                                    i33 = i39 + 8;
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 5) {
                                    unsafe2.putInt(t12, offset, ArrayDecoders.decodeFixed32(bArr2, i39));
                                    i33 = i39 + 4;
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = ArrayDecoders.decodeVarint64(bArr2, i39, registers2);
                                    if (registers2.long1 != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    UnsafeUtil.putBoolean(t12, offset, z10);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    if ((ENFORCE_UTF8_MASK & i43) == 0) {
                                        i33 = ArrayDecoders.decodeString(bArr2, i39, registers2);
                                    } else {
                                        i33 = ArrayDecoders.decodeStringRequireUtf8(bArr2, i39, registers2);
                                    }
                                    unsafe2.putObject(t12, offset, registers2.object1);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t12, i27);
                                    i33 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i27), bArr, i39, i11, registers);
                                    messageSchema2.storeMessageField(t12, i27, mutableMessageFieldForMerge);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    i33 = ArrayDecoders.decodeBytes(bArr2, i39, registers2);
                                    unsafe2.putObject(t12, offset, registers2.object1);
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = ArrayDecoders.decodeVarint32(bArr2, i39, registers2);
                                    int i48 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i27);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i48)) {
                                        getMutableUnknownFields(t10).storeField(i26, Long.valueOf(i48));
                                        i35 = i27;
                                        i37 = i23;
                                        i36 = i26;
                                        i34 = i18;
                                        i38 = i25;
                                        i32 = i12;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(t12, offset, i48);
                                        i37 = i23 | i46;
                                        i32 = i12;
                                        i35 = i27;
                                        i36 = i26;
                                        i34 = i18;
                                        i38 = i25;
                                        bArr3 = bArr2;
                                        break;
                                    }
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = ArrayDecoders.decodeVarint32(bArr2, i39, registers2);
                                    unsafe2.putInt(t12, offset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 16:
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i39, registers2);
                                    unsafe2.putLong(t10, offset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i37 = i23 | i46;
                                    i32 = i12;
                                    i35 = i27;
                                    i33 = decodeVarint64;
                                    i36 = i26;
                                    i34 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                    break;
                                } else {
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            case 17:
                                if (i41 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t12, i42);
                                    i33 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i42), bArr, i39, i11, (i40 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t12, i42, mutableMessageFieldForMerge2);
                                    i37 = i23 | i46;
                                    i38 = i24;
                                    i32 = i12;
                                    i35 = i42;
                                    i36 = i44;
                                    i34 = i40;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i18 = i40;
                                    i25 = i24;
                                    i26 = i44;
                                    i27 = i42;
                                    i21 = i25;
                                    i13 = i12;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i15 = i26;
                                    break;
                                }
                            default:
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                i21 = i25;
                                i13 = i12;
                                i19 = i39;
                                i22 = i27;
                                unsafe = unsafe2;
                                i20 = i23;
                                i15 = i26;
                                break;
                        }
                    } else {
                        i18 = i40;
                        i21 = i38;
                        i20 = i37;
                        if (type == 27) {
                            if (i41 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(t12, offset);
                                if (!protobufList.isModifiable()) {
                                    int size = protobufList.size();
                                    if (size == 0) {
                                        i30 = 10;
                                    } else {
                                        i30 = size * 2;
                                    }
                                    protobufList = protobufList.mutableCopyWithCapacity(i30);
                                    unsafe2.putObject(t12, offset, protobufList);
                                }
                                i33 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i42), i44, bArr, i39, i11, protobufList, registers);
                                i35 = i42;
                                i36 = i44;
                                i38 = i21;
                                i37 = i20;
                                i34 = i18;
                                bArr3 = bArr;
                                i32 = i12;
                            } else {
                                i28 = i39;
                                unsafe = unsafe2;
                                i22 = i42;
                                i29 = i44;
                                i13 = i12;
                                i19 = i28;
                            }
                        } else if (type <= 49) {
                            int i49 = i39;
                            unsafe = unsafe2;
                            i22 = i42;
                            i29 = i44;
                            i33 = parseRepeatedField(t10, bArr, i39, i11, i44, i18, i41, i42, i43, type, offset, registers);
                            if (i33 != i49) {
                                messageSchema2 = this;
                                t12 = t10;
                                bArr3 = bArr;
                                i31 = i11;
                                i32 = i12;
                                registers2 = registers;
                                i38 = i21;
                                i37 = i20;
                                i35 = i22;
                                i36 = i29;
                                i34 = i18;
                                unsafe2 = unsafe;
                            } else {
                                i13 = i12;
                                i19 = i33;
                            }
                        } else {
                            i28 = i39;
                            unsafe = unsafe2;
                            i22 = i42;
                            i29 = i44;
                            if (type == 50) {
                                if (i41 == 2) {
                                    i33 = parseMapField(t10, bArr, i28, i11, i22, offset, registers);
                                    if (i33 != i28) {
                                        messageSchema2 = this;
                                        t12 = t10;
                                        bArr3 = bArr;
                                        i31 = i11;
                                        i32 = i12;
                                        registers2 = registers;
                                        i38 = i21;
                                        i37 = i20;
                                        i35 = i22;
                                        i36 = i29;
                                        i34 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i19 = i33;
                                    }
                                } else {
                                    i13 = i12;
                                    i19 = i28;
                                }
                            } else {
                                i33 = parseOneofField(t10, bArr, i28, i11, i29, i18, i41, i43, type, offset, i22, registers);
                                if (i33 != i28) {
                                    messageSchema2 = this;
                                    t12 = t10;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    registers2 = registers;
                                    i38 = i21;
                                    i37 = i20;
                                    i35 = i22;
                                    i36 = i29;
                                    i34 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i19 = i33;
                                }
                            }
                        }
                        i15 = i29;
                    }
                }
                if (i15 == i13 && i13 != 0) {
                    i17 = 1048575;
                    messageSchema = this;
                    i14 = i19;
                    i16 = i21;
                    i37 = i20;
                } else {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        i33 = ArrayDecoders.decodeExtensionOrUnknownField(i15, bArr, i19, i11, t10, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i33 = ArrayDecoders.decodeUnknownField(i15, bArr, i19, i11, getMutableUnknownFields(t10), registers);
                    }
                    t12 = t10;
                    bArr3 = bArr;
                    i31 = i11;
                    i36 = i15;
                    messageSchema2 = this;
                    registers2 = registers;
                    i38 = i21;
                    i37 = i20;
                    i35 = i22;
                    i34 = i18;
                    unsafe2 = unsafe;
                    i32 = i13;
                }
            } else {
                int i50 = i38;
                unsafe = unsafe2;
                i13 = i32;
                messageSchema = messageSchema2;
                i14 = i33;
                i15 = i36;
                i16 = i50;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t11 = t10;
            unsafe.putInt(t11, i16, i37);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i51 = messageSchema.checkInitializedCount; i51 < messageSchema.repeatedFieldOffsetStart; i51++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t10, messageSchema.intArray[i51], unknownFieldSetLite, messageSchema.unknownFieldSchema, t10);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t11, unknownFieldSetLite);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i14;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t10, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t10, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t10, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t10, writer);
        }
    }

    private boolean isFieldPresent(T t10, int i10) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & presenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (UnsafeUtil.getInt(t10, j10) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t10, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t10, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t10, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t10, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t10, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t10, offset));
            case 11:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t10, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t10, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t10, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, reader, extensionRegistryLite);
    }

    private boolean equals(T t10, T t11, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t10, t11, i10) && Double.doubleToLongBits(UnsafeUtil.getDouble(t10, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t11, offset));
            case 1:
                return arePresentForEquals(t10, t11, i10) && Float.floatToIntBits(UnsafeUtil.getFloat(t10, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t11, offset));
            case 2:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, offset) == UnsafeUtil.getLong(t11, offset);
            case 3:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, offset) == UnsafeUtil.getLong(t11, offset);
            case 4:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 5:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, offset) == UnsafeUtil.getLong(t11, offset);
            case 6:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 7:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getBoolean(t10, offset) == UnsafeUtil.getBoolean(t11, offset);
            case 8:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 9:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 10:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 11:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 12:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 13:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 14:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, offset) == UnsafeUtil.getLong(t11, offset);
            case 15:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, offset) == UnsafeUtil.getInt(t11, offset);
            case 16:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, offset) == UnsafeUtil.getLong(t11, offset);
            case 17:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, offset), UnsafeUtil.getObject(t11, offset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) {
        if (this.proto3) {
            parseProto3Message(t10, bArr, i10, i11, registers);
        } else {
            parseProto2Message(t10, bArr, i10, i11, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i10)));
    }
}
