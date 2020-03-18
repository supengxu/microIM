// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/update_friend_request_request.proto

package im.micro.access.pojo.request.user.relationship;

/**
 * Protobuf type {@code im.micro.proto.UpdateFriendRequestRequest}
 */
public  final class UpdateFriendRequestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.micro.proto.UpdateFriendRequestRequest)
    UpdateFriendRequestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFriendRequestRequest.newBuilder() to construct.
  private UpdateFriendRequestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFriendRequestRequest() {
    responseAction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFriendRequestRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateFriendRequestRequest(
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
          case 8: {

            requestId_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            responseAction_ = rawValue;
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (reason_ != null) {
              subBuilder = reason_.toBuilder();
            }
            reason_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reason_);
              reason_ = subBuilder.buildPartial();
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
    return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOuterClass.internal_static_im_micro_proto_UpdateFriendRequestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOuterClass.internal_static_im_micro_proto_UpdateFriendRequestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.class, im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.Builder.class);
  }

  public static final int REQUESTID_FIELD_NUMBER = 1;
  private long requestId_;
  /**
   * <code>int64 requestId = 1;</code>
   * @return The requestId.
   */
  public long getRequestId() {
    return requestId_;
  }

  public static final int RESPONSEACTION_FIELD_NUMBER = 2;
  private int responseAction_;
  /**
   * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
   * @return The enum numeric value on the wire for responseAction.
   */
  public int getResponseActionValue() {
    return responseAction_;
  }
  /**
   * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
   * @return The responseAction.
   */
  public im.micro.access.constant.ResponseAction getResponseAction() {
    @SuppressWarnings("deprecation")
    im.micro.access.constant.ResponseAction result = im.micro.access.constant.ResponseAction.valueOf(responseAction_);
    return result == null ? im.micro.access.constant.ResponseAction.UNRECOGNIZED : result;
  }

  public static final int REASON_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue reason_;
  /**
   * <code>.google.protobuf.StringValue reason = 3;</code>
   * @return Whether the reason field is set.
   */
  public boolean hasReason() {
    return reason_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue reason = 3;</code>
   * @return The reason.
   */
  public com.google.protobuf.StringValue getReason() {
    return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
  }
  /**
   * <code>.google.protobuf.StringValue reason = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
    return getReason();
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
    if (requestId_ != 0L) {
      output.writeInt64(1, requestId_);
    }
    if (responseAction_ != im.micro.access.constant.ResponseAction.ACCEPT.getNumber()) {
      output.writeEnum(2, responseAction_);
    }
    if (reason_ != null) {
      output.writeMessage(3, getReason());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, requestId_);
    }
    if (responseAction_ != im.micro.access.constant.ResponseAction.ACCEPT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, responseAction_);
    }
    if (reason_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReason());
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
    if (!(obj instanceof im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest)) {
      return super.equals(obj);
    }
    im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest other = (im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (responseAction_ != other.responseAction_) return false;
    if (hasReason() != other.hasReason()) return false;
    if (hasReason()) {
      if (!getReason()
          .equals(other.getReason())) return false;
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
    hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestId());
    hash = (37 * hash) + RESPONSEACTION_FIELD_NUMBER;
    hash = (53 * hash) + responseAction_;
    if (hasReason()) {
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parseFrom(
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
  public static Builder newBuilder(im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest prototype) {
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
   * Protobuf type {@code im.micro.proto.UpdateFriendRequestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.micro.proto.UpdateFriendRequestRequest)
      im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOuterClass.internal_static_im_micro_proto_UpdateFriendRequestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOuterClass.internal_static_im_micro_proto_UpdateFriendRequestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.class, im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.Builder.class);
    }

    // Construct using im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.newBuilder()
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
      requestId_ = 0L;

      responseAction_ = 0;

      if (reasonBuilder_ == null) {
        reason_ = null;
      } else {
        reason_ = null;
        reasonBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequestOuterClass.internal_static_im_micro_proto_UpdateFriendRequestRequest_descriptor;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest getDefaultInstanceForType() {
      return im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest build() {
      im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest buildPartial() {
      im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest result = new im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest(this);
      result.requestId_ = requestId_;
      result.responseAction_ = responseAction_;
      if (reasonBuilder_ == null) {
        result.reason_ = reason_;
      } else {
        result.reason_ = reasonBuilder_.build();
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
      if (other instanceof im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest) {
        return mergeFrom((im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest other) {
      if (other == im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest.getDefaultInstance()) return this;
      if (other.getRequestId() != 0L) {
        setRequestId(other.getRequestId());
      }
      if (other.responseAction_ != 0) {
        setResponseActionValue(other.getResponseActionValue());
      }
      if (other.hasReason()) {
        mergeReason(other.getReason());
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
      im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long requestId_ ;
    /**
     * <code>int64 requestId = 1;</code>
     * @return The requestId.
     */
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <code>int64 requestId = 1;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(long value) {
      
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 requestId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = 0L;
      onChanged();
      return this;
    }

    private int responseAction_ = 0;
    /**
     * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
     * @return The enum numeric value on the wire for responseAction.
     */
    public int getResponseActionValue() {
      return responseAction_;
    }
    /**
     * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
     * @param value The enum numeric value on the wire for responseAction to set.
     * @return This builder for chaining.
     */
    public Builder setResponseActionValue(int value) {
      responseAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
     * @return The responseAction.
     */
    public im.micro.access.constant.ResponseAction getResponseAction() {
      @SuppressWarnings("deprecation")
      im.micro.access.constant.ResponseAction result = im.micro.access.constant.ResponseAction.valueOf(responseAction_);
      return result == null ? im.micro.access.constant.ResponseAction.UNRECOGNIZED : result;
    }
    /**
     * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
     * @param value The responseAction to set.
     * @return This builder for chaining.
     */
    public Builder setResponseAction(im.micro.access.constant.ResponseAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseAction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.im.micro.proto.ResponseAction responseAction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseAction() {
      
      responseAction_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue reason_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> reasonBuilder_;
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     * @return Whether the reason field is set.
     */
    public boolean hasReason() {
      return reasonBuilder_ != null || reason_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     * @return The reason.
     */
    public com.google.protobuf.StringValue getReason() {
      if (reasonBuilder_ == null) {
        return reason_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : reason_;
      } else {
        return reasonBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public Builder setReason(com.google.protobuf.StringValue value) {
      if (reasonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reason_ = value;
        onChanged();
      } else {
        reasonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public Builder setReason(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (reasonBuilder_ == null) {
        reason_ = builderForValue.build();
        onChanged();
      } else {
        reasonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public Builder mergeReason(com.google.protobuf.StringValue value) {
      if (reasonBuilder_ == null) {
        if (reason_ != null) {
          reason_ =
            com.google.protobuf.StringValue.newBuilder(reason_).mergeFrom(value).buildPartial();
        } else {
          reason_ = value;
        }
        onChanged();
      } else {
        reasonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public Builder clearReason() {
      if (reasonBuilder_ == null) {
        reason_ = null;
        onChanged();
      } else {
        reason_ = null;
        reasonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getReasonBuilder() {
      
      onChanged();
      return getReasonFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getReasonOrBuilder() {
      if (reasonBuilder_ != null) {
        return reasonBuilder_.getMessageOrBuilder();
      } else {
        return reason_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : reason_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue reason = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getReasonFieldBuilder() {
      if (reasonBuilder_ == null) {
        reasonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getReason(),
                getParentForChildren(),
                isClean());
        reason_ = null;
      }
      return reasonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:im.micro.proto.UpdateFriendRequestRequest)
  }

  // @@protoc_insertion_point(class_scope:im.micro.proto.UpdateFriendRequestRequest)
  private static final im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest();
  }

  public static im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFriendRequestRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFriendRequestRequest>() {
    @java.lang.Override
    public UpdateFriendRequestRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateFriendRequestRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateFriendRequestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFriendRequestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.micro.access.pojo.request.user.relationship.UpdateFriendRequestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

