// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: constant/device_type.proto

package im.micro.access.constant;

/**
 * <pre>
 * 设备烈性
 * </pre>
 *
 * Protobuf enum {@code im.micro.proto.DeviceType}
 */
public enum DeviceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 桌面
   * </pre>
   *
   * <code>DESKTOP = 0;</code>
   */
  DESKTOP(0),
  /**
   * <pre>
   * 浏览器
   * </pre>
   *
   * <code>BROWSER = 1;</code>
   */
  BROWSER(1),
  /**
   * <pre>
   * IOS
   * </pre>
   *
   * <code>IOS = 2;</code>
   */
  IOS(2),
  /**
   * <pre>
   * 安卓
   * </pre>
   *
   * <code>ANDROID = 3;</code>
   */
  ANDROID(3),
  /**
   * <pre>
   * 其他设备（其他系统）
   * </pre>
   *
   * <code>OTHERS = 4;</code>
   */
  OTHERS(4),
  /**
   * <pre>
   * 位置
   * </pre>
   *
   * <code>UNKNOWN = 5;</code>
   */
  UNKNOWN(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 桌面
   * </pre>
   *
   * <code>DESKTOP = 0;</code>
   */
  public static final int DESKTOP_VALUE = 0;
  /**
   * <pre>
   * 浏览器
   * </pre>
   *
   * <code>BROWSER = 1;</code>
   */
  public static final int BROWSER_VALUE = 1;
  /**
   * <pre>
   * IOS
   * </pre>
   *
   * <code>IOS = 2;</code>
   */
  public static final int IOS_VALUE = 2;
  /**
   * <pre>
   * 安卓
   * </pre>
   *
   * <code>ANDROID = 3;</code>
   */
  public static final int ANDROID_VALUE = 3;
  /**
   * <pre>
   * 其他设备（其他系统）
   * </pre>
   *
   * <code>OTHERS = 4;</code>
   */
  public static final int OTHERS_VALUE = 4;
  /**
   * <pre>
   * 位置
   * </pre>
   *
   * <code>UNKNOWN = 5;</code>
   */
  public static final int UNKNOWN_VALUE = 5;


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
  public static DeviceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeviceType forNumber(int value) {
    switch (value) {
      case 0: return DESKTOP;
      case 1: return BROWSER;
      case 2: return IOS;
      case 3: return ANDROID;
      case 4: return OTHERS;
      case 5: return UNKNOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeviceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeviceType>() {
          public DeviceType findValueByNumber(int number) {
            return DeviceType.forNumber(number);
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
    return im.micro.access.constant.DeviceTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DeviceType[] VALUES = values();

  public static DeviceType valueOf(
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

  private DeviceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:im.micro.proto.DeviceType)
}

