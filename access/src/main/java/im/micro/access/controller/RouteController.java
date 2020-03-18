package im.micro.access.controller;

import im.micro.access.pojo.bo.common.Int64Values;
import im.micro.access.pojo.notification.MicroNotification;
import im.micro.access.pojo.request.MicroRequest;
import im.micro.common.contsant.ResponseCode;
import io.micrometer.core.lang.Nullable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Set;

@RestController("/")
public class RouteController {
    private final static Logger LOGGER = LoggerFactory.getLogger(RouteController.class);

}
