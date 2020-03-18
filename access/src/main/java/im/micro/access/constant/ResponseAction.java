// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: constant/response_action.proto

package im.micro.access.constant;

/**
 * Protobuf enum {@code im.micro.proto.ResponseAction}
 */
public enum ResponseAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACCEPT = 0;</code>
   */
  ACCEPT(0),
  /**
   * <code>DECLINE = 1;</code>
   */
  DECLINE(1),
  /**
   * <code>IGNORE = 2;</code>
   */
  IGNORE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACCEPT = 0;</code>
   */
  public static final int ACCEPT_VALUE = 0;
  /**
   * <code>DECLINE = 1;</code>
   */
  public static final int DECLINE_VALUE = 1;
  /**
   * <code>IGNORE = 2;</code>
   */
  public static final int IGNORE_VALUE = 2;


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
  public static ResponseAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResponseAction forNumber(int value) {
    switch (value) {
      case 0: return ACCEPT;
      case 1: return DECLINE;
      case 2: return IGNORE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseAction>() {
          public ResponseAction findValueByNumber(int number) {
            return ResponseAction.forNumber(number);
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
    return im.micro.access.constant.ResponseActionOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseAction[] VALUES = values();

  public static ResponseAction valueOf(
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

  private ResponseAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:im.micro.proto.ResponseAction)
}

