// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: constant/chat_type.proto

package im.micro.access.constant;

/**
 * <pre>
 * 聊天类型
 * </pre>
 *
 * Protobuf enum {@code im.micro.proto.ChatType}
 */
public enum ChatType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 私聊
   * </pre>
   *
   * <code>PRIVATE = 0;</code>
   */
  PRIVATE(0),
  /**
   * <pre>
   * 群聊
   * </pre>
   *
   * <code>GROUP = 1;</code>
   */
  GROUP(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 私聊
   * </pre>
   *
   * <code>PRIVATE = 0;</code>
   */
  public static final int PRIVATE_VALUE = 0;
  /**
   * <pre>
   * 群聊
   * </pre>
   *
   * <code>GROUP = 1;</code>
   */
  public static final int GROUP_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ChatType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChatType forNumber(int value) {
    switch (value) {
      case 0: return PRIVATE;
      case 1: return GROUP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChatType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChatType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChatType>() {
          public ChatType findValueByNumber(int number) {
            return ChatType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return im.micro.access.constant.ChatTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChatType[] VALUES = values();

  public static ChatType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ChatType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:im.micro.proto.ChatType)
}

