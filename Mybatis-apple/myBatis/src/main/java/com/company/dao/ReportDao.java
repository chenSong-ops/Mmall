package com.company.dao;

import com.company.dao.pojo.DateVO;
import com.company.dao.pojo.InfoBO;
import com.company.dao.pojo.enameDnameDTO;

import java.util.List;

public interface ReportDao {
    public List<enameDnameDTO> findBoth();
    public List<InfoBO> findInfoBO (DateVO dateVO);
}
