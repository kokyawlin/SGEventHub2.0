package edu.nus.microservice.user_manager.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class EventUserResponse {
    private String UserId;
    private String UserName;
    private String Password;
    private String EmailAddress;
    private int ActiveStatus;
    private int RoleId;
    private Date CreateDt;
}
