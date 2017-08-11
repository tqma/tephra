package org.lpw.model;

import org.lpw.tephra.dao.model.Jsonable;
import org.lpw.tephra.dao.model.ModelSupport;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.Table;

@Component("user.model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity(name = "user")
//@DataSource(key="")
@Table(name = "user")
public class UserModel extends ModelSupport{
    private String name;
    private String password;

    @Jsonable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //	@Jsonable
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
