package com.czp.haoyou.entity;

import com.czp.haoyou.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Brutus
 * @since 2021-03-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    
    private String username;

    private String password;

    private String address;


}
