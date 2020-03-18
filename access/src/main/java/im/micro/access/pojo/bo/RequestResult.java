package im.micro.access.pojo.bo;

import im.micro.access.pojo.bo.common.Int64Values;
import im.micro.access.pojo.notification.MicroNotification;
import im.micro.access.pojo.request.MicroRequest;
import im.micro.common.contsant.ResponseCode;
import io.micrometer.core.lang.Nullable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Set;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestResult {
    public static final RequestResult NO_CONTENT = new RequestResult(
            null,
            null,
            null,
            ResponseCode.NO_CONTENT,
            null);
    private MicroNotification.Data dataForRequester;
    private Set<Long> recipients;
    private MicroRequest dataForRecipients;
    private ResponseCode
            code;
    private String reason;

    public static RequestResult fail() {
        return status(ResponseCode.FAILED);
    }

    public static RequestResult status(@NotNull ResponseCode code) {
        return new RequestResult(null, Collections.emptySet(), null, code, null);
    }

    public static RequestResult statusAndReason(@NotNull ResponseCode code, @NotNull String reason) {
        return new RequestResult(null, Collections.emptySet(), null, code, reason);
    }

    public static RequestResult responseId(@NotNull Long id) {
        MicroNotification.Data data = MicroNotification.Data
                .newBuilder()
                .setIds(Int64Values.newBuilder().addValues(id).build())
                .build();
        return new RequestResult(
                data,
                Collections.emptySet(),
                null,
                ResponseCode.OK,
                null);
    }

    public static RequestResult responseIdAndRecipientData(
            @NotNull Long id,
            @NotNull Long recipientId,
            @NotNull MicroRequest dataForRecipient) {
        MicroNotification.Data data = MicroNotification.Data
                .newBuilder()
                .setIds(Int64Values.newBuilder().addValues(id).build())
                .build();
        return new RequestResult(data, Collections.singleton(recipientId), dataForRecipient, ResponseCode.OK, null);
    }

    public static RequestResult responseIdAndRecipientData(
            @NotNull Long id,
            @Nullable Set<Long> recipients,
            MicroRequest dataForRecipients) {
        if (recipients == null || recipients.isEmpty()) {
            return responseId(id);
        } else {
            MicroNotification.Data data = MicroNotification.Data
                    .newBuilder()
                    .setIds(Int64Values.newBuilder().addValues(id).build())
                    .build();
            return new RequestResult(
                    data,
                    recipients,
                    dataForRecipients,
                    ResponseCode.OK,
                    null);
        }
    }

    public static RequestResult responseData(@NotNull MicroNotification.Data data) {
        return new RequestResult(data, Collections.emptySet(), null, ResponseCode.OK, null);
    }

    public static RequestResult recipientData(
            @NotNull Long recipientId,
            @NotNull MicroRequest dataForRecipient) {
        return new RequestResult(null, Collections.singleton(recipientId), dataForRecipient, ResponseCode.OK, null);
    }

    public static RequestResult recipientData(
            @NotEmpty Set<Long> recipientsIds,
            @NotNull MicroRequest dataForRecipient) {
        return new RequestResult(null, recipientsIds, dataForRecipient, ResponseCode.OK, null);
    }

    public static RequestResult recipientData(
            @NotNull Long recipientId,
            @NotNull MicroRequest dataForRecipient,
            @NotNull ResponseCode code) {
        return new RequestResult(null, Collections.singleton(recipientId), dataForRecipient, code, null);
    }

    public static RequestResult okIfTrue(@Nullable Boolean acknowledged) {
        return acknowledged != null && acknowledged ? ok() : fail();
    }

    public static RequestResult ok() {
        return status(ResponseCode.OK);
    }
}
