package im.micro.access.web.group;

import im.micro.access.pojo.domain.Group;
import im.micro.access.pojo.dto.ResponseDTO;
import im.micro.common.contsant.ResponseCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupController {
    public ResponseEntity<ResponseDTO<Group>> addGroup(){
        return ResponseEntity.ok(new ResponseDTO<Group>(ResponseCode.DISABLED_FUNCTION,new Group()));
    }
}
