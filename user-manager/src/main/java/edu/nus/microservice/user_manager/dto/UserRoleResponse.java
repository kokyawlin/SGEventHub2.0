package edu.nus.microservice.user_manager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleResponse {
    private String RoleId;
    private String RoleName;
    private String Permission;
}
