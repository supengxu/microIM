// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/query_users_infos_nearby_request.proto

package im.micro.access.pojo.request.user;

/**
 * Protobuf type {@code im.turms.proto.QueryUsersInfosNearbyRequest}
 */
public  final class QueryUsersInfosNearbyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.QueryUsersInfosNearbyRequest)
    QueryUsersInfosNearbyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUsersInfosNearbyRequest.newBuilder() to construct.
  private QueryUsersInfosNearbyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUsersInfosNearbyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUsersInfosNearbyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryUsersInfosNearbyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            latitude_ = input.readFloat();
            break;
          }
          case 21: {

            longitude_ = input.readFloat();
            break;
          }
          case 26: {
            com.google.protobuf.FloatValue.Builder subBuilder = null;
            if (distance_ != null) {
              subBuilder = distance_.toBuilder();
            }
            distance_ = input.readMessage(com.google.protobuf.FloatValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(distance_);
              distance_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (maxNumber_ != null) {
              subBuilder = maxNumber_.toBuilder();
            }
            maxNumber_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxNumber_);
              maxNumber_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOuterClass.internal_static_im_turms_proto_QueryUsersInfosNearbyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOuterClass.internal_static_im_turms_proto_QueryUsersInfosNearbyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.class, im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private float latitude_;
  /**
   * <code>float latitude = 1;</code>
   * @return The latitude.
   */
  public float getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private float longitude_;
  /**
   * <code>float longitude = 2;</code>
   * @return The longitude.
   */
  public float getLongitude() {
    return longitude_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private com.google.protobuf.FloatValue distance_;
  /**
   * <code>.google.protobuf.FloatValue distance = 3;</code>
   * @return Whether the distance field is set.
   */
  public boolean hasDistance() {
    return distance_ != null;
  }
  /**
   * <code>.google.protobuf.FloatValue distance = 3;</code>
   * @return The distance.
   */
  public com.google.protobuf.FloatValue getDistance() {
    return distance_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : distance_;
  }
  /**
   * <code>.google.protobuf.FloatValue distance = 3;</code>
   */
  public com.google.protobuf.FloatValueOrBuilder getDistanceOrBuilder() {
    return getDistance();
  }

  public static final int MAXNUMBER_FIELD_NUMBER = 4;
  private com.google.protobuf.UInt32Value maxNumber_;
  /**
   * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
   * @return Whether the maxNumber field is set.
   */
  public boolean hasMaxNumber() {
    return maxNumber_ != null;
  }
  /**
   * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
   * @return The maxNumber.
   */
  public com.google.protobuf.UInt32Value getMaxNumber() {
    return maxNumber_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxNumber_;
  }
  /**
   * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
   */
  public com.google.protobuf.UInt32ValueOrBuilder getMaxNumberOrBuilder() {
    return getMaxNumber();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (latitude_ != 0F) {
      output.writeFloat(1, latitude_);
    }
    if (longitude_ != 0F) {
      output.writeFloat(2, longitude_);
    }
    if (distance_ != null) {
      output.writeMessage(3, getDistance());
    }
    if (maxNumber_ != null) {
      output.writeMessage(4, getMaxNumber());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, latitude_);
    }
    if (longitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, longitude_);
    }
    if (distance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDistance());
    }
    if (maxNumber_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMaxNumber());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest)) {
      return super.equals(obj);
    }
    im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest other = (im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest) obj;

    if (java.lang.Float.floatToIntBits(getLatitude())
        != java.lang.Float.floatToIntBits(
            other.getLatitude())) return false;
    if (java.lang.Float.floatToIntBits(getLongitude())
        != java.lang.Float.floatToIntBits(
            other.getLongitude())) return false;
    if (hasDistance() != other.hasDistance()) return false;
    if (hasDistance()) {
      if (!getDistance()
          .equals(other.getDistance())) return false;
    }
    if (hasMaxNumber() != other.hasMaxNumber()) return false;
    if (hasMaxNumber()) {
      if (!getMaxNumber()
          .equals(other.getMaxNumber())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLatitude());
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLongitude());
    if (hasDistance()) {
      hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getDistance().hashCode();
    }
    if (hasMaxNumber()) {
      hash = (37 * hash) + MAXNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getMaxNumber().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.QueryUsersInfosNearbyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.QueryUsersInfosNearbyRequest)
      im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOuterClass.internal_static_im_turms_proto_QueryUsersInfosNearbyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOuterClass.internal_static_im_turms_proto_QueryUsersInfosNearbyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.class, im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.Builder.class);
    }

    // Construct using im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      latitude_ = 0F;

      longitude_ = 0F;

      if (distanceBuilder_ == null) {
        distance_ = null;
      } else {
        distance_ = null;
        distanceBuilder_ = null;
      }
      if (maxNumberBuilder_ == null) {
        maxNumber_ = null;
      } else {
        maxNumber_ = null;
        maxNumberBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequestOuterClass.internal_static_im_turms_proto_QueryUsersInfosNearbyRequest_descriptor;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest getDefaultInstanceForType() {
      return im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest build() {
      im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest buildPartial() {
      im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest result = new im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      if (distanceBuilder_ == null) {
        result.distance_ = distance_;
      } else {
        result.distance_ = distanceBuilder_.build();
      }
      if (maxNumberBuilder_ == null) {
        result.maxNumber_ = maxNumber_;
      } else {
        result.maxNumber_ = maxNumberBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest) {
        return mergeFrom((im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest other) {
      if (other == im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest.getDefaultInstance()) return this;
      if (other.getLatitude() != 0F) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0F) {
        setLongitude(other.getLongitude());
      }
      if (other.hasDistance()) {
        mergeDistance(other.getDistance());
      }
      if (other.hasMaxNumber()) {
        mergeMaxNumber(other.getMaxNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float latitude_ ;
    /**
     * <code>float latitude = 1;</code>
     * @return The latitude.
     */
    public float getLatitude() {
      return latitude_;
    }
    /**
     * <code>float latitude = 1;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(float value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float latitude = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0F;
      onChanged();
      return this;
    }

    private float longitude_ ;
    /**
     * <code>float longitude = 2;</code>
     * @return The longitude.
     */
    public float getLongitude() {
      return longitude_;
    }
    /**
     * <code>float longitude = 2;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(float value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float longitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.FloatValue distance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> distanceBuilder_;
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     * @return Whether the distance field is set.
     */
    public boolean hasDistance() {
      return distanceBuilder_ != null || distance_ != null;
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     * @return The distance.
     */
    public com.google.protobuf.FloatValue getDistance() {
      if (distanceBuilder_ == null) {
        return distance_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : distance_;
      } else {
        return distanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public Builder setDistance(com.google.protobuf.FloatValue value) {
      if (distanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        distance_ = value;
        onChanged();
      } else {
        distanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public Builder setDistance(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (distanceBuilder_ == null) {
        distance_ = builderForValue.build();
        onChanged();
      } else {
        distanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public Builder mergeDistance(com.google.protobuf.FloatValue value) {
      if (distanceBuilder_ == null) {
        if (distance_ != null) {
          distance_ =
            com.google.protobuf.FloatValue.newBuilder(distance_).mergeFrom(value).buildPartial();
        } else {
          distance_ = value;
        }
        onChanged();
      } else {
        distanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public Builder clearDistance() {
      if (distanceBuilder_ == null) {
        distance_ = null;
        onChanged();
      } else {
        distance_ = null;
        distanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public com.google.protobuf.FloatValue.Builder getDistanceBuilder() {
      
      onChanged();
      return getDistanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getDistanceOrBuilder() {
      if (distanceBuilder_ != null) {
        return distanceBuilder_.getMessageOrBuilder();
      } else {
        return distance_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : distance_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue distance = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getDistanceFieldBuilder() {
      if (distanceBuilder_ == null) {
        distanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getDistance(),
                getParentForChildren(),
                isClean());
        distance_ = null;
      }
      return distanceBuilder_;
    }

    private com.google.protobuf.UInt32Value maxNumber_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> maxNumberBuilder_;
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     * @return Whether the maxNumber field is set.
     */
    public boolean hasMaxNumber() {
      return maxNumberBuilder_ != null || maxNumber_ != null;
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     * @return The maxNumber.
     */
    public com.google.protobuf.UInt32Value getMaxNumber() {
      if (maxNumberBuilder_ == null) {
        return maxNumber_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxNumber_;
      } else {
        return maxNumberBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public Builder setMaxNumber(com.google.protobuf.UInt32Value value) {
      if (maxNumberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxNumber_ = value;
        onChanged();
      } else {
        maxNumberBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public Builder setMaxNumber(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (maxNumberBuilder_ == null) {
        maxNumber_ = builderForValue.build();
        onChanged();
      } else {
        maxNumberBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public Builder mergeMaxNumber(com.google.protobuf.UInt32Value value) {
      if (maxNumberBuilder_ == null) {
        if (maxNumber_ != null) {
          maxNumber_ =
            com.google.protobuf.UInt32Value.newBuilder(maxNumber_).mergeFrom(value).buildPartial();
        } else {
          maxNumber_ = value;
        }
        onChanged();
      } else {
        maxNumberBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public Builder clearMaxNumber() {
      if (maxNumberBuilder_ == null) {
        maxNumber_ = null;
        onChanged();
      } else {
        maxNumber_ = null;
        maxNumberBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getMaxNumberBuilder() {
      
      onChanged();
      return getMaxNumberFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getMaxNumberOrBuilder() {
      if (maxNumberBuilder_ != null) {
        return maxNumberBuilder_.getMessageOrBuilder();
      } else {
        return maxNumber_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : maxNumber_;
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value maxNumber = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getMaxNumberFieldBuilder() {
      if (maxNumberBuilder_ == null) {
        maxNumberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getMaxNumber(),
                getParentForChildren(),
                isClean());
        maxNumber_ = null;
      }
      return maxNumberBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.QueryUsersInfosNearbyRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.QueryUsersInfosNearbyRequest)
  private static final im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest();
  }

  public static im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUsersInfosNearbyRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryUsersInfosNearbyRequest>() {
    @java.lang.Override
    public QueryUsersInfosNearbyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryUsersInfosNearbyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryUsersInfosNearbyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUsersInfosNearbyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.micro.access.pojo.request.user.QueryUsersInfosNearbyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

