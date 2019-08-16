package com.company.dao;

import com.company.dao.pojo.DateVO;
import com.company.dao.pojo.InfoBO;
import com.company.dao.pojo.enameDnameDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ReportDaoTest {
    @Autowired
    ReportDao reportDao;
    @Test
    public void findBoth() {
       List<enameDnameDTO> result= reportDao.findBoth();
       for(enameDnameDTO edd:result){
           System.err.println(edd);
       }
    }

    @Test
    public void findInfoBO (){
        DateVO datevo = new DateVO("2017-03-01","2019-03-01");
       List<InfoBO> infobos= reportDao.findInfoBO(datevo);
       for(InfoBO infobo:infobos){
           System.err.println(infobo.getDept());
           System.err.println(infobo.getEmp());
           System.err.println("********************");
       }
    }

}