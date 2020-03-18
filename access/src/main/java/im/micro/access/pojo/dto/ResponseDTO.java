package im.micro.access.pojo.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import im.micro.common.contsant.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
public class ResponseDTO<T> {
    /**
     * For now, "code" and "reason" are
     */
    private Integer code;
    private String reason;
    private Date timestamp;
    private T data;

    @JsonIgnore
    private Integer httpCode;

    public ResponseDTO(ResponseCode statusCode, T data) {
        this.code = statusCode.getBusinessCode();
        this.reason = statusCode.getReason();
        this.timestamp = new Date();
        this.data = data;
        this.httpCode = statusCode.getHttpStatusCode();
    }
}