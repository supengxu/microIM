// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/signal/ack_request.proto

package im.micro.access.pojo.request.signal;

public interface AckRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.micro.proto.AckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int64 messages_ids = 1;</code>
   * @return A list containing the messagesIds.
   */
  java.util.List<java.lang.Long> getMessagesIdsList();
  /**
   * <code>repeated int64 messages_ids = 1;</code>
   * @return The count of messagesIds.
   */
  int getMessagesIdsCount();
  /**
   * <code>repeated int64 messages_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The messagesIds at the given index.
   */
  long getMessagesIds(int index);
}
