package org.lpw.tephra.dao.orm.hibernate;

import org.junit.Assert;
import org.junit.Test;
import org.lpw.tephra.dao.orm.UserModel;
import org.lpw.tephra.test.DaoTestSupport;
import org.lpw.tephra.util.Converter;

import javax.inject.Inject;

public class UserTest extends DaoTestSupport {
    @Inject
    private Converter converter;
    @Inject
    private HibernateOrm hibernateOrm;

    @Test
    public void crud() {
        UserModel u = new UserModel();
        u.setName("mtq");
        u.setPassword("mmm");
        this.hibernateOrm.save(u);
        hibernateOrm.close();
        UserModel u2 = new UserModel();
        u2 = hibernateOrm.findById(UserModel.class,u.getId());
        hibernateOrm.close();
        Assert.assertEquals(u.getName(),u2.getName());
        Assert.assertEquals(u.getPassword(),u2.getPassword());
        Assert.assertEquals(u.getId(),u2.getId());

        u.setName("qtm");
        u.setPassword("nnn");
        hibernateOrm.save(u);
        hibernateOrm.close();
        u2=null;
        u2 = hibernateOrm.findById(UserModel.class,u.getId());
        hibernateOrm.close();
        Assert.assertEquals("qtm",u2.getName());
        Assert.assertEquals("nnn",u2.getPassword());
        Assert.assertEquals(u.getId(),u2.getId());

        hibernateOrm.delete(u2);
        u2 = hibernateOrm.findById(UserModel.class,u.getId());
        Assert.assertNull(u2);
    }


}
