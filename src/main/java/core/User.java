package core;

import annotion.ProcessExtraExpression;
import lombok.Data;

import java.util.Date;

/**
 * @author 4everlynn
 * @version V1.0
 * @date 2020-07-15
 */

@ProcessExtraExpression(prefix = "user_", suffix = "_end")
public class User {
    private Long id;
    private String name;
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
